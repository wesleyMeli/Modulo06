DROP TABLE IF EXISTS PRODUCT;

DROP TABLE IF EXISTS ALUNO;
DROP TABLE IF EXISTS DISCIPLINA;
DROP TABLE IF EXISTS DIPLOMA;

DROP TABLE IF EXISTS MESA;
DROP TABLE IF EXISTS PEDIDO;
DROP TABLE IF EXISTS PRODUTO;
DROP TABLE IF EXISTS PEDIDO_PRATO;
DROP TABLE IF EXISTS CAIXA;

DROP TABLE IF EXISTS LOJAPEDIDO;
DROP TABLE IF EXISTS LOJAPRODUTO;
DROP TABLE IF EXISTS LOJACLIENTE;
DROP TABLE IF EXISTS PEDIDO_PRODUTO;

DROP TABLE IF EXISTS STARWARS;

CREATE TABLE PRODUCT (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250),
  price NUMBER(6,2)
);

INSERT INTO PRODUCT (id, name, price) VALUES
  ('0', 'Danone', 3.50),
  ('1', 'Maca', 2.00),
  ('2', 'Banana', 1.73),
  ('3', 'Picanha', 52.27),
  ('4', 'Contra-file', 25.00);
  


CREATE TABLE ALUNO (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250)
);

INSERT INTO ALUNO (id, name) VALUES
  ('0', 'Alicia'),
  ('1', 'Marcos');
  
CREATE TABLE DISCIPLINA (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250),
  nota NUMBER(6,2),
  id_aluno INT,
  FOREIGN KEY(id_aluno) REFERENCES ALUNO(id)
);

INSERT INTO DISCIPLINA (id, name, nota, id_aluno) VALUES
  (0, 'Matematica', 8, 0),
  (1, 'Fisica', 6, 1),
  (2, 'Quimica', 8, 1),
  (3, 'Astrologia', 10, 1),
  (4, 'Mitologia', 6, 0),
  (5, 'Tecnologia', 10, 0),
  (6, 'Linguas', 8, 0),
  (7, 'Financas', 9, 1);
  
CREATE TABLE DIPLOMA (
  id INT AUTO_INCREMENT PRIMARY KEY,
  average NUMBER(6,2),
  message VARCHAR(250),
  id_aluno INT,
  FOREIGN KEY(id_aluno) REFERENCES ALUNO(id)
);  

INSERT INTO DIPLOMA (id, average, message, id_aluno) VALUES
  (0, 8,'Aprovado', 0),
  (1, 8.25,'Aprovado', 1);  
  
  
  
  
CREATE TABLE PRATO (
  id INT AUTO_INCREMENT PRIMARY KEY,
  preco NUMBER(6,2),
  descricao VARCHAR(250),
  quantidade INT
);  

INSERT INTO PRATO (id, preco, descricao, quantidade) VALUES
  (0, 25,'Frango a passarinho', 4),
  (1, 13.75,'Torresmo', 2);
  
CREATE TABLE MESA (
  id INT AUTO_INCREMENT PRIMARY KEY,
  valorTotal NUMBER(6,2)
);  

INSERT INTO MESA (id, valorTotal) VALUES
  (0, 38.75); 
  
CREATE TABLE PEDIDO (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_mesa INT,
  valorTotal NUMBER(6,2),
  FOREIGN KEY(id_mesa) REFERENCES MESA(id)
);  

INSERT INTO PEDIDO (id, id_mesa, valorTotal) VALUES
  (0, 0, 38.75); 
  
 CREATE TABLE PEDIDO_PRATO (
  ID_PEDIDO INT,
  ID_PRATO INT,
  FOREIGN KEY(ID_PEDIDO) REFERENCES PEDIDO(id),
  FOREIGN KEY(ID_PRATO) REFERENCES PRATO(id)
);  

INSERT INTO PEDIDO_PRATO (ID_PEDIDO, ID_PRATO) VALUES
  (0, 0),
  (0, 1); 
  
CREATE TABLE CAIXA (
  id INT PRIMARY KEY,
  valor NUMBER(6,2)
);  
  
CREATE TABLE LOJAPRODUTO (
  id INT AUTO_INCREMENT PRIMARY KEY,
  descricao VARCHAR(250),
  cor VARCHAR(250),
  quatidade NUMBER(6),
  preco NUMBER(6,2)

);
INSERT INTO LOJAPRODUTO (id, descricao, cor, quatidade, preco) VALUES
  ('0', 'Danone','Azul', 10, 3.50),
  ('1', 'Maca','Vermelha',  20, 2.00),
  ('2', 'Banana', 'Amarela', 15, 1.73),
  ('3', 'Picanha', 'Marrom', 2, 52.27),
  ('4', 'Contra-file', 'Marrom', 5, 25.00);
  
CREATE TABLE LOJACLIENTE (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(250),
  cpf VARCHAR(250),
  email VARCHAR(250),
  telefone VARCHAR(250)
);

