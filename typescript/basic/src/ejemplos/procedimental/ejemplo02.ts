(function(){
    // pasos por parametro

    let a=10;
    sumaDos(a);
    console.log("fuera de la funcion: "+a);

    function sumaDos(a : number){
        a= a+2;
        console.log("dentro de la funcion "+a);
    }
})();