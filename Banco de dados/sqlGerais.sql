select * from empregado;

select distinct codcliente from conta; 


select nomemp, cargo from empregado where bairro = 'Savassi';


select NomEmp, CidEmp from Empregado where MatEmp = 11;



select NomEmp from Empregado where NomEmp like '%_a%';



select * from Empregado where (Salario between 3000 and 40000) and coddepto = 1;
select * from Empregado where (Salario between 3000 and 40000) or coddepto = 1;

select nomemp from Empregado where cargo not in ('Vendedor', 'Presidente');
select nomemp from Empregado where cargo in ('Vendedor', 'Presidente');

select nomemp from Empregado where comissao is null and coddepto = 10
select nomemp from Empregado where comissao is not null and coddepto = 1


select sum(salario) as soma, max(salario) as maior, min(salario) as menor, avg(salario) as media from empregado;


select count(*) from empregado; 




