package org.flowkeeper.client.ui;

/**
 *
 * 
 */
public class ViewPlanWindow extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6568058051729047574L;
	/** Creates new form ViewPlanWindow */
    public ViewPlanWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Util.decorate(this, true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.toedter.calendar.JDateChooser();
        headerPanel = new javax.swing.JPanel();
        headerTextLabel = new javax.swing.JLabel();
        headerLogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.flowkeeper.client.ui.PomodoroClientApp.class).getContext().getResourceMap(ViewPlanWindow.class);
        dateChooser.setDateFormatString(resourceMap.getString("dateChooser.dateFormatString")); // NOI18N
        dateChooser.setName("dateChooser"); // NOI18N

        headerPanel.setBackground(resourceMap.getColor("headerPanel.background")); // NOI18N
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("headerPanel.border.lineColor"))); // NOI18N
        headerPanel.setName("headerPanel"); // NOI18N

        headerTextLabel.setFont(headerTextLabel.getFont().deriveFont(headerTextLabel.getFont().getSize()+7f));
        headerTextLabel.setText(resourceMap.getString("headerTextLabel.text")); // NOI18N
        headerTextLabel.setName("headerTextLabel"); // NOI18N

        headerLogoLabel.setIcon(resourceMap.getIcon("headerLogoLabel.icon")); // NOI18N
        headerLogoLabel.setName("headerLogoLabel"); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLogoLabel))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLogoLabel)
            .addComponent(headerTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel headerLogoLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerTextLabel;
    // End of variables declaration//GEN-END:variables

}