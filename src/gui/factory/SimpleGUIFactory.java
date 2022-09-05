package gui.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import data.Component;
import enums.ComponentType;
import gui.WindowManager;
import gui.component.GUIComponent;
import gui.component.button.SimpleButton;
import gui.component.editbox.SimpleEditBox;
import gui.component.textbox.SimpleTextBox;

public class SimpleGUIFactory extends GUIFactory {
    
    int componentIndex;

    ArrayList<String> modifyOptions = new ArrayList<String>(
        Arrays.asList(
                    "color",
                    "text-color"
                    )
    );

    public void produce(Component component) {
        if(component.getType() == ComponentType.Button) {
            super.components.add(new SimpleButton(component));
        }
        else if(component.getType() == ComponentType.Editbox) {
            super.components.add(new SimpleEditBox(component));
        }
        else if(component.getType() == ComponentType.Textbox) {
            super.components.add(new SimpleTextBox(component));
        }
    }

    public void modify() {
        Scanner scannerSimple = new Scanner(System.in);
        
        while (true) {
            System.out.println("> Select Action:");
            System.out.println("  1: Modify");
            System.out.println("  2: Exit");

            System.out.print("> ");
            int choice = scannerSimple.nextInt();
            
            String color = "";
            int option = 0;
            int optionCount;

            if(choice==1) {
                System.out.println("> Enter Component No.: [Starts from 1]");

                System.out.print("> ");
                componentIndex = scannerSimple.nextInt()-1;

                System.out.println("> [SELECTED] " + super.components.get(componentIndex).getType().toString() + " " + componentIndex);
                System.out.println("> Modify " + super.components.get(componentIndex).getType().toString() + " " + componentIndex + ":");

                option = 1;
                for(String modifyOption : modifyOptions) {
                    System.out.println("  " + option + " " + modifyOption);
                    option++;
                }
                System.out.println("  " + option + " " + "Cancel");
                optionCount = option-1;

                System.out.print("> ");
                option = scannerSimple.nextInt()-1;

                if(option == optionCount) {
                    continue;
                }

                System.out.println("> Enter New Color: [#rrggbb]");

                System.out.print("> ");
                color = scannerSimple.next();

                if(!color.isEmpty()) {
                    System.out.println(modifyOptions.get(option) + " " + color + " " + super.components.get(componentIndex).getType().toString() + " " + componentIndex);
                    super.components.get(componentIndex).modify(modifyOptions.get(option), color);
                }
                else {
                    color = "";
                }
            }
            else if(choice == 2) {
                System.exit(0);
            }
            else {
                break;
            }
        }
    }

}
