import java.awt.event.*;
import java.util.*;

public class EcouteurBoutonJouer implements ActionListener{
    
    private FenetreAccueil fen;
    
    public EcouteurBoutonJouer(FenetreAccueil fenetre){
		this.fen=fenetre;
	}
    
    public void actionPerformed(ActionEvent ae){
		fen.rendreInvisible();
		FenetreJeu jeu = new FenetreJeu();
		jeu.rendreVisible();
	}
}
