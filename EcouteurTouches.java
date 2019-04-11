import java.awt.event.*;
import java.util.*;

public class EcouteurTouches extends KeyAdapter{
    
    private FenetreJeu fen;
    
    public EcouteurTouches(FenetreJeu fenetre){
		this.fen=fenetre;
	}
    
    public void keyTyped(KeyEvent e){
		if(e.getKeyChar() == 'q'){
			// ajouter ici le code pour que le bloc aille vers la gauche (méthode de la fenêtre)
			System.out.println("Gauche");
		}else if(e.getKeyChar() == 'd'){
			// ajouter ici le code pour que le bloc aille vers la droite (méthode de la fenêtre)
			System.out.println("Droite");
		}
	}

}
