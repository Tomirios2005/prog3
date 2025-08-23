let botonImagen = document.getElementById("botonImagen");
let imagen = document.getElementById("imagenAnimal");
let entradaUsuario = document.getElementById("animalIngresado");
let botonVerificar = document.getElementById("verificar");
let numeroImagen;
let imagenElegida = 1


botonImagen.addEventListener("click", generarImagen);
botonVerificar.addEventListener("click", verificarEntrada);

function generarImagen() {
    numeroImagen = Math.floor(Math.random()*5+1);
    console.log(numeroImagen)

    if (numeroImagen!=imagenElegida) {
        switch (numeroImagen) {
            case 1: imagen.src = "./img/caballo.jpeg";
                
                break;
            case 2: imagen.src = "./img/gato.jpeg";
                break;
            case 3: imagen.src = "./img/leon.jpeg";
                break;
            case 4: imagen.src = "./img/perro.jpeg";
                break;
            case 5: imagen.src = "./img/tigre.jpeg";
                break;
        
            default:
                break;
        };
        
    }else{
        generarImagen();
    }
    imagenElegida = numeroImagen;
    
    
}
function verificarEntrada() {
    let animalIngresado = entradaUsuario.value;
    if (numeroImagen == 1 && animalIngresado=="caballo") {
        alert("CORRECTO")
        
    }else if (numeroImagen == 2 && animalIngresado == "gato") {
        alert("CORRECTO")
        
    }else if (numeroImagen == 3 &&animalIngresado == "leon"){
        alert("CORRECTO")


    }else if (numeroImagen == 4 && animalIngresado == "perro") {
        alert("CORRECTO")

        
    }else if (numeroImagen == 5 && animalIngresado == "tigre"){
        alert("CORRECTO")


    }else{
        alert("incorrecto, intentalo nuevamente")
    }

    
}
