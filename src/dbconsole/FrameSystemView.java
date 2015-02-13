package dbconsole;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;



public class FrameSystemView extends Frame implements ActionListener,WindowListener {
 
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("ê√â™åßÇÃåéï ç~êÖó ");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int month, precipitation;
		ResultSet rs;
		
        MySQL mysql = new MySQL();
        
        rs = mysql.selectAll();
        
        try {
			while(rs.next()){
			 month = rs.getInt("month");
			 precipitation = rs.getInt("precipitation");
			 
			 System.out.println("monthÅF" + month);
			 System.out.println("precipitationÅF" + precipitation);
			 
			}
		} catch (SQLException ep) {
			// TODO Auto-generated catch block
			ep.printStackTrace();
		}

		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
