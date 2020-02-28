
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {
    public static boolean addEmployee(EmpPojo e) throws SQLException{
      PreparedStatement ps = DBConnection.getConnection().prepareStatement("insert into emp values(?,?,?)");
      ps.setInt(1, e.getEmpno());
      ps.setString(2, e.getEname());
      ps.setDouble(3, e.getSal());  
      int result = ps.executeUpdate();
      return (result==1);
    }
}
