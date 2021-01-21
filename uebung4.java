
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
{   int Schrittweite=10;
    int R=0;
    int G=0;
    int B=0;
    int key;
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
        background(66, 165, 250);
        fill(95, 158, 160);
        rect(50,50,200,200);
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
        einstellung();
    }

    public void keyPressed(){
        if(key == ‘r‘){
            R=R+1;
        }
        if(key== ‘g‘){
            G=G+1;
        }
        if(key== ‘b‘){
            B=B+B;
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
