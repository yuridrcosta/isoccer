
package isoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

//OBS.: Login: admin Senha: senhaForte
public class ISoccer {
    
    public static Scanner read = new Scanner(System.in);
    /*List for registering*/
    public static ArrayList<Employee> allEmployees = new ArrayList<Employee>();
    public static ArrayList<Employee> generalServices = new ArrayList<Employee>();
    public static ArrayList<Player> players = new ArrayList<Player>();
    public static Employee mainCoach;
    public static Employee pres;
    public static ArrayList<Partner> partners = new ArrayList<Partner>();
    public static ArrayList<Bus> buses = new ArrayList<Bus>();
    public static ArrayList<Stadium> stadiums = new ArrayList<Stadium>();
    public static ArrayList<TrainingCenter> trainingCenters = new ArrayList<TrainingCenter>();
    /*End of the list*/
    
    static int count=0;
    
    public static Employee emptyPosition = new Employee("Posição não ocupada","ascom@meutimefc.com","xxx.xxx.xxx-xx",0,0,"Função disponível");
    
    public static void main(String[] args) { 
        showLogin();
    }
    
    public static void showLogin(){
        String saux;
        System.out.println("[+] Bem-vindo ao iSoccer - gerenciador de times de futebol!");
        System.out.println("[+] Digite o login do sistema:");
        saux = read.nextLine();
        if(saux.equals("admin")){
            System.out.println("[+] Digite a senha do sistema:");
            saux = read.nextLine();
            if(saux.equals("admin")){
                mainMenu();
            }
            else{
                System.out.println("[!] ERRO: A senha não corresponde!");
            }
        }else{
            System.out.println("[!] ERRO: Login não encontrado!");
        }
    }
    
    public static void mainMenu(){
        int menuOpt = -1;//Valor inicial
        String saux;
        
        while(menuOpt != 0){
            showMainMenu();
            menuOpt = readNumber();
            saux = read.nextLine();
            
            switch(menuOpt){
                case 1:
                    manageEmployees();
                    break;
                case 2:
                    manageResources();
                    break;
                case 3:
                    break;
            }
            
        }
        
    }
    
    public static void manageResources(){
        int menuOpt = -1;
        String saux;
        
        showManageResourcesMenu();
        menuOpt = readNumber();
        saux = read.nextLine();
        
        switch(menuOpt){
            case 1:
                addStadium();
                break;
            case 2:
                addTrainingCenter();
                break;
            case 3:
                addBus();
                break;
            case 4:
                verifyAvailability();
                break;
            case 5:
                increaseStadium();
                break;
            case 6:
                increaseSnacks();
                break;
            case 7:
                increaseBathrooms();
                break;
        }
    }
    
    public static void increaseBathrooms(){
        String name;
        int newCap;
        System.out.println("[+] Digite o nome do estádio:");
        name = read.nextLine();
        
        Stadium foundStadium = findStadium(name);
        
        if(foundStadium != null){
            System.out.println("[!] O número atual de banheiros no estádio é de "+ foundStadium.getBathrooms()+ " banheiros"); 
            System.out.println("[+] Digite o novo número de banheiros:");
            newCap = readNumber();
            name = read.nextLine();
            foundStadium.setBathrooms(newCap);
            System.out.println("[!] Número de banheiros alterado!");
        }else{
            System.out.println("[!] ERRO: Estádio não encontrado!");
        }
    }
    
    public static void increaseSnacks(){
        String name;
        int newCap;
        System.out.println("[+] Digite o nome do estádio:");
        name = read.nextLine();
        
        Stadium foundStadium = findStadium(name);
        
        if(foundStadium != null){
            System.out.println("[!] O número atual de lanchonetes no estádio é de "+ foundStadium.getSnackBars()+ " lanchonetes"); 
            System.out.println("[+] Digite o novo número de lanchonetes:");
            newCap = readNumber();
            name = read.nextLine();
            foundStadium.setSnackBars(newCap);
            System.out.println("[!] Número de lanchonetes alterado!");
        }else{
            System.out.println("[!] ERRO: Estádio não encontrado!");
        }
    }
    
    public static void increaseStadium(){
        String name;
        int newCap;
        System.out.println("[+] Digite o nome do estádio:");
        name = read.nextLine();
        
        Stadium foundStadium = findStadium(name);
        
        if(foundStadium != null){
            System.out.println("[!] A capacidade atual do estádio é de "+foundStadium.getCapacity()+ " pessoas"); 
            System.out.println("[+] Digite a nova capacidade:");
            newCap = readNumber();
            name = read.nextLine();
            foundStadium.setCapacity(newCap);
            System.out.println("[!] Capacidade alterada!");
        }else{
            System.out.println("[!] ERRO: Estádio não encontrado!");
        }
                
    }
    
