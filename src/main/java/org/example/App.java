package org.example;

import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        int std_rollno=35;
        String std_name="vitthal";
        float std_marks=67.8f;
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
        String insert_sql_query="INSERT INTO Student values(?,?,?)";
        int count= jdbcTemplate.update(insert_sql_query,std_rollno,std_name,std_marks);
        if (count>0){
            System.out.println("insert");
        }

    }
}
