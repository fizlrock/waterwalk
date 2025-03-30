import { PassedInitialConfig } from 'angular-auth-oidc-client';

// export const authConfig: PassedInitialConfig = {
//   config: {
//     authority: 'https://login.microsoftonline.com/http://localhost:8081/realms/fizlrock/v2.0',
//     authWellknownEndpointUrl: 'https://login.microsoftonline.com/common/v2.0',
//     redirectUrl: window.location.origin,
//     clientId: 'please-enter-clientId',
//     scope: 'please-enter-scopes', // 'openid profile offline_access ' + your scopes
//     responseType: 'code',
//     silentRenew: true,
//     useRefreshToken: true,
//     maxIdTokenIatOffsetAllowedInSeconds: 600,
//     issValidationOff: false,
//     autoUserInfo: false,
//     customParamsAuthRequest: {
//       prompt: 'select_account', // login, consent
//     },
//   }
// }




export const authConfig: PassedInitialConfig = {
  config: {
    authority: 'http://localhost:8081/realms/fizlrock', // URL твоего realm в Keycloak
    redirectUrl: 'http://localhost:4200/callback',      // Куда перенаправить после логина
    clientId: 'waterwalk-web-frontend',
    scope: 'openid profile email',                      // Запрашиваемые данные пользователя
    responseType: 'code',                               // Authorization Code Flow с PKCE
    silentRenew: true,                                  // Автоматическое обновление токена
    useRefreshToken: true,                              // Использовать refresh token
    postLogoutRedirectUri: 'http://localhost:4200/logout', // Куда перенаправить после выхода
  },
};
