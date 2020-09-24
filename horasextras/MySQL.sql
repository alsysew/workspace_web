create database projetohoraextra;
drop table projetohoraextra.itmn232_usuario;

use projetohoraextra;

insert into itmn232_usuario values
(null, 'isidro@isidro.com', 1,
   'https://avatars2.githubusercontent.com/u/6184696?s=460&v=4',
   'Professor Isidro' , '1234567','1234');
  
insert into itmn232_usuario values
(null, 'pedro@pedro.com', 0,
   '', 'Pedro Developer', '1234568', ' 1234');
  
insert into itmn232_usuario values
(null, 'ana@ana.com' , 0, '', 'Ana Designer', '1234569', '1234');


select * from itmn232_atividade;

insert into itmn232_atividade values
(null, "Execução de Mudança Planejada"),
(null, "Acionamento por Mudança"),
(null, "Acionamento por Incidente"),
(null, "Acionamento Indevido"),
(null, "Cobertura de Turnos"),
(null, "Cancelamento de Rotina Batch"),
(null, "Teste de Comunidade"),
(null, "Sustentação e Operação (24x7)"),
(null, "Implantação de Projetos"),
(null, "War Room"),
(null, "TOP TI"),
(null, "Horas não compensadas no mês"),
(null, "Outros");


use projetohoraextra;

create table itmn232_ocorrencia(
	num_seq integer not null auto_increment,
	id_usuario integer not null,
    id_atividade integer not null,
    descricao text,
    data_oc date,
    num_horas time,
    ponto_manual integer,
    status_oc integer,
    
    constraint pk_oc primary key (num_seq),
    constraint fk_us foreign key (id_usuario) references itmn232_usuario(id_usuario),
    constraint fk_at foreign key (id_atividade) references itmn232_atividade(id_atividade)) engine=MyISAM;
    
    
    
    insert into itmn232_ocorrencia values 
    (null, 1, 10,'', '2020-09-08','02:30', 0,0);
    
    
    
    select * from itmn232_usuario;
    
    update itmn232_usuario set link_foto="https://conteudo.imguol.com.br/c/entretenimento/12/2019/01/30/ana-carolina-1548857596625_v2_450x450.pngx" where id_usuario=3;