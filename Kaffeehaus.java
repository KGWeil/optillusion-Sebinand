
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{
    int s=40;
    int t=0;                //veränderung des x wertes der quadrate
    int[] abstaende = { 0,10,20,10,0,10,20,10,0 };
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,400);
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
        stroke(150);
        strokeWeight(1);
        parallelen();
        fill(0);
        zeichneAlleQuadrate2();
    }

    public void parallelen() 
    { 

        for(int i=0; i<11; i++){
            line(0,i*40,600,i*40);
        }    
    }

    /**
     * Zeichnet 10 Quadrate in ein Reihe
     *
     */
    public void zeichneQuadrate(){
        for(int i=0; i<10; i++){
            rect(10,i*s,s,s+i*s);
        }
    }

    public void zeichneAlleQuadrate(){
        for(int k=0; k<8; k++){
            for(int i=0; i<9; i++){
                if(i==0||i==4||i==8){
                    t=0;
                }
                if(i==1||i==3||i==5||i==7){
                    t=10;
                }
                if(i==2||i==6){
                    t=20;
                }

                rect(10+k*s*2+t,i*s,s,s);
            }
        }
    }
    /* Andere Programmierungsweise: mit [] abstaend
     * 
     * 
     */
    public void zeichneAlleQuadrate2(){
        for(int k=0; k<8; k++){
            for(int i=0; i<9; i++){
                rect(10+k*s*2+abstaende[i],i*s,s,s);
            }
        }
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

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
