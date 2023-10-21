import javax.swing.JOptionPane;
public class pane1{
  public static void main(String[] args){
    String name = JOptionPane.showInputDialog("What's Your Name?");
    JOptionPane.showMessageDialog(null, "Hello " + name);
  }
}
