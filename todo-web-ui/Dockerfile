# Стадия 1: Сборка Angular-приложения
FROM node:18 AS build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build -- --configuration production

# Стадия 2: Сервер для раздачи статических файлов
FROM nginx:alpine
# COPY --from=build /todo-web-ui/dist/todo-web-ui/browser /usr/share/nginx/html
COPY --from=build /app/dist/todo-web-ui/browser /usr/share/nginx/html

COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
