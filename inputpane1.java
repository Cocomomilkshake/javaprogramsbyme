import javax.swing.JOptionPane;
public class inputpane1{
  public static void main(String[] args){
    //convo 1:
    String name1 = JOptionPane.showInputDialog("What's Your Name?");
    JOptionPane.showMessageDialog(null, "Hello " + name);
    
    // convo 2:
    int age1 = parseint.JOptionPane.showInputDialog("What's Your Age?");
    JOptionPane.showMessageDialog(null, "You Are " + age1);

    //convo 3:
    String favfood1 = JOptionPane.showInputDialog("What's Your Favorite Food?");
    JOptionPane.showMessageDialog(null, "Your Favourite Food Is " + favfood1);

    //convo end:
    JOptionPane.showMessageDialog(null, "Hello " + name1 + ", You Are " + age1 + "Years Old, And You Like " + favfood1);
  }
}