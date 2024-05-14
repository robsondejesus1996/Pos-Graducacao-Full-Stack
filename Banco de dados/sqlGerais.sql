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


select nomemp from empregado order by nomemp desc;

select CodDepto, COUNT(*) as qtd, AVG(Salario) as sal
from Empregado
GROUP BY CodDepto;

select P.CodProjeto, P.ProjNome, COUNT(*)
from Projeto P, Trabalha_Em T
where P.CodProjeto = T.CodProjeto 
GROUP BY P.CodProjeto, P.ProjNome
HAVING COUNT(*) >= 2


//Consultas Aninhadas 
select nomemp 
from empregado
where salario > all
(select salario
from empregado 
where coddepto = 2);

select nomemp 
from empregado as e
where e.matemp in 
(select matemp
from dependente 
where e.sexo = sexo);



//junções 
select e.matemp as matriculaEm, e.nomemp as nomeEmp, d.nomdep as nomedep
from empregado e join dependente d on d.matemp = e.matemp;




