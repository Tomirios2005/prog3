let div=document.querySelector("#div");
let imagen = document.querySelector("img")
// imagen.classList.remove("oculto")
let btn1=document.getElementById("1")
let btn2=document.getElementById("2")
let btn3=document.getElementById("3")
let divAjax=document.getElementById("ajax")


// fetch("https://web-unicen-service.onrender.com/api/html").then(response=>{
//     console.log(response)

//     response.text().then(texto=>{
//         imagen.classList.add("oculto")

//         console.log(texto)
//         div.innerHTML=texto;
//     });
   
// })
// .catch(error=>{
//     div.innerHTML=error
// })

btn1.addEventListener("click",()=>{
    window.history.pushState("stateObj", "pageTitle", "nosotros");
    imagen.classList.remove("oculto")

    fetch("home.html").then(response=>{
        response.text().then(texto=>{
            imagen.classList.add("oculto")
            divAjax.innerHTML=texto
        })
    })
})

