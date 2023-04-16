package jdbc_day31_32;

import java.sql.Connection;
        import java.sql.*;
        import java.sql.ResultSet;
        import java.sql.Statement;

public class Employee_Payroll {
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

            ResultSet result = statement.executeQuery("select * from employee_payroll;");

            while (result.next()) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Id: " + result.getInt(1));
                System.out.println("Name: " + result.getString(2));
                System.out.println("salary: " + result.getDouble(3));
                System.out.println("StartDate: " + result.getDate(4));
                System.out.println("gender: " + result.getString(5));
                System.out.println("phone: " + result.getInt(6));
                System.out.println("address: " + result.getString(7));
                System.out.println("departnment: " + result.getString(8));
                System.out.println("deduction: " + result.getDouble(9));
                System.out.println("taxable: " + result.getDouble(10));
                System.out.println("income tax: " + result.getDouble(11));
                System.out.println("Basic: " + result.getDouble(12));
                System.out.println("net: " + result.getDouble(13));
            }
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
