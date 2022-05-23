package assign1;

import assign1.constants.Display;
import assign1.exceptions.InvalidItemInput;
import assign1.models.Item;
import assign1.services.AddItemsFromCmdArgs;
import assign1.services.AddItemsInteractive;
import assign1.services.DisplayItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private List<Item> items;
    Scanner sc;
    public Application() {
        this.items= new ArrayList<>();
        sc=new Scanner(System.in);
    }
    public void run(String[] args){
        try{
            AddItemsFromCmdArgs.run(items,args);
            while (true){
                this.interactive();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void interactive() throws InvalidItemInput {
        System.out.println(Display.line);
        System.out.println(
                "1. enter new item\n"+
                "2. Display items\n"+
                "3. exit"
        );
        int op=this.sc.nextInt();
        switch (op){
            case 1:
                AddItemsInteractive.run(this.items,this.sc);
                break;
            case 2:
                DisplayItems.run(this.items);
                break;
            case 3:
                System.out.println("exiting....");
                System.exit(0);
            default:
                System.out.println("enter the correct option");
        }
    }
}
