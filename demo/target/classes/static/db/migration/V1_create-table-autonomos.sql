create table autonomos(
    id bigint not null  auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    senha varchar(100) not null,
    areaDeTrabalho varchar(100) not null,
    cep varchar(9) not null ,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    complemento varchar(100),
    numero varchar(100),
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key (id)
);