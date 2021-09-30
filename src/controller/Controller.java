
package controller;

import model.ModelInterface;
import view.ViewInterface;

/**
 *
 * @author ibai arriola  y jon mayo 
 *
 */
public class Controller {
    /**
     * 
     * @param view   como vamos a visualizar el metodo get.Greetins
     * @param model   de donde obtendremos los datos ( base de datos , fichero)
     */
    
    public void run(ViewInterface view,ModelInterface model){
        view.showGreeting(model.getGreetings());
        
    }
    
}
