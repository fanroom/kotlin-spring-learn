FROM postgres:16.1-bullseye

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 123
EXPOSE 5432

COPY init.sql /docker-entrypoint-initdb.d/