    public static void verifyAvailability(){
        listBuses();
        listTrainingCenters();
        listStadiums();
    }
    
    public static void listBuses(){
        Bus st;
        for (Iterator<Bus> it = buses.iterator(); it.hasNext();) {
            st = it.next();
            
            if(st.isAvailable()){
                System.out.println("           [!] Código: "+st.getCode() + " Item: Ônibus  Disponibilidade: Disponível");
            }else{
                System.out.println("           [!] Código: "+st.getCode() + " Item: Ônibus  Disponibilidade: Não disponível");
            }
        }
    }
    
    public static void listTrainingCenters(){
        TrainingCenter ct;
        for (Iterator<TrainingCenter> it = trainingCenters.iterator(); it.hasNext();) {
            ct = it.next();
            
            if(ct.isAvailable()){
                System.out.println("           [!] Código: "+ct.getCode() + " Item: Centro de Treinamento  Disponibilidade: Disponível");
            }else{
                System.out.println("           [!] Código: "+ct.getCode() + " Item: Centro de Treinamento  Disponibilidade: Não disponível");
            }
            System.out.println("                    Número de Dormitórios: "+ct.getBedrooms());
        }
    }
    
    public static void listStadiums(){
        Stadium es;
        for (Iterator<Stadium> it = stadiums.iterator(); it.hasNext();) {
            es = it.next();
            
            if(es.isAvailable()){
                System.out.println("           [!] Nome: "+es.getName() + " Item: Centro de Treinamento  Disponibilidade: Disponível");
            }else{
                System.out.println("           [!] Nome: "+es.getName() + " Item: Centro de Treinamento  Disponibilidade: Não disponível");
            }
            System.out.println("                    Número de Banheiros: "+es.getBathrooms()+" Número de Lanchonetes: "+es.getSnackBars());
            System.out.println("                        Capacidade: "+es.getCapacity());
        }
    }
    
    public static void addBus(){
        
        Bus newBus = new Bus(count+1);
        count++;
        
        buses.add(newBus);
        
        System.out.println("[!] Ônibus adicionado com sucesso!");
    }
    
    public static void addTrainingCenter(){
        int bedrooms;
        String saux;
        System.out.println("[+] Digite o número de dormitórios do novo centro de treinamentos:");
        bedrooms = readNumber();
        saux = read.nextLine();
        
        TrainingCenter newTrainingCenter = new TrainingCenter(count+1,bedrooms);
        count++;
        
        trainingCenters.add(newTrainingCenter);
        System.out.println("[!] Centro de Treinamento adicionado com sucesso!");
    }
    
    public static void addStadium(){
        String name;
        int capacity;
        int bathrooms;
        int snackBars; 
        
        System.out.println("[+] Digite o nome do novo estádio:");
        name = read.nextLine();
        System.out.println("[+] Digite a capacidade do novo estádio:");
        capacity = readNumber();
        System.out.println("[+] Digite o número de banheiros no novo estádio:");
        bathrooms = readNumber();
        System.out.println("[+] Digite o número de lanchonetes no novo estádio:");
        snackBars = readNumber();
        
        Stadium newStadium = new Stadium(name,capacity,bathrooms,snackBars);
        
        stadiums.add(newStadium);
        System.out.println("[!] Estádio adicionado com sucesso!");
    }
    
    public static void manageEmployees(){
        int menuOpt = -1;
        String saux;
        
        while(menuOpt != 0){
            showEmployeesMenu();
            menuOpt = readNumber();
            saux = read.nextLine();
            
            switch(menuOpt){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    changeHealthyStatus();
                    break;
            }
            
        }
        
    }
    
    public static void changeHealthyStatus(){
        String saux;
        System.out.println("[+] Digite o nome do jogador a ter o status de saúde alterado:");
        saux = read.nextLine();
        
        Player foundEmployee = findPlayer(saux);
        
        if(foundEmployee != null){
            if(foundEmployee.isHealthy()){
                System.out.println("[!] O jogador está registrado como APTO a jogar, será alterado para INAPTO!");
                foundEmployee.setHealthy(false);
                System.out.println("[!] O status de saúde do jogador agora é INAPTO!");
            }else{
                System.out.println("[!] O jogador está registrado como INAPTO a jogar, será alterado para APTO!");
                foundEmployee.setHealthy(true);
                System.out.println("[!] O status de saúde do jogador agora é APTO!");
            }
        }else{
            System.out.println("[!] ERRO: Jogador não encontrado!");
        }
    }
    
