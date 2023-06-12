import java.sql.*;

public class Teacher {
    public static int save(String name, String email, String city, String qualification, String contact) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into teacher(name, email, city, qualification, contact) values(?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, city);
            ps.setString(4, qualification);
            ps.setString(5, contact);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from teacher where id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
