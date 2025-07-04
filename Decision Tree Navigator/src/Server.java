import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Server {
    private Scanner fileLink;// declares the variable fileLink of data type scanner
    private ArrayList<Node> nodeArray;

    public Server() throws FileNotFoundException {

        java.io.File filePath = new java.io.File("src/Data.csv");
        nodeArray = new ArrayList<Node>();
        fileLink = new Scanner(filePath);
        while (fileLink.hasNext()) {
            // do the repeated actions here
            String line = fileLink.nextLine();
            String[] stringArray = line.split(","); // split the line on commas
            // How to convert Data
            int NodeID= Integer.parseInt(stringArray[0]);// converts the string to integer
            int yesID= Integer.parseInt(stringArray[1]);
            int noID= Integer.parseInt(stringArray[2]);
            String description =stringArray[3];
            String question= stringArray[4];

            // build my node worksheet 3
            Node node = new Node();// creates an object whee the constructor is used
            node.setNodeID(NodeID);
            node.setNoID(noID);
            node.setYesID(yesID); //with node.setYesID(yesID) is defined in the Node class
            node.setDescription(description);
            node.setQuestion(question);

            nodeArray.add(node);//adds 1 node at a time onto the nodeArray
        }
    }

    public Node getNode(int id){return nodeArray.get(id-1);}//get(int) on ArrayList
    public String getLine() {return fileLink.nextLine();}

    public void Close(){ fileLink.close();}

    public boolean hasAnotherLine() {return fileLink.hasNext();}// hasNext returns true or false

    public String toString() {

        String string = "";
        for(Node node :nodeArray){string+=node.toString()+"\n";}
        return string;
    }

}
