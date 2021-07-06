DROP TABLE IF EXISTS PRODUCT;
DROP TABLE IF EXISTS ALUNO;
DROP TABLE IF EXISTS DISCIPLINA;

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
  
  
  
  
  
  
  
  