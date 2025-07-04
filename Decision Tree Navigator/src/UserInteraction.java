import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInteraction {
    public static void main(String[] args) throws FileNotFoundException {
        Server server = new Server();
        Node nodes = server.getNode(1);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(nodes.toString());
            String userinput = scanner.next();
        while (true) {
            if (userinput.equals("yes")||userinput.equals("no")){
                break;
            };
               // if the method equals() reurns true, will show next node


            // if the method equals() reurns false, will show invalid userinput, then the user has to enter valid userinput

            System.out.println("invalid userinput");
             userinput = scanner.next();
        }
            if (userinput.equals("yes")){
                int yesID = nodes.getYesID();
                nodes = server.getNode(yesID);
            } else if (userinput.equals("no")){
                int noID = nodes.getNoID();
                nodes = server.getNode(noID);

            }
            if( nodes.getYesID()==-1 ){
                System.out.println(server.getNode(40));
                break;
            }
        }
    }
}
