public class Boleto{
    private String lugar;
    private float precio;
    private int cc;

    public Boleto(){
        lugar = "";
        precio = 0f;
        cc = 0;
    }
public String getLugar(){
    return lugar;
}
public void setLugar(String lugar){
    this.lugar = lugar;
}
public float getPrecio() {
    return precio;
}
public void setPrecio(float precio) {
    this.precio = precio;
}
public int getCc(){
    return cc;
}
public void setCc(int cc) {
    this.cc = cc;
}

}