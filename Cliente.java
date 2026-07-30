

public class Cliente {
    //Atr//
    private String name;
    private int ticket; 
    private String email;
    private int cbc1;
    private int cbc2;
    private int cbc3;
    private float total;
    private float presupuesto;
    // Methods//
    public Cliente(){
        name = "";
        ticket = 0;
        email = "";
        cbc1 = 0;
        cbc2 = 0;
        cbc3 = 0;
        total = 0f;
        presupuesto = 0f;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getTicket(){
        return ticket;
    }

    public void setTicket(int ticket){
        this.ticket = ticket;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getCbc1(){
        return cbc1;
    }
    public void setCbc1(int cbc1){
        this.cbc1 = cbc1;
    }
    public int getCbc2(){
        return cbc2;
    }
    public void setCbc2(int cbc2){
        this.cbc2 = cbc2;
    }
    public int getCbc3(){
        return cbc3;
    }
    public void setCbc3(int cbc3){
        this.cbc3 = cbc3;
    }
    public float getTotal(){
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public float getPresupuesto(){
        return presupuesto;
    }
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
}