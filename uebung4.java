
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse uebung4.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung4 extends PApplet
{   int Schrittweite=1;
    int R=0;
    int G=0;
    int B=0;
    float RRandom=random(0,255);
    float GRandom=random(255);
    float BRandom=random(255);
    int Richtung=1;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
        
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        fill(RRandom, GRandom, BRandom);
        rect(50,50,200,200);
        println("Herzlich Willkommen im RGB-Farbspiel");
        println("Versuche die Farbe des kleinen Quadrats die des großen anzupassen");
        println("Verändere mit den Tasten r, g und b den RGB-Wert in die positivie Richtung");
        println("Verändere mit den Tasten R, G und B den RGB-Wert in die negative Richtung");
        println("Mit der Leertaste kannst du überprüfen, ob du richtig liegst");

    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        vorbereitung();
        if(R>255)R=255;
        if(G>255)G=255;
        if(B>255)B=255;
        // einstellung();

    }

    @Override
    public void keyPressed(){

        if(key == 'r'){
            R=R+Schrittweite;
        }
        if(key== 'g'){
            G=G+Schrittweite;
        }
        if(key== 'b'){
            B=B+Schrittweite;
        }
        if(key == 'R'){
            R=R-Schrittweite;
        }
        if(key== 'G'){
            G=G-Schrittweite;
        }
        if(key== 'B'){
            B=B-Schrittweite;
        }
        if(key== (char)32){
            println("RGB-Farben:");
            println(RRandom);
            println(GRandom);
            println(BRandom);
            println("Deine RGB-Farben");
            println(R);
            println(G);
            println(B);
            if(R==RRandom&&G==GRandom&&B==BRandom){
                println("Gut gemacht. Du hast es geschafft :D");
            } else{
                println("Noch nicht ganz geschafft");
            }
        }
    }

    public void mouseClicked(){
        if(Schrittweite==10){
            Schrittweite=1;
            print("Schrittweite=");
            println(Schrittweite);
        }else{
            Schrittweite=10;
            print("Schrittweite=");
            println(Schrittweite);
        }

    }

    public void vorbereitung(){
        fill(R,G,B);
        rect(125,125,50,50);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung4.class.getName() });
    }

}
