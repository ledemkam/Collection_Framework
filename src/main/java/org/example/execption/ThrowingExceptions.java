package org.example.execption;

public class ThrowingExceptions {

    public static void main(String[] args) {
        try {
            registerUser("John", 14);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occured: " + e.getMessage());
            throw e;
        }

    }
        static void registerUser(String username,int age) {
            if(age<18){
                throw  new IllegalArgumentException("Age must be greater than 18");

            }else {
                System.out.println("User registered successfully");
            }
        }
    }

