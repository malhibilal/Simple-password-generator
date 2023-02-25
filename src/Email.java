import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;

    private int passwordLength = 10;
    private int mailBoxCapacity;
    private String alternateEmailAddress;
    private String companySuffix = "technologies.com";
    private String department;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("frist and last names are  " + firstName + " and " + lastName);
       this.department=setDepartment();
        System.out.println("your department is "+department);

        System.out.println("---------------------");
        this.password = setPassword(passwordLength);
        System.out.println("your password is:  " + this.password);
        // calling method to change password
        changePassword();

    }

    private String setDepartment() {
        System.out.println("please enter the code for your departmemt \n 1 for sales \n 2 for Development \n 3 for Accounting");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        if (code == 1) {
            return "sales";

        } else if (code == 2) {
            return "development";
        } else if (code == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    private String setPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#%&/=?^*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    private String getEmailAddress() {
        return ("your email address is : " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix);

    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress = alternateEmailAddress;
    }

    private void changePassword() {
        System.out.println("would you like to change your password \n 1 for yes \n 2 for no");
        Scanner sc = new Scanner(System.in);
        int reply = sc.nextInt();
        if (reply == 1) {

            System.out.println("please write your new password");
            String newPassword = sc.next();
            sc.nextLine();
            System.out.println("please re-write your new password again");
            String newPassword1 = sc.next();

            if (newPassword.equals(newPassword1)) {
                System.out.println("password changed successfully!!!");
                System.out.println("your new password is " + newPassword1);
            } else {
                System.out.println("password doesn't matches. please re enter your new password again.");
                String newPassword2 = sc.next();
                if (newPassword2.equals(newPassword)) {
                    System.out.println("password updated sucessfully");
                } else {
                    System.out.println("please retry again");
                }
            }
        } else if (reply == 2) {
            System.out.println("thank-you for your answer");

        }
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void printDetails() {
        System.out.println("here is the details of the new emplyee email and password along with department");
        System.out.println("Name of the employee is : " + getFirstName() + " " + getLastName());
        System.out.println(getEmailAddress());
        System.out.println("alternate email address is : " + getAlternateEmailAddress());
        System.out.println("mailbox capacity is : " + getMailBoxCapacity());

    }
}
