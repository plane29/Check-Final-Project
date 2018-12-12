
//Taken from lab 7
public interface OrderedCollection{  //this is an interface to make sure that our DS has all of the correct methods
    public void append(int toAppend);  //append takes in some int
    public int peek(); //peek takes in no arguments
    public int pop();  //pop takes in no arguments
    public String toString();  //toString takes no arguments
    public int length();  //length takes in no arguments
}