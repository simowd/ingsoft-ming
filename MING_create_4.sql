-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2020-10-29 18:24:22.527

-- tables
-- Table: countries
CREATE TABLE countries (
    id_country int NOT NULL AUTO_INCREMENT,
    name varchar(40) NULL,
    CONSTRAINT countries_pk PRIMARY KEY (id_country)
);

-- Table: developers
CREATE TABLE developers (
    id_developer int NOT NULL AUTO_INCREMENT,
    id_publisher int NOT NULL,
    developer varchar(50) NOT NULL COMMENT 'Nombre de la desarrollada que es parte del Publisher:

Por ejemplo:
....',
    CONSTRAINT developers_pk PRIMARY KEY (id_developer)
);

-- Table: directx
CREATE TABLE directx (
    id_directx int NOT NULL AUTO_INCREMENT,
    version varchar(30) NULL,
    CONSTRAINT directx_pk PRIMARY KEY (id_directx)
);

-- Table: esrb
CREATE TABLE esrb (
    id_esrb int NOT NULL AUTO_INCREMENT,
    esrb varchar(20) NULL,
    logo_path varchar(200) NOT NULL,
    CONSTRAINT esrb_pk PRIMARY KEY (id_esrb)
);

-- Table: games
CREATE TABLE games (
    id_game int NOT NULL AUTO_INCREMENT,
    id_esrb int NOT NULL,
    id_developer int NOT NULL,
    name varchar(75) NULL,
    description text NULL,
    size varchar(10) NULL,
    players int NOT NULL,
    release_date date NULL,
    processor varchar(25) NOT NULL,
    memory varchar(10) NOT NULL,
    graphics varchar(50) NOT NULL,
    color varchar(10) NULL,
    highlight int NOT NULL,
    download_path varchar(200) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT games_pk PRIMARY KEY (id_game)
);

-- Table: games_directx
CREATE TABLE games_directx (
    id_games_direct_x int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    id_directx int NOT NULL,
    CONSTRAINT games_directx_pk PRIMARY KEY (id_games_direct_x)
);

-- Table: games_os
CREATE TABLE games_os (
    id_games_os int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    id_operating_system int NOT NULL,
    CONSTRAINT games_os_pk PRIMARY KEY (id_games_os)
);

-- Table: genres
CREATE TABLE genres (
    id_genre int NOT NULL AUTO_INCREMENT,
    genre varchar(25) NULL,
    CONSTRAINT genres_pk PRIMARY KEY (id_genre)
);

-- Table: genres_games
CREATE TABLE genres_games (
    id_genre_game int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    id_genre int NOT NULL,
    CONSTRAINT genres_games_pk PRIMARY KEY (id_genre_game)
);

-- Table: h_games
CREATE TABLE h_games (
    h_id_game int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    id_esrb int NOT NULL,
    id_developer int NOT NULL,
    name varchar(75) NULL,
    description text NULL,
    size varchar(10) NULL,
    developer varchar(30) NULL,
    players int NOT NULL,
    release_date date NULL,
    processor varchar(25) NOT NULL,
    memory varchar(10) NOT NULL,
    graphics varchar(50) NOT NULL,
    color varchar(10) NULL,
    highlight int NOT NULL,
    download_path varchar(200) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date date NOT NULL,
    CONSTRAINT h_games_pk PRIMARY KEY (h_id_game)
);

-- Table: languages
CREATE TABLE languages (
    id_language int NOT NULL AUTO_INCREMENT,
    language varchar(15) NOT NULL,
    CONSTRAINT languages_pk PRIMARY KEY (id_language)
);

-- Table: languages_games
CREATE TABLE languages_games (
    id_languages_games int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    id_language int NOT NULL,
    CONSTRAINT languages_games_pk PRIMARY KEY (id_languages_games)
);

-- Table: library
CREATE TABLE library (
    id_library int NOT NULL AUTO_INCREMENT,
    id_user int NOT NULL,
    id_game int NOT NULL,
    status int NOT NULL,
    download int NOT NULL,
    CONSTRAINT library_pk PRIMARY KEY (id_library)
);

-- Table: operating_system
CREATE TABLE operating_system (
    id_operating_system int NOT NULL AUTO_INCREMENT,
    operating_system varchar(50) NULL,
    logo_path varchar(200) NOT NULL,
    CONSTRAINT operating_system_pk PRIMARY KEY (id_operating_system)
);

-- Table: order_details
CREATE TABLE order_details (
    id_order_details int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    id_order int NOT NULL,
    price numeric(10,6) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT order_details_pk PRIMARY KEY (id_order_details)
);

-- Table: orders
CREATE TABLE orders (
    id_order int NOT NULL AUTO_INCREMENT,
    id_user int NOT NULL,
    date timestamp NOT NULL,
    status int NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT orders_pk PRIMARY KEY (id_order)
);

-- Table: photos
CREATE TABLE photos (
    id_photos int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    photo_path varchar(200) NULL,
    type int NOT NULL,
    status int NOT NULL,
    CONSTRAINT photos_pk PRIMARY KEY (id_photos)
);

-- Table: price
CREATE TABLE price (
    id_price int NOT NULL AUTO_INCREMENT,
    id_game int NOT NULL,
    price numeric(10,6) NOT NULL,
    date timestamp NOT NULL,
    sale int NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT price_pk PRIMARY KEY (id_price)
);

