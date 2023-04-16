package jdbc_day31_32;

import java.sql.*;

public class Prepared_Statment {

        public static void main(String[] args) {

            try {
                //IP:PORT
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root");



//statement.executeUpdate("update employee_payroll set name='Ankit' where id=1;");

//            statement.execute("delete from employee_payroll where id=6;");

//            ResultSet result = statement.executeQuery("select * from employee_payroll;");
//            PreparedStatment.executeUpdate("insert into employee_payroll (nme,salary,startDate,gender,emp_phone,address,department,deduction,taxable,incomeTax,basic,net)values ('arpit','30','2023-2-25','M',48494,'sg','computer',9,0,0,50,0)");

                String query = "insert into employee_payroll (nme,salary,startDate,gender,emp_phone,address,department,deduction,taxable,incomeTax,basic,net)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(2,"zero");
                statement.setDouble(3,500.5);
                statement.setString(4,"2019-05-06");
                statement.setString(5,"M");
                statement.setInt(6,930926);
                statement.setString(7,"address...");
                statement.setString(8,"comp");
                statement.setInt(9,50);
                statement.setInt(10,5);
                statement.setInt(11,6);
                statement.setInt(12,5000);
                statement.setInt(13,6);
//                statement.setString("arpitnext");
                int count = statement.executeUpdate();

                System.out.println(count+" row affected");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

}
