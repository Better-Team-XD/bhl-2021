FROM node:15-alpine

WORKDIR '/app'
COPY package.json .

RUN npm config set fund false --global
RUN npm install --force

COPY . .

CMD ["npm", "run", "start"]