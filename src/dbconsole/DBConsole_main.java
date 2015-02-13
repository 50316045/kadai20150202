package dbconsole;

import java.awt.Label;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Label month, precipitation;
        int month1,precipitation1;
        
        ResultSet rs;
       
        MySQL mysql = new MySQL();
        
        rs = mysql.selectAll();
        
        FrameSystemController controller = new FrameSystemController();
        FrameSystemView frame = new FrameSystemView(controller);
        frame.setBounds(5,5,655,455);
        frame.setVisible(true);
        
       
        try {
			while(rs.next()){
			 month1 = rs.getInt("month");
			 precipitation1 = rs.getInt("precipitation");
			 
			 month = new Label(String.valueOf(month1));
			 precipitation = new Label(String.valueOf(precipitation1));
			 
			 frame.add(month);
			 frame.add(precipitation);
			 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
	}

	
}
