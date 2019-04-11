import java.awt.*;
import javax.swing.*;

import net.phys2d.math.*;
import net.phys2d.raw.*;
import net.phys2d.raw.strategies.*;


public class FenetreJeu extends JFrame{
	
	//tous les attributs à définir
    
    private JLabel nomJoueur;
    private JLabel score;
    
    private World world;
    
    public FenetreJeu(){
        
        
        // Action par défaut
        super("Jeu");											// Nom de la fenêtre
        this.setResizable(false);								// Taille invariable
        this.setIgnoreRepaint(false);							// Pas compris pourquoi (source : Phys2D)
        this.setSize(1000,800);									// Taille définitive de la fenêtre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Action par défaut à faire à la fermeture
        
        
        // Placement de la fenêtre au centre de l'écran (source : Phys2D)
        int x = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 1000) / 2;
		int y = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 800) / 2;
		this.setLocation(x,y);
        
        
        // Initialisation du monde :
        world = new World(new Vector2f(0.0f, 10.0f), 10, new QuadSpaceStrategy(20,5));
        
        // Lien de la fenêtre avec EcouteurTouches
        this.addKeyListener(new EcouteurTouches(this));
        
        nomJoueur= new JLabel ("Nom Joueur");
        score= new JLabel ("Score");
        
        JPanel informations = new JPanel (new BorderLayout());
        informations.add(nomJoueur, BorderLayout.WEST);
        informations.add(score, BorderLayout.EAST);
        
        JPanel plateauDeJeu = new JPanel (new FlowLayout());
        plateauDeJeu.setBackground(Color.RED);
        
        JPanel conteneurPrincipal = new JPanel(new BorderLayout());
        conteneurPrincipal.add(informations, BorderLayout.NORTH);
        conteneurPrincipal.add(plateauDeJeu, BorderLayout.CENTER);
        setContentPane(conteneurPrincipal);
        
        setVisible(true); //à remettre en false quand tout sera mis en place
    }
    
    //Methode qui fait disparaître la fenêtre
    public void rendreInvisible(){
		setVisible(false);
	}
    
    //Methode qui rend visible la fenetre
    public void rendreVisible(){
		setVisible(true);
	}
	
	// Ajouter les méthodes pour que le bloc en cours de chute aille à gauche ou à droite
}
