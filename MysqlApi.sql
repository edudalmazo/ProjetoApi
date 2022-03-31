create database CorrentistaFluxo;

use revision;

Create table correntista(
ag int not null,
conta int not null,
nome varchar(50) not null,
email varchar(80) not null,
telefone char(11) not null,
saldo decimal(8,2) not null,
primary key (ag,conta));

describe correntista;

insert into correntista
(ag,conta,nome,email,telefone,saldo)
values
(0258,24879,"Murilio","murilio@gmail.com.br","5587-8976",2500.00),
(0259,24880,"Camila","camila@gmail.com.br","4487-7483",3000.00);

Select * From correntista;

drop table correntista;

drop table fluxo_caixa;

create table fluxo_caixa(
ag int not null,
conta int not null,
fluxo int not null,
entrada decimal(8,2) not null,
saida decimal(8,2) not null,
primary key(ag,conta,fluxo));

insert into fluxo_caixa
(ag,conta,fluxo,entrada,saida)
values
(0258,24879,10,1000,0),
(0259,24880,11,1500,0);

select * from fluxo_caixa;

select c.ag,c.conta,c.nome,f.entrada,f.saida
from correntista as c,
fluxo_caixa as f
where (c.ag=f.ag) and (c.conta=f.conta);





