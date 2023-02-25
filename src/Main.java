public class Main {
    public static void main(String[] args) {
        Email email1 =new Email("Bilal","Ejaz");
        email1.setMailBoxCapacity(890);
        email1.setAlternateEmailAddress("bilalejaz@gmail.com");
        email1.printDetails();
        System.out.println(email1.getDepartment());




    }
}