

let varc: number;
varc = parseInt(prompt("digite un numero"));

if (varc == 1) {
    console.log("uno");
} else {
    if (varc == 2) {
        console.log("dos");
    } else {
        if (varc == 3) {
            console.log("tres");
        } else {
            console.log("no se que numero sera");
        }
    }
}

// mejor
if (varc == 1) {
    console.log("uno");
} else if (varc == 2) {
    console.log("dos");
} else if (varc == 3) {
    console.log("tres");
} else if (varc == 4) {
    console.log("cuatro");
} else {
    console.log("cinco");
}