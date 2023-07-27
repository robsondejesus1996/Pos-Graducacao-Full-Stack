let usuarios ={
    nome: 'Robson',
    idade: 27
}

let musica = {};

musica.nome = 'Nome da musica'
musica.artista = 'Robson de Jesus'
musica.segundos = 180;

console.log(musica)
console.log(musica.artista)
console.log(musica["artista"])

console.log("-------------------------")

if('idade' in usuarios){
    console.log(`${usuarios.nome} tem ${usuarios.idade} anos.`)
}

console.log("-------------------------") 
for(let chave in usuarios){
    console.log(`${chave} = ${usuarios[chave]}`)
}

console.log("-------------------------") 
console.log("Função para criar um objeto")
function criarUsuario(n, i){
    let maior = i >=18;
    return{
        nome: n,
        idade: i,
        maiorIdade: maior
    };
}

let usuariosCriar = criarUsuario('Fernada', 35)
console.log(usuariosCriar)

console.log("-------------------------------")
console.log("Declaração de Classes")

class Usuarios{
    constructor(n, i){
        this.nome = n;
        this.idade = i
    }

    maiorIdade(){
        return this.idade >=18;
    }
}

let usuariosClasse = new Usuarios('Sofia', 17)
console.log(usuariosClasse)
console.log(usuariosClasse.maiorIdade())

