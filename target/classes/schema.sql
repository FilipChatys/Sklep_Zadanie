-- Creation of products table

CREATE TABLE IF NOT EXISTS products
(
    id       INT          NOT NULL AUTO_INCREMENT,
    name     VARCHAR(250) NOT NULL,
    barcode  VARCHAR(250) NOT NULL,
    quantity INT          NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users
(
    id       INT          NOT NULL AUTO_INCREMENT,
    login    VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL,
    PRIMARY KEY (id)
);