-- Table: publishers
CREATE TABLE publishers (
    id_publisher int NOT NULL AUTO_INCREMENT,
    id_user int NOT NULL,
    publisher varchar(50) NULL,
    paypal_mail varchar(100) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT publishers_pk PRIMARY KEY (id_publisher)
);

-- Table: transactions
CREATE TABLE transactions (
    tx_id int NOT NULL AUTO_INCREMENT,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT transactions_pk PRIMARY KEY (tx_id)
);

-- Table: users
CREATE TABLE users (
    id_user int NOT NULL AUTO_INCREMENT,
    id_country int NOT NULL,
    username varchar(20) NULL,
    password varchar(35) NULL,
    email varchar(100) NULL,
    user_type int NULL COMMENT 'Existen diferentes tipos de usuarios.
0: user
1: publisher/developer
2: admin',
    photo_path varchar(200) NOT NULL,
    name varchar(40) NOT NULL,
    lastname varchar(50) NOT NULL,
    alias varchar(50) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (id_user)
);

-- foreign keys
-- Reference: developers_publishers (table: developers)
ALTER TABLE developers ADD CONSTRAINT developers_publishers FOREIGN KEY developers_publishers (id_publisher)
    REFERENCES publishers (id_publisher);

-- Reference: games_developers (table: games)
ALTER TABLE games ADD CONSTRAINT games_developers FOREIGN KEY games_developers (id_developer)
    REFERENCES developers (id_developer);

-- Reference: games_directx_directx (table: games_directx)
ALTER TABLE games_directx ADD CONSTRAINT games_directx_directx FOREIGN KEY games_directx_directx (id_directx)
    REFERENCES directx (id_directx);

-- Reference: games_directx_games (table: games_directx)
ALTER TABLE games_directx ADD CONSTRAINT games_directx_games FOREIGN KEY games_directx_games (id_game)
    REFERENCES games (id_game);

-- Reference: games_esrb (table: games)
ALTER TABLE games ADD CONSTRAINT games_esrb FOREIGN KEY games_esrb (id_esrb)
    REFERENCES esrb (id_esrb);

-- Reference: games_os_games (table: games_os)
ALTER TABLE games_os ADD CONSTRAINT games_os_games FOREIGN KEY games_os_games (id_game)
    REFERENCES games (id_game);

-- Reference: games_os_operating_system (table: games_os)
ALTER TABLE games_os ADD CONSTRAINT games_os_operating_system FOREIGN KEY games_os_operating_system (id_operating_system)
    REFERENCES operating_system (id_operating_system);

-- Reference: genres_games_games (table: genres_games)
ALTER TABLE genres_games ADD CONSTRAINT genres_games_games FOREIGN KEY genres_games_games (id_game)
    REFERENCES games (id_game);

-- Reference: genres_games_genres (table: genres_games)
ALTER TABLE genres_games ADD CONSTRAINT genres_games_genres FOREIGN KEY genres_games_genres (id_genre)
    REFERENCES genres (id_genre);

-- Reference: languages_games_games (table: languages_games)
ALTER TABLE languages_games ADD CONSTRAINT languages_games_games FOREIGN KEY languages_games_games (id_game)
    REFERENCES games (id_game);

-- Reference: languages_games_languages (table: languages_games)
ALTER TABLE languages_games ADD CONSTRAINT languages_games_languages FOREIGN KEY languages_games_languages (id_language)
    REFERENCES languages (id_language);

-- Reference: library_games (table: library)
ALTER TABLE library ADD CONSTRAINT library_games FOREIGN KEY library_games (id_game)
    REFERENCES games (id_game);

-- Reference: library_users (table: library)
ALTER TABLE library ADD CONSTRAINT library_users FOREIGN KEY library_users (id_user)
    REFERENCES users (id_user);

-- Reference: order_details_games (table: order_details)
ALTER TABLE order_details ADD CONSTRAINT order_details_games FOREIGN KEY order_details_games (id_game)
    REFERENCES games (id_game);

-- Reference: order_details_orders (table: order_details)
ALTER TABLE order_details ADD CONSTRAINT order_details_orders FOREIGN KEY order_details_orders (id_order)
    REFERENCES orders (id_order);

-- Reference: orders_users (table: orders)
ALTER TABLE orders ADD CONSTRAINT orders_users FOREIGN KEY orders_users (id_user)
    REFERENCES users (id_user);

-- Reference: photos_games (table: photos)
ALTER TABLE photos ADD CONSTRAINT photos_games FOREIGN KEY photos_games (id_game)
    REFERENCES games (id_game);

-- Reference: price_games (table: price)
ALTER TABLE price ADD CONSTRAINT price_games FOREIGN KEY price_games (id_game)
    REFERENCES games (id_game);

-- Reference: publishers_users (table: publishers)
ALTER TABLE publishers ADD CONSTRAINT publishers_users FOREIGN KEY publishers_users (id_user)
    REFERENCES users (id_user);

-- Reference: users_countries (table: users)
ALTER TABLE users ADD CONSTRAINT users_countries FOREIGN KEY users_countries (id_country)
    REFERENCES countries (id_country);

-- End of file.

