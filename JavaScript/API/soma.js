onmessage = function (evento){
    let soma = evento.data[0] + evento.data[1];
    postMessage(soma)
}