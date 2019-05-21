

class Perro {
    private _sexo :string;
    private _color: string;
    private _peso: number;

    get sexo(): string {
        return this._sexo;
    }

    set sexo(value: string) {
        this._sexo = value;
    }

    get color(): string {
        return this._color;
    }

    set color(value: string) {
        this._color = value;
    }

    get peso(): number {
        return this._peso;
    }

    set peso(value: number) {
        this._peso = value;
    }
};


let perrito = new Perro();
perrito.color="cafe";
perrito.peso=12;
perrito.sexo="hembrita";

