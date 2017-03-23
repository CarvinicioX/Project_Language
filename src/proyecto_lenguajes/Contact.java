package proyecto_lenguajes;

import javax.swing.ImageIcon;

/**
 *
 * @author car_v
 */
public class Contact {

    int ID;
    String Name, Phone, Image;

    public Contact(int ID, String Name, String Phone, String Image) {
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

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "id: " + ID + ", Name: " + Name + ", Phone: " + Phone + ", Image: " + Image;
    }
}
