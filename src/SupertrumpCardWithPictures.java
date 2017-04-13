import javax.swing.*;

/**
 * Name: Diraj Ravikumar
 * Student ID: 13255244
 *
 * Date: 24/01/2017
 * GitHub: https://github.com/dirajrk/MineralSuperTrumpsGUI
 */
 
public class SupertrumpCardWithPictures extends SupertrumpCard {
    private ImageIcon cardImage;

    SupertrumpCardWithPictures(String nm,ImageIcon img)
    {
        super(nm);
        cardImage = img;
    }

    public ImageIcon getCardImage() {
        return cardImage;
    }
}
