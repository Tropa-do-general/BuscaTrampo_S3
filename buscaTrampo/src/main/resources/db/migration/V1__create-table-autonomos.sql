create table autonomo(
     id bigint not null auto_increment,
     nome varchar(100) not null,
     email varchar(100) not null unique,
     senha varchar(150) not null,
     profissao varchar(200) not null,
     telefone varchar(20) not null,

     primary key (id)
);