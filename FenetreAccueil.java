import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class FenetreAccueil extends JFrame{
    
    //tous les attributs à définir
    private JButton boutonJouer;
	private JTextField taperNom;
    private JLabel nomDuJeu;
    private JLabel texteTaperNom;
    Image fond; 	    // L'image du papier peint
    
    //Constructeur de la Fenetre
    
    public FenetreAccueil(){
        
        super("Accueil");
        this.setSize(new Dimension(1000,400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Toolkit T=Toolkit.getDefaultToolkit();
        fond = T.getImage("cubes.png");
        
        
        
        boutonJouer = new JButton("C'est parti !");
		//boutonJouer.addActionListener(new EcouteurBoutonJouer(this));

        
        nomDuJeu = new JLabel("Il faut encore qu'on trouve l'inspi");
        texteTaperNom = new JLabel("Nom du Joueur ");
        taperNom = new JTextField(20);
        
        JPanel nomJeu = new JPanel(new FlowLayout());
        nomJeu.add(nomDuJeu);
        
        JPanel authentification = new JPanel(new FlowLayout());
        authentification.add(texteTaperNom);
        authentification.add(taperNom);
        
        JPanel jouer = new JPanel(new FlowLayout());
        jouer.add(boutonJouer);
        
        JPanel conteneurPrincipal = new JPanel(new GridLayout(3,1));
        conteneurPrincipal.add(nomJeu);
        conteneurPrincipal.add(authentification);
        conteneurPrincipal.add(jouer);
        
        setContentPane(conteneurPrincipal);
        setVisible(true);
    }
    
     
    //Methode qui fait disparaître la fenêtre d'accueil 
    
    public void rendreInvisible(){
		setVisible(false);
	}
}
