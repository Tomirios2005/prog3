function mostrarMenu() {
    document.getElementById("menu").classList.toggle("mostrarMenuResponsive");
}
document.getElementById("mostrarMenu").addEventListener("click", mostrarMenu);

function modoOscuro() {
    document.querySelector("body").classList.toggle("modoOscuro");
}
document.getElementById("btnModoOscuro").addEventListener("click", modoOscuro);
