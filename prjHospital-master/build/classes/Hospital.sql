create database hospital;

use hospital;

create table tb_hospital(
id int auto_increment primary key,
nome varchar(45),
endereco varchar(100)
);

create table paciente(
cd int auto_increment primary key,
nome varchar(50),
cpf varchar(14) not null,
rg varchar(20),
idade int,
senha varchar(45),
id_hospital int not null,
foreign key(id_hospital) references tb_hospital(id)
);

create table funcionarios(
cd int auto_increment primary key,
nome varchar(50),
cpf varchar(14) not null,
rg varchar(20),
idade int,
senha varchar(45),
id_hospital int not null,
foreign key(id_hospital) references tb_hospital(id),
valor_hora decimal(5,2)
);

create table prontoSocorro(
cd int auto_increment primary key,
id_hospital int not null,
foreign key(id_hospital) references tb_hospital(id),
endereco varchar(100)
);

create table Medicos(
cd int auto_increment primary key,
id_funcionario int not null,
crm varchar(45),
especialidade varchar(45),
foreign key(id_funcionario) references funcionarios(cd)
);

create table Enfermeiros(
cd int auto_increment primary key,
id_funcionario int not null,
corem varchar(45),
foreign key(id_funcionario) references funcionarios(cd)
);

select * from tb_hospital; 


