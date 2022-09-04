package gui.factory;

import data.Component;
import enums.ComponentType;
import gui.component.button.SimpleButton;
import gui.component.editbox.SimpleEditBox;
import gui.component.textbox.SimpleTextBox;

public class SimpleGUIFactory extends GUIFactory {
    
    int changeIndex;

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
        // Scanner scanner1 = new Scanner(System.in);
        // // let user change till he wants, then create the UI
        // while (true) {
        //     // if the user want to change anything
        //     System.out.println("Change anything ? \n1.Change\n2.Exit");
        //     int choice = scanner1.nextInt();
        //     if(choice==1) {

        //         // which element user want to change
        //         System.out.println("Which element want to change ?\nEnter Element no : ");
        //         changeIndex = scanner1.nextInt(); // index of the changeable element
        //         //scanner1.nextLine();
        //         // clarify element to be changed
        //         System.out.println("change " + ui_components[changeIndex].type + " " + changeIndex + " Color :\nEnter RGB value : ");
        //         // change the color
        //         System.out.print("red : ");
        //         int r = scanner1.nextInt();
        //         System.out.print("Green : ");
        //         int g = scanner1.nextInt();
        //         System.out.print("Blue : ");
        //         int b = scanner1.nextInt();

        //         ui_components[changeIndex].changeColor(r,g,b);
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
    }

}