INSERT INTO LOJACLIENTE (id, nome, cpf, email, telefone) VALUES
  ('0', 'Crayde','123456789','ceayde@email.com', '5511980665830');
  
  
CREATE TABLE LOJAPEDIDO (
  id INT AUTO_INCREMENT PRIMARY KEY,
  VALORTOTAL NUMBER(6,2),
  ID_CLIENTE int,
  FOREIGN KEY(ID_CLIENTE) REFERENCES LOJACLIENTE(id)
);

INSERT INTO LOJAPEDIDO (id, VALORTOTAL,ID_CLIENTE) VALUES
  ('0', 13.50, 0),
  ('1', 22.00, 0);
  
CREATE TABLE PEDIDO_PRODUTO (
  ID_PEDIDO INT,
  ID_PRODUTO INT,
  FOREIGN KEY(ID_PEDIDO) REFERENCES LOJAPEDIDO(id),
  FOREIGN KEY(ID_PRODUTO) REFERENCES LOJAPRODUTO(id)
);  

INSERT INTO PEDIDO_PRODUTO (ID_PEDIDO, ID_PRODUTO) VALUES
  (1, 0),
  (0, 1);
  
  
  -- JSON STARWARS
  
CREATE TABLE STARWARS(
   name       VARCHAR(255) PRIMARY KEY
  ,height     VARCHAR(255)
  ,mass       VARCHAR(255)
  ,hair_color VARCHAR(255)
  ,skin_color VARCHAR(255)
  ,eye_color  VARCHAR(255)
  ,birth_year VARCHAR(255)
  ,gender     VARCHAR(255)
  ,homeworld  VARCHAR(255)
  ,species    VARCHAR(255)
);
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Luke Skywalker','172','77','blond','fair','blue','19BBY','male','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('C-3PO','167','75','vazio','gold','yellow','112BBY','vazio','Tatooine','Droid');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('R2-D2','96','32','vazio','white, blue','red','33BBY','vazio','Naboo','Droid');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Darth Vader','202','136','none','white','yellow','41.9BBY','male','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Leia Organa','150','49','brown','light','brown','19BBY','female','Alderaan','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Owen Lars','178','120','brown, grey','light','blue','52BBY','male','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Beru Whitesun lars','165','75','brown','light','blue','47BBY','female','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('R5-D4','97','32','vazio','white, red','red','vazio','vazio','Tatooine','Droid');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Biggs Darklighter','183','84','black','light','brown','24BBY','male','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Obi-Wan Kenobi','182','77','auburn, white','fair','blue-gray','57BBY','male','Stewjon','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Anakin Skywalker','188','84','blond','fair','blue','41.9BBY','male','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Wilhuff Tarkin','180','vazio','auburn, grey','fair','blue','64BBY','male','Eriadu','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Chewbacca','228','112','brown','vazio','blue','200BBY','male','Kashyyyk','Wookiee');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Han Solo','180','80','brown','fair','brown','29BBY','male','Corellia','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Greedo','173','74','vazio','green','black','44BBY','male','Rodia','Rodian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Jabba Desilijic Tiure','175','1,358','vazio','green-tan, brown','orange','600BBY','hermaphrodite','Nal Hutta','Hutt');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Wedge Antilles','170','77','brown','fair','hazel','21BBY','male','Corellia','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Jek Tono Porkins','180','110','brown','fair','blue','vazio','male','Bestine IV','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Yoda','66','17','white','green','brown','896BBY','male','vazio','Yoda''s species');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Palpatine','170','75','grey','pale','yellow','82BBY','male','Naboo','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Boba Fett','183','78.2','black','fair','brown','31.5BBY','male','Kamino','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('IG-88','200','140','none','metal','red','15BBY','none','vazio','Droid');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Bossk','190','113','none','green','red','53BBY','male','Trandosha','Trandoshan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Lando Calrissian','177','79','black','dark','brown','31BBY','male','Socorro','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Lobot','175','79','none','light','blue','37BBY','male','Bespin','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Ackbar','180','83','none','brown mottle','orange','41BBY','male','Mon Cala','Mon Calamari');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Mon Mothma','150','vazio','auburn','fair','blue','48BBY','female','Chandrila','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Arvel Crynyd','vazio','vazio','brown','fair','brown','vazio','male','vazio','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Wicket Systri Warrick','88','20','brown','brown','brown','8BBY','male','Endor','Ewok');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Nien Nunb','160','68','none','grey','black','vazio','male','Sullust','Sullustan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Qui-Gon Jinn','193','89','brown','fair','blue','92BBY','male','vazio','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Nute Gunray','191','90','none','mottled green','red','vazio','male','Cato Neimoidia','Neimodian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Finis Valorum','170','vazio','blond','fair','blue','91BBY','male','Coruscant','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Jar Jar Binks','196','66','none','orange','orange','52BBY','male','Naboo','Gungan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Roos Tarpals','224','82','none','grey','orange','vazio','male','Naboo','Gungan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Rugor Nass','206','vazio','none','green','orange','vazio','male','Naboo','Gungan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Ric Olié','183','vazio','brown','fair','blue','vazio','male','Naboo','vazio');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Watto','137','vazio','black','blue, grey','yellow','vazio','male','Toydaria','Toydarian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Sebulba','112','40','none','grey, red','orange','vazio','male','Malastare','Dug');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Quarsh Panaka','183','vazio','black','dark','brown','62BBY','male','Naboo','vazio');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Shmi Skywalker','163','vazio','black','fair','brown','72BBY','female','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Darth Maul','175','80','none','red','yellow','54BBY','male','Dathomir','Zabrak');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Bib Fortuna','180','vazio','none','pale','pink','vazio','male','Ryloth','Twi''lek');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Ayla Secura','178','55','none','blue','hazel','48BBY','female','Ryloth','Twi''lek');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Dud Bolt','94','45','none','blue, grey','yellow','vazio','male','Vulpter','Vulptereen');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Gasgano','122','vazio','none','white, blue','black','vazio','male','Troiken','Xexto');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Ben Quadinaros','163','65','none','grey, green, yellow','orange','vazio','male','Tund','Toong');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Mace Windu','188','84','none','dark','brown','72BBY','male','Haruun Kal','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Ki-Adi-Mundi','198','82','white','pale','yellow','92BBY','male','Cerea','Cerean');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Kit Fisto','196','87','none','green','black','vazio','male','Glee Anselm','Nautolan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Eeth Koth','171','vazio','black','brown','brown','vazio','male','Iridonia','Zabrak');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Adi Gallia','184','50','none','dark','blue','vazio','female','Coruscant','Tholothian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Saesee Tiin','188','vazio','none','pale','orange','vazio','male','Iktotch','Iktotchi');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Yarael Poof','264','vazio','none','white','yellow','vazio','male','Quermia','Quermian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Plo Koon','188','80','none','orange','black','22BBY','male','Dorin','Kel Dor');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Mas Amedda','196','vazio','none','blue','blue','vazio','male','Champala','Chagrian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Gregar Typho','185','85','black','dark','brown','vazio','male','Naboo','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Cordé','157','vazio','brown','light','brown','vazio','female','Naboo','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Cliegg Lars','183','vazio','brown','fair','blue','82BBY','male','Tatooine','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Poggle the Lesser','183','80','none','green','yellow','vazio','male','Geonosis','Geonosian');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Luminara Unduli','170','56.2','black','yellow','blue','58BBY','female','Mirial','Mirialan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Barriss Offee','166','50','black','yellow','blue','40BBY','female','Mirial','Mirialan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Dormé','165','vazio','brown','light','brown','vazio','female','Naboo','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Dooku','193','80','white','fair','brown','102BBY','male','Serenno','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Bail Prestor Organa','191','vazio','black','tan','brown','67BBY','male','Alderaan','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Jango Fett','183','79','black','tan','brown','66BBY','male','Concord Dawn','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Zam Wesell','168','55','blonde','fair, green, yellow','yellow','vazio','female','Zolan','Clawdite');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Dexter Jettster','198','102','none','brown','yellow','vazio','male','Ojom','Besalisk');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Lama Su','229','88','none','grey','black','vazio','male','Kamino','Kaminoan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Taun We','213','vazio','none','grey','black','vazio','female','Kamino','Kaminoan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Jocasta Nu','167','vazio','white','fair','blue','vazio','female','Coruscant','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Ratts Tyerell','79','15','none','grey, blue','vazio','vazio','male','Aleen Minor','Aleena');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('R4-P17','96','vazio','none','silver, red','red, blue','vazio','female','vazio','vazio');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Wat Tambor','193','48','none','green, grey','vazio','vazio','male','Skako','Skakoan');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('San Hill','191','vazio','none','grey','gold','vazio','male','Muunilinst','Muun');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Shaak Ti','178','57','none','red, blue, white','black','vazio','female','Shili','Togruta');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Grievous','216','159','none','brown, white','green, yellow','vazio','male','Kalee','Kaleesh');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Tarfful','234','136','brown','brown','blue','vazio','male','Kashyyyk','Wookiee');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Raymus Antilles','188','79','brown','light','brown','vazio','male','Alderaan','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Sly Moore','178','48','none','pale','white','vazio','female','Umbara','vazio');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Tion Medon','206','80','none','grey','black','vazio','male','Utapau','Pau''an');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Finn','vazio','vazio','black','dark','dark','vazio','male','vazio','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Rey','vazio','vazio','brown','light','hazel','vazio','female','vazio','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Poe Dameron','vazio','vazio','brown','light','brown','vazio','male','vazio','Human');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('BB8','vazio','vazio','none','none','black','vazio','none','vazio','Droid');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Captain Phasma','vazio','vazio','vazio','vazio','vazio','vazio','female','vazio','vazio');
INSERT INTO STARWARS(name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,species) VALUES ('Padmé Amidala','165','45','brown','light','brown','46BBY','female','Naboo','Human');
  