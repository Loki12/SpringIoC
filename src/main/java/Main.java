import model.RobotModels.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sergej on 02.02.2017.
 * Main part.
 */
public class Main {

    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ModelT1000 modelT1000 = (ModelT1000) context.getBean("t1000");
        modelT1000.dance();

    }
}
