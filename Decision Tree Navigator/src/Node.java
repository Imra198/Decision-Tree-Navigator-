



public class Node {

    private int NodeID;
    private int yesID;
    private int noID;

    private String description;
    private String question;

    @Override
    public String toString() {// retrive and displays the inforamtion
        return //"NodeID: " + NodeID +
                //"yesID: " + yesID +
               // "| noID: " + noID +
                " description: " + description +
                " | question: " + question ;
        // return  " description: " + description + "| question: " + question ;
    }

    public Node() {
    }

    public Node(int nodeID, int yesID, int noID, String description, String question) {//parameters pass values
                                                                                  // through the constructor
        NodeID = nodeID;
        this.yesID = yesID;// this is used on member variables if the member variable doesn't
                           // have the same name as the parameter
        this.noID = noID;
        this.description = description;
        this.question = question;
    }

    public int getNodeID() {
        return NodeID;
    }

    public void setNodeID(int nodeID) {
        NodeID = nodeID;
    }// set changes the NodeID to nodeID

    public int getYesID() {
        return yesID;
    }// it gets the yesID because its private so had to use the get method

    public void setYesID(int yesID) {
        this.yesID = yesID;
    }// this.yesID refers to the variables at the top of the class

    public int getNoID() {
        return noID;
    }

    public void setNoID(int noID) {
        this.noID = noID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
