package gui.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import data.Component;
import enums.ComponentType;
import gui.component.button.AdvancedButton;
import gui.component.editbox.AdvancedEditBox;
import gui.component.textbox.AdvancedTextBox;

public class AdvancedGUIFactory extends GUIFactory{

    int componentIndex;

    ArrayList<String> modifyOptions = new ArrayList<String>(
        Arrays.asList(
                    "color",
                    "text-color",
                    "text-size"
                    )
    );

    @Override
    public void produce(Component component) {
        if(component.getType() == ComponentType.Button) {
            super.components.add(new AdvancedButton(component));
        }
        else if(component.getType() == ComponentType.Editbox) {
            super.components.add(new AdvancedEditBox(component));
        }
        else if(component.getType() == ComponentType.Textbox) {
            super.components.add(new AdvancedTextBox(component));
        }
    }

    @Override
    public void modify() {
        Scanner scannerAdvanced = new Scanner(System.in);
        
        while (true) {
            System.out.println("> Select Action:");
            System.out.println("  1: Modify");
            System.out.println("  2: Exit");

            System.out.print("> ");
            int choice = scannerAdvanced.nextInt();
            
            String color = "";
            int textSize = 9;
            int option = 0;
            int optionCount;

            if(choice==1) {
                System.out.println("> Enter Component No.: [Starts from 1]");

                System.out.print("> ");
                componentIndex = scannerAdvanced.nextInt()-1;

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
                option = scannerAdvanced.nextInt()-1;

                if(option == optionCount) {
                    continue;
                }
                else if(option == 2) {
                    System.out.println("> Enter New Text Size:");

                    System.out.print("> ");
                    textSize = scannerAdvanced.nextInt();

                    System.out.println(modifyOptions.get(option) + " " + textSize + " " + super.components.get(componentIndex).getType().toString() + " " + componentIndex);
                    super.components.get(componentIndex).modify(modifyOptions.get(option), textSize);
                }
                else {
                    System.out.println("> Enter New Color: [#rrggbb]");

                    System.out.print("> ");
                    color = scannerAdvanced.next();
    
                    if(!color.isEmpty()) {
                        System.out.println(modifyOptions.get(option) + " " + color + " " + super.components.get(componentIndex).getType().toString() + " " + componentIndex);
                        super.components.get(componentIndex).modify(modifyOptions.get(option), color);
                    }
                    else {
                        color = "";
                    }
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
