package kata3;

public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        histogram.increment("adrian.es");
        histogram.increment("adrian.es");
        histogram.increment("ulpgc.net");
        histogram.increment("hola.com");
        histogram.increment("adios.net");
        histogram.increment("adios.net");
        histogram.increment("adios.net");
        histogram.increment("adios.net");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
