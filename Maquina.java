public class Maquina{
    private float ptl1;
    private float ptl2;
    private float ptl3;
    private Boleto boleto1;
    private Boleto boleto2;
    private Boleto boleto3;

    public Maquina(){
        ptl1 = 0f;
        ptl2 = 0f;
        ptl3 = 0f;
        boleto1 = new Boleto();
        boleto2 = new Boleto();
        boleto3 = new Boleto();
        boleto1.setLugar("1");
        boleto2.setLugar("2");
        boleto3.setLugar("3");
        boleto1.setPrecio(100f);
        boleto2.setPrecio(500f);
        boleto3.setPrecio(1000f);


    }
    public float getPtl1(){
        return ptl1;
    }

    public void setPtl1(float ptl1){
        this.ptl1 = ptl1;
    }
    
    
    public float getPtl2(){
        return ptl2;
    }

    public void setPtl2(float ptl2){
        this.ptl2 = ptl2;
    }
    
    public float getPtl3(){
        return ptl3;
    }

    public void setPtl3(float ptl3){
        this.ptl3 = ptl3;
    }

    public Boleto getBoleto1() {
        return boleto1;
    }
    public Boleto getBoleto2() {
        return boleto2;
    }
    public Boleto getBoleto3() {
        return boleto3;
    }
}