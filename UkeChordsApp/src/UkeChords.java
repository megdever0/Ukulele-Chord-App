import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.FileInputStream;

public class UkeChords extends Application {
    private static String songRandom = "";
    static String [] chords = {"C", "D", "E", "F", "G", "A", "B", "C7","D7", "E7", "F7", "G7", "A7",
            "B7", "Cm", "Dm", "Em", "Fm", "Gm", "Am", "Bm"};

    @Override
    public void start(Stage base)  {
        base.setTitle("Uke Chords");
        base.setMinHeight(625);
        base.setMinWidth(800);

        StackPane root = new StackPane();
        HBox app = new HBox(50); //main hbox

        VBox ukeImage = new VBox(); //uke neck picture
        changeImage(ukeImage, "default");

        //the welcome, instructions, buttons, and the random song generator
        VBox rightSide = new VBox(30);
        rightSide.setMaxHeight(80);
        rightSide.setMaxWidth(800);
        rightSide.setPadding(new Insets(20));
        rightSide.setAlignment(Pos.CENTER_RIGHT);
        VBox intro = new VBox();
        Label intro1 = new Label("Welcome to Meg Dev's");
        Label intro2 = new Label("Ukulele Tab Generator");
        intro.getChildren().addAll(intro1,intro2);
        intro1.setFont(new Font("Rockwell",35));
        intro2.setFont(new Font("Rockwell",35));
        VBox instr = new VBox();
        Label instructions1 = new Label("Click one of the buttons below to get");
        Label instructions2 = new Label("the tab for the chord");
        instr.getChildren().addAll(instructions1,instructions2);
        instr.setAlignment(Pos.CENTER);
        instructions1.setFont(new Font("Rockwell",16));
        instructions2.setFont(new Font("Rockwell",16));

        // chord buttons the rightside vbox
        VBox basicChords = new VBox(10);
        Button cChord = new Button("C ");
        Button dChord = new Button("D ");
        Button eChord = new Button("E ");
        Button fChord = new Button("F ");
        Button gChord = new Button("G ");
        Button bChord = new Button("B ");
        Button aChord = new Button("A ");
        basicChords.getChildren().addAll(cChord, dChord, eChord, fChord, gChord, aChord,bChord);

        cChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "c");
        });

        dChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "d");
        });

        eChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "e");
        });

        fChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "f");
        });

        gChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "g");
        });

        aChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "a");
        });

        bChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "b");
        });


        VBox mChords = new VBox(10);
        Button cmChord = new Button("Cm");
        Button dmChord = new Button("Dm");
        Button emChord = new Button("Em");
        Button fmChord = new Button("Fm");
        Button gmChord = new Button("Gm");
        Button bmChord = new Button("Bm");
        Button amChord = new Button("Am");
        mChords.getChildren().addAll(cmChord, dmChord, emChord, fmChord, gmChord, amChord,bmChord);

        cmChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "cm");
        });

        dmChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "dm");
        });

        emChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "em");
        });

        fmChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "fm");
        });

        gmChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "gm");
        });

        amChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "am");
        });

        bmChord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "bm");
        });

        VBox sevChords = new VBox(10);
        Button c7Chord = new Button("C7");
        Button d7Chord = new Button("D7");
        Button e7Chord = new Button("E7");
        Button f7Chord = new Button("F7");
        Button g7Chord = new Button("G7");
        Button b7Chord = new Button("B7");
        Button a7Chord = new Button("A7");
        sevChords.getChildren().addAll(c7Chord, d7Chord, e7Chord, f7Chord, g7Chord, a7Chord,b7Chord);

        c7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "c7");
        });

        d7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "d7");
        });

        e7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "e7");
        });

        f7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "f7");
        });

        g7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "g7");
        });

        a7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "a7");
        });

        b7Chord.setOnMouseClicked(e-> {
            changeImage(ukeImage, "b7");
        });

        // styling buttons
        cChord.setFont(new Font("Rockwell",16));
        dChord.setFont(new Font("Rockwell",16));
        eChord.setFont(new Font("Rockwell",16));
        fChord.setFont(new Font("Rockwell",16));
        gChord.setFont(new Font("Rockwell",16));
        bChord.setFont(new Font("Rockwell",16));
        aChord.setFont(new Font("Rockwell",16));
        cmChord.setFont(new Font("Rockwell",16));
        dmChord.setFont(new Font("Rockwell",16));
        emChord.setFont(new Font("Rockwell",16));
        fmChord.setFont(new Font("Rockwell",16));
        gmChord.setFont(new Font("Rockwell",16));
        bmChord.setFont(new Font("Rockwell",16));
        amChord.setFont(new Font("Rockwell",16));
        c7Chord.setFont(new Font("Rockwell",16));
        d7Chord.setFont(new Font("Rockwell",16));
        e7Chord.setFont(new Font("Rockwell",16));
        f7Chord.setFont(new Font("Rockwell",16));
        g7Chord.setFont(new Font("Rockwell",16));
        a7Chord.setFont(new Font("Rockwell",16));
        b7Chord.setFont(new Font("Rockwell",16));

        // contains all chord buttons includes styling
        HBox chordButtons = new HBox(20);
        chordButtons.setAlignment(Pos.CENTER);
        chordButtons.getChildren().addAll(basicChords,mChords,sevChords);

        // random song generator here
        VBox songGen = new VBox(20);
        Label generateTitle = new Label("Click the button to generate a 4 chord song");
        generateTitle.setFont(new Font("Rockwell",20));

        HBox generateSong = new HBox(50);
        Button generateButton = new Button("Generate");
        generateButton.setFont(new Font("Rockwell",20));

        Label randSong = new Label();
        generateButton.setOnMouseClicked(e-> {
                songRandom = fourChordSong(chords);
                randSong.setText(songRandom);
        });

        randSong.setFont(new Font("Rockwell",20));

        generateSong.getChildren().addAll(generateButton,randSong);
        generateSong.setAlignment(Pos.CENTER);
        songGen.getChildren().addAll(generateTitle,generateSong);
        songGen.setAlignment(Pos.CENTER);

        // adding all elements to the rightside
        rightSide.getChildren().addAll(intro, instr, chordButtons);
        VBox fullRightSide = new VBox(10);
        fullRightSide.getChildren().addAll(rightSide,songGen);

        // adding stuff to main hbox called app
        app.setPadding(new Insets(20));
        app.getChildren().addAll(ukeImage, fullRightSide);
        root.getChildren().add(app);
        Scene scene = new Scene(root, 500, 300);

        // once one is clicked the chords will show up

        // styles of hbox and vboxes
        app.setStyle("-fx-background-color: #26CEFF");
        rightSide.setStyle("-fx-background-color: #0358EC");
        // setting the scene
        base.setScene(scene);
        base.show();
    }


    public static String fourChordSong(String[] chords){
        String song = "";
        for(int i = 1; i <= 4; i++){
            int random = (int)(Math.random() * chords.length);
            song += "" + chords[random] + " ";
        }
        return song;
    }

    public void changeImage(VBox ukeImage, String note){
        try{
            FileInputStream ukeNeck = new FileInputStream("finished uke.jpg");
            if(note == "default"){
                ukeNeck = new FileInputStream("finished uke.jpg");
            }
            else if (note == "c"){
                ukeNeck = new FileInputStream("cChord.jpg");
            }
            else if(note == "d"){
                ukeNeck = new FileInputStream("dChord.jpg");
            }
            else if(note == "e"){
                ukeNeck = new FileInputStream("eChord.jpg");
            }
            else if(note == "f"){
                ukeNeck = new FileInputStream("fChord.jpg");
            }
            else if(note == "g"){
                ukeNeck = new FileInputStream("gChord.jpg");
            }
            else if(note == "a"){
                ukeNeck = new FileInputStream("aChord.jpg");
            }
            else if(note == "b"){
                ukeNeck = new FileInputStream("bChord.jpg");
            }
            else if (note == "cm"){
                ukeNeck = new FileInputStream("cmChord.jpg");
            }
            else if(note == "dm"){
                ukeNeck = new FileInputStream("dmChord.jpg");
            }
            else if(note == "em"){
                ukeNeck = new FileInputStream("emChord.jpg");
            }
            else if(note == "fm"){
                ukeNeck = new FileInputStream("fmChord.jpg");
            }
            else if(note == "gm"){
                ukeNeck = new FileInputStream("gmChord.jpg");
            }
            else if(note == "am"){
                ukeNeck = new FileInputStream("amChord.jpg");
            }
            else if(note == "bm"){
                ukeNeck = new FileInputStream("bmChord.jpg");
            }
            else if (note == "c7"){
                ukeNeck = new FileInputStream("c7Chord.jpg");
            }
            else if(note == "d7"){
                ukeNeck = new FileInputStream("d7Chord.jpg");
            }
            else if(note == "e7"){
                ukeNeck = new FileInputStream("e7Chord.jpg");
            }
            else if(note == "f7"){
                ukeNeck = new FileInputStream("f7Chord.jpg");
            }
            else if(note == "g7"){
                ukeNeck = new FileInputStream("g7Chord.jpg");
            }
            else if(note == "a7"){
                ukeNeck = new FileInputStream("a7Chord.jpg");
            }
            else if(note == "b7"){
                ukeNeck = new FileInputStream("b7Chord.jpg");
            }
            Image image = new Image(ukeNeck,250,600,
                    false,false);
            ImageView view = new ImageView();
            view.setImage(image);
            ukeImage.getChildren().clear();
            ukeImage.getChildren().addAll(view);

        }
        catch(Exception e){
            System.out.println("file not found");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
