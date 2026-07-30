import java.util.Scanner;
import java.util.Random; 
public class Inicio {
    public static void main(String[] args){
        System.out.println("Welcome");
       Cliente user;
       user = new Cliente();
       Maquina machine;
       machine = new Maquina();
       Scanner keyboard = new Scanner(System.in);
       /*El random se llama asi en honor a un personaje de un juego */
       Random asatpramad = new Random();

       Boleto boleto1 = machine.getBoleto1();
       Boleto boleto2 = machine.getBoleto2();
       Boleto boleto3 = machine.getBoleto3();

       
        
       
       int number = asatpramad.nextInt(15000)+1;
       int a = asatpramad.nextInt(15000)+1;
       int b = asatpramad.nextInt(15000)+1;
      
       user.setTicket(number);
       
       

       if ((user.getTicket() > a && user.getTicket() < b) || (user. getTicket() > b && user.getTicket() < a)) {
        String option = "0";
        while(!option.equals("6")){
        System.out.println("What action do you wish to perform?" + "\n");
        System.out.println("1 - Set client info"+ "\n");
        System.out.println("2 - Buy tickets"+ "\n");
        System.out.println("3 - Check total availability"+ "\n");
        System.out.println("4 - Check individual availability"+ "\n");
        System.out.println("5 - View current net profit"+ "\n");
        System.out.println("6 - Leave"+ "\n");
        option = keyboard.nextLine();

        switch(option) {
            case "1":
                System.out.println("Under what name do you wish to register?");
                String name1 = keyboard.nextLine();
                System.out.println("Through what email adress should we contact you?");
                String email1 = keyboard.nextLine();
                System.out.println("What is your budget currently?");
                float budget = keyboard.nextFloat();
                keyboard.nextLine();
                user.setPresupuesto(budget);
                user.setName(name1);
                user.setEmail(email1);
                break;
            case "2":
                    System.out.println("How many tickets do you wish to buy?");
                     int amount = keyboard.nextInt();
                     keyboard.nextLine();
                     if (amount < 21) {
                    System.out.println("Successfully bought the tickets!");
                     int i = asatpramad.nextInt(3)+1;
                        switch(i) {
                            case 1: 
                                int mount1 = boleto1.getCc() + amount;
                                if (mount1 < 21 && (boleto1.getPrecio()*mount1)<=user.getPresupuesto()){
                                    boleto1.setCc(mount1);
                             }
                                else {System.out.println("Sorry, we are unable to complete the purchase. ");}
                                break;
                            case 2: 
                                int mount2 = boleto2.getCc() + amount;
                                if (mount2 < 21 && (boleto2.getPrecio()*mount2)<=user.getPresupuesto()){
                                    boleto2.setCc(mount2);
                                }
                                else {System.out.println("Sorry, we are unable to complete the purchase. ");}
                                break;
                            case 3: 
                                int mount3 = boleto3.getCc() + amount;
                                if (mount3 < 21 && (boleto3.getPrecio()*mount3)<=user.getPresupuesto()){
                                    boleto3.setCc(mount3);
                                }
                                else {System.out.println("Sorry, we are unable to complete the purchase. ");}
                                break;
                            default: 
                                System.out.println("I'm trully unaware as to how you got this message");}}
                     else {System.out.println("The amount of tickets exceeds the maximum allowed.");}
                     break;
                case "3":
                    System.out.println("The amount of seats taken is: "+ "\n");
                    int avlibt = boleto1.getCc() + boleto2.getCc() + boleto3.getCc();
                    System.out.println(avlibt);
                    break;
                case "4":
                    System.out.println("The amount of seats taken in tier number 1 is: "+ "\n");
                    System.out.println(boleto1.getCc()+ "\n");
                    System.out.println("The amount of seats taken in tier number 2 is: "+ "\n");
                    System.out.println(boleto2.getCc()+ "\n");
                    System.out.println("The amount of seats taken in tier number 3 is: "+ "\n");
                    System.out.println(boleto3.getCc()+ "\n");
                    break;

                case "5":
                    machine.setPtl1(boleto1.getCc()*boleto1.getPrecio());
                    machine.setPtl2(boleto2.getCc()*boleto2.getPrecio());
                    machine.setPtl3(boleto3.getCc()*boleto3.getPrecio());
                    System.out.println(machine.getPtl1()+machine.getPtl2()+machine.getPtl3());
                case "6":
                    System.out.println("Goodbye");
                }

                
            }
        
        }
        else{
            System.out.println("Sorry, you're not eligible.");
        }
       }
    }
        

    
