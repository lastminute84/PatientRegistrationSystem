
import controller.SurgeryController;
import model.Surgery;
import view.SurgeryFrame;


/*
 * @author Csaba
 * Date: 20-Feb-2015
 */
public class Main {

    public static void main(String[] args) {
        
        Surgery dataModel = new Surgery();
        
        SurgeryController.getInstance().setSurgeryModel(dataModel);
        
        SurgeryFrame gui = new SurgeryFrame("Patient Database");
        
        SurgeryController.getInstance().setGUIReference(gui);
        
        
    }
}
