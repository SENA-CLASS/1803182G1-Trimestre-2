
let vardd: number= parseInt(prompt("digite el numero"));

if(vardd>0){
    if (vardd%2==0){
        console.log("el numero es positivo y es par");
    }else{
        console.log("el numero es positivo y es impar");
    }
}else{
    if(vardd%2==0){
        console.log("el numeor es negativo y es par");
    }else{
        console.log("el numero es negativo y es impar");
    }
}