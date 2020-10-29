CREATE DATABASE ming DEFAULT CHARACTER SET 'utf8' DEFAULT COLLATE utf8_general_ci;

-- Trigger h_games

delimiter //
CREATE TRIGGER tg_ins_h_games AFTER INSERT ON games
    FOR EACH ROW
    BEGIN
        INSERT INTO h_games VALUES (null, NEW.id_game,NEW.id_esrb, NEW.id_developer,NEW.name,NEW.description,NEW.size,NEW.players,NEW.release_date,NEW.processor,NEW.memory,NEW.graphics,NEW.color,NEW.highlight,NEW.download_path,NEW.status,NEW.tx_id, NEW.tx_host, NEW.tx_user_id, NEW.tx_date);
    END;//
delimiter ;

delimiter //
CREATE TRIGGER tg_upd_h_games AFTER UPDATE ON games
    FOR EACH ROW
    BEGIN
        INSERT INTO h_games VALUES (null, NEW.id_game,NEW.id_esrb, NEW.id_developer,NEW.name,NEW.description,NEW.size,NEW.players,NEW.release_date,NEW.processor,NEW.memory,NEW.graphics,NEW.color,NEW.highlight,NEW.download_path,NEW.status,NEW.tx_id, NEW.tx_host, NEW.tx_user_id, NEW.tx_date);
    END;//
delimiter ;

-- Table countries
      
