import javax.swing.JOptionPane;

public class JOPTIONPANE_demo{
    public static void main(String[] args) {
        String errMsg1 = "Bạn đã thao tác lỗi";
        String msg1 = "Are you sure you want to exit?";
        String msg2 = "Please choose";
        String warningMsg1 = "Warning!!!";
        String warningMsg2 = "Press OK to continue";
        Object[] options = {"Continue","Cancel"};
        //JOptionPane.showMessageDialog(null, errMsg1, "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        int a = JOptionPane.showConfirmDialog(null, msg1,msg2 , JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(a);
        if(a == 0){System.exit(0);}
        else{
            a = JOptionPane.showOptionDialog(null, warningMsg2, warningMsg1, 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            System.out.println(a);
        }

    }
}