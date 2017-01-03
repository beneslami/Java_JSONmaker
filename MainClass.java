package ir.org.acm.main;

import org.json.JSONException;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ben on 12/30/16.
 */
public class MainClass {
    public static void main(String[] args) throws JSONException, IOException {

        int input = -1 ;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        JSONclass json = new JSONclass();


        while (input != 0){
            System.out.println("1-append information:");
            System.out.println("0-quit");

            input = sc.nextInt();

            if(input == 1){
                System.out.println("please enter name:");
                String name = sc.next();
                System.out.println("please enter university:");
                String university = sc.next();
                System.out.println("please enter email:");
                String email = sc.next();
                System.out.println("please enter the field of study:");
                String field = sc.next();
                System.out.println("please enter the page link:");
                String link = sc.next();

                json.appendObject(name,university,email,field,link);
            }
            else if(input == 0){
                break;
            }
        }
    }
}
