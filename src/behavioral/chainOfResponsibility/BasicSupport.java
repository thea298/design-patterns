package behavioral.chainOfResponsibility;

import java.util.Scanner;

public class BasicSupport extends CustomerServiceAgent {

    @Override
    public void handle(Request request) {
        System.out.println("Basic support: Have you tried turning it off and on again?");
        Scanner scanner = new Scanner (System.in);
        String answer = scanner.next();
        if(answer.equals("no")){
            System.out.println("Try it, bye bye");
            scanner.close();
            return;//request finishes here
        }
        System.out.println("Basic operator will forward your request to an available tech");
        this.getNext().handle(request);
        scanner.close();
    }
    
}
