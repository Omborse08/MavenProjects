package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "LLD")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ImageData" , columnDefinition = "LONGBLOB")
    private byte[] image;

    public Image(byte[] image) {
        this.image = image;
    }

    public Image() {
    }

    public int getId() {
        return id;
    }

    public byte[] getImage() {
        return image;
    }
}
