package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stadium {
    
    Scanner read = new Scanner(System.in);
    private String name;
    private boolean available;
    private int capacity;
    private int bathrooms;
    private int snackBars;

    public Stadium(String name, int capacity, int bathrooms, int snackBars) {
        this.name = name;
        this.available = true;
        this.capacity = capacity;
        this.bathrooms = bathrooms;
        this.snackBars = snackBars;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSnackBars() {
        return snackBars;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSnackBars(int snackBars) {
        this.snackBars = snackBars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    public void changeCapacity(){
        int rNumber = 0;
            System.out.println("[!] O estádio "+ this.getName() + " tem capacidade para "+ this.getCapacity()+" pessoas!");
        try{
            System.out.println("[+] Digite a nova capacidade do estádio:");
            rNumber = read.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERRO: Você deve digitar um número!");
        }
    }
    
    public void changeBathrooms(){
        int rNumber = 0;
            System.out.println("[!] O estádio "+ this.getName() + " tem "+ this.getBathrooms()+" banheiros!");
        try{
            System.out.println("[+] Digite a nova quantidade de banheiros:");
            rNumber = read.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERRO: Você deve digitar um número!");
        }
    }
    
    public void changeSnackBars(){
        int rNumber = 0;
            System.out.println("[!] O estádio "+ this.getName() + " tem "+ this.getSnackBars()+" lanchonetes!");
        try{
            System.out.println("[+] Digite a nova quantidade de lanchonetes:");
            rNumber = read.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERRO: Você deve digitar um número!");
        }
    }
}
