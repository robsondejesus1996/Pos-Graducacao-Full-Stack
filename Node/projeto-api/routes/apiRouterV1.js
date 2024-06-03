var express = require('express');
var apiRouterV1 = express.Router();

var produtos = [
  {"id": 1, "descricao": "Camiseta", "marca": "Nike", "preco": 49.99},
  {"id": 2, "descricao": "Calça", "marca": "Nike", "preco": 149.99},
  {"id": 3, "descricao": "Moletom", "marca": "Nike", "preco": 249.99}
]

/* GET home page. */
apiRouterV1.get('/produtos', function(req, res, next) {
  res.json(produtos)
});

apiRouterV1.get('/produtos/:id', function(req, res, next) {
  let id = req.params.id;
  if(id){
    idInt = Number.parseInt(id)
    let idx = produtos.findIndex(o => o.id === idInt)
    if(idx > -1){
      res.json(produtos[idx])
    }
    else{
      res.status(404).json({ message: `Produto não encontrado`})
    }
    
  }
  else{
    res.status(404).json({ message: `Produto não encontrado`})
  }
  
});

module.exports = apiRouterV1;