INSERT INTO countries (name) VALUES('Afganistán');
INSERT INTO countries (name) VALUES('Islas Gland');
INSERT INTO countries (name) VALUES('Albania');
INSERT INTO countries (name) VALUES('Alemania');
INSERT INTO countries (name) VALUES('Andorra');
INSERT INTO countries (name) VALUES('Angola');
INSERT INTO countries (name) VALUES('Anguilla');
INSERT INTO countries (name) VALUES('Antártida');
INSERT INTO countries (name) VALUES('Antigua y Barbuda');
INSERT INTO countries (name) VALUES('Antillas Holandesas');
INSERT INTO countries (name) VALUES('Arabia Saudí');
INSERT INTO countries (name) VALUES('Argelia');
INSERT INTO countries (name) VALUES('Argentina');
INSERT INTO countries (name) VALUES('Armenia');
INSERT INTO countries (name) VALUES('Aruba');
INSERT INTO countries (name) VALUES('Australia');
INSERT INTO countries (name) VALUES('Austria');
INSERT INTO countries (name) VALUES('Azerbaiyán');
INSERT INTO countries (name) VALUES('Bahamas');
INSERT INTO countries (name) VALUES('Bahréin');
INSERT INTO countries (name) VALUES('Bangladesh');
INSERT INTO countries (name) VALUES('Barbados');
INSERT INTO countries (name) VALUES('Bielorrusia');
INSERT INTO countries (name) VALUES('Bélgica');
INSERT INTO countries (name) VALUES('Belice');
INSERT INTO countries (name) VALUES('Benin');
INSERT INTO countries (name) VALUES('Bermudas');
INSERT INTO countries (name) VALUES('Bhután');
INSERT INTO countries (name) VALUES('Bolivia');
INSERT INTO countries (name) VALUES('Bosnia y Herzegovina');
INSERT INTO countries (name) VALUES('Botsuana');
INSERT INTO countries (name) VALUES('Isla Bouvet');
INSERT INTO countries (name) VALUES('Brasil');
INSERT INTO countries (name) VALUES('Brunéi');
INSERT INTO countries (name) VALUES('Bulgaria');
INSERT INTO countries (name) VALUES('Burkina Faso');
INSERT INTO countries (name) VALUES('Burundi');
INSERT INTO countries (name) VALUES('Cabo Verde');
INSERT INTO countries (name) VALUES('Islas Caimán');
INSERT INTO countries (name) VALUES('Camboya');
INSERT INTO countries (name) VALUES('Camerún');
INSERT INTO countries (name) VALUES('Canadá');
INSERT INTO countries (name) VALUES('República Centroafricana');
INSERT INTO countries (name) VALUES('Chad');
INSERT INTO countries (name) VALUES('República Checa');
INSERT INTO countries (name) VALUES('Chile');
INSERT INTO countries (name) VALUES('China');
INSERT INTO countries (name) VALUES('Chipre');
INSERT INTO countries (name) VALUES('Isla de Navidad');
INSERT INTO countries (name) VALUES('Ciudad del Vaticano');
INSERT INTO countries (name) VALUES('Islas Cocos');
INSERT INTO countries (name) VALUES('Colombia');
INSERT INTO countries (name) VALUES('Comoras');
INSERT INTO countries (name) VALUES('República Democrática del Congo');
INSERT INTO countries (name) VALUES('Congo');
INSERT INTO countries (name) VALUES('Islas Cook');
INSERT INTO countries (name) VALUES('Corea del Norte');
INSERT INTO countries (name) VALUES('Corea del Sur');
INSERT INTO countries (name) VALUES('Costa de Marfil');
INSERT INTO countries (name) VALUES('Costa Rica');
INSERT INTO countries (name) VALUES('Croacia');
INSERT INTO countries (name) VALUES('Cuba');
INSERT INTO countries (name) VALUES('Dinamarca');
INSERT INTO countries (name) VALUES('Dominica');
INSERT INTO countries (name) VALUES('República Dominicana');
INSERT INTO countries (name) VALUES('Ecuador');
INSERT INTO countries (name) VALUES('Egipto');
INSERT INTO countries (name) VALUES('El Salvador');
INSERT INTO countries (name) VALUES('Emiratos Árabes Unidos');
INSERT INTO countries (name) VALUES('Eritrea');
INSERT INTO countries (name) VALUES('Eslovaquia');
INSERT INTO countries (name) VALUES('Eslovenia');
INSERT INTO countries (name) VALUES('España');
INSERT INTO countries (name) VALUES('Islas ultramarinas de Estados Unidos');
INSERT INTO countries (name) VALUES('Estados Unidos');
INSERT INTO countries (name) VALUES('Estonia');
INSERT INTO countries (name) VALUES('Etiopía');
INSERT INTO countries (name) VALUES('Islas Feroe');
INSERT INTO countries (name) VALUES('Filipinas');
INSERT INTO countries (name) VALUES('Finlandia');
INSERT INTO countries (name) VALUES('Fiyi');
INSERT INTO countries (name) VALUES('Francia');
INSERT INTO countries (name) VALUES('Gabón');
INSERT INTO countries (name) VALUES('Gambia');
INSERT INTO countries (name) VALUES('Georgia');
INSERT INTO countries (name) VALUES('Islas Georgias del Sur y Sandwich del Sur');
INSERT INTO countries (name) VALUES('Ghana');
INSERT INTO countries (name) VALUES('Gibraltar');
INSERT INTO countries (name) VALUES('Granada');
INSERT INTO countries (name) VALUES('Grecia');
INSERT INTO countries (name) VALUES('Groenlandia');
INSERT INTO countries (name) VALUES('Guadalupe');
INSERT INTO countries (name) VALUES('Guam');
INSERT INTO countries (name) VALUES('Guatemala');
INSERT INTO countries (name) VALUES('Guayana Francesa');
INSERT INTO countries (name) VALUES('Guinea');
INSERT INTO countries (name) VALUES('Guinea Ecuatorial');
INSERT INTO countries (name) VALUES('Guinea-Bissau');
INSERT INTO countries (name) VALUES('Guyana');
INSERT INTO countries (name) VALUES('Haití');
INSERT INTO countries (name) VALUES('Islas Heard y McDonald');
INSERT INTO countries (name) VALUES('Honduras');
INSERT INTO countries (name) VALUES('Hong Kong');
INSERT INTO countries (name) VALUES('Hungría');
INSERT INTO countries (name) VALUES('India');
INSERT INTO countries (name) VALUES('Indonesia');
INSERT INTO countries (name) VALUES('Irán');
INSERT INTO countries (name) VALUES('Iraq');
INSERT INTO countries (name) VALUES('Irlanda');
INSERT INTO countries (name) VALUES('Islandia');
INSERT INTO countries (name) VALUES('Israel');
INSERT INTO countries (name) VALUES('Italia');
INSERT INTO countries (name) VALUES('Jamaica');
INSERT INTO countries (name) VALUES('Japón');
INSERT INTO countries (name) VALUES('Jordania');
INSERT INTO countries (name) VALUES('Kazajstán');
INSERT INTO countries (name) VALUES('Kenia');
INSERT INTO countries (name) VALUES('Kirguistán');
INSERT INTO countries (name) VALUES('Kiribati');
INSERT INTO countries (name) VALUES('Kuwait');
INSERT INTO countries (name) VALUES('Laos');
INSERT INTO countries (name) VALUES('Lesotho');
INSERT INTO countries (name) VALUES('Letonia');
INSERT INTO countries (name) VALUES('Líbano');
INSERT INTO countries (name) VALUES('Liberia');
INSERT INTO countries (name) VALUES('Libia');
INSERT INTO countries (name) VALUES('Liechtenstein');
INSERT INTO countries (name) VALUES('Lituania');
INSERT INTO countries (name) VALUES('Luxemburgo');
INSERT INTO countries (name) VALUES('Macao');
INSERT INTO countries (name) VALUES('ARY Macedonia');
INSERT INTO countries (name) VALUES('Madagascar');
INSERT INTO countries (name) VALUES('Malasia');
INSERT INTO countries (name) VALUES('Malawi');
INSERT INTO countries (name) VALUES('Maldivas');
INSERT INTO countries (name) VALUES('Malí');
INSERT INTO countries (name) VALUES('Malta');
INSERT INTO countries (name) VALUES('Islas Malvinas');
INSERT INTO countries (name) VALUES('Islas Marianas del Norte');
INSERT INTO countries (name) VALUES('Marruecos');
INSERT INTO countries (name) VALUES('Islas Marshall');
INSERT INTO countries (name) VALUES('Martinica');
INSERT INTO countries (name) VALUES('Mauricio');
INSERT INTO countries (name) VALUES('Mauritania');
INSERT INTO countries (name) VALUES('Mayotte');
INSERT INTO countries (name) VALUES('México');
INSERT INTO countries (name) VALUES('Micronesia');
INSERT INTO countries (name) VALUES('Moldavia');
INSERT INTO countries (name) VALUES('Mónaco');
INSERT INTO countries (name) VALUES('Mongolia');
INSERT INTO countries (name) VALUES('Montserrat');
INSERT INTO countries (name) VALUES('Mozambique');
INSERT INTO countries (name) VALUES('Myanmar');
INSERT INTO countries (name) VALUES('Namibia');
INSERT INTO countries (name) VALUES('Nauru');
INSERT INTO countries (name) VALUES('Nepal');
INSERT INTO countries (name) VALUES('Nicaragua');
INSERT INTO countries (name) VALUES('Níger');
INSERT INTO countries (name) VALUES('Nigeria');
INSERT INTO countries (name) VALUES('Niue');
INSERT INTO countries (name) VALUES('Isla Norfolk');
INSERT INTO countries (name) VALUES('Noruega');
INSERT INTO countries (name) VALUES('Nueva Caledonia');
INSERT INTO countries (name) VALUES('Nueva Zelanda');
INSERT INTO countries (name) VALUES('Omán');
INSERT INTO countries (name) VALUES('Países Bajos');
INSERT INTO countries (name) VALUES('Pakistán');
INSERT INTO countries (name) VALUES('Palau');
INSERT INTO countries (name) VALUES('Palestina');
INSERT INTO countries (name) VALUES('Panamá');
INSERT INTO countries (name) VALUES('Papúa Nueva Guinea');
INSERT INTO countries (name) VALUES('Paraguay');
INSERT INTO countries (name) VALUES('Perú');
INSERT INTO countries (name) VALUES('Islas Pitcairn');
INSERT INTO countries (name) VALUES('Polinesia Francesa');
INSERT INTO countries (name) VALUES('Polonia');
INSERT INTO countries (name) VALUES('Portugal');
INSERT INTO countries (name) VALUES('Puerto Rico');
INSERT INTO countries (name) VALUES('Qatar');
INSERT INTO countries (name) VALUES('Reino Unido');
INSERT INTO countries (name) VALUES('Reunión');
INSERT INTO countries (name) VALUES('Ruanda');
INSERT INTO countries (name) VALUES('Rumania');
INSERT INTO countries (name) VALUES('Rusia');
INSERT INTO countries (name) VALUES('Sahara Occidental');
INSERT INTO countries (name) VALUES('Islas Salomón');
INSERT INTO countries (name) VALUES('Samoa');
INSERT INTO countries (name) VALUES('Samoa Americana');
INSERT INTO countries (name) VALUES('San Cristóbal y Nevis');
INSERT INTO countries (name) VALUES('San Marino');
INSERT INTO countries (name) VALUES('San Pedro y Miquelón');
INSERT INTO countries (name) VALUES('San Vicente y las Granadinas');
INSERT INTO countries (name) VALUES('Santa Helena');
INSERT INTO countries (name) VALUES('Santa Lucía');
INSERT INTO countries (name) VALUES('Santo Tomé y Príncipe');
INSERT INTO countries (name) VALUES('Senegal');
INSERT INTO countries (name) VALUES('Serbia y Montenegro');
INSERT INTO countries (name) VALUES('Seychelles');
INSERT INTO countries (name) VALUES('Sierra Leona');
INSERT INTO countries (name) VALUES('Singapur');
INSERT INTO countries (name) VALUES('Siria');
INSERT INTO countries (name) VALUES('Somalia');
INSERT INTO countries (name) VALUES('Sri Lanka');
INSERT INTO countries (name) VALUES('Suazilandia');
INSERT INTO countries (name) VALUES('Sudáfrica');
INSERT INTO countries (name) VALUES('Sudán');
INSERT INTO countries (name) VALUES('Suecia');
INSERT INTO countries (name) VALUES('Suiza');
INSERT INTO countries (name) VALUES('Surinam');
INSERT INTO countries (name) VALUES('Svalbard y Jan Mayen');
INSERT INTO countries (name) VALUES('Tailandia');
INSERT INTO countries (name) VALUES('Taiwán');
INSERT INTO countries (name) VALUES('Tanzania');
INSERT INTO countries (name) VALUES('Tayikistán');
INSERT INTO countries (name) VALUES('Territorio Británico del Océano Índico');
INSERT INTO countries (name) VALUES('Territorios Australes Franceses');
INSERT INTO countries (name) VALUES('Timor Oriental');
INSERT INTO countries (name) VALUES('Togo');
INSERT INTO countries (name) VALUES('Tokelau');
INSERT INTO countries (name) VALUES('Tonga');
INSERT INTO countries (name) VALUES('Trinidad y Tobago');
INSERT INTO countries (name) VALUES('Túnez');
INSERT INTO countries (name) VALUES('Islas Turcas y Caicos');
INSERT INTO countries (name) VALUES('Turkmenistán');
INSERT INTO countries (name) VALUES('Turquía');
INSERT INTO countries (name) VALUES('Tuvalu');
INSERT INTO countries (name) VALUES('Ucrania');
INSERT INTO countries (name) VALUES('Uganda');
INSERT INTO countries (name) VALUES('Uruguay');
INSERT INTO countries (name) VALUES('Uzbekistán');
INSERT INTO countries (name) VALUES('Vanuatu');
INSERT INTO countries (name) VALUES('Venezuela');
INSERT INTO countries (name) VALUES('Vietnam');
INSERT INTO countries (name) VALUES('Islas Vírgenes Británicas');
INSERT INTO countries (name) VALUES('Islas Vírgenes de los Estados Unidos');
INSERT INTO countries (name) VALUES('Wallis y Futuna');
INSERT INTO countries (name) VALUES('Yemen');
INSERT INTO countries (name) VALUES('Yibuti');
INSERT INTO countries (name) VALUES('Zambia');
INSERT INTO countries (name) VALUES('Zimbabue');

