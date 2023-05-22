import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class main{
  public static void main(String[] args) {
    String fileName = "out.txt";
    PrintWriter outputStream = null;
    try{
        outputStream = new PrintWriter(fileName);
    }
    catch(FileNotFoundException e){
        System.out.println("Error opning file" + fileName);
        System.exit(0);
    }
    for(int count = 1 ;count<=3; count++){
        outputStream.println("this is line "+ count);
    }
        
}
}