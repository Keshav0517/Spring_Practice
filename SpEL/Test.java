package org.example.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpEL_config.xml");
        Student s1=context.getBean("student",Student.class);
        System.out.println(s1);

        ExpressionParser parser = new SpelExpressionParser();

        Expression exp = parser.parseExpression("'Hello SPELL'");
        String message = (String) exp.getValue();
        System.out.println(message);

        Expression exp1=parser.parseExpression("50+60");
        Integer message1=(Integer) exp1.getValue();
        System.out.println(message1);
    }
}
