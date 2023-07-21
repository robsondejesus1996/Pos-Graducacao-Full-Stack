function mensagem() {
    console.log("Ola mundo")
}

mensagem()


console.log("---------------------------------")
function mensagem1(nome){
    console.log(`Ola ${nome}`)
}
mensagem1("Robson")

console.log("---------------------------------")

function soma(a, b){
    console.log(a+b);
}

soma(3, 4);

console.log("---------------------------------")

function argos(){
    console.log(arguments)
    return;
}

console.log(argos(1,3));

console.log("---------------------------------")
console.log("Variaveis locais")
function soma2(a, b){
    let resultado = a+b
    return resultado
}
console.log(soma2(3,4))
//console.log(resultado)

console.log("---------------------------------")

let nome = 'Marcos'

function mensagem3(nome){
    console.log('Ola '+ nome)
}

mensagem3('Ana')

console.log("---------------------------------")

let soma5 = function(a,b){
    return a+b
}

console.log(soma5(3,2))

console.log("---------------------------------")
let f = function fatorial(n){
    if(n<=1){
        return 1;
    }else{
        return n*fatorial(n-1);
    }
}

console.log(f(6));

console.log("---------------------------------")

console.log("Arrow functions")

let arroyF = (a,b) => a+b;

console.log(arroyF(12,32))