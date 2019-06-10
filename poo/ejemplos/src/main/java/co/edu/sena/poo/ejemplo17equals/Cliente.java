package co.edu.sena.poo.ejemplo17equals;

import java.util.Objects;

public class Cliente {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return tipoDocumento.equals(cliente.tipoDocumento) &&
                numeroDocumento.equals(cliente.numeroDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento, numeroDocumento);
    }
}
