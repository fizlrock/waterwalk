import { PassedInitialConfig } from 'angular-auth-oidc-client';


export const authConfig: PassedInitialConfig = {
  config: {
    authority: 'http://keycloak:8081/realms/fizlrock', // URL твоего realm в Keycloak
    redirectUrl: 'http://localhost:4200/callback',      // Куда перенаправить после логина
    clientId: 'todo-webapp',
    scope: 'openid profile email',                      // Запрашиваемые данные пользователя
    responseType: 'code',                               // Authorization Code Flow с PKCE
    silentRenew: true,                                  // Автоматическое обновление токена
    useRefreshToken: true,                              // Использовать refresh token
    postLogoutRedirectUri: 'http://localhost:4200/logout', // Куда перенаправить после выхода
  },
};
