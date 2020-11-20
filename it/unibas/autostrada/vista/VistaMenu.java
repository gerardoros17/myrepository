package it.unibas.autostrada.vista;

import it.unibas.autostrada.Applicazione;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class VistaMenu extends javax.swing.JFrame {

    public void inizializza() {
        initComponents();
        this.setContentPane(new JScrollPane(Applicazione.getIstance().getVistaPrincipale()));
        this.pack();
        this.setLocationRelativeTo(null);
        inizializzaAzioni();
        this.setVisible(true);
    }
    
    private void inizializzaAzioni() {
        this.menuCarica.setAction(Applicazione.getIstance().getControlloMenu().getAzioneCarica());
        this.menuEsci.setAction(Applicazione.getIstance().getControlloMenu().getAzioneEsci());
        this.menuVerifica.setAction(Applicazione.getIstance().getControlloMenu().getAzioneVerifica());
    }
    
    public void mostraMessaggio(String messaggio) {
        JOptionPane.showMessageDialog(this, messaggio, "MESSAGGIO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostraErrore(String errore) {
        JOptionPane.showMessageDialog(this, errore, "ERRORE", JOptionPane.ERROR_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCarica = new javax.swing.JMenuItem();
        menuVerifica = new javax.swing.JMenuItem();
        menuEsci = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        menuCarica.setText("jMenuItem1");
        jMenu1.add(menuCarica);

        menuVerifica.setText("jMenuItem1");
        jMenu1.add(menuVerifica);

        menuEsci.setText("jMenuItem1");
        jMenu1.add(menuEsci);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCarica;
    private javax.swing.JMenuItem menuEsci;
    private javax.swing.JMenuItem menuVerifica;
    // End of variables declaration//GEN-END:variables
}
