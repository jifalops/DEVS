/*
 * DialogDeltint.java
 *
 * Created on July 12, 2007, 1:21 PM
 */

package genDevs.jaxb.gui;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.util.*;
import javax.swing.JTable;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 *
 * @author  Saurabh
 */
public class DialogDeltint extends javax.swing.JDialog {
    
    TableModel_Deltint tableModel = null;
    private Hashtable<Integer,StructureDeltint> data = null;
    int counter=0;
    
    /** Creates new form DialogDeltint */
    public DialogDeltint(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        data = new Hashtable<Integer,StructureDeltint>();
    }
    
    public void resetTables(){
        tableModel  = new TableModel_Deltint();
       jTableDeltint = new JTable(tableModel);
        
        this.jScrollPane1.setViewportView(jTableDeltint);
        loadData();
        validate();
    }
    public void loadStateComboBoxes(Vector states){
        this.jcbStartState.removeAllItems();
        this.jcbNextState.removeAllItems();
        
        Iterator it = states.iterator();
        while(it.hasNext()){
            String state = (String)it.next();
            this.jcbStartState.addItem(state);
            this.jcbNextState.addItem(state);
        }
        validate();
    }
    
    private void loadData(){
        data = FrameFDDEVS.deltint;
        
        Enumeration e = data.keys();
        while(e.hasMoreElements()){
            Integer key = (Integer)e.nextElement();
            StructureDeltint deltint = (StructureDeltint)data.get(key);
            if(counter < key.intValue())
                counter = key.intValue();
            
            Object[] dataSet = {
                key.intValue(),
                deltint.startState, deltint.nextState, deltint.ta, deltint.outgoingMsg};
            
         tableModel.addRow(dataSet);        
        int row = jTableDeltint.getRowCount() - 1;
        jTableDeltint.changeSelection(row, 0, false, false);
        
        }
    }
    
    private void resetEntries(){
    
    this.jtfOutgoingMsg.setText("");
    this.jtfSNo.setText(""+(counter+1));

}
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfSNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfTimeout = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfOutgoingMsg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDeltint = new javax.swing.JTable();
        jButtonDone = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jcbStartState = new javax.swing.JComboBox();
        jcbNextState = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel1.setText("S.No.");

        jtfSNo.setFont(new java.awt.Font("Tahoma", 0, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel2.setText("Start State");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setText("Next State");

        jtfTimeout.setEditable(false);
        jtfTimeout.setFont(new java.awt.Font("Tahoma", 0, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel4.setText("Timeout");

        jtfOutgoingMsg.setFont(new java.awt.Font("Tahoma", 0, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel5.setText("Outgoing Message");

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 10));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 10));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableDeltint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDeltint);

        jButtonDone.setFont(new java.awt.Font("Tahoma", 0, 10));
        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 10));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jcbStartState.setFont(new java.awt.Font("Tahoma", 0, 10));
        jcbStartState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbStartState.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbStartStateItemStateChanged(evt);
            }
        });

        jcbNextState.setFont(new java.awt.Font("Tahoma", 0, 10));
        jcbNextState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		jcbNextState.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				jcbNextStateItemStateChanged(evt);
			}
		});

        jLabel6.setText("Note: State with sequence id=1 will be initial state");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jtfSNo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jcbStartState, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jcbNextState, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfOutgoingMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDone, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbStartState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNextState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTimeout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfOutgoingMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButtonDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDone)
                    .addComponent(jButtonCancel)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelActionPerformed

private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
    FrameFDDEVS.deltint = data;
    this.dispose();
}//GEN-LAST:event_jButtonDoneActionPerformed

private void jcbStartStateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbStartStateItemStateChanged
/*    String state = (String)this.jcbStartState.getSelectedItem();
    
    if(state==null)return;
    if(FrameFDDEVS.stateAndTA.containsKey(state)){
        Double value = (Double)FrameFDDEVS.stateAndTA.get(state);
        this.jtfTimeout.setText(""+value.doubleValue());
    }
    else{
        this.jtfTimeout.setEditable(true);
        System.out.println("Error in STATE_TA table in FDDEVS frame. Enter value!");
    }
*/
}//GEN-LAST:event_jcbStartStateItemStateChanged

private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
    int row = jTableDeltint.getSelectedRow()-1;
        if(row<0) row = 0;
    Object key = jTableDeltint.getValueAt(row, 0);
    if(data.containsKey((Integer)key)){
        data.remove((Integer)key);
    }
        tableModel.deleteRow(jTableDeltint.getSelectedRow());
         jTableDeltint.changeSelection(row, 0, false, false);
        jTableDeltint.requestFocusInWindow();
}//GEN-LAST:event_jButtonDeleteActionPerformed

private boolean isStartStateAlreadyDefined(StructureDeltint deltinInst){
	
	Enumeration e = data.keys();
	while(e.hasMoreElements()){
		Integer id = (Integer)e.nextElement();
		StructureDeltint deltint = (StructureDeltint)data.get(id);
		
		if(deltint.startState.equals(deltinInst.startState))
			return true;
	}
	
	return false;
}
private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
   try{
       Integer id = new Integer(Integer.parseInt(this.jtfSNo.getText()));
   
   String start = (String)this.jcbStartState.getSelectedItem();
   String next = (String)this.jcbNextState.getSelectedItem();
   Double ta = new Double(Double.parseDouble(this.jtfTimeout.getText()));
   String outgoingMsg = this.jtfOutgoingMsg.getText();
   
   
   StructureDeltint deltint = new StructureDeltint(id.intValue(),
           start, next, ta.doubleValue(), outgoingMsg);
   
    if(!data.containsKey(id)){
    	if(isStartStateAlreadyDefined(deltint)){
    		javax.swing.JOptionPane.showMessageDialog(this,"State Transition Defined already\n"+
    				"You can NOT defined an internal transition with same start state!");
    		return;
    	}
        data.put(id, deltint);
        counter = id.intValue();
        
        Object[] dataSet = {id,start, next, ta, outgoingMsg};
         tableModel.addRow(dataSet);        
        int row = jTableDeltint.getRowCount() - 1;
        jTableDeltint.changeSelection(row, 0, false, false);
        //jtableStateTA.requestFocusInWindow();
    }
   
   this.resetEntries();
   }
   catch(Exception ex){
       System.out.println("Error in inputing values. Check again!");
       javax.swing.JOptionPane.showMessageDialog(this, "Error in input values. Kindly check!");
       return;
   }
}//GEN-LAST:event_jButtonAddActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogDeltint dialog = new DialogDeltint(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

	private void jcbNextStateItemStateChanged(ItemEvent evt) {
		String state = (String)this.jcbNextState.getSelectedItem();
	    
	    if(state==null)return;
	    if(FrameFDDEVS.stateAndTA.containsKey(state)){
	        Double value = (Double)FrameFDDEVS.stateAndTA.get(state);
	        this.jtfTimeout.setText(""+value.doubleValue());
	    }
	    else{
	        this.jtfTimeout.setEditable(true);
	        System.out.println("Error in STATE_TA table in FDDEVS frame. Enter value!");
	    }
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDeltint;
    private javax.swing.JComboBox jcbNextState;
    private javax.swing.JComboBox jcbStartState;
    private javax.swing.JTextField jtfOutgoingMsg;
    private javax.swing.JTextField jtfSNo;
    private javax.swing.JTextField jtfTimeout;
    // End of variables declaration//GEN-END:variables
    
}