-- Table languages

INSERT INTO languages (language)  VALUES('Español');
INSERT INTO languages (language)  VALUES('English');
INSERT INTO languages (language)  VALUES('Deutsch');
INSERT INTO languages (language)  VALUES('Português');
INSERT INTO languages (language)  VALUES('Fraçais');
INSERT INTO languages (language)  VALUES('Italiano');
INSERT INTO languages (language)  VALUES('日本語');
INSERT INTO languages (language)  VALUES('한국어');

-- Table esrb

INSERT INTO esrb (esrb, logo_path) VALUES ('Everyone', 'https://www.esrb.org/wp-content/uploads/2019/05/E.svg');
INSERT INTO esrb (esrb, logo_path) VALUES ('Everyone 10+', 'https://www.esrb.org/wp-content/uploads/2019/05/E10plus.svg');
INSERT INTO esrb (esrb, logo_path) VALUES ('Teen', 'https://www.esrb.org/wp-content/uploads/2019/05/T.svg');
INSERT INTO esrb (esrb, logo_path) VALUES ('Mature 17+', 'https://www.esrb.org/wp-content/uploads/2019/05/M.svg');
INSERT INTO esrb (esrb, logo_path) VALUES ('Adults Only', 'https://www.esrb.org/wp-content/uploads/2019/05/AO.svg');
INSERT INTO esrb (esrb, logo_path) VALUES ('Rating Pending', 'https://www.esrb.org/wp-content/uploads/2019/05/RP.svg');

