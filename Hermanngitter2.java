
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter2 extends PApplet
{ 
    int s=50;
    int t=0;                //veränderung des x wertes der quadrate
    int a=15;                //Abstand zwischen Quadraten
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
        fill(0,0,0);
        zeichneAlleQuadrate();
        fill(255,255,255);
        stroke(255);
        zeichneAlleKreise();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    public void zeichneAlleQuadrate(){
        /*   for(int k=0; k<8; k++){
        for(int i=0; i<9; i++){
        rect(10+k*s*2,i*s,s,s);
        }
        }
         */
        for(int k=0; k<7; k++){
            for(int i=0; i<7; i++){
                rect(20+k*(a+s),20+i*s+a*i,s,s);
            }
        }
    }

    public void zeichneAlleKreise(){
        for(int k=0; k<6; k++){
            for(int p=0; p<6; p++){
                circle(20+s+a/2+k*(a+s), 20+s+a/2+p*(a+s), a);
                // circle(20+s+a/2, 20+s+a/2+p*(a+s), a);
            }
        }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter2.class.getName() });
    }

}
