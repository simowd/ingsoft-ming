-- Trigger h_games

delimiter //
CREATE TRIGGER tg_ins_h_games AFTER INSERT ON games
    FOR EACH ROW
    BEGIN
        INSERT INTO h_games VALUES (null, NEW.id_game,NEW.id_esrb, NEW.id_developer,NEW.name,NEW.description,NEW.size,NEW.players,NEW.release_date,NEW.color,NEW.highlight,NEW.download_path,NEW.status,NEW.tx_id, NEW.tx_host, NEW.tx_user_id, NEW.tx_date);
    END;//
delimiter ;

delimiter //
CREATE TRIGGER tg_upd_h_games AFTER UPDATE ON games
    FOR EACH ROW
    BEGIN
        INSERT INTO h_games VALUES (null, NEW.id_game,NEW.id_esrb, NEW.id_developer,NEW.name,NEW.description,NEW.size,NEW.players,NEW.release_date,NEW.color,NEW.highlight,NEW.download_path,NEW.status,NEW.tx_id, NEW.tx_host, NEW.tx_user_id, NEW.tx_date);
    END;//
delimiter ;

-- Table countries
      
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Afganistán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Gland',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Albania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Alemania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Andorra',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Angola',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Anguilla',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Antártida',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Antigua y Barbuda',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Antillas Holandesas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Arabia Saudí',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Argelia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Argentina',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Armenia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Aruba',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Australia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Austria',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Azerbaiyán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bahamas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bahréin',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bangladesh',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Barbados',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bielorrusia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bélgica',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Belice',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Benin',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bermudas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bhután',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bolivia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bosnia y Herzegovina',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Botsuana',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Isla Bouvet',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Brasil',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Brunéi',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Bulgaria',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Burkina Faso',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Burundi',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Cabo Verde',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Caimán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Camboya',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Camerún',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Canadá',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('República Centroafricana',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Chad',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('República Checa',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Chile',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('China',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Chipre',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Isla de Navidad',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Ciudad del Vaticano',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Cocos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Colombia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Comoras',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('República Democrática del Congo',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Congo',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Cook',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Corea del Norte',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Corea del Sur',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Costa de Marfil',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Costa Rica',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Croacia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Cuba',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Dinamarca',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Dominica',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('República Dominicana',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Ecuador',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Egipto',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('El Salvador',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Emiratos Árabes Unidos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Eritrea',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Eslovaquia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Eslovenia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('España',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas ultramarinas de Estados Unidos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Estados Unidos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Estonia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Etiopía',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Feroe',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Filipinas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Finlandia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Fiyi',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Francia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Gabón',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Gambia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Georgia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Georgias del Sur y Sandwich del Sur',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Ghana',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Gibraltar',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Granada',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Grecia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Groenlandia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guadalupe',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guam',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guatemala',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guayana Francesa',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guinea',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guinea Ecuatorial',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guinea-Bissau',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Guyana',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Haití',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Heard y McDonald',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Honduras',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Hong Kong',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Hungría',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('India',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Indonesia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Irán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Iraq',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Irlanda',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islandia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Israel',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Italia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Jamaica',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Japón',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Jordania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Kazajstán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Kenia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Kirguistán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Kiribati',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Kuwait',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Laos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Lesotho',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Letonia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Líbano',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Liberia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Libia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Liechtenstein',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Lituania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Luxemburgo',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Macao',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('ARY Macedonia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Madagascar',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Malasia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Malawi',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Maldivas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Malí',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Malta',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Malvinas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Marianas del Norte',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Marruecos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Marshall',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Martinica',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mauricio',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mauritania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mayotte',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('México',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Micronesia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Moldavia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mónaco',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mongolia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Montserrat',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mozambique',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Myanmar',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Namibia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Nauru',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Nepal',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Nicaragua',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Níger',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Nigeria',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Niue',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Isla Norfolk',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Noruega',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Nueva Caledonia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Nueva Zelanda',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Omán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Países Bajos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Pakistán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Palau',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Palestina',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Panamá',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Papúa Nueva Guinea',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Paraguay',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Perú',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Pitcairn',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Polinesia Francesa',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Polonia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Portugal',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Puerto Rico',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Qatar',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Reino Unido',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Reunión',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Ruanda',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Rumania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Rusia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Sahara Occidental',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Salomón',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Samoa',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Samoa Americana',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('San Cristóbal y Nevis',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('San Marino',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('San Pedro y Miquelón',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('San Vicente y las Granadinas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Santa Helena',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Santa Lucía',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Santo Tomé y Príncipe',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Senegal',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Serbia y Montenegro',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Seychelles',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Sierra Leona',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Singapur',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Siria',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Somalia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Sri Lanka',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Suazilandia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Sudáfrica',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Sudán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Suecia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Suiza',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Surinam',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Svalbard y Jan Mayen',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Tailandia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Taiwán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Tanzania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Tayikistán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Territorio Británico del Océano Índico',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Territorios Australes Franceses',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Timor Oriental',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Togo',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Tokelau',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Tonga',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Trinidad y Tobago',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Túnez',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Turcas y Caicos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Turkmenistán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Turquía',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Tuvalu',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Ucrania',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Uganda',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Uruguay',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Uzbekistán',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Vanuatu',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Venezuela',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Vietnam',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Vírgenes Británicas',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Islas Vírgenes de los Estados Unidos',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Wallis y Futuna',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Yemen',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Yibuti',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Zambia',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO countries (name,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Zimbabue',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table languages

INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)  VALUES('Español',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)  VALUES('English',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)   VALUES('Deutsch',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)   VALUES('Português',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)   VALUES('Français',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)   VALUES('Italiano',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)   VALUES('日本語',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages (language,status,tx_id,tx_host,tx_user_id,tx_date)   VALUES('한국어',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table esrb

INSERT INTO esrb (esrb, logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Everyone', 'https://www.esrb.org/wp-content/uploads/2019/05/E.svg',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO esrb (esrb, logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Everyone 10+', 'https://www.esrb.org/wp-content/uploads/2019/05/E10plus.svg',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO esrb (esrb, logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Teen', 'https://www.esrb.org/wp-content/uploads/2019/05/T.svg',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO esrb (esrb, logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Mature 17+', 'https://www.esrb.org/wp-content/uploads/2019/05/M.svg',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO esrb (esrb, logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Adults Only', 'https://www.esrb.org/wp-content/uploads/2019/05/AO.svg',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO esrb (esrb, logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Rating Pending', 'https://www.esrb.org/wp-content/uploads/2019/05/RP.svg',1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table directx

INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 12',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 11.3',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 11.2',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 11.1',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 11',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 10.1',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO directx (version,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('DirectX 10',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());

-- Table genres

INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Aventura',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Disparos',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Educativos',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Estrategia',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Peleas',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Survival Horror',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Plataformas',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Rol',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Mundo Abierto',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Novela Gráfica',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO genres (genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES('Deportes',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());


-- Table operating_system

INSERT INTO operating_system (operating_system,logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Windows', 'https://www.flaticon.com/svg/static/icons/svg/732/732076.svg',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO operating_system (operating_system,logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('Linux', 'https://www.flaticon.com/svg/static/icons/svg/731/731985.svg',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO operating_system (operating_system,logo_path,status,tx_id,tx_host,tx_user_id,tx_date) VALUES ('MacOS', 'https://www.flaticon.com/svg/static/icons/svg/121/121147.svg',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());

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

INSERT INTO transactions VALUES (null, '192.168.2.3', 7, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'QueenNai25','qwerty12345','eljojos@gmail.com',1,'https://i.pinimg.com/564x/93/ac/06/93ac06f07613955584a1cc22205c2094.jpg','Diego','BombasLocas','Dodgeeee',1,LAST_INSERT_ID(),'192.168.2.3',6,NOW());

INSERT INTO transactions VALUES (null, '192.168.2.3', 7, now());
SELECT LAST_INSERT_ID();
INSERT INTO users (id_country,username,password,email,user_type,photo_path,name,lastname,alias,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'WachoDog69','qwerty12345','bugisoft@gmail.com',1,'https://i.pinimg.com/564x/93/ac/06/93ac06f07613955584a1cc22205c2094.jpg','Diego','BombasLocas','washin',1,LAST_INSERT_ID(),'192.168.2.3',6,NOW());

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

INSERT INTO transactions VALUES (null, '192.168.1.10', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO publishers (id_user, publisher, paypal_mail, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (7,'Humble Bundle Publishing','choquito@humblebundle.com',1,LAST_INSERT_ID(),'192.168.1.10',1,NOW());

INSERT INTO transactions VALUES (null, '192.168.1.10', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO publishers (id_user, publisher, paypal_mail, status, tx_id, tx_host, tx_user_id, tx_date) VALUES (8,'Ubisoft','bugs@ubisoft.com',1,LAST_INSERT_ID(),'192.168.1.10',1,NOW());

-- Table publisher_earnings

INSERT INTO transactions VALUES (null, '192.168.1.10', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO publisher_earnings (id_publisher,amount,expenditure_date,card,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,39.990000,NOW(),'Visa',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());

-- Table developers

INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Nomada Studio',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Mediatonic',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,'Ghost Town Games',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Dennaton Games',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Dodge Roll',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,'Playtonic Games',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'Askiisoft',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,'Gears for Breakfast',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,'Blue Mammoth Games',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,'HopFrog',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());
INSERT INTO developers(id_publisher, developer,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,'Crema',1,LAST_INSERT_ID(),'192.168.1.10', 1, now());

-- Table games

INSERT INTO transactions VALUES (null, '192.168.5.55', 4, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date) VALUES (2,1,'GRIS','Gris is a hopeful young girl lost in her own world, dealing with a painful experience in her life. Her journey through sorrow is manifested in her dress, which grants new abilities to better navigate her faded reality.','1.1GB',1,NOW(),'#F4B9B5', 0,'https://www.gog.com/game/gris',1,LAST_INSERT_ID(), '192.168.5.55', 4, NOW());

INSERT INTO transactions VALUES (null, '192.168.5.55', 5, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (2,2,'Fall Guys','Fall Guys is a massively multiplayer party game with up to 60 players online in a free-for-all struggle through round after round of escalating chaos until one victor remains! ','8GB',1,NOW(), '#2ED7DE', 1,'https://store.steampowered.com/app/1097150/Fall_Guys_Ultimate_Knockout/',1,LAST_INSERT_ID(), '192.168.5.55', 5, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (1,3,'Overcooked','Overcooked is a chaotic couch co-op cooking game for one to four players. Working as a team, you and your fellow chefs must prepare, cook and serve up a variety of tasty orders before the baying customers storm out in a huff.','1GB',1,NOW(), '#CB4B3B', 0,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (4,4,'Hotline Miami','Hotline Miami is a high-octane action game overflowing with raw brutality, hard-boiled gunplay and skull crushing close combat. Set in an alternative 1989 Miami, you will assume the role of a mysterious antihero on a murderous rampage against the shady underworld at the behest of voices on your answering machine. Soon you\'ll find yourself struggling to get a grip of what is going on and why you are prone to these acts of violence.','1GB',1,NOW(), '#f746b8', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (3,5,'Enter the Gungeon','Enter the Gungeon is a bullet hell dungeon crawler following a band of misfits seeking to shoot, loot, dodge roll and table-flip their way to personal absolution by reaching the legendary Gungeon’s ultimate treasure: the gun that can kill the past. Select a hero [or team up in co-op] and battle your way to the bottom of the Gungeon by surviving a challenging and evolving series of floors filled with the dangerously adorable Gundead and fearsome Gungeon bosses armed to the teeth. Gather precious loot, discover hidden secrets, and chat with opportunistic merchants and shopkeepers to purchase powerful items to gain an edge.','5GB',1,NOW(), '#1a0a49', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (2,6,'Yooka Laylee','Yooka-Laylee is an all-new open-world platformer from genre veterans Playtonic! Explore huge, beautiful worlds, meet (and beat) an unforgettable cast of characters and horde a vault-load of shiny collectibles as buddy-duo Yooka (the green one) and Laylee (the wisecracking bat with the big nose) embark on an epic adventure to thwart corporate creep Capital B and his devious scheme to absorb all the world’s books… and convert them into pure profit!','9GB',1,NOW(), '#319517', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (4,7,'Katana ZERO','Katana ZERO is a stylish neo-noir, action-platformer featuring breakneck action and instant-death combat. Slash, dash, and manipulate time to unravel your past in a beautifully brutal acrobatic display.','200MB',1,NOW(), '#2bd8ec', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (2,8,'A Hat in Time','In A Hat in Time you play as a tiny space-travelling girl with a big tophat. Her adventure is halted when all her fuel, the Time Pieces, is lost and scattered across a nearby planet. Hat Kid must now jump, fight and stitch new hats to make her way into every nook and cranny of this new world in order to restore her fuel and resume her journey. On her way, she\'ll bump into the menacing Mafia of Cooks, the goofy birds of Dead Bird Studio, the spooky shadows of Subcon Forest, and more!','8GB',1,NOW(), '#221350', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (1,9,'Brawlhalla','History\'s greatest warriors brawl to prove who\'s the best in an epic test of strength and skill. These slugfests are salted with powerful weapons and gadgets. Every weapon you pick up changes your style of play. Brawlhalla is a free 2D platform fighting game that supports up to 8 local or online players with full cross-play for PC, Xbox One, PS4, Nintendo Switch, iOS, and Android!','350MB',1,NOW(), '#fecc29', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (1,10,'Forager','The highly popular and quirky "idle game that you want to actively keep playing". Explore, craft, gather & manage resources, find secrets and build your base out of nothing! Buy land to explore and expand! Originally made for a jam (in which Forager won second place!), over 200,000 players tried and LOVED the prototype! You were all asking for MORE FORAGER, so here it goes! A full 15+ hour experience for everyone on Steam!','250MB',1,NOW(), '#fe9768', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (3,5,'Exit the Gungeon','Exit the Gungeon is a small, arcade-style, spin-off \'dungeon climber\' that immediately follows the adventures of the misfit Gungeoneers attempting to survive a series of increasingly dangerous elevators and countless waves of enemies. The Gungeon has become a paradox and is collapsing! Blessed by the magic of the Sorceress, your gun will change rapidly as you ascend the Gungeon. The better you play, and the higher your combo, the more powerful the form your gun will take.','5GB',1,NOW(), '#1a0a49', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

INSERT INTO transactions VALUES (null, '192.168.6.100', 6, now());
SELECT LAST_INSERT_ID();
INSERT INTO games (id_esrb,id_developer,name,description,size,players,release_date,color,highlight,download_path,status,tx_id, tx_host, tx_user_id, tx_date
) VALUES (3,11,'Temtem','Temtem is a massively multiplayer creature-collection adventure. Seek adventure in the lovely Airborne Archipelago alongside your Temtem squad. Catch every Temtem, battle other tamers, customize your house, join a friend\'s adventure or explore the dynamic online world.','5GB',1,NOW(), '#edbf6c', 1,'https://www.gog.com/game/overcooked_gourmet_edition',1,LAST_INSERT_ID(), '192.168.6.100', 6, NOW());

-- Table genres_games

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,5,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,5,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,8,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO genres_games (id_game,id_genre,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,8,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table games_directx

INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_directx (id_game,id_directx,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,7,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table games_os

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO games_os (id_game,id_operating_system,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());


-- Table languages_games

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());


INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,5,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,6,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,5,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,6,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,4,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,5,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,6,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO languages_games (id_game,id_language,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,3,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table game_requirements

INSERT INTO transactions VALUES (null, '192.168.6.100', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,1,'Intel Core i7','12 GB','Geforce 940mx',1,LAST_INSERT_ID(),'192.168.6.100',1,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.101', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,1,'Intel Core i9','8 GB','Geforce 3070i',1,LAST_INSERT_ID(),'192.168.6.101',2,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,1,'Intel Core i3','4 GB','Geforce 104i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,1,'Intel Patito','1 GB','Geforce 104i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

INSERT INTO transactions VALUES (null, '192.168.6.103', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO game_requirements (id_game,id_operating_system,processor,memory,graphics,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,1,'Intel Core i5','16 GB','Geforce 1040i',1,LAST_INSERT_ID(),'192.168.6.102',3,NOW());

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

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,9.99,NOW(),50,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,14.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,24.99,NOW(),25,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,19.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,14.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,0,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,19.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,14.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO price (id_game,price,date,sale,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,39.99,NOW(),0,1,LAST_INSERT_ID(),'192.192.1.2',1,NOW());

-- Table photos

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'https://images.hdqwalls.com/wallpapers/gris-zy.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'https://cdn.cloudflare.steamstatic.com/steam/apps/683320/ss_a155ad5423e11e3e764a1a270dcf4f30323f0a35.600x338.jpg?t=1574359986',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,'https://cdn.cloudflare.steamstatic.com/steam/apps/683320/ss_973175ba1865c5716c5f37588d00ac135b7d34ba.600x338.jpg?t=1574359986',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,'https://wallpapercave.com/wp/wp7048889.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,'https://cdn.cloudflare.steamstatic.com/steam/apps/1097150/ss_b2b6b170330b8af1f50d0e90efad984adafeb281.600x338.jpg?t=1603922857',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,'https://cdn.cloudflare.steamstatic.com/steam/apps/1097150/ss_df2d12f278d6c0203e11fece84fc50226ff077d6.600x338.jpg?t=1603922857',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,'https://images.pushsquare.com/a8e84bb43f1f0/overcooked-online-multiplayer-guide-ps4-playstation-4.original.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,'https://cdn.cloudflare.steamstatic.com/steam/apps/448510/ss_c307c59c18be77c920050a2d70d76929a2295879.600x338.jpg?t=1594197612',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,'https://cdn.cloudflare.steamstatic.com/steam/apps/448510/ss_65929fedb7284c22e6a3d78e84fd4e85ca174d2a.600x338.jpg?t=1594197612',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,'https://external-preview.redd.it/pZWzjtkaQFP_hmlvAFNj7lhsq15MESv7mf5rP9G6C3E.jpg?auto=webp&s=cb7f2edd091336e4ccef180522469ba3be862c8f',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,'https://steamcdn-a.akamaihd.net/steam/apps/219150/ss_263387d83df0626c58a484baa8f78f9394074b76.600x338.jpg?t=1603501662',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (4,'https://steamcdn-a.akamaihd.net/steam/apps/219150/ss_75386edf15a48d844dc28ffdc61eb5c458d68533.600x338.jpg?t=1603501662',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,'https://vistapointe.net/images/enter-the-gungeon-wallpaper-19.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,'https://steamcdn-a.akamaihd.net/steam/apps/311690/ss_bca0036bc452b872a7d9ee3de9e0c9548e8cd4f5.116x65.jpg?t=1598923827',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (5,'https://steamcdn-a.akamaihd.net/steam/apps/311690/ss_ecdf8986898c7d866d419943eb7c7cbef42754bd.600x338.jpg?t=1598923827',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,'https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_4/H2x1_NSwitch_YookaLaylee.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,'https://steamcdn-a.akamaihd.net/steam/apps/360830/ss_f2162c85edbdaaeb768abaa6730588b049eda216.600x338.jpg?t=1596099819',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (6,'https://steamcdn-a.akamaihd.net/steam/apps/360830/ss_bf7ac867228bd41375c3c58aa6af48e91b341326.600x338.jpg?t=1596099819',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,'https://images4.alphacoders.com/106/thumb-1920-1063600.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,'https://steamcdn-a.akamaihd.net/steam/apps/460950/ss_9c5b43f5a2ab00b35857b8ccb0c4a24a9755091f.600x338.jpg?t=1593451079',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (7,'https://steamcdn-a.akamaihd.net/steam/apps/460950/ss_b33ce3a83dfa206b0927f50076f6092d6e478736.600x338.jpg?t=1593451079',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,'https://images8.alphacoders.com/888/thumb-1920-888084.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,'https://steamcdn-a.akamaihd.net/steam/apps/253230/ss_eb442a7301b8a0d8e94c4064575ebe68d77deb12.600x338.jpg?t=1589582654',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (8,'https://steamcdn-a.akamaihd.net/steam/apps/253230/ss_6c4cd183a85ba42f93eb4d39743ed0e43c164351.600x338.jpg?t=1589582654',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,'https://www.f2p.com/wp-content/uploads/2017/05/Brawlhalla-wallpaper-4.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,'https://steamcdn-a.akamaihd.net/steam/apps/291550/ss_47bfee537422508aa0e0f9d8aad5c0646fa5d9f5.600x338.jpg?t=1604429982',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (9,'https://steamcdn-a.akamaihd.net/steam/apps/291550/ss_166e9fe5e40992872500387d201b23070688a29d.600x338.jpg?t=1604429982',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,'https://geekisphere.com/wp-content/uploads/2019/05/Forager-cover.png',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,'https://steamcdn-a.akamaihd.net/steam/apps/751780/ss_d88521fbcbf66e7e8ca9b920c379ec5356c85d5d.600x338.jpg?t=1593722880',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (10,'https://steamcdn-a.akamaihd.net/steam/apps/751780/ss_3d02565e1349a3231828ca6a941dec2dda3c087a.600x338.jpg?t=1593722880',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,'https://images8.alphacoders.com/108/thumb-1920-1083986.png',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,'https://steamcdn-a.akamaihd.net/steam/apps/1209490/ss_d29f4e82049e03484c80670a462d3cc1e244b5d3.600x338.jpg?t=1605291478',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (11,'https://steamcdn-a.akamaihd.net/steam/apps/1209490/ss_56464b752a3f5b1d972c3ebb4030abe758185006.600x338.jpg?t=1605291478',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,'https://static.giga.de/wp-content/uploads/2020/02/temtem.jpg',1,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,'https://steamcdn-a.akamaihd.net/steam/apps/745920/ss_053909ef657ef86e75beafa86519d453ff6140ed.600x338.jpg?t=1595383096',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());
INSERT INTO photos (id_game, photo_path, type, status,tx_id,tx_host,tx_user_id,tx_date) VALUES (12,'https://steamcdn-a.akamaihd.net/steam/apps/745920/ss_c85267d255c8861e47744771593de5dc8aa6c1b1.600x338.jpg?t=1595383096',2,1,LAST_INSERT_ID(),'127.0.0.0',1,NOW());

-- Table library

INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO library (id_user,id_game,download,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,2,1,1,LAST_INSERT_ID(),'192.192.1.2', 2,NOW());
INSERT INTO transactions VALUES (null, '192.192.1.2', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO library (id_user,id_game,download,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (1,3,0,1,LAST_INSERT_ID(),'192.192.1.2', 3,NOW());
INSERT INTO transactions VALUES (null, '192.192.1.2', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO library (id_user,id_game,download,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,1,1,1,LAST_INSERT_ID(),'192.192.1.2', 1,NOW());
INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO library (id_user,id_game,download,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (2,3,0,1,LAST_INSERT_ID(),'192.192.1.2', 2,NOW());
INSERT INTO transactions VALUES (null, '192.192.1.2', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO library (id_user,id_game,download,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,1,1,1,LAST_INSERT_ID(),'192.192.1.2', 3,NOW());
INSERT INTO transactions VALUES (null, '192.192.1.2', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO library (id_user,id_game,download,status,tx_id,tx_host,tx_user_id,tx_date) VALUES (3,2,1,1,LAST_INSERT_ID(),'192.192.1.2', 1,NOW());

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

-- Table Order_details

INSERT INTO transactions VALUES (null, '192.192.1.1', 1, now());
SELECT LAST_INSERT_ID();
INSERT INTO order_details (id_game, id_order, price, status,tx_id, tx_host, tx_user_id, tx_date ) VALUES (1,1,19.99,1,LAST_INSERT_ID(),'192.192.1.1',1,NOW());


INSERT INTO transactions VALUES (null, '192.192.1.2', 2, now());
SELECT LAST_INSERT_ID();
INSERT INTO order_details (id_game, id_order, price, status,tx_id, tx_host, tx_user_id, tx_date ) VALUES (2,2,19.99,1,LAST_INSERT_ID(),'192.192.1.2',2,NOW());

INSERT INTO transactions VALUES (null, '192.192.1.3', 3, now());
SELECT LAST_INSERT_ID();
INSERT INTO order_details (id_game, id_order, price, status,tx_id, tx_host, tx_user_id, tx_date ) VALUES (3,3,19.99,1,LAST_INSERT_ID(),'192.192.1.3',3,NOW());