    public static void removeEmployee(){
        String saux;
        System.out.println("[+] Digite o nome do empregado a ser removido:");
        saux = read.nextLine();
        
        Employee foundEmployee = findEmployee(saux);
        
        if(foundEmployee != null){
            if(foundEmployee.getFunction().equals("Jogador")){
                players.remove(foundEmployee);
                allEmployees.remove(foundEmployee);
            }else if(foundEmployee.getFunction().equals("Presidente")){
                pres =  emptyPosition;
                allEmployees.remove(foundEmployee);
            }else if(foundEmployee.getFunction().equals("Treinador")){
                mainCoach = emptyPosition;
                allEmployees.remove(foundEmployee);
            }else{
                allEmployees.remove(foundEmployee);
                generalServices.remove(foundEmployee);
            }
        }else{
            System.out.println("[!] ERRO: Empregado não encontrado!");
        }
        System.out.println("[!] Empregado removido com sucesso!");
    }
    
    public static void searchEmployee(){
        String saux;
        System.out.println("[+] Digite o nome do empregado a ser buscado:");
        saux = read.nextLine();
        
        Employee foundEmployee = findEmployee(saux);
        
        if(foundEmployee != null)
        {
            System.out.println("        [!] Nome: "+foundEmployee.getName());
            System.out.println("        [!] Email: "+foundEmployee.getEmail());
            System.out.println("        [!] CPF: "+foundEmployee.getCpf()+" Telefone: "+foundEmployee.getPhone());
            System.out.println("        [!] Salário: "+foundEmployee.getSalary());
            System.out.println("        [!] Função: "+foundEmployee.getFunction());
        }else{
            System.out.println("[!] ERRO: Empregado não encontrado!");
        }
        
    }
        
    public static Employee findEmployee(String name){
        String nm;
        Employee st = null;
        int exit = 0;
        for (Iterator<Employee> it = allEmployees.iterator(); it.hasNext();) {
            st = it.next();
            nm = st.getName();
            if(nm.equals(name)){
                exit = 1;
                break;
            }
        }
        
        if(exit == 1){
            return st;
        }
        else{
            return null;
        }
    }  
    
    public static Player findPlayer(String name){
        String nm;
        Player st = null;
        int exit = 0;
        for (Iterator<Player> it = players.iterator(); it.hasNext();) {
            st = it.next();
            nm = st.getName();
            if(nm.equals(name)){
                exit = 1;
                break;
            }
        }
        
        if(exit == 1){
            return st;
        }
        else{
            return null;
        }
    } 
    
    public static Stadium findStadium(String name){
        String nm;
        Stadium st = null;
        int exit = 0;
        for (Iterator<Stadium> it = stadiums.iterator(); it.hasNext();) {
            st = it.next();
            nm = st.getName();
            if(nm.equals(name)){
                exit = 1;
                break;
            }
        }
        
        if(exit == 1){
            return st;
        }
        else{
            return null;
        }
    }
    
