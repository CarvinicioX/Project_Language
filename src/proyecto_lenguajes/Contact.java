package proyecto_lenguajes;

import javax.swing.ImageIcon;

/**
 *
 * @author car_v
 */
public class Contact {

    int ID;
    String Name, Phone;
    ImageIcon Image;

    public Contact(int ID, String Name, String Phone, ImageIcon Image) {
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Image = Image;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public ImageIcon getImage() {
        return Image;
    }

    public void setImage(ImageIcon Image) {
        this.Image = Image;
    }
}
