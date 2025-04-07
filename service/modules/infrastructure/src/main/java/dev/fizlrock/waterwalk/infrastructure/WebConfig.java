package dev.fizlrock.waterwalk.infrastructure;

import java.util.ArrayList;
import java.util.List;
import net.devh.boot.grpc.server.security.authentication.BearerAuthenticationReader;
import net.devh.boot.grpc.server.security.authentication.CompositeGrpcAuthenticationReader;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthenticationToken;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationProvider;

@Configuration
public class WebConfig {

  @Bean
  public AuthenticationManager authenticationManager(JwtDecoder jwtDecoder) {
    JwtAuthenticationProvider provider = new JwtAuthenticationProvider(jwtDecoder);
    return new ProviderManager(provider);
  }

  @Bean
  public JwtDecoder jwtDecoder(@Value("${ISSUER_LOCATION}") String issuer) {
    return JwtDecoders.fromIssuerLocation(issuer);
  }

  @Bean
  GrpcAuthenticationReader authenticationReader() {
    final List<GrpcAuthenticationReader> readers = new ArrayList<>();
    readers.add(
        new BearerAuthenticationReader(
            accessToken -> {
              System.out.println("Token:" + accessToken);
              return new BearerTokenAuthenticationToken(accessToken);
            }));
    return new CompositeGrpcAuthenticationReader(readers);
  }
}
