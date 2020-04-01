package provis9.prak1;
import javax.swing.JFrame;

public class Utama extends JFrame {
    public Utama()
    {
        this.setSize(300, 300);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void tampil(){
        this.setVisible(true);
    }
    
    //override atau overload method
    
    public void tampil(String nama){
        this.setTitle(nama);
        this.setVisible(true);
    }
}