package jdbc_day31_32;

import java.sql.*;

public class EmployeePayrollUpdate {
    public static void main(String[] args) {

        try {
            //IP:PORT
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root");

            Statement statement = connection.createStatement();

//exceute : Will return boolean true if query success else false.
// (Used for create table, insert, update & delete )
//statement.execute("insert into employee_payroll values('6','Ram','M','40000.00','2019-05-15');");

//statement.executeUpdate("update employee_payroll set name='Ankit' where id=1;");

//            statement.execute("delete from employee_payroll where id=6;");

//            ResultSet result = statement.executeQuery("select * from employee_payroll;");
            statement.executeUpdate("insert into employee_payroll (nme,salary,startDate,gender,emp_phone,address,department,deduction,taxable,incomeTax,basic,net)values ('arpit','30','2023-2-25','M',48494,'sg','computer',9,0,0,50,0)");
//            String query = "insert into employee_payroll  values ('arpit','30','2023-2-25','M',48494,'sg','computer',9,0,0,50,0)";
//            int count = statement.executeUpdate(query);
//            System.out.println(count+" row affected");
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}
