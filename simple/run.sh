#!/usr/bin/env bash

set -e
echo "Starting API For Hero!"
mvn clean install -pl spincastone -am -DskipTests=true
sudo docker-compose down
sudo docker-compose  up -d --build