-- Table directx

INSERT INTO directx (version) VALUES('DirectX 12');
INSERT INTO directx (version) VALUES('DirectX 11.3');
INSERT INTO directx (version) VALUES('DirectX 11.2');
INSERT INTO directx (version) VALUES('DirectX 11.1');
INSERT INTO directx (version) VALUES('DirectX 11');
INSERT INTO directx (version) VALUES('DirectX 10.1');
INSERT INTO directx (version) VALUES('DirectX 10');

-- Table genres

INSERT INTO genres (genre) VALUES('Aventura');
INSERT INTO genres (genre) VALUES('Disparos');
INSERT INTO genres (genre) VALUES('Educativos');
INSERT INTO genres (genre) VALUES('Estrategia');
INSERT INTO genres (genre) VALUES('Peleas');
INSERT INTO genres (genre) VALUES('Survival Horror');
INSERT INTO genres (genre) VALUES('Plataformas');
INSERT INTO genres (genre) VALUES('Rol');
INSERT INTO genres (genre) VALUES('Mundo Abierto');
INSERT INTO genres (genre) VALUES('Novela Gráfica');
INSERT INTO genres (genre) VALUES('Deportes');


-- Table operating_system

INSERT INTO operating_system (operating_system,logo_path) VALUES ('Windows', 'https://www.flaticon.com/svg/static/icons/svg/732/732076.svg');
INSERT INTO operating_system (operating_system,logo_path) VALUES ('Linux', 'https://www.flaticon.com/svg/static/icons/svg/731/731985.svg');
INSERT INTO operating_system (operating_system,logo_path) VALUES ('MacOS', 'https://www.flaticon.com/svg/static/icons/svg/121/121147.svg');

