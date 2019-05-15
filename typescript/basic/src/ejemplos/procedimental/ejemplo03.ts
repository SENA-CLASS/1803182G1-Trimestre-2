(function(){
    // pasos por parametro

    let a=[1,2,3,4,5,6,7];
    sumaDos(a);
    for (let index = 0; index < a.length; index++) {
        console.log(a[index]);
    }


    function sumaDos(a : number[]){
        for (let index = 0; index < a.length; index++) {
            a[index]++;
        }
        
    }
})();