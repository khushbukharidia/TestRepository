package SeleniumFirstScript;

public class JUnitMessage {				

    private String message;					

    public JUnitMessage(String message) {					
        this.message = message;							
    }		
    		
public String printMessage(){		
    
    System.out.println(message);
    
    int divide=1/0;
    		
    return message;					
}    		
    		
public String printHiMessage(){							
    		
    System.out.println("Hi!"+ message);					
    		
    return "Hi!"+ message;					
}    		
    		
}	
