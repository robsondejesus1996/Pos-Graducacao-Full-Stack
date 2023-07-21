let idade = 11;
if(idade >=18){
    console.log("Acesso permitido")
}else{
    console.log("Acesso negado")
}


console.log("-------------------------------")
let acessoPermitido;
let idadeAcesso = 21
if(idadeAcesso >=18){
    acessoPermitido = true;
}else{
    acessoPermitido = false;
}

console.log(acessoPermitido)

console.log("-------------------------------")

let a=5, b=3, operador='*'

if(operador=='+'){
    console.log(a+b)
}else if(operador =='-'){
    console.log(a-b)
}else if(operador=='*'){
    console.log(a*b)
}else if(operador=='/'){
    console.log(a*b)
}else{
    console.log('Operador Invalido')
}

console.log("-------------------------------")
console.log("Declaracao switch")
let c =2, d= 1, oper = '*'
switch(oper){
    case '+':
        console.log(c+d);
    break;
    case '-':
        console.log(c-d);
    break;
    case '*':
        console.log(c*d);
    break;  
    case '/':
        console.log(c/d);
    break;     
    default:
        console.log("Operador invalido");
}


console.log("-------------------------------")
console.log("Declaracao de repeticao")

let i =0;
while(i<3){
    console.log(i);
    i++
}
console.log('fim')



console.log("-------------------------------")
console.log("Declaracao de repeticao")

for(let i=0; i<10; i++){
    if(i%2 == 0){
        console.log(i + " e um numero par")
    }
}
