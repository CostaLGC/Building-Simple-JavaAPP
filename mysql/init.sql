CREATE DATABASE IF NOT EXISTS contatos;
USE contatos;
CREATE TABLE Persons (
    PersonID int NOT NULL AUTO_INCREMENT,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
    PRIMARY KEY(PersonID)
);
INSERT INTO Persons (LastName, FirstName, Address, City) VALUES
('Silva', 'João', 'Rua A, 123', 'São Paulo'),
('Santos', 'Maria', 'Av. B, 456', 'Rio de Janeiro'),
('Oliveira', 'Pedro', 'Rua C, 789', 'Belo Horizonte'),
('Souza', 'Ana', 'Av. D, 321', 'Porto Alegre'),
('Ferreira', 'José', 'Rua E, 654', 'Salvador'),
('Almeida', 'Mariana', 'Av. F, 987', 'Curitiba'),
('Costa', 'Carlos', 'Rua G, 234', 'Recife'),
('Rodrigues', 'Camila', 'Av. H, 567', 'Fortaleza'),
('Pereira', 'Lucas', 'Rua I, 890', 'Brasília'),
('Gomes', 'Isabela', 'Av. J, 432', 'Manaus');
