import java.sql.*;
public class Accountant {

	
	public static int save(String name,String password,String email,String contact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into accountant(name,password,email,contact) values(?,?,?,?)");
			ps.setString(1,name);
                        ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from accountant where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
