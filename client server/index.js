var express = require('express');
var app = express();
var fs = require("fs");


app.use(express.static('public'));
var book;

fs.readFile("userpass.json",'utf8',function(err , data){
    if(err){}
    else
    {
      book = JSON.parse(data.trim());
      
  }});
app.get("");
app.listen(3000);