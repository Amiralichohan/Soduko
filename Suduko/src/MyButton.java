import javax.swing.*;
import java.awt.*;

public class    MyButton extends JButton {
    MyButton(){

        this.setFont(new Font("Now Bold",Font.PLAIN,40));
        this.setForeground(new Color(123,50,250));
        this.setFocusable(false);
        this.setBackground(Color.white);
    }
}
