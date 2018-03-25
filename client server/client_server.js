//import { userInfo } from 'os';

var express = require('express');
var app = express();
var fs = require("fs");


app.use(express.static('public'));
var dictionary;
var book;



    
fs.readFile("words.json",'utf8',function(err , data){
  if(err){
      console.log("error in word.json");
  }
  else
  {
    dictionary = JSON.parse(data.trim());
    
    
}});


app.get('/dictionary',function(req,res){
    var word = req.query['word'].toUpperCase();
    var jsoon =""+dictionary[word];
    console.log(jsoon);
    res.status(200).send(jsoon);
    
});
app.get('/finisher',function(req,res){
    var word = req.query['word'].toUpperCase();
    var a;
    var sor="";
    for (a in dictionary){
        b=a.toUpperCase();
       if(b.startsWith(word)){
            sor +="<ul style = 'margin-top:-1.5%' class='list-group' onclick='change(this.innerHTML)')>"+b+"</ul>";
        }}
        res.status(200).send(sor);
       
         console.log(sor);
    
});
  
    app.listen(9000);
console.log("connecting......");