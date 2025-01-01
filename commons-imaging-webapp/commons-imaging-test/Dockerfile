# Use a node base image to build the React app
FROM node:18-alpine AS build

# Set the working directory
WORKDIR /app

# Copy the package.json and package-lock.json
COPY package.json package-lock.json ./

# Install dependencies
RUN npm install

# Copy the rest of the React project files
COPY . ./

# Build the React app
RUN npm run build

# Use a web server (nginx) to serve the static files
FROM nginx:alpine

# Copy the build output to the nginx server directory
COPY --from=build /app/build /usr/share/nginx/html

# Expose the port that nginx will serve the app on
EXPOSE 80

# Run nginx
CMD ["nginx", "-g", "daemon off;"]
