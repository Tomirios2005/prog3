let animal;
let animalElegido = 0;
let botonImagen = document.getElementById("btn-generarAnimal");
let botonAceptar = document.getElementById("btn-aceptar");
let espacioImagen = document.getElementById("imagen");
imagenActual();

//mostrar imagen random
botonImagen.addEventListener("click", imagenActual)
function imagenActual() {
    console.log(animalElegido)
    let numeroRandom = Math.floor(Math.random() * 5 + 1);
    console.log(numeroRandom)
    //generar animal sin repetir
    if (numeroRandom != animalElegido) {
        animalElegido = numeroRandom;
        switch (numeroRandom) {
            case 1:
                espacioImagen.src = "./img/gato.png"
                animal = "gato";
                break;
            case 2:
                espacioImagen.src = "./img/perro.jpg"
                animal = "perro";
                break;
            case 3:
                espacioImagen.src = "./img/caballo.jpg"
                animal = "caballo";
                break;
            case 4:
                espacioImagen.src = "./img/oveja.jpg"
                animal = "oveja";
                break;
            case 5:
                espacioImagen.src = "./img/vaca.jpg"
                animal = "vaca";
                break;

        }
    } else {
        console.log("elseee")
        imagenActual()
    }


}

//verificar entrada
botonAceptar.addEventListener("click", adivinarAnimal)
function adivinarAnimal() {
    let animalErroneo = "El animal que ingresaste no es el de la foto";
    let respuesta = document.getElementById("inputAnimal").value;
    respuestaFinal = respuesta.toLowerCase();

    if (respuestaFinal === animal) {
        document.getElementById("ir_a_paginaWeb").classList.add("mostrarBoton");
        document.querySelector(".captchaContainer").classList.add("desaparecerContenedor");
        document.querySelector(".botones").classList.add("desaparecerBotones");
        captchaErroneo.innerHTML = "";
        document.getElementById("inputAnimal").classList.add("desaparecerContenedor")
        document.getElementById("captchaCorrecto").innerHTML = "CORRECTO"

    } else if (respuestaFinal === "") {
        captchaErroneo.innerHTML = "Ingrese un animal";
    } else {
        captchaErroneo.innerHTML = animalErroneo;
        imagenActual();

    }
    document.getElementById("inputAnimal").value = "";
}



