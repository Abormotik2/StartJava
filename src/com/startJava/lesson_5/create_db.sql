--create database

CREATE TABLE Robots (
    id        SERIAL PRIMARY KEY,
    modelname TEXT,
    mark      TEXT,
    height    DOUBLE PRECISION,
    weight    DOUBLE PRECISION,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijukill INTEGER
);
