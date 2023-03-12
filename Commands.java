import java.io.File;
import java.util.Scanner;
import javax.swing.text.html.parser.Entity;
import org.xml.sax.Attributes;


public class Commands {
  //  Scanner input = new Scanner(System.in);
    private int Time_Start;
    private int Time_End;
    private int Day;
    private String Course_Namme;
    //Attribute class Commands
    
    public Commands(int Time_Start, int Time_End, int Day, String Course_Namme){
        this.Time_Start = Time_Start;
        this.Time_End = Time_End;
        this.Day =Day;
        this.Course_Namme=Course_Namme;
    }//end Constracture

    public int getTime_Start(){
        return Time_Start;
    }//END method getTime_Start
    
    public void setTime_Start(int Time_Start){
        this.Time_Start = input.nextInt();
    }//END method setTime_Start
        
    public int getTime_End(){
        return Time_End;
    }//END method getTime_End
    
    public void setTime_End(){
        this.Time_End = input.nextInt();
    }//END method setTime_End

    public int getDay() {
        return Day;
    }//End method getDay
    
    public void setDay(int Day){
        String day; 
        switch (Day) { 
        case 1: day = "Sunday";
        break;
        case 2: day = "Monday";
        break;
        case 3: day = "Tuesday";
        break;
        case 4: day = "Wednesday"; 
        break;
        case 5: day = "Thursday";
        break;
        case 6: day = "Friday";
        break; 
        case 7: day = "Saturday";
        break;
    }// End method getDay
        System.out.println(this.Day = input.nextInt());
    }// End method setDay
    
    public String getCourse_Namme(){
        return Course_Namme;
    }// End method getCourse_Namme 

    public void setCourse_Namme(){
        Scanner input = new Scanner(System.in);
        this.Course_Namme = input.nextLine();
    }// End method setCourse_Namme 
    
    @Override
    public String toString(){
        return  Time_Start+ Time_End+  Day+  Course_Namme;
    }// End method toString
    

}// End class Commands 