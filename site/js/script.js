const horas= document.getElementById("horas");
const minutos = document.getElementById("minutos");
const segundos = document.getElementById("segundos");



const relogio= setInterval(function time(){
 
let data =new Date();
let h=data.getHours().toString().padStart(2,'0');
let m=data.getMinutes().toString().padStart(2,'0');;
let s=data.getSeconds().toString().padStart(2,'0');;

horas.textContent=h;
minutos.textContent=m;
segundos.textContent=s;
})