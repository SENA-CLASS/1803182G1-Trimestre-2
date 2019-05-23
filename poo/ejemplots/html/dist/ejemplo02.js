var Persona = /** @class */ (function () {
    function Persona() {
    }
    Persona.prototype.hablar = function () {
        console.log("hablo");
    };
    Persona.prototype.ver = function () {
        console.log("veo");
    };
    Persona.prototype.escuchar = function () {
        console.log("escucho");
    };
    return Persona;
}());
var cieguito = new Persona();
var sordito = new Persona();
var mudito = new Persona();

