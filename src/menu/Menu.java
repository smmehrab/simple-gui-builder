package menu;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner;

    public Menu() {
        System.out.println("\n> Simple GUI Builder");
        System.out.println("---------------------------------------");
        scanner = new Scanner(System.in);
    }

    public String[] selectConfigFile() {        
        String layoutPath = Paths.get(Paths.get("").toAbsolutePath().toString(), "layout").toString();
        File layoutDirectory = new File(layoutPath);
        File[] layoutFiles = layoutDirectory.listFiles();
        ArrayList<String> layoutFileNames = new ArrayList<String>();


        for (File file : layoutFiles) {
            if (file.isFile() && !file.getName().equals(".gitkeep")) {
                layoutFileNames.add(file.getName());
            }
        }

        System.out.println("\n> Layout Files:");

        if(layoutFileNames.size()==0) {
            System.out.println("> Unfortunately, the layout folder is empty. Please, add your necessary layout files there.");
        }

        for (int i = 0; i < layoutFileNames.size(); i++) {
            System.out.println("  " + (i+1) + ": " + layoutFileNames.get(i));
        }

        System.out.println("> Select:");
        System.out.print("> ");

        int choice;
        choice = scanner.nextInt();

        String[] fileNameParts = layoutFileNames.get(choice-1).split("\\.");
        String layoutFileType = fileNameParts[fileNameParts.length-1];
        String layoutFileName = layoutFileNames.get(choice-1);

        String[] configInfo = new String[2];
        configInfo[0] = layoutFileType;
        configInfo[1] = layoutFileName;
        return configInfo;
    }

    public GUIStyle selectGUIStyle() {
        System.out.println("\n> GUI Styles:");
        System.out.println("  1: " + "Simple GUI");
        System.out.println("  2: " + "Advanced GUI");
        System.out.println("> Select:");
        System.out.print("> ");
        int choice;
        choice = scanner.nextInt();
        return (choice==1) ? GUIStyle.SIMPLE : GUIStyle.ADVANCED;
    }
}