-- Table users

INSERT INTO transactions VALUES (null, '192.168.1.1', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'DemonSlayer89','contra123','demonSlayer89@gmail.com',0,'https://i.pinimg.com/564x/f1/f3/52/f1f35248da63e685e1445b4deb7697e3.jpg','Ana','Banana','DemonAna',1,LAST_INSERT_ID(),'192.168.1.1',1,NOW());

INSERT INTO transactions VALUES (null, '192.168.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Saske34','contra1234','podemosHacerlo@gmail.com',0,'https://i.pinimg.com/564x/15/a9/96/15a996aec97792e380c9dc1c56c04bd9.jpg','Bob','Constructor','BobSaske',1,LAST_INSERT_ID(),'192.168.1.2',2,NOW());

INSERT INTO transactions VALUES (null, '192.168.1.3', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'GonHun23','contra12345','gonHun23@gmail.com',0,'https://i.pinimg.com/564x/72/0a/7b/720a7bc322bf34fdf4dc6ff8eb0a58ce.jpg','Burbuja','Poderosa','BurbujaGon',1,LAST_INSERT_ID(),'192.168.1.3',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.2.1', 4, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Naruto12','qwerty123','septimoHokage@gmail.com',1,'https://i.pinimg.com/564x/59/74/54/5974549edfeeefc9e86bd73e8e4af0ed.jpg','Donald','Duck','DonaldNaruto',1,LAST_INSERT_ID(),'192.168.2.1',4,NOW());

INSERT INTO transactions VALUES (null, '192.168.2.2', 5, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'IronMan4','qwerty1234','jarvis@gmail.com',1,'https://i.pinimg.com/564x/84/ad/07/84ad07dfc05d24769cf0036f5bf87f9c.jpg','Gus','Gus','GusMan',1,LAST_INSERT_ID(),'192.168.2.2',5,NOW());

