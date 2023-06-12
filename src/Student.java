import java.sql.*;
public class Student {

	
	public static int save(String name,String password,String email,String dob,String address,String city,String contact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into student(name,password,email,DOB,address,city,contact) values(?,?,?,?,?,?,?)");
			
                        ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
                        ps.setString(4,dob);
			ps.setString(5,address);
			ps.setString(6,city);
			ps.setString(7,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from student where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from student where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
