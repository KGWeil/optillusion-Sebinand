
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{      
    int a=30;
    int r=4;     //Wie dick der Rand ist
    int weiss=0xffffffff;
    int gruen=0xff1caf38;
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
        background(255,255,255);
        strokeWeight(r);
        rechtecke();
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

    public void einRechteck(int x, int y, int fill )
    {        
        stroke((fill == gruen)? weiss : gruen);
        fill(fill);
        square(x,y,a);
    }


    public void rechtecke()
    {   
        int farbe=weiss;
        for(int i=0; i<10; i++){
            farbe = (farbe == gruen)? weiss : gruen;
            for(int x=0; x<12; x++){

                farbe = (farbe == gruen)? weiss : gruen;
                einRechteck(r/2+(a+r)*i,r/2+x*(a+r),farbe);
            }
        }
    }	

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
