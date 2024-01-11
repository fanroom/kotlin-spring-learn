CREATE DATABASE learn;
\c learn;
CREATE TABLE country (
  id SERIAL PRIMARY KEY,
  name VARCHAR NOT NULL,
  population INTEGER NOT NULL
);

INSERT INTO country (name, population) VALUES ('USA', 328000000);
INSERT INTO country (name, population) VALUES ('China', 1440000000);
INSERT INTO country (name, population) VALUES ('Brazil', 209000000);