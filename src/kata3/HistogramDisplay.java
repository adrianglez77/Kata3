package kata3;

import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset())); 
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
            "Histograma JFreeChart",
            "Dominios email",
            "Nº de emails",
            dataSet,
            PlotOrientation.VERTICAL,
            false,
            false,
            rootPaneCheckingEnabled);
            return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(1, "", "hola.es");
        dataSet.addValue(5, "", "adrian.com");
        dataSet.addValue(7, "", "ulpgc.net");
        return dataSet;
    }    
}
    

