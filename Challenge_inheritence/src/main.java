import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {

    private static ArrayList<Contact>contacts;
    private static Scanner scanner;
    private static int id=0;

    public static void main(String[] args) {
        contacts =new ArrayList<>();
        System.out.println("Welcome to here");
        showInitialOption();
    }

    private static void showInitialOption(){
        System.out.println("Please select : "+"\n\t1. Manage Contacts"+
                "\n\t2. Messages"+"\n\t3. Quit");
        scanner =new Scanner(System.in);
        int choice=scanner.nextInt();

        switch(choice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageContacts(){
        System.out.println("Select any(1) of the following: "+
                "\n\t1. Show all contacts"+
                "\n\t2. Add anew contact" +
                "\n\t3. Search for a contact"+
                "\n\t4. Delete Contact"+
                "\n\t5. Go back to previous menu");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4 :
                deleteContacts();
                break;
            default:
                showInitialOption();
        }
    }

    private static void showAllContacts(){
        for(Contact c: contacts){
            c.getDetails();
            System.out.println("*****");
        }
        manageContacts();
    }
    private static void addNewContact(){
        System.out.println("Adding new Contact..."+"\nPlease enter contacts name: ");
        String name=scanner.next();
        System.out.println("Please enter a number: ");
        String number=scanner.next();
        System.out.println("Please enter a email: ");
        String email=scanner.next();

        if(name.equals("")|| number.equals("")|| email.equals("")){
            System.out.println("Please enter all of the information");
            addNewContact();
        }else{
            boolean doesExist=false;
            for(Contact c: contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                }
            }
            if(doesExist){
                System.out.println(" "+name+" named Contact already exists");
                addNewContact();
            }
            else {
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println(name+" Contact added successfully");
                System.out.println("--------");
            }
        }
        manageContacts();
    }
    private static void searchForContact(){
        System.out.println("Enter name of contact: ");
        String name=scanner.next();

        if(name.equals("")){
            System.out.println("Enter the name ");
            searchForContact();
        }
        else{
            boolean doesExists=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExists=true;
                    c.getDetails();
                    System.out.println("-------");
                }
            }
            if(!doesExists){
                System.out.println("Contact doesnot exists");
                System.out.println("------");
            }
        }
        manageContacts();
    }
    private static void deleteContacts(){
        System.out.println("Enter name of Contact ");
        String name= scanner.next();
        if(name.equals("")){
            System.out.println("Enter the name ");
            deleteContacts();
        }
        else{
            boolean doesExist=false;

            Iterator<Contact> iter = contacts.iterator();

            while (iter.hasNext()) {
                Contact c = iter.next();

                if (c.getName().equals(name)) {
                    doesExist = true;
                    iter.remove();
                    System.out.println("Contact deleted successfully");
                    System.out.println("-----");
                }
            }

            /*for(Contact c: contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                    contacts.remove(c);
                }
            }*/
            if(!doesExist)
                System.out.println("There is no such contact");
        }
        manageContacts();
    }

    private static void manageMessages(){
        System.out.println("Please select one:"+
                "\n\t1. show all messages"+
                "\n\t2. Send a new messages"+
                "\n\t3. Go back");
        int choice =scanner.nextInt();
        switch (choice){
            case 1:
                showAllMessages();
                break;
            case 2:
                sendMessage();
                break;
            default:
                showInitialOption();
                break;
        }
    }

    private static void showAllMessages(){
        ArrayList<Message>allMessages=new ArrayList<>();
        for(Contact c: contacts){
            allMessages.addAll(c.getMessages());
        }
        if(allMessages.size()>0){
            for(Message m: allMessages){
                m.getDetails();
                System.out.println("*********");
            }
        }
        else {
            System.out.println("You dont have any messages");
        }
        showInitialOption();
    }
    private static void sendMessage(){
        System.out.println("Enter name of contact");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name");
            sendMessage();
        }
        else{
            boolean doesExist=false;
            for(Contact c: contacts){
                if(c.getName().equals(name)){
                 doesExist=true;
                }
            }
            if(doesExist){
                System.out.println("Enter text: ");
                String text=scanner.next();
                if(text.equals("")){
                    System.out.println("Please Enter text");
                    sendMessage();
                }
                else{
                    id++;
                   Message newMessage=new Message(text,name,id);
                   for(Contact c: contacts){
                       if(c.getName().equals(name)){
                           ArrayList<Message>newMsg=c.getMessages();
                           newMsg.add(newMessage);
                           c.setMessages(newMsg);
                       }
                   }
                    System.out.println("-----");
                }
            }
            else{
                System.out.println("There is no such contact");
            }
        }
        manageMessages();
    }


}
