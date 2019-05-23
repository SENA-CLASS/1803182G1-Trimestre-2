var Perro = /** @class */ (function () {
    function Perro() {
    }
    Object.defineProperty(Perro.prototype, "sexo", {
        get: function () {
            return this._sexo;
        },
        set: function (value) {
            this._sexo = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Perro.prototype, "color", {
        get: function () {
            return this._color;
        },
        set: function (value) {
            this._color = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Perro.prototype, "peso", {
        get: function () {
            return this._peso;
        },
        set: function (value) {
            this._peso = value;
        },
        enumerable: true,
        configurable: true
    });
    return Perro;
}());
;
var perrito = new Perro();
perrito.color = "cafe";
perrito.peso = 12;
perrito.sexo = "hembrita";
