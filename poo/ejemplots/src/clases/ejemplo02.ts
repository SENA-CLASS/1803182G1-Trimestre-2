


class Persona implements Sordo, Mudo, Ciego{

    public hablar(): void{
        console.log("hablo");
    }

    public ver(): void{
        console.log("veo");
    }

    public escuchar(): void{
        console.log("escucho");
    }

}


interface Ciego {
    hablar(): void;
    escuchar(): void
}


interface Mudo {
    ver(): void;
    escuchar(): void;
}

interface Sordo {
    ver(): void;
    hablar(): void;
}


let cieguito: Ciego = new Persona();
let sordito: Sordo = new Persona();
let mudito: Mudo = new Persona();




