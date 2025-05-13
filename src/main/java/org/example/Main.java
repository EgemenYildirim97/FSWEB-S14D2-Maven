package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // 1. Gerekli nesneleri oluşturuyoruz
        Wall northWall = new Wall("North");
        Wall southWall = new Wall("South");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");

        Ceiling bedroomCeiling = new Ceiling(3, PaintColor.WHITE);

        Bed kingBed = new Bed("King", 4, 60, 2, 1);

        Lamp bedsideLamp = new Lamp(LampType.NORMAL, false, 75);

        Wardrobe largeWardrobe = new Wardrobe(150, 200, 75.5);

        Carpet fluffyCarpet = new Carpet(200, 300, PaintColor.GREEN);

        // 2. Bedroom objesini oluşturuyoruz
        Bedroom myBedroom = new Bedroom(
                "My Cozy Bedroom",
                northWall,
                southWall,
                eastWall,
                westWall,
                bedroomCeiling,
                kingBed,
                bedsideLamp,
                largeWardrobe,
                fluffyCarpet
        );

        // 3. Bedroom objesinin ve içerdiği nesnelerin değerlerine erişim ve metotlarını çağırma

        System.out.println("Oda Adı: " + myBedroom.getName());

        System.out.println("\nDuvarlar:");
        System.out.println("Kuzey Duvarı Yönü: " + myBedroom.getWall1().getDirection());
        myBedroom.getWall1().create();
        System.out.println("Güney Duvarı Yönü: " + myBedroom.getWall2().getDirection());
        myBedroom.getWall2().create();
        System.out.println("Doğu Duvarı Yönü: " + myBedroom.getWall3().getDirection());
        myBedroom.getWall3().create();
        System.out.println("Batı Duvarı Yönü: " + myBedroom.getWall4().getDirection());
        myBedroom.getWall4().create();

        System.out.println("\nTavan:");
        System.out.println("Tavan Yüksekliği: " + myBedroom.getCeiling().getHeight());
        System.out.println("Tavan Rengi: " + myBedroom.getCeiling().getColor());
        myBedroom.getCeiling().create();

        System.out.println("\nYatak:");
        System.out.println("Yatak Stili: " + myBedroom.getBed().getStyle());
        System.out.println("Yastık Sayısı: " + myBedroom.getBed().getPillows());
        myBedroom.getBed().make();

        System.out.println("\nLamba:");
        System.out.println("Lamba Stili: " + myBedroom.getLamp().getStyle());
        System.out.println("Pilli Mi?: " + myBedroom.getLamp().isBattery());
        myBedroom.getLamp().turnOn();

        System.out.println("\nGardırop:");
        System.out.println("Gardırop Genişliği: " + myBedroom.getWardrobe().getWidth());
        System.out.println("Gardırop Yüksekliği: " + myBedroom.getWardrobe().getHeight());
        myBedroom.getWardrobe().add();

        System.out.println("\nHalı:");
        System.out.println("Halı Rengi: " + myBedroom.getCarpet().getColor());
        myBedroom.getCarpet().lying();
    }
}