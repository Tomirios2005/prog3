let nombreInput = document.getElementById("nombre");
let apellidoInput = document.getElementById("apellido")
let botonSaludar = document.getElementById("botonSaludar");
let espacioSaludo = document.getElementById("espacioSaludo");


function saludar() {
    let nombre=nombreInput.value;
    let apellido=apellidoInput.value;
    espacioSaludo.innerHTML = "Hola "+ nombre + " " + apellido;
    
}
botonSaludar.addEventListener("click", saludar);



