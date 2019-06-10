package co.edu.sena.poo.ejemplo17equals;

import java.util.Objects;

public class Casa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return Objects.equals(matricula, casa.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
