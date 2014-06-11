/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.String;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class MainFrm extends javax.swing.JFrame {
 private int size;
 private Integrator integr;
     
    public MainFrm(Integrator a) {
        initComponents();
        integr = a;
       
            
          for(Map.Entry<String, Robot> e: integr.rMap.entrySet()){   //при запуске формы,
              //мы подгружаем в RobotBox имена имеющихсЯ роботов
          this.RobotBox.addItem(e.getKey());
          }
     
   //   String NameItem = RobotBox.getSelectedItem().toString();  //имя робота, который был выбран в комбобоксе
   //   Robot rObj = integr.rMap.get(NameItem); // получаем объект робота, по его имени
   //   rObj.languages.add(FChoose.getSelectedFile()); //к роботу по его индексу мы добавляем язык из FChoose в его коллекцию программ
   //    for(int i=0; i<rObj.languages.size();i++){
   //         this.ProgBox.addItem(rObj.languages.get(i).getName());
   //       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FChoose = new javax.swing.JFileChooser();
        CrFrm = new javax.swing.JFrame();
        RNameField = new javax.swing.JTextField();
        RobotName = new javax.swing.JLabel();
        FreqSlider = new javax.swing.JSlider();
        FreqSlider.setValue(30);
        FreqLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SlideVal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        LaunchButton = new javax.swing.JButton();
        ProgBox = new javax.swing.JComboBox();
        ListProgLabel = new javax.swing.JLabel();
        RobotBox = new javax.swing.JComboBox();
        ListRobLabel = new javax.swing.JLabel();
        LoadButton = new javax.swing.JButton();
        RobotButton = new javax.swing.JButton();

        RobotName.setText("Robot's name");

        FreqSlider.setMaximum(120);
        FreqSlider.setMinimum(30);
        FreqSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FreqSliderMouseDragged(evt);
            }
        });

        FreqLabel.setText("Frequency");

        jButton1.setText("OK");
        jButton1.setName("ButOK"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        SlideVal.setText("30");

        jButton3.setText("Cancel");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CrFrmLayout = new javax.swing.GroupLayout(CrFrm.getContentPane());
        CrFrm.getContentPane().setLayout(CrFrmLayout);
        CrFrmLayout.setHorizontalGroup(
            CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrFrmLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RobotName)
                    .addComponent(FreqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FreqSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SlideVal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(CrFrmLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CrFrmLayout.setVerticalGroup(
            CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrFrmLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RobotName)
                    .addComponent(RNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FreqLabel)
                    .addComponent(FreqSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlideVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(CrFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LaunchButton.setText("Launch");
        LaunchButton.setName("launchButton"); // NOI18N
        LaunchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaunchButtonActionPerformed(evt);
            }
        });

        ProgBox.setToolTipText("");

        ListProgLabel.setText("List of Programmes");

        RobotBox.setToolTipText("");
        RobotBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RobotBoxItemStateChanged(evt);
            }
        });

        ListRobLabel.setText("List of Robots");

        LoadButton.setText("Programme load");
        LoadButton.setName("LoadButton"); // NOI18N
        LoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadButtonMouseClicked(evt);
            }
        });
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        RobotButton.setText("Create new Robot");
        RobotButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RobotButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(ListRobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(RobotBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ListProgLabel)
                                .addGap(41, 41, 41))
                            .addComponent(ProgBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(RobotButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(LaunchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ListRobLabel)
                    .addComponent(ListProgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RobotBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProgBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RobotButton)
                    .addComponent(LoadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(LaunchButton)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadButtonMouseClicked
        //BufferedReader reader = null;
        FChoose = new JFileChooser();//создаем объект для выбора файлов
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Hodik's file extension", "hdk");
        FChoose.setFileFilter(filter);//устанавливаем фильтр для выбора файлов только с расширением hdk
        int returnVal; //APPROVE_OPTION returns int value
        returnVal = FChoose.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {//проверяем нажал ли человек ок
            System.out.println("You chose to open this file: " + FChoose.getSelectedFile().getName());//вывод имени файла в консоль
            FChoose.setSize(300, 300);
            FChoose.setVisible(true);
            
        
       String NameItem = RobotBox.getSelectedItem().toString();  //имя робота, который был выбран в комбобоксе
       Robot rObj = integr.rMap.get(NameItem); // получаем объект робота, по его имени
       rObj.languages.add(FChoose.getSelectedFile()); //к роботу по его индексу мы добавляем язык из FChoose в его коллекцию программ
       int index = rObj.languages.indexOf(FChoose.getSelectedFile()); // получаем номер выбранного файла в коллекции языков выбранного робота
       this.ProgBox.addItem(rObj.languages.get(index).getName()); // добавляем в комбобокс программ язык из коллекции выбранного робота
       
       
    
            
    }//GEN-LAST:event_LoadButtonMouseClicked
    }
    private void RobotButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RobotButtonMouseClicked
        CrFrm.setSize(400, 250);
        CrFrm.setVisible(true);
        CrFrm.setLocationRelativeTo(null);
    }//GEN-LAST:event_RobotButtonMouseClicked

    private void FreqSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FreqSliderMouseDragged
        size = FreqSlider.getValue();
        SlideVal.setText(Integer.toString(size));
    }//GEN-LAST:event_FreqSliderMouseDragged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String NameValue = RNameField.getText();
        int FreqValue = FreqSlider.getValue();
        if ("".equals(NameValue)) {
            JOptionPane.showMessageDialog(null, "Input name for your robot, please.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            Robot r = new Robot(NameValue,FreqValue);
            integr.rMap.put(NameValue, r);

           this.RobotBox.addItem(NameValue);    
            CrFrm.setVisible(false);
            RNameField.setText(null);
            FreqSlider.setValue(30);
            SlideVal.setText(Integer.toString(30));
    }//GEN-LAST:event_jButton1MouseClicked
    }
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        RNameField.setText(null);        FreqSlider.setValue(30);
        CrFrm.setVisible(false);
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void LaunchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaunchButtonActionPerformed
        // TODO add your handling code here:

        GameWindow myWindow = new GameWindow(800,600,integr);
        myWindow.setVisible(true);
       Robot rObj = integr.rMap.get(RobotBox.getSelectedItem().toString());
       System.out.println("x = " + rObj.curr.c.x + " y = " + rObj.curr.c.y);
       rObj.curr.Run();
       System.out.println("x = " + rObj.curr.c.x + " y = " + rObj.curr.c.y);
       myWindow.getC().repaint();
        
    }//GEN-LAST:event_LaunchButtonActionPerformed

    private void RobotBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RobotBoxItemStateChanged
         String NameItem = RobotBox.getSelectedItem().toString();  //имя робота, который был выбран в комбобоксе
        Robot rObj = integr.rMap.get(NameItem); // получаем объект робота, по его имени
            this.ProgBox.removeAllItems();//очищаем ComboBox с программами для загрузки новых
            for(int i=0; i<rObj.languages.size();i++){
                this.ProgBox.addItem(rObj.languages.get(i).getName());}
    }//GEN-LAST:event_RobotBoxItemStateChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame CrFrm;
    private javax.swing.JFileChooser FChoose;
    private javax.swing.JLabel FreqLabel;
    private javax.swing.JSlider FreqSlider;
    private javax.swing.JButton LaunchButton;
    private javax.swing.JLabel ListProgLabel;
    private javax.swing.JLabel ListRobLabel;
    private javax.swing.JButton LoadButton;
    private javax.swing.JComboBox ProgBox;
    private javax.swing.JTextField RNameField;
    private javax.swing.JComboBox RobotBox;
    private javax.swing.JButton RobotButton;
    private javax.swing.JLabel RobotName;
    private javax.swing.JTextField SlideVal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
