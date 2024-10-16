import javax.swing.JOptionPane;

public class RandomFile{
    public static void main(String[] args) {
        String errMsg1 = "Bạn đã thao tác lỗi";
        String msg1 = "Are you sure you want to exit?";
        String msg2 = "Please choose";
        String warningMsg1 = "Warning!!!";
        String warningMsg2 = "Press Continue to continue";
        Object[] options = {"Continue","Cancel"};
        //JOptionPane.showMessageDialog(null, errMsg1, "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null, msg1,msg2 , JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showOptionDialog(null, warningMsg2, warningMsg1, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

    }
}