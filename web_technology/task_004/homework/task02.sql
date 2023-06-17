
-- create
CREATE TABLE students (
  Id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  age TEXT NOT NULL,
  adress TEXT NOT NULL
);

-- insert
INSERT INTO students VALUES (0001, 'Serge', 20, 'Moskow');
INSERT INTO students VALUES (0002, 'Ivan', 25, 'Rostov');
INSERT INTO students VALUES (0003, 'Ira', 18, 'Piter');
INSERT INTO students VALUES (0004, 'Oleg', 12, 'Sochi');
INSERT INTO students VALUES (0005, 'Igor', 50, 'Tula');
INSERT INTO students VALUES (0006, 'Vera', 41, 'NSK');
INSERT INTO students VALUES (0007, 'Vova', 34, 'Donbas');

-- fetch 
SELECT * FROM students WHERE age >= 18 and adress= 'Moskow';