INSERT INTO transactions VALUES (null, '192.168.2.3', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Tiburoncin45','qwerty12345','makoAgua@gmail.com',1,'https://i.pinimg.com/564x/93/ac/06/93ac06f07613955584a1cc22205c2094.jpg','Kilos','Mortales','KilosLocos',1,LAST_INSERT_ID(),'192.168.2.3',6,NOW());

-- Table publishers

INSERT INTO transactions VALUES (null, '192.168.1.10', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO publishers (id_user, publisher, paypal_mail, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (4,'Devolver Digital','washinmail@devolver.com',1,LAST_INSERT_ID(),'192.168.1.10',1,NOW());

INSERT INTO transactions VALUES (null, '192.168.1.10', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO publishers (id_user, publisher, paypal_mail, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (5,'Team 17','relations@team17.com',1,LAST_INSERT_ID(),'192.168.1.10',1,NOW());

INSERT INTO transactions VALUES (null, '192.168.1.10', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO publishers (id_user, publisher, paypal_mail, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (6,'Rockstar','press@rockstar.com',1,LAST_INSERT_ID(),'192.168.1.10',1,NOW());

-- Table developers

INSERT INTO developers(id_publisher, developer) VALUES (1,'Nomada Studio');
INSERT INTO developers(id_publisher, developer) VALUES (1,'Mediatonic');
INSERT INTO developers(id_publisher, developer) VALUES (2,'Ghost Town Games');

-- Table games

INSERT INTO transactions VALUES (null, '192.168.5.55', 4, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,processor,memory,graphics,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date) VALUES (2,1,'GRIS','Gris is a hopeful young girl lost in her own world, dealing with a painful experience in her life. Her journey through sorrow is manifested in her dress, which grants new abilities to better navigate her faded reality.','1.1GB',1,NOW(),'Intel i3', '4GB RAM','GeForce GT340', '#F4B9B5', 0,'https://www.gog.com/game/gris',1,LAST_INSERT_ID(), '192.168.5.55', 4, NOW());

INSERT INTO transactions VALUES (null, '192.168.5.55', 5, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,processor,memory,graphics,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date) VALUES (2,2,'Fall Guys','Fall Guys is a massively multiplayer party game with up to 60 players online in a free-for-all struggle through round after round of escalating chaos until one victor remains! ','8GB',1,NOW(),'Intel i5', '8GB RAM','GeForce GT660', '#2ED7DE', 0,'https://store.steampowered.com/app/1097150/Fall_Guys_Ultimate_Knockout/',1,LAST_INSERT_ID(), '192.168.5.55', 5, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,processor,memory,graphics,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date) VALUES (1,3,'Overcooked','Overcooked is a chaotic couch co-op cooking game for one to four players. Working as a team, you and your fellow chefs must prepare, cook and serve up a variety of tasty orders before the baying customers storm out in a huff.','1GB',1,NOW(),'Dual Core 2.4', '2GB RAM','GeForce 8800GT', '#CB4B3B', 0,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

-- Table genre_games

INSERT INTO genres_games (id_game,id_genre) VALUES (1,1);
INSERT INTO genres_games (id_game,id_genre) VALUES (2,5);
INSERT INTO genres_games (id_game,id_genre) VALUES (3,4);

-- Table games_directx

INSERT INTO games_directx (id_game,id_directx) VALUES (1,7);
INSERT INTO games_directx (id_game,id_directx) VALUES (2,7);
INSERT INTO games_directx (id_game,id_directx) VALUES (3,7);

-- Table games_os

INSERT INTO games_os (id_game,id_operating_system) VALUES (1,1);
INSERT INTO games_os (id_game,id_operating_system) VALUES (1,2);
INSERT INTO games_os (id_game,id_operating_system) VALUES (1,3);

INSERT INTO games_os (id_game,id_operating_system) VALUES (2,1);

INSERT INTO games_os (id_game,id_operating_system) VALUES (3,1);
INSERT INTO games_os (id_game,id_operating_system) VALUES (3,2);
INSERT INTO games_os (id_game,id_operating_system) VALUES (3,3);

-- Table languages_games

INSERT INTO languages_games (id_game,id_language) VALUES (1,1);
INSERT INTO languages_games (id_game,id_language) VALUES (1,2);

INSERT INTO languages_games (id_game,id_language) VALUES (2,1);
INSERT INTO languages_games (id_game,id_language) VALUES (2,2);
INSERT INTO languages_games (id_game,id_language) VALUES (2,4);


INSERT INTO languages_games (id_game,id_language) VALUES (3,1);
INSERT INTO languages_games (id_game,id_language) VALUES (3,2);
INSERT INTO languages_games (id_game,id_language) VALUES (3,3);
INSERT INTO languages_games (id_game,id_language) VALUES (3,4);

-- Table price
INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,19.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,19.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,19.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

-- Table photos

INSERT INTO photos (id_game, photo_path, type, status) VALUES (1,'https://cdn.cloudflare.steamstatic.com/steam/apps/683320/ss_4fa618f5a2141d48a05716d43598a260235b0aaa.600x338.jpg?t=1574359986',1,1);
INSERT INTO photos (id_game, photo_path, type, status) VALUES (1,'https://cdn.cloudflare.steamstatic.com/steam/apps/683320/ss_a155ad5423e11e3e764a1a270dcf4f30323f0a35.600x338.jpg?t=1574359986',2,1);
INSERT INTO photos (id_game, photo_path, type, status) VALUES (1,'https://cdn.cloudflare.steamstatic.com/steam/apps/683320/ss_973175ba1865c5716c5f37588d00ac135b7d34ba.600x338.jpg?t=1574359986',2,1);

INSERT INTO photos (id_game, photo_path, type, status) VALUES (2,'https://cdn.cloudflare.steamstatic.com/steam/apps/1097150/ss_242e6f5aa36e166864002ed976ed0293dfe49011.600x338.jpg?t=1603922857',1,1);
INSERT INTO photos (id_game, photo_path, type, status) VALUES (2,'https://cdn.cloudflare.steamstatic.com/steam/apps/1097150/ss_b2b6b170330b8af1f50d0e90efad984adafeb281.600x338.jpg?t=1603922857',2,1);
INSERT INTO photos (id_game, photo_path, type, status) VALUES (2,'https://cdn.cloudflare.steamstatic.com/steam/apps/1097150/ss_df2d12f278d6c0203e11fece84fc50226ff077d6.600x338.jpg?t=1603922857',2,1);

INSERT INTO photos (id_game, photo_path, type, status) VALUES (3,'https://cdn.cloudflare.steamstatic.com/steam/apps/448510/ss_2a35c15c78f06dd4f23dab8a1e1917a835d0062d.600x338.jpg?t=1594197612',1,1);
INSERT INTO photos (id_game, photo_path, type, status) VALUES (3,'https://cdn.cloudflare.steamstatic.com/steam/apps/448510/ss_c307c59c18be77c920050a2d70d76929a2295879.600x338.jpg?t=1594197612',2,1);
INSERT INTO photos (id_game, photo_path, type, status) VALUES (3,'https://cdn.cloudflare.steamstatic.com/steam/apps/448510/ss_65929fedb7284c22e6a3d78e84fd4e85ca174d2a.600x338.jpg?t=1594197612',2,1);

-- Table library

INSERT INTO library (id_user,id_game,status,download) VALUES (1,2,1,0);
INSERT INTO library (id_user,id_game,status,download) VALUES (1,3,1,1);
INSERT INTO library (id_user,id_game,status,download) VALUES (2,1,1,0);
INSERT INTO library (id_user,id_game,status,download) VALUES (2,3,1,0);
INSERT INTO library (id_user,id_game,status,download) VALUES (3,1,1,1);
INSERT INTO library (id_user,id_game,status,download) VALUES (3,2,1,1);

-- Table Orders

INSERT INTO transactions VALUES (null, '192.192.1.1', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO orders (id_user, date, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (1,NOW(),0,LAST_INSERT_ID(),'192.192.1.1',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO orders (id_user, date, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (2,NOW(),1,LAST_INSERT_ID(),'192.192.1.2',2,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.3', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO orders (id_user, date, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (3,NOW(),2,LAST_INSERT_ID(),'192.192.1.3',3,NOW());

-- Table Order_detail

INSERT INTO transactions VALUES (null, '192.192.1.1', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO order_details (id_game, id_order, price, status,tx_id, tx_host, tx_user_id, tx_date ) VALUES (1,1,19.99,1,LAST_INSERT_ID(),'192.192.1.1',1,NOW());


INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO order_details (id_game, id_order, price, status,tx_id, tx_host, tx_user_id, tx_date ) VALUES (2,2,19.99,1,LAST_INSERT_ID(),'192.192.1.2',2,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.3', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO order_details (id_game, id_order, price, status,tx_id, tx_host, tx_user_id, tx_date ) VALUES (3,3,19.99,1,LAST_INSERT_ID(),'192.192.1.3',3,NOW());
