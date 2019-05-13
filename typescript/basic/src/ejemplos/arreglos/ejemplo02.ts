(function () {
    // dos dimensiones
    let fila: number =3;
    let columna: number = 4;

    // declaracion del arreglo de dos dimensiones
    let a : number[][] = new Array(fila);
    for(let i =0; i<3;i++){
        a[i] = new Array(columna);
    }

    console.log(typeof a);


    // lectura
    for (let i =0; i<3;i++){
        for (let j = 0; j<4 ; j++) {
            a[i][j]= parseInt(prompt("digite numero"+i+","+j+": "));
        }
    }
    // impresión del arreglo
    for (let i =0; i<3;i++){
        for (let j = 0; j<4 ; j++) {
            console.log("["+i+","+j+"]: "+a[i][j]);
        }
    }





})();