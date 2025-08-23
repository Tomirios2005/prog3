'use strict'
let formulario = document.querySelector("#formulario");
formulario.addEventListener("submit", cargarDatos);
let personas=[];
let cantidadAsortear=0;
let botonSortear = document.querySelector("#sortear")

function cargarDatos(e) {
    e.preventDefault()
    let formData = new FormData(formulario);
    let nombre = formData.get("nombre");
    let apellido = formData.get("apellido");
    let edad=formData.get("edad")
    let persona={nombre:nombre,apellido:apellido};
    personas.push(persona);
    cantidadAsortear++;
    if (edad<18) {
        personas.pop();
        cantidadAsortear-=1
        alert("debe ser mayor")
        
    }
    formData=""
    
}
function sortear(e) {
    e.preventDefault()
    let ganador=Math.floor(Math.random()*cantidadAsortear);
    console.log("el ganador es", personas[ganador]);


    
}
botonSortear.addEventListener("click", sortear)