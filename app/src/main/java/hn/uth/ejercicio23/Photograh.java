package hn.uth.ejercicio23;

public class Photograh {
    private byte[] image;
    private String description;

    public Photograh(byte[] image, String description) {
        this.image = image;
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
