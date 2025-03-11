package relaciones;

import java.util.List;

public class Auto {
    private int id;
    private String marca;
    private String modelo;

    private List<Propietario> propietarios;

    public Auto(int id, String marca, String modelo, List<Propietario> propietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietarios = propietarios;
    }

    public Auto() {
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", propietarios=" + propietarios +
                '}';
    }

    public int getId() {
        return id;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }


}
