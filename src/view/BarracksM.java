package view;

import controllers.MenuController;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class BarracksM extends MenuIn{
    public BarracksM(MenuIn parent, MenuController menuController,VillageView villageView) {
        super(parent,menuController,villageView);
    }

    @Override
    public void show(Group group) {

        try {
            InputStream inputStream2 = new FileInputStream(new File("../AP_15/src/Images/Sardar/Barracks.png"));
            Image image2 = new Image(inputStream2);
            ImageView imageView2 = new ImageView(image2);
            setTitle(imageView2);

            basic(group);

            HBox hBox = new HBox();
            hBox.setAlignment(Pos.CENTER);
            hBox.setSpacing(20);


            InputStream inputStream3 = new FileInputStream(new File("../AP_15/src/Images/button/info.png"));
            Image image3 = new Image(inputStream3);
            ImageView imageView3 = new ImageView(image3);

            InputStream inputStream4 = new FileInputStream(new File("../AP_15/src/Images/button/barracksBuildSoldier.png"));
            Image image4 = new Image(inputStream4);
            ImageView imageView4 = new ImageView(image4);

            hBox.getChildren().setAll(imageView3, imageView4);
            HBox hBox1 = new HBox();
            hBox1.setAlignment(Pos.CENTER);
            hBox1.setSpacing(20);


            InputStream inputStream6 = new FileInputStream(new File("../AP_15/src/Images/button/barracksStatus.png"));
            Image image6 = new Image(inputStream6);
            ImageView imageView6 = new ImageView(image6);

            hBox1.getChildren().setAll(imageView6);
            VBox vBox = new VBox();
            vBox.relocate(x + 22, y + 70);
            vBox.setAlignment(Pos.CENTER);
            vBox.getChildren().setAll(hBox, hBox1);

            getSubG().getChildren().add(vBox);
            if(group.getChildren().contains(getSubG())){
                group.getChildren().remove(getSubG());
            }
            group.getChildren().addAll(getSubG());

            imageView3.setOnMouseClicked(event -> {
                group.getChildren().removeAll(getSubG());
                getChilderen().get(0).setTitle(getTitle());
                getChilderen().get(0).show(group);
            });
            imageView4.setOnMouseClicked(event -> {
                group.getChildren().removeAll(getSubG());
                getChilderen().get(1).setTitle(getTitle());
                getChilderen().get(1).show(group);
            });
            imageView6.setOnMouseClicked(event ->{
                group.getChildren().removeAll(getSubG());
                getChilderen().get(2).setTitle(getTitle());
                getChilderen().get(2).show(group);
            });
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
