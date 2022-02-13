package emailapp;

import java.util.Scanner;

public class email
 {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBox = 500;
    private String email;
    private int defaultPasswordLength = 10;
    private String alterEmail;
    private String companysuffix="daorg.com";

    // constructor to receive first name and last name 

        public email(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            //System.out.println("Email Created :"+ this.firstName + " " + this.lastName);


            // call a method asking for department and return it as well
                this.department = setDepartment();
                String d = this.department;
                //System.out.println("Department:-"+ d);

            // call a method that return a random password
            this.password = randomPassword(defaultPasswordLength);
            System.out.println(" your password is : - "+ password);

            // call a method for generating email
            email  = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@"+ department +"."+ companysuffix;
            //System.out.println(" Your email is : "+ email);

        }


    // ask for department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for sales\n2 for developemnt\n3 for accounting\n0 for none" );
        Scanner in = new Scanner(System.in);
        Integer c = in.nextInt();
        if (c ==1 ){return "sales";}
        else if (c ==2 ){return "development";}
        else if (c ==3 ){return "accouting" ;}
        else {return "";}

    
    }

    //generate a random password 
    private String randomPassword(int length){
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
            char[] password = new char[length];
            for(int i = 0 ;i<length;i++){
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
                
            }
            return new String(password); 
        }

    //set the mailbox capacity
        public void setMailboxCapacity(int capacity){
            this.mailBox = capacity;
        }

    //set alternate email
        public void setAlternateEmail(String altEmail){
            this.email = altEmail;
        }

    // change password
     public void changePassword(String password){
         this.password = password;
     }
     
     public int getMailboxCapacity(){ return mailBox; }
     public String getAlternateEmail() { return email;}
     public String getPassword(){ return password;}
     public String display(){
         return "\nDislay name "+firstName +  " "+ lastName +"\nCompany email:-"+ email+
         "\nmailbox capacity:- "+ mailBox +"mb+";


     }

 }