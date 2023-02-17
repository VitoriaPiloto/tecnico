create database vih;
use vih;
create table empregado (
`matr` int not null,
`nome` varchar(255) not null,
`nascimento` date not null,
`sexo` char(1) 
check(sexo in ('F','M')), 
`rg` varchar(10) not null unique,
`cpf` bigint unique,
`email` varchar(30) not null unique,
`log` varchar(30), `comp` varchar(30),
`uf` char(3),`bairro` varchar(20),
`municipio` varchar(30),`cep` bigint,
primary key(`matr`));

create table cliente(
`codcl` int not null, 
`nome` varchar(100) not null,
`rg` varchar(10) not null unique,
`cpf` bigint,
`email` varchar(50) not null unique, 
primary key(`codcl`));