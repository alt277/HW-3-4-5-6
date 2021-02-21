package hw6systempatterns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ExteriorDao {
    private final Map<Integer, Exterior> identityMap = new HashMap<>();

    public Exterior findById(int myId, Connection connection) throws SQLException {

        Exterior exterior = identityMap.get(myId);
        if (exterior == null) {
            String str = "SELECT * FROM car_configurator.exterior where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(str);
            preparedStatement.setInt(1, myId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                exterior = new Exterior();

                exterior.setId(resultSet.getInt(1));
                exterior.setColor(resultSet.getString(2));
                exterior.setTintedWindows(resultSet.getBoolean(3));
                exterior.setChromMoldings(resultSet.getBoolean(4));
                exterior.setWheelSize(resultSet.getDouble(5));
                exterior.setGrillDesign(resultSet.getString(6));
                exterior.setWheelDesign(resultSet.getString(7));
                //    System.out.println(exterior);
            }
            if (exterior != null) {
                identityMap.put(myId, exterior);
            }
        }
        return exterior;
    }

    public void save(Exterior exterior, Connection connection) throws SQLException {

        identityMap.remove(exterior.getId());

        //save to DB
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into  car_configurator.exterior" +
                        " (id,color,chromMoldings,tintedWindows,wheelSize,grillDesign,wheelDesign)" +
                        " values (?,?,?,?,?,?,?);");


        preparedStatement.setInt(1, exterior.getId());          //set.для вставки: напр.setInt
        preparedStatement.setString(2, exterior.getColor());//get.. для извлечения: getString
        preparedStatement.setBoolean(3, exterior.isChromMoldings());
        preparedStatement.setBoolean(4, exterior.isTintedWindows());
        preparedStatement.setDouble(5, exterior.getWheelSize());
        preparedStatement.setString(6, exterior.getGrillDesign());
        preparedStatement.setString(7, exterior.getWheelDesign());

        preparedStatement.addBatch();
        preparedStatement.executeBatch();

        identityMap.remove(exterior.getId());

    }
}
