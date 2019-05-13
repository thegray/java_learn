package pbk;

import pbk.MyClasses.*;

import java.util.Scanner;

public class Consoles {

    private boolean keepRunning = true;

    public void Run() {
        MyClass mc = new MyClass();
        mc.setStr("Program Keren");
        System.out.println(mc.getStr());

        MyClass mc2 = new MyClass("Bangun");

        ClassA ca = new ClassA();
        ClassB cb = new ClassB();

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String strInput = sc.nextLine();
//            System.out.println("type any command : ");
//
//            System.out.println("You type : " + strInput);
            String[] tokenizedInput = strInput.split(" ");

            if (strInput.equals("exit")) {
                break;
            } else if (strInput.equals("kampret")) {
                System.out.println("Cebong");
            } else if (strInput.equals("classa")) {
                System.out.println(ca.getStr());
            } else if (strInput.equals("classb")) {
                System.out.println(cb.getStr());
            } else if (strInput.equals("my name")) {
                System.out.println(mc2.getStr());
            } else if (tokenizedInput[0].equals("ganteng_bener")) {
                System.out.println(tokenizedInput[1]);
            } else {
                System.out.println("Command not found, try again..");
            }
        }
    }
}
