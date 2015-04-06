package controladores;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Hello
 * new sesionbean
 */
@Stateless
@LocalBean
public class HelloController {

    /**
     * Default constructor. 
     */
    public HelloController() {
        // TODO Auto-generated constructor stub
    }
    
    public String SayHello(String name){
    	return "Hello "+ name; 
    }
    
    

}
