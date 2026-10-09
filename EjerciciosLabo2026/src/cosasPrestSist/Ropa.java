package cosasPrestSist;

public abstract class Ropa{
    private String color;
    private Material material;
    private String marca;
    private boolean estado;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "color='" + color + '\'' +
                ", material=" + material +
                ", marca='" + marca + '\'' +
                ", estado=" + estado +
                '}';
    }
}