    public static void addEmployee(){
        int menuOpt = -1;
        String name;
        String email;
        String cpf;
        float salary;
        int phone;
        String saux;
        int iaux;
        showAddEmployeeMenu();
        menuOpt = readNumber();
        name = read.nextLine();
        
        switch(menuOpt){
            case 1://ADICIONAR JOGADOR
                
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                /*Dados específicos - jogador*/
                System.out.println("[+] Digite a posição do jogador:");
                saux = read.nextLine();
                
                Player newPlayer = new Player(name,email,cpf,salary,phone,saux);
                
                //Adicionando ao sistema de registros
                allEmployees.add(newPlayer);
                players.add(newPlayer);
                
                System.out.println("[!] Jogador adicionado com sucesso!");
                
                break;
            case 2:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                
                Coach newCoach = new Coach(name,email,cpf,salary,phone);
                
                //Adicionando ao sistema de registros
                allEmployees.add(newCoach);
                mainCoach = newCoach;
                
                System.out.println("[!] Treinador atualizado com sucesso!");
                
                break;
            case 3:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                
                President newPresident = new President(name,email,cpf,salary,phone);
                
                //Adicionando ao sistema de registros
                allEmployees.add(newPresident);
                pres = newPresident;
                
                System.out.println("[!] Presidente atualizado com sucesso!");
                break;
            case 4:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                System.out.println("[+] Digite o número do CRM do médico: (SOMENTE NÚMEROS)");
                iaux = readNumber();
                saux = read.nextLine();
                
                Doctor newDoctor = new Doctor(name,email,cpf,salary,phone,iaux);
                     
                //Adicionando ao sistema de registros
                allEmployees.add(newDoctor);
                generalServices.add(newDoctor);
                
                System.out.println("[!] Médico adicionado com sucesso!");
                break;
            case 5:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                
                PersonalTrainer newPersonalTrainer = new PersonalTrainer(name,email,cpf,salary,phone);
                     
                //Adicionando ao sistema de registros
                allEmployees.add(newPersonalTrainer);
                generalServices.add(newPersonalTrainer);
                
                System.out.println("[!] Preparador físico adicionado com sucesso!");
                
                break;
            case 6:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                
                Lawyer newLawyer = new Lawyer(name,email,cpf,salary,phone);
                     
                //Adicionando ao sistema de registros
                allEmployees.add(newLawyer);
                generalServices.add(newLawyer);
                
                System.out.println("[!] Advogado adicionado com sucesso!");
                break;
            case 7:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                
                Cooker newCooker = new Cooker(name,email,cpf,salary,phone);
                     
                //Adicionando ao sistema de registros
                allEmployees.add(newCooker);
                generalServices.add(newCooker);
                
                System.out.println("[!] Cozinheiro adicionado com sucesso!");
                break;
            case 8:
                /*Dados básicos*/
                System.out.println("[+] Digite o nome do funcionário:");
                name = read.nextLine();
                System.out.println("[+] Digite o email do funcionário:");
                email = read.nextLine();
                System.out.println("[+] Digite o cpf do funcionário:");
                cpf = read.nextLine();
                System.out.println("[+] Digite o salário do funcionário:");
                salary = readFloat();
                System.out.println("[+] Digite o telefone do funcionário: (SOMENTE NÚMEROS)");
                phone = readNumber();
                saux = read.nextLine();
                /*Fim dos dados básicos*/
                System.out.println("[+] Digite o número da carteira de motorista: (SOMENTE NÚMEROS)");
                iaux = readNumber();
                saux = read.nextLine();
                
                Driver newDriver = new Driver(name,email,cpf,salary,phone,iaux);
                     
                //Adicionando ao sistema de registros
                allEmployees.add(newDriver);
                generalServices.add(newDriver);
                
                System.out.println("[!] Motorista adicionado com sucesso!");
                
                break;
        }
        
        
    }
   
    public static void showManageResourcesMenu(){
        System.out.println("[+] Digite o NÚMERO correspondente a opção desejada:");
        System.out.println("    [1] Adicionar estádio");
        System.out.println("    [2] Adicionar centro de treinamento");
        System.out.println("    [3] Adicionar ônibus");
        System.out.println("    [4] Verificar dados de recursos");
        System.out.println("    [5] Aumentar capacidade de estádio");
        System.out.println("    [6] Aumentar número de lanchonetes de estádio");
        System.out.println("    [7] Aumentar número de banheiros de estádio");
        System.out.println("    [8] Alterar status de disponibilidade");//TODO
        System.out.println("    [0] Sair");
    }
    
    public static void showAddEmployeeMenu(){
        System.out.println("[+] Digite o NÚMERO correspondente a opção desejada:");
        System.out.println("    [1] Adicionar jogador");
        System.out.println("    [2] Adicionar técnico");
        System.out.println("    [3] Adicionar presidente");
        System.out.println("    [4] Adicionar médico");
        System.out.println("    [5] Adicionar preparador físico");
        System.out.println("    [6] Adicionar advogado"); 
        System.out.println("    [7] Adicionar cozinheiro");
        System.out.println("    [8] Adicionar motorista");
        System.out.println("    [0] Sair");
    }
    
    public static void showEmployeesMenu(){
        System.out.println("[+] Digite o NÚMERO correspondente a opção desejada:");
        System.out.println("    [1] Adicionar funcionário");
        System.out.println("    [2] Remover funcionário");
        System.out.println("    [3] Buscar dados de funcionário");
        System.out.println("    [4] Alterar status de saúde de jogador");
        System.out.println("    [0] Sair");
    }
    
    public static void showMainMenu(){
        System.out.println("[+] Digite o NÚMERO correspondente a opção desejada:");
        System.out.println("    [1] Gerenciar funcionários");
        System.out.println("    [2] Gerenciar recursos físicos");//TODO
        System.out.println("    [3] Gerenciar sócios-torcedores");//TODO
        System.out.println("    [4] Relatórios");//TODO
        System.out.println("    [0] Sair");
    }
    
    public static int readNumber(){
        int rNumber = 0;
        
        try{
            rNumber = read.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERRO: Você deve digitar um número!");
        }
            
        return rNumber;
    }
    
    public static Float readFloat(){
        float rFloat = 0;
        
        try{
            rFloat = read.nextFloat();
        }catch(InputMismatchException error){
            System.out.println("ERRO: Você deve digitar um número real (float)! (Formato: XX,X)");
        }
        
        return rFloat;
    }
    
}
