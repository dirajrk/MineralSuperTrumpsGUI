import javax.swing.*;

/**
 * Name: Diraj Ravikumar
 * Student ID: 13255244
 *
 * Date: 24/01/2017
 * GitHub: https://github.com/dirajrk/MineralSuperTrumpsGUI
 */
 
public class NormalCardWithPictures extends NormalCard {
    private ImageIcon cardImage;
    NormalCardWithPictures(String nm, float hard, float speGra, String cleav, String cryAbu, String ecoV, ImageIcon img)
    {
        super(nm,hard,speGra,cleav,cryAbu,ecoV);
        cardImage = img;
    }

    public ImageIcon getCardImage() {
        return cardImage;
    }
}
