let var13: string;

var13 = prompt("digite el numero");

switch(var13){
    case "uno":
    case "UNO":{
        console.log(1);
        break;
    }
    case "dos":
    case "DOS":{
        console.log(2);
        break;
    }
    case "tres":
    case "TRES":{
        console.log(3);
        break;
    }
    default:{
        console.log("no conozco ese numero");
    }

}

