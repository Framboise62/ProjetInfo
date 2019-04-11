import java.awt.*;
import javax.swing.*;
import java.util.LinkedList;

public class FenetreScore extends JFrame{
    
    //tous les attributs à définir
    
    private JLabel score;
    private JButton rejouer;
    
    public FenetreScore(){
        
        super("Perdu !");
        this.setSize(new Dimension(1000,400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Placement de la fenêtre au centre de l'écran (source : Phys2D)
        int x = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 1000) / 2;
		int y = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 400) / 2;
		this.setLocation(x,y);
        
        score = new JLabel ("Perdu ! Score :");
        JPanel afficheScore = new JPanel(new FlowLayout());
        afficheScore.add(score);
        
        rejouer = new JButton ("Rejouer");
        rejouer.addActionListener(new EcouteurBoutonRejouer(this));
        
        JPanel conteneurPrincipal = new JPanel(new BorderLayout());
        conteneurPrincipal.add(afficheScore, BorderLayout.CENTER);
        conteneurPrincipal.add(rejouer, BorderLayout.SOUTH);
        setContentPane(conteneurPrincipal);
        setVisible(true);
    }
    
    //Methode qui fait disparaître la fenêtre
    public void rendreInvisible(){
		setVisible(false);
	}
    
    //Methode qui rend visible la fenetre
    public void rendreVisible(){
		setVisible(true);
	}
}

