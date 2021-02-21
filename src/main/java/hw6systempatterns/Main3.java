package hw6systempatterns;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, SQLException {

        String url = "jdbc:mysql://localhost/car_configurator?serverTimezone=Europe/Moscow&useSSL=false";
        String username = "root";
        String password = "intrepid277";
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

        Connection connection = DriverManager.getConnection(url, username, password);

        final ExteriorDao exteriorDao = new ExteriorDao();
        Exterior exterior = exteriorDao.findById(2, connection);
        System.out.println(exterior);

        Exterior newExterior = new Exterior(4, "grey", true, false, "horisontal", 17, "stars");
        exteriorDao.save(newExterior, connection);
        final Exterior exterior2 = exteriorDao.findById(4, connection);
        System.out.println(exterior2);

        Statement statement = connection.createStatement();           //то,что подчеркивает имя - нормально
        ResultSet resultSet = statement.executeQuery("SELECT * FROM car_configurator.exterior");

        final List<Exterior> exteriorList = ExteriorMapper.map(resultSet);
        System.out.println(exteriorList);

        connection.close();              //тогда не нужен try/catch

    }

}
