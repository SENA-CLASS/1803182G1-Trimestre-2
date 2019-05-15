(function(){


    // funcion
    function suma(a: number,b: number): number{
        return a+b;
    }

    //procedimiento
    function saludar() : void{
        console.log("hola mundo");
    }


    // llamado del procedimiento
    saludar();

    //llamado de funciones
    let r =suma(4,6);
    console.log(suma(7,8));

})();
