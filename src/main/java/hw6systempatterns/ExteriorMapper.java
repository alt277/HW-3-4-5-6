package hw6systempatterns;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExteriorMapper {
    public static List<Exterior> map(ResultSet resultSet) throws SQLException {
        List<Exterior> exteriorList = new ArrayList<>();
        while (resultSet.next()) {
            Exterior exterior = new Exterior();

            exterior.setId(resultSet.getInt(1));
            exterior.setColor(resultSet.getString(2));
            exterior.setTintedWindows(resultSet.getBoolean(3));
            exterior.setChromMoldings(resultSet.getBoolean(4));
            exterior.setWheelSize(resultSet.getDouble(5));
            exterior.setGrillDesign(resultSet.getString(6));
            exterior.setWheelDesign(resultSet.getString(7));

            exteriorList.add(exterior);

        }
        return exteriorList;
    }
}

//
