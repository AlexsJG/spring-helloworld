import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println("Кот " + bean3.getName() + ", " + "возраст " + bean3.getAge() + " года");

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println("Кот " + bean4.getName() + ", " + "возраст " + bean4.getAge() + " года");

        System.out.println(bean == bean2);
        if (bean3 == bean4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}