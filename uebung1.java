
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse uebung1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung1 extends PApplet
{     
    int hintergrundfarbe=0xff969b96;
    int gruen=0xff54b966;
    int blau=0xff3f71c4;
    int grau=0xff969b96;
    int V;                                                             //Verschiebung jedes 2. Mal
    int Vx;                                                            // Verschiebung x-Achse
    int Vy;                                                            // Verschiebung y-Achse
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
        background(hintergrundfarbe);
        viereckezeichnen();
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

    public void viereckezeichnen(){
        for(int y=0; y<10; y++){
            if(y%2==0){
                V=0;
            } else {
                V=20;
                
            }
            
        for(int x=0; x<15; x++){
            Vx=V+x*40;
            Vy=y*40;
            viereck(grau,0+Vx,0+Vy,20+Vx,-10+Vy,40+Vx,0+Vy,20+Vx,10+Vy);
            viereck(blau,0+Vx,0+Vy,20+Vx,10+Vy,20+Vx,35+Vy,0+Vx,20+Vy);
            viereck(gruen,20+Vx,10+Vy,40+Vx,0+Vy,40+Vx,20+Vy,20+Vx,35+Vy);
        }
    }
}
    public void viereck(int fuellfarbe, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        stroke(fuellfarbe);
        fill(fuellfarbe);
        quad(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung1.class.getName() });
    }

}
