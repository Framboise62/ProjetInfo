import java.awt.event.*;
import java.util.*;

public class EcouteurBoutonRejouer implements ActionListener{
    
    private FenetreScore fen;
    
    public EcouteurBoutonRejouer(FenetreScore fenetre){
		this.fen=fenetre;
	}
    
    public void actionPerformed(ActionEvent ae){
		fen.rendreInvisible();
		FenetreAccueil accueil = new FenetreAccueil();
	}
}
