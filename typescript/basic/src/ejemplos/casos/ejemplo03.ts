let var14: string;

var14 = prompt("digite");


if (var14.length > 1) {
    console.log("debe ingresar una caracter no un texto");
} else {
    switch (var14) {
        case "a":
        case "A": {
            console.log("es una a o A");
            break;
        }
        case "b":
        case "B": {
            console.log("es una b o B");
            break;
        }
        case "C":
        case "c": {
            console.log("es una c o C");
            break;
        }
        default: {
            console.log("no conozco esa letra");
        }

    }
}