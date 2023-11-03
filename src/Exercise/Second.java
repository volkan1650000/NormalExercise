package Exercise;

import java.util.HashMap;
import java.util.Scanner;

//A simple example java code of account section on a website

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        //The created accounts are (with keys being the usernames and values being the passwords) :

        map.put("yahsir55","KiNGYahSir_6");
        map.put("akifjkh88","floWers88**7/#");
        map.put("nameuser99","icanDoitbabyy++");

        System.out.println("ACCOUNTS : "+map);

        System.out.println("Welcome to the system!");

        while(true){
            System.out.println("Choose what you will do : ");
            System.out.println();
            System.out.println("Sign in to your account, press 1");
            System.out.println("Create a new account, press 2");
            System.out.println("Quit the system, press 3");
            System.out.println("Show the registered accounts, press 4");
            int x = scan.nextInt();

            if(x==1){
                System.out.println("Enter your username");
                scan.nextLine();
                String a;
                a = scan.nextLine();
                System.out.println("Enter your password");
                String b = scan.next();
                while(!map.containsKey(a) || !map.get(a).equals(b)){
                    System.out.println("Username or password is incorrect!");
                    System.out.println("Enter your username (Press 2 to create a new account)");
                    scan.nextLine();
                    a = scan.nextLine();
                    if(a.equals("2")){
                        x=2;
                        break;
                    }
                    System.out.println("Enter your password");
                    b = scan.next();
                }
                if(map.containsKey(a) && map.get(a).equals(b)){
                    System.out.println("Successfully logged in!");
                }
                break;
            }
            if(x==2){
                System.out.println("Create an username by following the following rules :");
                System.out.println("-Username must be between 8 and 16 characters");
                System.out.println("-Username can't contain space");

                boolean further;
                String a;

                do{
                    further = true;
                    a=scan.nextLine();
                    a=scan.nextLine();
                    if(a.length()<8 || a.length()>16){
                        System.out.println("ERROR - Username must be between 8 and 16 characters!");
                        further=false;
                    }
                    if(a.contains(" ")){
                        System.out.println("ERROR - Username can't contain space!");
                        further=false;
                    }
                    if(map.containsKey(a)){
                        System.out.println("This username was taken");
                        further=false;
                    }
                }while(!further);

                System.out.println("Create a password by following the following rules :");
                System.out.println("-Password must contain at least one uppercase");
                System.out.println("-Password must contain at least one lowercase");
                System.out.println("-Password must contain at least one digit");
                System.out.println("-Password must contain at least one special character");
                System.out.println("-Password can't contain space");
                System.out.println("-Password must be at least 10 characters");

                boolean wow;
                String b;

                do{
                    wow = true;
                    b = scan.nextLine();
                    if(b.replaceAll("[^A-Z]","").length()==0){
                        System.out.println("ERROR - Password must contain at least one uppercase");
                        wow = false;
                    }
                    if(b.replaceAll("[^a-z]","").length()==0){
                        System.out.println("ERROR - Password must contain at least one lowercase");
                        wow = false;
                    }
                    if(b.replaceAll("[^0-9]","").length()==0){
                        System.out.println("ERROR - Password must contain at least one digit");
                        wow = false;
                    }
                    if(b.replaceAll("[^0-9a-z-A-Z]","").length()==0){
                        System.out.println("ERROR - Password must contain at least one special character");
                        wow = false;
                    }
                    if(b.contains(" ")){
                        System.out.println("ERROR - Password can't contain space");
                        wow = false;
                    }
                    if(b.length()<10){
                        System.out.println("ERROR - Password must be at least 10 characters");
                        wow = false;
                    }
                }while(!wow);
                map.put(a,b);
                System.out.println("Sucessfully created a new account");
            }else if(x==3){
                break;
            }else if(x==4){
                System.out.println(map);
            }else{
                System.out.println("You did an invalid process!");
            }
        }
        System.out.println("Thank you for using our service!");
    }
}
