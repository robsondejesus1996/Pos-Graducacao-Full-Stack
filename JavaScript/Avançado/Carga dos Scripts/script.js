
output.innerHTML = '';


let a;
let x = 10;

try {
  if(x<0)
  throw new Error("Valor não pode ser negativo!")
  a = x
    
}catch(erro){
    output.innerHTML = '<p>Não pode ser calculado </p>'
    console.log(erro.name)
    console.log(erro.mensagem)
    console.log(erro.stack)
}
console.log('fim')
