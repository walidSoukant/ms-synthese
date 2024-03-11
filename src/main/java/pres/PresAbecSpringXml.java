package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAbecSpringXml {
    public static void main(String[] args) {
        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springContext.getBean("metier");
        System.out.println("Resultat:"+metier.calcul());
    }
    }

