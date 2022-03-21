package com.codeX;


import java.util.Scanner;

public class ContactDataBase {
    Scanner sc=new Scanner(System.in);

    public static MyArrayList<ContactDataBase> arr=new MyArrayList();


    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String Email;


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }





    public void AddDetails(){


        ContactDataBase cdn =new ContactDataBase();
        System.out.println("Enter your First Name: ");
        String fn=sc.next();

        System.out.println("Enter your Last Name: ");
        String ln=sc.next();

        System.out.println("Enter your Email Address: ");
        String add=sc.next();

        System.out.println("Enter your Phone Number ");
        String PN=sc.next();

        cdn.setFirstName(fn);
        cdn.setLastName(ln);
        cdn.setEmail(add);
        cdn.setPhoneNumber(PN);

        arr.add(cdn);
        System.out.println("Contact Registered Successfully");




    }



    public void SearchContact(String PhoneNumber1) {
        boolean b = false;
        ContactDataBase cdn = new ContactDataBase();
        MyIterator<ContactDataBase> iter = new MyIterator<>(arr);
        while (iter.hasNext()){
            ContactDataBase temp = iter.next();
            if (temp.PhoneNumber.equals(PhoneNumber1)) {

                System.out.println("First name : " + temp.getFirstName() );
                System.out.println("Last name : " + temp.getLastName() );
                System.out.println("Email : " + temp.getEmail() );
                System.out.println("Phone number : " + temp.getPhoneNumber() );
                b = true;
                break;
            }
        }
        if(!b)
        {
            System.out.println("Not Found");
        }

    }
    public void DeleteContact(String PhoneNumber){
        boolean b = false;
        ContactDataBase cdn=new ContactDataBase();
        MyIterator<ContactDataBase> iter = new MyIterator<>(arr);
        int i = 0 ;
        while (iter.hasNext())
        {
            ContactDataBase temp = iter.next();


            if(temp.PhoneNumber.equals(PhoneNumber)){

                arr.remove(i);
                System.out.println("Contact Deleted Successfully.");
                b = true;
                break;

            }
            i++;
        }
        if(!b)
        {
            System.out.println("Not Found");
        }



    }










}
