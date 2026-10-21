package Frames;

import Classes.CenterController;
import Classes.TrainingPlane;
import Classes.Courseregister;
import Classes.DbConnection;
import Classes.TeacherCourse;
import Classes.TeacherManegement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TVET extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TVET.class.getName());
    Connection con = new DbConnection().dbConn();
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"Center_Name", "Registration_No", "Address", "Contact_No", "GPS_Location", "District"}, 0);
    DefaultTableModel model2 = new DefaultTableModel(new String[]{"Center Name", "Course Name", "Year", "Start Month", "Capacity"}, 0);
    DefaultTableModel model3 = new DefaultTableModel(new String[]{"ID", "course_name", "course_code", "sector", "entry_qualification", "type", "mode", "language", "duration", "course_fee"}, 0);
    DefaultTableModel model4 = new DefaultTableModel(new String[]{"ID", "Tearcher ID", "Teacher Name", "NIC", "Center Name"}, 0);
    DefaultTableModel model5 = new DefaultTableModel(new String[]{"ID", "Tearcher ID", "Course ID"}, 0);

    public TVET() {
        initComponents();
        loadLebel();
        tbCenter.setModel(model1);
        loadCourseIntoComboBox1();
        loadCourseIntoComboBox2();
        tbMPlaner.setModel(model2);
        dataview.setModel(model3);
        Teachertable.setModel(model4);
        tbTCRegistry.setModel(model5);
        setDefault();

        Teachertable.getColumnModel().getColumn(0).setMinWidth(0);
        Teachertable.getColumnModel().getColumn(0).setMaxWidth(0);
        Teachertable.getColumnModel().getColumn(0).setPreferredWidth(0);

        dataview.getColumnModel().getColumn(0).setMinWidth(0);
        dataview.getColumnModel().getColumn(0).setMaxWidth(0);
        dataview.getColumnModel().getColumn(0).setPreferredWidth(0);

        tbTCRegistry.getColumnModel().getColumn(0).setMinWidth(0);
        tbTCRegistry.getColumnModel().getColumn(0).setMaxWidth(0);
        tbTCRegistry.getColumnModel().getColumn(0).setPreferredWidth(0);

        loadCourseNames();
        loadCenterNames();
        loadTeacherId();

        erlbTName.setText("");
        erlbNIC.setText("");
        erlbCourseName.setText("");
        erlbCenterName.setText("");
        erlbCourseName1.setText("");

        bottomPanel.setVisible(false);

        int frameHeight = this.getPreferredSize().height;
        topPanel.setPreferredSize(new java.awt.Dimension(topPanel.getWidth(), frameHeight - 120));

        roundPanel.setLayout(new java.awt.GridLayout(1, 4, 15, 0));

        roundPanel.add(jPanel7);
        roundPanel.add(jPanel13);
        roundPanel.add(jPanel11);

        roundPanel.add(jPanel15);

        roundPanel.revalidate();
        roundPanel.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbWelcome = new javax.swing.JLabel();
        lbAbout = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        tfAbout = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        roundPanel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lbTeacher = new javax.swing.JLabel();
        lbcTeacher = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbcCourse = new javax.swing.JLabel();
        lbCourse = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbcTCenter = new javax.swing.JLabel();
        lbTCenters = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbcTPlaner = new javax.swing.JLabel();
        lbTPlaner = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCenter = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        lbReNo = new javax.swing.JLabel();
        tfCName = new javax.swing.JTextField();
        lbAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        lbGPS = new javax.swing.JLabel();
        tfGPS = new javax.swing.JTextField();
        lbCName = new javax.swing.JLabel();
        tfReNo = new javax.swing.JTextField();
        lbConNo = new javax.swing.JLabel();
        tfConNo = new javax.swing.JTextField();
        lbDistrict = new javax.swing.JLabel();
        tfDistrict = new javax.swing.JComboBox<>();
        lbvalid = new javax.swing.JLabel();
        jcValid = new javax.swing.JCheckBox();
        jbAddCenter = new javax.swing.JButton();
        JbUpdate = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        elbCName = new javax.swing.JLabel();
        elbAddress = new javax.swing.JLabel();
        elbConNo = new javax.swing.JLabel();
        elbDistrict = new javax.swing.JLabel();
        elbGPS = new javax.swing.JLabel();
        lbGPS1 = new javax.swing.JLabel();
        tfSearchTC = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        lbCourseName = new javax.swing.JLabel();
        cmbCourseName = new javax.swing.JComboBox<>();
        erlbCourseName = new javax.swing.JLabel();
        lbCourseName1 = new javax.swing.JLabel();
        cmbTeacherId = new javax.swing.JComboBox<>();
        erlbCourseName1 = new javax.swing.JLabel();
        Insertbtn1 = new javax.swing.JButton();
        Updatebtn1 = new javax.swing.JButton();
        Clearbtn1 = new javax.swing.JButton();
        Deletebtn1 = new javax.swing.JButton();
        btnACD = new javax.swing.JButton();
        lbNIC2 = new javax.swing.JLabel();
        tfsearchTCo = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbTCRegistry = new javax.swing.JTable();
        topPanel = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Teachertable = new javax.swing.JTable();
        lbNIC1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        lbTName = new javax.swing.JLabel();
        tfTName = new javax.swing.JTextField();
        lbTId = new javax.swing.JLabel();
        tfTId = new javax.swing.JTextField();
        lbNIC = new javax.swing.JLabel();
        tfNIC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbCenterName = new javax.swing.JLabel();
        cmbCenterName = new javax.swing.JComboBox<>();
        erlbTName = new javax.swing.JLabel();
        erlbNIC = new javax.swing.JLabel();
        Insertbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        erlbCenterName = new javax.swing.JLabel();
        btnAC = new javax.swing.JButton();
        tfsearchT = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dataview = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        lbCcode = new javax.swing.JLabel();
        tfcname = new javax.swing.JTextField();
        lbSector = new javax.swing.JLabel();
        lbQualification = new javax.swing.JLabel();
        lbType = new javax.swing.JLabel();
        lbLanguage = new javax.swing.JLabel();
        lbCfee = new javax.swing.JLabel();
        tfCfee = new javax.swing.JTextField();
        lbcname = new javax.swing.JLabel();
        tfCcode = new javax.swing.JTextField();
        lbMode = new javax.swing.JLabel();
        sectorcombobox = new javax.swing.JComboBox<>();
        qualificationcombobox = new javax.swing.JComboBox<>();
        typecombobox = new javax.swing.JComboBox<>();
        modecombobox = new javax.swing.JComboBox<>();
        tfmonths = new javax.swing.JTextField();
        btncourse = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        languagecombobox = new javax.swing.JComboBox<>();
        elbMonths = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        elbCname = new javax.swing.JLabel();
        elbCfee = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbMonths = new javax.swing.JLabel();
        elb = new javax.swing.JLabel();
        lbMonths1 = new javax.swing.JLabel();
        tfSearchC = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMPlaner = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbCenter = new javax.swing.JComboBox<>();
        cbCourse = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSMonth = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbYear = new javax.swing.JComboBox<>();
        lbCapacity = new javax.swing.JLabel();
        tfCapacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfsearchCP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(153, 0, 51));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  VTA Management System");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Logged in: Admin");

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setText("Logout");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("TabbedPane.focus"));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");

        jPanel8.setBackground(new java.awt.Color(153, 0, 51));
        jPanel8.setToolTipText("");

        lbWelcome.setBackground(new java.awt.Color(0, 0, 255));
        lbWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lbWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbWelcome.setText("Welcome to TVET Guide Management System");

        lbAbout.setForeground(new java.awt.Color(255, 255, 255));
        lbAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAbout.setText("VTA Management");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("About TVET Guide"));

        jTextPane1.setEditable(false);
        jTextPane1.setText("TVET Guide is one of the leading Career Guidance publications of the TVET Sector,containing information on public sector registered courses ,accredited and private sector accredited courses.this publication is  circulated among all Career Guidance Centres in the public sector and other relevant agencies every year.\n\nUse the tabs above to manage:\n  • Training Centres – Register, view and update TVEC training centres\n  • Courses – Manage NVQ and Non-NVQ courses across 28 occupational sectors\n  • Teachers – Manage Teachers \n  • Training Plans – Submit annual batch schedules for the TVET Guide publication\n  ");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfAbout.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 102, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(128, 127));

        lbTeacher.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        lbTeacher.setForeground(new java.awt.Color(255, 255, 255));
        lbTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTeacher.setText("Teachers");

        lbcTeacher.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        lbcTeacher.setForeground(new java.awt.Color(255, 255, 255));
        lbcTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
            .addComponent(lbcTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lbcTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(0, 153, 102));
        jPanel11.setPreferredSize(new java.awt.Dimension(128, 125));

        lbcCourse.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        lbcCourse.setForeground(new java.awt.Color(255, 255, 255));
        lbcCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbCourse.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        lbCourse.setForeground(new java.awt.Color(255, 255, 255));
        lbCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCourse.setText("Courses");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addComponent(lbcCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lbcCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setPreferredSize(new java.awt.Dimension(128, 125));

        lbcTCenter.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        lbcTCenter.setForeground(new java.awt.Color(255, 255, 255));
        lbcTCenter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbTCenters.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        lbTCenters.setForeground(new java.awt.Color(255, 255, 255));
        lbTCenters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTCenters.setText("Training Centers");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTCenters, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
            .addComponent(lbcTCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbcTCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTCenters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(153, 0, 153));
        jPanel15.setPreferredSize(new java.awt.Dimension(128, 127));

        lbcTPlaner.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        lbcTPlaner.setForeground(new java.awt.Color(255, 255, 255));
        lbcTPlaner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbTPlaner.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        lbTPlaner.setForeground(new java.awt.Color(255, 255, 255));
        lbTPlaner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTPlaner.setText("Course Planers");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTPlaner, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
            .addComponent(lbcTPlaner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lbcTPlaner, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTPlaner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanelLayout = new javax.swing.GroupLayout(roundPanel);
        roundPanel.setLayout(roundPanelLayout);
        roundPanelLayout.setHorizontalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundPanelLayout.setVerticalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Dashboard", jPanel5);

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registered Training Centers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tbCenter.setBackground(new java.awt.Color(255, 255, 255));
        tbCenter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Reg. No", "Center Name", "Address", "Contact No", "GPS Location", "District"
            }
        ));
        tbCenter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCenterMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCenter);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Centre Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel24.setForeground(new java.awt.Color(0, 0, 0));

        lbReNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbReNo.setForeground(new java.awt.Color(0, 0, 0));
        lbReNo.setText("Registration No");

        tfCName.setBackground(new java.awt.Color(255, 255, 255));
        tfCName.setForeground(new java.awt.Color(0, 0, 0));
        tfCName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCNameFocusLost(evt);
            }
        });
        tfCName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCNameKeyTyped(evt);
            }
        });

        lbAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAddress.setForeground(new java.awt.Color(0, 0, 0));
        lbAddress.setText("Address");

        tfAddress.setBackground(new java.awt.Color(255, 255, 255));
        tfAddress.setForeground(new java.awt.Color(0, 0, 0));
        tfAddress.setText("  ");
        tfAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAddressFocusLost(evt);
            }
        });
        tfAddress.addActionListener(this::tfAddressActionPerformed);
        tfAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAddressKeyReleased(evt);
            }
        });

        lbGPS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbGPS.setForeground(new java.awt.Color(0, 0, 0));
        lbGPS.setText("GPS Location");

        tfGPS.setBackground(new java.awt.Color(255, 255, 255));
        tfGPS.setForeground(new java.awt.Color(0, 0, 0));
        tfGPS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfGPSFocusLost(evt);
            }
        });
        tfGPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfGPSKeyReleased(evt);
            }
        });

        lbCName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCName.setForeground(new java.awt.Color(0, 0, 0));
        lbCName.setText("Center Name");

        tfReNo.setEditable(false);
        tfReNo.setBackground(new java.awt.Color(255, 255, 255));
        tfReNo.setForeground(new java.awt.Color(0, 0, 0));
        tfReNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfReNoFocusLost(evt);
            }
        });
        tfReNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfReNoKeyReleased(evt);
            }
        });

        lbConNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbConNo.setForeground(new java.awt.Color(0, 0, 0));
        lbConNo.setText("Contact No");

        tfConNo.setBackground(new java.awt.Color(255, 255, 255));
        tfConNo.setForeground(new java.awt.Color(0, 0, 0));
        tfConNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfConNoFocusLost(evt);
            }
        });
        tfConNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfConNoKeyReleased(evt);
            }
        });

        lbDistrict.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbDistrict.setForeground(new java.awt.Color(0, 0, 0));
        lbDistrict.setText("District");

        tfDistrict.setBackground(new java.awt.Color(204, 204, 204));
        tfDistrict.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfDistrict.setForeground(new java.awt.Color(0, 0, 0));
        tfDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Colombo", "Gampaha", "Kalutara", "Kandy", "Matale", "Nuwara Eliya", "Galle", "Matara", "Hambantota ", "Jaffna", "Kilinochchi", "Mannar", "Vavuniya", "Mullaitivu", "Batticaloa", "Ampara", "Trincomalee ", "Kurunegala", "Puttalam", "Anuradhapura", "Polonnaruwa ", "Badulla", "Moneragala", "Ratnapura ", "Kegalle", " " }));

        lbvalid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbvalid.setForeground(new java.awt.Color(0, 0, 0));
        lbvalid.setText("Reg. Valid");

        jcValid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcValid.setForeground(new java.awt.Color(0, 0, 0));
        jcValid.setText("Registration Active");

        jbAddCenter.setBackground(new java.awt.Color(153, 153, 153));
        jbAddCenter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbAddCenter.setForeground(new java.awt.Color(0, 0, 0));
        jbAddCenter.setText("Add Center");
        jbAddCenter.addActionListener(this::jbAddCenterActionPerformed);

        JbUpdate.setBackground(new java.awt.Color(153, 153, 153));
        JbUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JbUpdate.setForeground(new java.awt.Color(0, 0, 0));
        JbUpdate.setText("Update");
        JbUpdate.addActionListener(this::JbUpdateActionPerformed);

        jbClear.setBackground(new java.awt.Color(153, 153, 153));
        jbClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbClear.setForeground(new java.awt.Color(0, 0, 0));
        jbClear.setText("Clear");
        jbClear.addActionListener(this::jbClearActionPerformed);

        jbDelete.setBackground(new java.awt.Color(153, 153, 153));
        jbDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbDelete.setForeground(new java.awt.Color(255, 0, 0));
        jbDelete.setText("Delete");
        jbDelete.addActionListener(this::jbDeleteActionPerformed);

        elbCName.setForeground(new java.awt.Color(102, 0, 0));
        elbCName.setText(" ");

        elbAddress.setText(" ");

        elbConNo.setText(" ");

        elbDistrict.setText("  ");

        elbGPS.setText(" ");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elbGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lbvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcValid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(0, 428, Short.MAX_VALUE)
                        .addComponent(elbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbReNo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lbConNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDistrict, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfConNo)
                            .addComponent(tfReNo)
                            .addComponent(elbConNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbGPS, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(lbCName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elbCName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jbAddCenter)
                .addGap(18, 18, 18)
                .addComponent(JbUpdate)
                .addGap(18, 18, 18)
                .addComponent(jbClear)
                .addGap(18, 18, 18)
                .addComponent(jbDelete)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel24Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfAddress, tfCName, tfGPS});

        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReNo)
                    .addComponent(tfCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfReNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCName))
                .addGap(5, 5, 5)
                .addComponent(elbCName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress)
                    .addComponent(lbConNo)
                    .addComponent(tfConNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(elbConNo)
                    .addComponent(elbAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGPS)
                    .addComponent(tfGPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDistrict)
                    .addComponent(tfDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elbGPS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbvalid)
                    .addComponent(jcValid))
                .addGap(53, 53, 53)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddCenter)
                    .addComponent(JbUpdate)
                    .addComponent(jbClear)
                    .addComponent(jbDelete))
                .addGap(98, 98, 98))
        );

        lbGPS1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbGPS1.setForeground(new java.awt.Color(0, 0, 0));
        lbGPS1.setText("Search");

        tfSearchTC.setBackground(new java.awt.Color(255, 255, 255));
        tfSearchTC.setForeground(new java.awt.Color(0, 0, 0));
        tfSearchTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSearchTCFocusLost(evt);
            }
        });
        tfSearchTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchTCKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchTCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSearchTCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbGPS1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchTC, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGPS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfSearchTC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 557, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Training Centers", jPanel12);

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Teacher_Coursse_Details"));

        lbCourseName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCourseName.setText("Teacher ID");

        cmbCourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        cmbCourseName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbCourseNameFocusLost(evt);
            }
        });
        cmbCourseName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbCourseNameMouseReleased(evt);
            }
        });
        cmbCourseName.addActionListener(this::cmbCourseNameActionPerformed);

        erlbCourseName.setForeground(new java.awt.Color(255, 51, 51));
        erlbCourseName.setText("*Select a field");

        lbCourseName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCourseName1.setText("Course ID");

        cmbTeacherId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        cmbTeacherId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbTeacherIdFocusLost(evt);
            }
        });
        cmbTeacherId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbTeacherIdMouseReleased(evt);
            }
        });
        cmbTeacherId.addActionListener(this::cmbTeacherIdActionPerformed);

        erlbCourseName1.setForeground(new java.awt.Color(255, 51, 51));
        erlbCourseName1.setText("*Select a field");

        Insertbtn1.setText("Add Teacher");
        Insertbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Insertbtn1.addActionListener(this::Insertbtn1ActionPerformed);

        Updatebtn1.setText("Change Details");
        Updatebtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Updatebtn1.addActionListener(this::Updatebtn1ActionPerformed);

        Clearbtn1.setText("Clear all feilds");
        Clearbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Clearbtn1.addActionListener(this::Clearbtn1ActionPerformed);

        Deletebtn1.setText("Remove Teacher");
        Deletebtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Deletebtn1.addActionListener(this::Deletebtn1ActionPerformed);

        btnACD.setText("Done");
        btnACD.setActionCommand("e");
        btnACD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnACD.addActionListener(this::btnACDActionPerformed);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Insertbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCourseName)
                        .addComponent(lbCourseName1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(cmbTeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(erlbCourseName))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(cmbCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(erlbCourseName1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Updatebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Clearbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnACD, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCourseName, cmbTeacherId});

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbCourseName, lbCourseName1});

        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCourseName)
                    .addComponent(erlbCourseName)
                    .addComponent(cmbTeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCourseName1)
                    .addComponent(erlbCourseName1)
                    .addComponent(cmbCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clearbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insertbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnACD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbCourseName, cmbTeacherId});

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbNIC2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNIC2.setText("  Search");

        tfsearchTCo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfsearchTCoFocusLost(evt);
            }
        });
        tfsearchTCo.addActionListener(this::tfsearchTCoActionPerformed);
        tfsearchTCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchTCoKeyReleased(evt);
            }
        });

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Teacher_Course_Registry"));

        tbTCRegistry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTCRegistryMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbTCRegistry);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lbNIC2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfsearchTCo))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfsearchTCo)
                            .addComponent(lbNIC2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Teacher Registry"));

        Teachertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeachertableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Teachertable);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        lbNIC1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNIC1.setText("  Search");

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Teacher Details"));

        lbTName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTName.setText("Teacher Name");

        tfTName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTNameFocusLost(evt);
            }
        });
        tfTName.addActionListener(this::tfTNameActionPerformed);
        tfTName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTNameKeyTyped(evt);
            }
        });

        lbTId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTId.setText("Teacher ID");

        tfTId.setEditable(false);
        tfTId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTIdFocusLost(evt);
            }
        });
        tfTId.addActionListener(this::tfTIdActionPerformed);
        tfTId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTIdKeyTyped(evt);
            }
        });

        lbNIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNIC.setText("NIC");

        tfNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNICFocusLost(evt);
            }
        });
        tfNIC.addActionListener(this::tfNICActionPerformed);
        tfNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNICKeyReleased(evt);
            }
        });

        lbCenterName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCenterName.setText("Center Name");

        cmbCenterName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Kaluthara North", "Horana", "Rathmalana" }));
        cmbCenterName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbCenterNameFocusLost(evt);
            }
        });

        erlbTName.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        erlbTName.setForeground(new java.awt.Color(255, 0, 0));
        erlbTName.setText("Please Enter a Valid Name");

        erlbNIC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        erlbNIC.setForeground(new java.awt.Color(255, 0, 0));
        erlbNIC.setText("Incorrect NIC");

        Insertbtn.setText("Add Teacher");
        Insertbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Insertbtn.addActionListener(this::InsertbtnActionPerformed);

        Deletebtn.setText("Remove Teacher");
        Deletebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Deletebtn.addActionListener(this::DeletebtnActionPerformed);

        Clearbtn.setText("Clear all feilds");
        Clearbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Clearbtn.addActionListener(this::ClearbtnActionPerformed);

        Updatebtn.setText("Change Details");
        Updatebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Updatebtn.addActionListener(this::UpdatebtnActionPerformed);

        erlbCenterName.setForeground(new java.awt.Color(255, 51, 51));
        erlbCenterName.setText("*Select a field");

        btnAC.setText("Assign Course");
        btnAC.setActionCommand("e");
        btnAC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAC.addActionListener(this::btnACActionPerformed);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(lbCenterName)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(erlbCenterName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(lbTName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfTName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(lbNIC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(erlbNIC)
                                            .addComponent(erlbTName))))
                                .addComponent(tfNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addComponent(lbTId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfTId, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTId)
                        .addComponent(tfTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(lbTName)
                        .addGap(11, 11, 11)
                        .addComponent(erlbTName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNIC))))
                .addGap(3, 3, 3)
                .addComponent(erlbNIC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCenterName)
                    .addComponent(cmbCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erlbCenterName))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        tfsearchT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfsearchTFocusLost(evt);
            }
        });
        tfsearchT.addActionListener(this::tfsearchTActionPerformed);
        tfsearchT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchTKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfsearchTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(lbNIC1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfsearchT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfsearchT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNIC1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Teacher", jPanel17);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Course Registry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        dataview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataviewMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(dataview);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Course Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel21KeyReleased(evt);
            }
        });

        lbCcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCcode.setText("Course Code");

        tfcname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfcname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcnameFocusLost(evt);
            }
        });
        tfcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfcnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcnameKeyTyped(evt);
            }
        });

        lbSector.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSector.setText("Sector");

        lbQualification.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQualification.setText("Entry Qualification");

        lbType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbType.setText("Type");

        lbLanguage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLanguage.setText("Language");

        lbCfee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCfee.setText("Course Fee (LKR)");

        tfCfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCfeeFocusLost(evt);
            }
        });
        tfCfee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCfeeKeyReleased(evt);
            }
        });

        lbcname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbcname.setText("Course Name");
        lbcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbcnameKeyReleased(evt);
            }
        });

        tfCcode.setEditable(false);
        tfCcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCcodeFocusLost(evt);
            }
        });
        tfCcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCcodeKeyReleased(evt);
            }
        });

        lbMode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMode.setText("Mode");

        sectorcombobox.setBackground(new java.awt.Color(153, 153, 153));
        sectorcombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sectorcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Agriculture", "Aquaculture & Fisheries", "Apparel & Textile", "Automotive", "Beauty Culture & Cosmetology", "Building & Construction", "Business Management", "Civil Security", "Creative Arts & Graphic Design", "Electrical", "Electronics", "Engineering", "Food & Beverage", "Health & Community Services", "Hotel & Tourism", "ICT", "Leather & Footwear", "Logistics & Transport", "Marine Engineering", "Media & Communication", "Metal Fabrication & Welding", "Plumbing", "Printing", "Refrigeration & Air Conditioning", "Security Services", "Social Services", "Wood & Furniture", "Others" }));

        qualificationcombobox.setBackground(new java.awt.Color(153, 153, 153));
        qualificationcombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        qualificationcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "GCE O/L Passed (3 subjects)", "GCE O/L Passed (6 subjects)", "GCE A/L Passed" }));
        qualificationcombobox.addActionListener(this::qualificationcomboboxActionPerformed);

        typecombobox.setBackground(new java.awt.Color(153, 153, 153));
        typecombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "NVQ Level 3", "NVQ Level 4", "NVQ Level 5", "Non-NVQ" }));

        modecombobox.setBackground(new java.awt.Color(153, 153, 153));
        modecombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Full Time", "Part Time" }));
        modecombobox.addActionListener(this::modecomboboxActionPerformed);

        tfmonths.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfmonthsFocusLost(evt);
            }
        });
        tfmonths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfmonthsKeyReleased(evt);
            }
        });

        btncourse.setBackground(new java.awt.Color(153, 153, 153));
        btncourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncourse.setText("Add Course");
        btncourse.addActionListener(this::btncourseActionPerformed);

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Update");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("Delete");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        languagecombobox.setBackground(new java.awt.Color(153, 153, 153));
        languagecombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        languagecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Sinhala", "Tamil", "English" }));

        elbMonths.setForeground(new java.awt.Color(255, 51, 51));

        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("error");

        elbCname.setForeground(new java.awt.Color(255, 51, 51));

        elbCfee.setForeground(new java.awt.Color(255, 51, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbMonths.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMonths.setText("Duration (Months)");

        elb.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(lbcname, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(tfcname, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCcode, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(elbCname)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCcode, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel21Layout.createSequentialGroup()
                                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbLanguage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbCfee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfCfee, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(languagecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(elbCfee)))
                                            .addGroup(jPanel21Layout.createSequentialGroup()
                                                .addComponent(lbType, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(typecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel21Layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(elbMonths)
                                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel18)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel21Layout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfmonths)
                                                    .addComponent(modecombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qualificationcombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sectorcombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMonths, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(elb, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(btncourse)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcname)
                    .addComponent(tfcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elbCname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSector)
                    .addComponent(sectorcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qualificationcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQualification))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMode))
                    .addComponent(typecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbType))
                .addGap(12, 12, 12)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfmonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(lbMonths))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(languagecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbLanguage)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCfee)
                            .addComponent(tfCfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(elbMonths)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elbCfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(elb)
                .addGap(2, 2, 2)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncourse)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lbMonths1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMonths1.setText("Search");

        tfSearchC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSearchCFocusLost(evt);
            }
        });
        tfSearchC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchCKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbMonths1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchC, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMonths1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Course", jPanel20);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Anual Trainng Planes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbMPlaner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbMPlaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMPlanerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMPlanerMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbMPlaner);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Submit Training Plane", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Training Center");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Course");

        cbCenter.setBackground(new java.awt.Color(153, 153, 153));
        cbCenter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", " " }));
        cbCenter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbCenterFocusLost(evt);
            }
        });
        cbCenter.addActionListener(this::cbCenterActionPerformed);

        cbCourse.setBackground(new java.awt.Color(153, 153, 153));
        cbCourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        cbCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbCourseFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Plan Year");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Batch Start Month");

        cbSMonth.setBackground(new java.awt.Color(153, 153, 153));
        cbSMonth.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbSMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " ", " " }));
        cbSMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbSMonthFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Intake Capacity");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Submit for Publictation");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        cbYear.setBackground(new java.awt.Color(153, 153, 153));
        cbYear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        cbYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbYearFocusLost(evt);
            }
        });

        lbCapacity.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbCapacity.setForeground(new java.awt.Color(255, 0, 0));
        lbCapacity.setText("  ");

        tfCapacity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCapacityFocusLost(evt);
            }
        });
        tfCapacity.addActionListener(this::tfCapacityActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCapacity)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(6, 6, 6)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCapacity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbYear, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSMonth, 0, 753, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbSMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCapacity)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("search");

        tfsearchCP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfsearchCPFocusLost(evt);
            }
        });
        tfsearchCP.addActionListener(this::tfsearchCPActionPerformed);
        tfsearchCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchCPKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfsearchCP))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfsearchCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Course Planer", jPanel1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        Delete();
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        ClearData();
    }//GEN-LAST:event_jbClearActionPerformed

    private void JbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbUpdateActionPerformed
        if (jcValid.isSelected()) {
            Update();
        } else {
            JOptionPane.showMessageDialog(this, "If you're ready to update this data please put tic Reg.valid");
        }
    }//GEN-LAST:event_JbUpdateActionPerformed

    private void jbAddCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddCenterActionPerformed
        if (jcValid.isSelected()) {
            InsertData();
        } else {
            JOptionPane.showMessageDialog(this, "If you're ready to add this data please put tic Reg.valid");
        }
    }//GEN-LAST:event_jbAddCenterActionPerformed

    private void tbCenterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCenterMouseClicked
        loadSelected();
    }//GEN-LAST:event_tbCenterMouseClicked

    private void cbCenterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbCenterFocusLost
        ValidateCenter();
    }//GEN-LAST:event_cbCenterFocusLost

    private void cbCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCenterActionPerformed

    private void cbCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbCourseFocusLost
        ValidateCourse();
    }//GEN-LAST:event_cbCourseFocusLost

    private void cbSMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbSMonthFocusLost
        ValidateStartMonth();
    }//GEN-LAST:event_cbSMonthFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insrtPlane();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        delete();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearselection();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbYearFocusLost
        ValidateYear();
    }//GEN-LAST:event_cbYearFocusLost

    private void tfCapacityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCapacityFocusLost
        ValidateCapacity();
    }//GEN-LAST:event_tfCapacityFocusLost

    private void tfCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCapacityActionPerformed

    private void dataviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataviewMouseClicked
        loadSelectedStudents();
    }//GEN-LAST:event_dataviewMouseClicked

    private void tfcnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcnameFocusLost
        isValidate();
    }//GEN-LAST:event_tfcnameFocusLost

    private void tfcnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcnameKeyReleased
        generateCourseCode();
        isValidate();
    }//GEN-LAST:event_tfcnameKeyReleased

    private void tfcnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcnameKeyTyped
        generateCourseCode();
    }//GEN-LAST:event_tfcnameKeyTyped

    private void tfCfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCfeeFocusLost
        isValidate();
    }//GEN-LAST:event_tfCfeeFocusLost

    private void tfCfeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCfeeKeyReleased
        isValidate();
    }//GEN-LAST:event_tfCfeeKeyReleased

    private void lbcnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbcnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbcnameKeyReleased

    private void tfCcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCcodeFocusLost
        generateCourseCode();
        isValidate();
    }//GEN-LAST:event_tfCcodeFocusLost

    private void tfCcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCcodeKeyReleased
        isValidate();
    }//GEN-LAST:event_tfCcodeKeyReleased

    private void qualificationcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationcomboboxActionPerformed

    private void modecomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modecomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modecomboboxActionPerformed

    private void tfmonthsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmonthsFocusLost
        isValidate();
    }//GEN-LAST:event_tfmonthsFocusLost

    private void tfmonthsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfmonthsKeyReleased
        isValidate();
    }//GEN-LAST:event_tfmonthsKeyReleased

    private void btncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncourseActionPerformed
        if (isValidate()) {
            AddCourse();
        }


    }//GEN-LAST:event_btncourseActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        updatecourse();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        textfiledclear();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        deletecourse();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tfCNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNameFocusLost
        isValidate1();
    }//GEN-LAST:event_tfCNameFocusLost

    private void tfCNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCNameKeyReleased
        generateTechCode();
        isValidate1();
    }//GEN-LAST:event_tfCNameKeyReleased

    private void tfReNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfReNoFocusLost
        isValidate1();
    }//GEN-LAST:event_tfReNoFocusLost

    private void tfReNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfReNoKeyReleased
        isValidate1();
    }//GEN-LAST:event_tfReNoKeyReleased

    private void tfAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusLost
        isValidate1();
    }//GEN-LAST:event_tfAddressFocusLost

    private void tfAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddressKeyReleased
        isValidate1();
    }//GEN-LAST:event_tfAddressKeyReleased

    private void tfConNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfConNoFocusLost
        isValidate1();
    }//GEN-LAST:event_tfConNoFocusLost

    private void tfConNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfConNoKeyReleased
        isValidate1();
    }//GEN-LAST:event_tfConNoKeyReleased

    private void tfGPSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfGPSFocusLost
        isValidate1();
    }//GEN-LAST:event_tfGPSFocusLost

    private void tfGPSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGPSKeyReleased
        isValidate1();
    }//GEN-LAST:event_tfGPSKeyReleased

    private void TeachertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeachertableMouseClicked
        loadSelectedTeachers();
    }//GEN-LAST:event_TeachertableMouseClicked

    private void tfTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTNameActionPerformed

    private void tfTNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTNameKeyTyped
        isValidate2();
    }//GEN-LAST:event_tfTNameKeyTyped

    private void tfTIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTIdFocusLost
        isValidate2();
    }//GEN-LAST:event_tfTIdFocusLost

    private void tfTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTIdActionPerformed

    private void tfTIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTIdKeyTyped
        isValidate2();
    }//GEN-LAST:event_tfTIdKeyTyped

    private void tfNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNICFocusLost
        isValidate2();
    }//GEN-LAST:event_tfNICFocusLost

    private void tfNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNICActionPerformed

    private void InsertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertbtnActionPerformed
        if (isValidate2()) {
            insertData();

        }

    }//GEN-LAST:event_InsertbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        deleteTeachers();
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        clearSelection();
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void tfTNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTNameFocusLost
        isValidate2();
    }//GEN-LAST:event_tfTNameFocusLost

    private void tfNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNICKeyReleased
        isValidate2();
    }//GEN-LAST:event_tfNICKeyReleased

    private void cmbCourseNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCourseNameFocusLost
        isValidate3();
    }//GEN-LAST:event_cmbCourseNameFocusLost

    private void cmbCenterNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCenterNameFocusLost
        isValidate2();
    }//GEN-LAST:event_cmbCenterNameFocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Login st = new Login();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel21KeyReleased
        generateCourseCode();
    }//GEN-LAST:event_jPanel21KeyReleased

    private void tfCNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCNameKeyTyped
        generateTechCode();
    }//GEN-LAST:event_tfCNameKeyTyped

    private void tfTNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTNameKeyReleased
        generateTeacherCode();
    }//GEN-LAST:event_tfTNameKeyReleased

    private void tbMPlanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMPlanerMouseClicked

    }//GEN-LAST:event_tbMPlanerMouseClicked

    private void tbMPlanerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMPlanerMousePressed

    }//GEN-LAST:event_tbMPlanerMousePressed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        if (isValidate2()) {
            updateTeachers();
        }
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void tbTCRegistryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTCRegistryMouseClicked
        loadSelectedTeacherCourse();
    }//GEN-LAST:event_tbTCRegistryMouseClicked

    private void cmbTeacherIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTeacherIdFocusLost
        isValidate3();
    }//GEN-LAST:event_cmbTeacherIdFocusLost

    private void cmbTeacherIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTeacherIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTeacherIdActionPerformed

    private void cmbCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseNameActionPerformed

    private void Insertbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insertbtn1ActionPerformed
        insert2();
    }//GEN-LAST:event_Insertbtn1ActionPerformed

    private void Updatebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Updatebtn1ActionPerformed
        updateTeacherCourse();
    }//GEN-LAST:event_Updatebtn1ActionPerformed

    private void Clearbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clearbtn1ActionPerformed
        clearSelection1();
    }//GEN-LAST:event_Clearbtn1ActionPerformed

    private void Deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletebtn1ActionPerformed
        deleteTeacherCourse();
    }//GEN-LAST:event_Deletebtn1ActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void cmbTeacherIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTeacherIdMouseReleased
        isValidate3();
    }//GEN-LAST:event_cmbTeacherIdMouseReleased

    private void cmbCourseNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCourseNameMouseReleased
        isValidate3();
    }//GEN-LAST:event_cmbCourseNameMouseReleased

    private void tfSearchCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchCFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchCFocusLost

    private void tfSearchCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchCKeyReleased
        searchCourse();
    }//GEN-LAST:event_tfSearchCKeyReleased

    private void tfSearchTCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchTCFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchTCFocusLost

    private void tfSearchTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchTCKeyReleased
        searchTrainingCenter();
    }//GEN-LAST:event_tfSearchTCKeyReleased

    private void tfsearchTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsearchTFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchTFocusLost

    private void tfsearchTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearchTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchTActionPerformed

    private void tfsearchTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchTKeyReleased
        searchTeacher();
    }//GEN-LAST:event_tfsearchTKeyReleased

    private void tfsearchTCoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsearchTCoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchTCoFocusLost

    private void tfsearchTCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearchTCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchTCoActionPerformed

    private void tfsearchTCoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchTCoKeyReleased
        searchTeacherCourse();
    }//GEN-LAST:event_tfsearchTCoKeyReleased

    private void tfsearchCPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsearchCPFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchCPFocusLost

    private void tfsearchCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearchCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchCPActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        bottomPanel.setVisible(true);
        topPanel.setPreferredSize(new java.awt.Dimension(topPanel.getWidth(), 294));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnACActionPerformed

    private void btnACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACDActionPerformed
        bottomPanel.setVisible(false);

        int frameHeight = this.getPreferredSize().height;
        topPanel.setPreferredSize(new java.awt.Dimension(topPanel.getWidth(), frameHeight - 100));
    }//GEN-LAST:event_btnACDActionPerformed

    private void tfSearchTCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchTCKeyTyped
        searchTrainingCenter();
    }//GEN-LAST:event_tfSearchTCKeyTyped

    private void tfSearchTCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchTCKeyPressed
        searchTrainingCenter();
    }//GEN-LAST:event_tfSearchTCKeyPressed

    private void tfsearchTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchTKeyTyped
        searchTeacher();
    }//GEN-LAST:event_tfsearchTKeyTyped

    private void tfsearchCPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchCPKeyReleased
        searchCourseePlaner();
    }//GEN-LAST:event_tfsearchCPKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TVET().setVisible(true));
    }

    private ArrayList<CenterController> getStudenttList(String query) {
        ArrayList<CenterController> studentList = new ArrayList<>();
        PreparedStatement pst;
        ResultSet rs;
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                CenterController student = new CenterController(
                        rs.getString("Registration_No"),
                        rs.getString("Center_Name"),
                        rs.getString("Address"),
                        rs.getString("Contact_No"),
                        rs.getString("GPS_Location"),
                        rs.getString("District")
                );
                studentList.add(student);
            }

            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return studentList;
    }

    private void setstudentTableData(String query) {
        model1.setRowCount(0);
        ArrayList<CenterController> students = getStudenttList(query);
        for (CenterController student : students) {
            model1.addRow(new Object[]{
                student.getCenterName(),
                student.getRegistrationNo(),
                student.getAddress(),
                student.getContactNo(),
                student.getGpsLocation(),
                student.getDistrict()

            });
        }
    }

    private void setDefault() {
        String query = "SELECT * FROM training_centers";
        setstudentTableData(query);
        String query1 = "SELECT * from course_planner";
        TrainingPlane(query1);
        String query2 = "SELECT * from courses";
        setStudentList(query2);
        String query3 = "SELECT * FROM teachers";
        setTeacherManegementList(query3);
        String query4 = "SELECT * FROM teacher_course";
        setTeacherCourse(query4);
    }

    private void loadSelected() {
        int row = tbCenter.getSelectedRow();

        tfCName.setText(model1.getValueAt(row, 0).toString());
        tfReNo.setText(model1.getValueAt(row, 1).toString());
        tfAddress.setText(model1.getValueAt(row, 2).toString());
        tfConNo.setText(model1.getValueAt(row, 3).toString());
        tfGPS.setText(model1.getValueAt(row, 4).toString());
        tfDistrict.setSelectedItem(model1.getValueAt(row, 5).toString());

    }

    private void InsertData() {
        String CenterName = tfCName.getText().trim();
        String RegistrationNo = tfReNo.getText().trim();
        String Address = tfAddress.getText().trim();
        String ContactNo = tfConNo.getText().trim();
        String GPSLocation = tfGPS.getText().trim();
        String District = (String) tfDistrict.getSelectedItem();
        if (isDuplicate(RegistrationNo, CenterName, Address, ContactNo, GPSLocation, District)) {
            JOptionPane.showMessageDialog(this, "This student record already exists for this course!", "Duplicate Entry", JOptionPane.ERROR_MESSAGE);
            return; // Stop the execution
        }
        String query = "INSERT into training_centers (Registration_No,Center_Name,Address,Contact_No,GPS_Location,District) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, RegistrationNo);
            pst.setString(2, CenterName);
            pst.setString(3, Address);
            pst.setString(4, ContactNo);
            pst.setString(5, GPSLocation);
            pst.setString(6, District);

            pst.execute();

            JOptionPane.showMessageDialog(this, "Registration Successfully");
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        setDefault();
        loadCenterNames();
        loadCourseIntoComboBox1();

    }

    private void Update() {
        if (tbCenter.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(
                    this, "Please select arow to update",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        if (tbCenter.getSelectedRowCount() == 1) {
            int index = tbCenter.getSelectedRow();

            String CenterName = tfCName.getText().trim();
            String RegistrationNo = tfReNo.getText().trim();
            String Address = tfAddress.getText().trim();
            String ContactNo = tfConNo.getText().trim();
            String GPSLocation = tfGPS.getText().trim();
            String District = (String) tfDistrict.getSelectedItem();

            String query = "UPDATE training_centers SET Center_Name=?, Address=?, Contact_No=?, GPS_Location=?, District=? WHERE Registration_No=?";

            try {

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, CenterName);
                pst.setString(2, Address);
                pst.setString(3, ContactNo);
                pst.setString(4, GPSLocation);
                pst.setString(5, District);

                pst.setString(6, model1.getValueAt(index, 0).toString());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Successfully");
                setDefault();

                pst.close();
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }

        } else {

            JOptionPane.showMessageDialog(this, "Please select a row to update");
        }
        setDefault();
        loadCenterNames();
        loadCourseIntoComboBox1();
    }

    private void Delete() {
        if (tbCenter.getSelectedRowCount() == 1) {
            int index = tbCenter.getSelectedRow();
            String name = (String) model1.getValueAt(index, 0);

            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete " + name + "?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {

                try {

                    String query = "DELETE FROM training_centers WHERE registration_no=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, model1.getValueAt(index, 1).toString());
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                    setDefault();
                    pst.close();
                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }

            } else {

                JOptionPane.showMessageDialog(this, "Please select arow to delete");
            }
            setDefault();
        }
    }

    private void ClearData() {
        tfCName.setText("");
        tfReNo.setText("");
        tfAddress.setText("");
        tfConNo.setText("");
        tfGPS.setText("");
        tfDistrict.setSelectedIndex(0);
        tbCenter.clearSelection();
    }

    private void insrtPlane() {
        String center_Name = (String) cbCenter.getSelectedItem();
        String course_Name = (String) cbCourse.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        String start_Month = (String) cbSMonth.getSelectedItem();
        String intake_Capacity = (String) tfCapacity.getText().trim();
        if (validation()) {
            String query = "INSERT INTO course_planner (center_name,course_name,year,start_month,intake_capacity) VALUES (?,?,?,?,?)";
            try {
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, center_Name);
                pst.setString(2, course_Name);
                pst.setString(3, year);
                pst.setString(4, start_Month);
                pst.setString(5, intake_Capacity);

                pst.execute();
                setDefault();

                JOptionPane.showMessageDialog(this, "Plane Is Added");
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Plese check the details before submit");
        }
    }

    private void loadCourseIntoComboBox1() {
        try {
            cbCenter.removeAllItems();
            cbCenter.addItem("-Select-");

            String query = "SELECT center_name FROM training_centers";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbCenter.addItem(rs.getString("center_name"));
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadCourseIntoComboBox2() {
        try {
            cbCourse.removeAllItems();
            cbCourse.addItem("-Select-");

            String query = "SELECT course_name FROM courses";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cbCourse.addItem(rs.getString("course_name"));
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArrayList<TrainingPlane> getPlaneDetails(String query) {

        ArrayList<TrainingPlane> studentList = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                TrainingPlane student = new TrainingPlane(
                        rs.getInt("id"),
                        rs.getString("center_name"),
                        rs.getString("course_name"),
                        rs.getString("year"),
                        rs.getString("start_month"),
                        rs.getString("intake_capacity")
                );
                studentList.add(student);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }
        return studentList;
    }

    private void TrainingPlane(String query) {
        model2.setRowCount(0);
        ArrayList<TrainingPlane> plans = getPlaneDetails(query);

        for (TrainingPlane plane : plans) {
            model2.addRow(new Object[]{
                plane.getCenter_Name(),
                plane.getCourse_Name(),
                plane.getYear(),
                plane.getStart_Month(),
                plane.getCapacity()

            });

        }
    }

    private void delete() {

        if (tbMPlaner.getSelectedRowCount() == 1) {

            int index = tbMPlaner.getSelectedRow();
            String name = (String) model2.getValueAt(index, 1);

            int Comfirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete" + name + " ?",
                    "Comfirm Delete",
                    JOptionPane.YES_NO_OPTION
            );

            if (Comfirm == JOptionPane.YES_OPTION) {

                try {
                    String query = "DELETE FROM course_planner WHERE  center_name=? AND course_name=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, model2.getValueAt(index, 0).toString());
                    pst.setString(2, model2.getValueAt(index, 1).toString());
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Course removed");
                    setDefault();
                    pst.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "First selecte a recode");
        }

    }

    private void clearselection() {

        tfCapacity.setText("");
        cbYear.setSelectedIndex(0);
        cbSMonth.setSelectedIndex(0);
        cbCourse.setSelectedIndex(0);
        tbMPlaner.clearSelection();
        cbCenter.setSelectedIndex(0);

    }

    public boolean validation() {
        if (tfCapacity.getText().isEmpty()) {
            lbCapacity.setText("Can not be Empty");
            return false;
        } else if (!Pattern.matches("[0-9]{1,3}", tfCapacity.getText())) {
            lbCapacity.setText("Enter how many months eg:12");
            return false;
        }
        if (cbCenter.getSelectedIndex() == 0) {
            return false;
        } else {
        }
        if (cbCenter.getSelectedIndex() == 0) {
            return false;
        } else {
        }
        if (cbYear.getSelectedIndex() == 0) {
            return false;
        } else {
        }
        if (cbSMonth.getSelectedIndex() == 0) {
            return false;
        } else {
        }
        return true;
    }

    public void ValidateCapacity() {
        if (tfCapacity.getText().isEmpty()) {
            lbCapacity.setText("Can not be Empty");

        } else if (!Pattern.matches("[0-9]{1,3}", tfCapacity.getText())) {
            lbCapacity.setText("Enter how many months eg:12");

        }
    }

    public void ValidateCenter() {
        if (cbCenter.getSelectedIndex() == 0) {
        } else {
        }
    }

    public void ValidateCourse() {
        if (cbCenter.getSelectedIndex() == 0) {

        } else {
        }
    }

    public void ValidateYear() {
        if (cbYear.getSelectedIndex() == 0) {

        } else {
        }
    }

    public void ValidateStartMonth() {
        if (cbYear.getSelectedIndex() == 0) {

        } else {
        }
    }

    private void AddCourse() {
        String course_name = tfcname.getText().trim();
        String course_code = tfCcode.getText().trim();
        String Sector = (String) sectorcombobox.getSelectedItem();
        String entry_Qualification = (String) qualificationcombobox.getSelectedItem();
        String Type = (String) typecombobox.getSelectedItem();
        String Mode = (String) modecombobox.getSelectedItem();
        String Language = (String) languagecombobox.getSelectedItem();
        String DurationMonths = tfmonths.getText().trim();
        String CourseFee = tfCfee.getText().trim();

        String query = "INSERT INTO courses (course_name , course_code , sector , entry_qualification , type , mode , language , duration , course_fee) VALUES (?,?,?,?,?,?,?,?,?)";

        if (isDuplicate(course_name, course_code, Sector, entry_Qualification, Type, Mode, Language, DurationMonths, CourseFee)) {
            JOptionPane.showMessageDialog(this, "This student record already exists for this course!", "Duplicate Entry", JOptionPane.ERROR_MESSAGE);
            return; // Stop the execution
        }

        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, course_name);
            pst.setString(2, course_code);
            pst.setString(3, Sector);
            pst.setString(4, entry_Qualification);
            pst.setString(5, Type);
            pst.setString(6, Mode);
            pst.setString(7, Language);
            pst.setString(8, DurationMonths);
            pst.setString(9, CourseFee);

            pst.execute();

            setDefault();

            JOptionPane.showMessageDialog(this, "Course is added");

            pst.close();
            loadCourseIntoComboBox2();
            loadCourseNames();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }

    }

    //showthetable
    private ArrayList<Courseregister> getStudentList(String query) {

        ArrayList<Courseregister> CourseList = new ArrayList();

        PreparedStatement pst;
        ResultSet rs;

        try {

            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {

                Courseregister course = new Courseregister(
                        rs.getInt("id"),
                        rs.getString("course_name"),
                        rs.getString("course_code"),
                        rs.getString("sector"),
                        rs.getString("entry_qualification"),
                        rs.getString("type"),
                        rs.getString("mode"),
                        rs.getString("language"),
                        rs.getString("duration"),
                        rs.getString("course_fee")
                );

                CourseList.add(course);
            }

            pst.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return CourseList;
    }

    private void setStudentList(String query) {
        model3.setRowCount(0);
        ArrayList<Courseregister> students = getStudentList(query);

        for (Courseregister student : students) {
            model3.addRow(new Object[]{
                student.getId(),
                student.getCourse_name(),
                student.getCourse_code(),
                student.getSector(),
                student.getEntry_qualification(),
                student.getType(),
                student.getMode(),
                student.getLanguage(),
                student.getDuration(),
                student.getCourse_fee()
            });

        }

    }

    private void loadSelectedStudents() {

        int row = dataview.getSelectedRow();

        tfcname.setText(model3.getValueAt(row, 1).toString());

        tfCcode.setText(model3.getValueAt(row, 2).toString());

        sectorcombobox.setSelectedItem(model3.getValueAt(row, 3).toString());

        qualificationcombobox.setSelectedItem(model3.getValueAt(row, 4).toString());

        typecombobox.setSelectedItem(model3.getValueAt(row, 5).toString());

        modecombobox.setSelectedItem(model3.getValueAt(row, 6).toString());

        languagecombobox.setSelectedItem(model3.getValueAt(row, 7).toString());

        tfmonths.setText(model3.getValueAt(row, 8).toString());

        tfCfee.setText(model3.getValueAt(row, 9).toString());
    }

    //updatecourse
    private void updatecourse() {

        //check if one row is not selected
        if (dataview.getSelectedRowCount() != 1) {

            JOptionPane.showMessageDialog(this, "Please Select a row to Update", "Warning", JOptionPane.WARNING_MESSAGE);

            return; //stop execution
        }

        //check if one row is selected
        if (dataview.getSelectedRowCount() == 1) {

            //get selected row index
            int index = dataview.getSelectedRow();

            //get updated values from text fields
            String course_name = tfcname.getText().trim();
            String code = tfCcode.getText().trim();
            String sector = (String) sectorcombobox.getSelectedItem();
            String entry_qualification = (String) qualificationcombobox.getSelectedItem();
            String type = (String) typecombobox.getSelectedItem();
            String mode = (String) modecombobox.getSelectedItem();
            String language = (String) languagecombobox.getSelectedItem();
            String duration = tfmonths.getText().trim();
            String course_fee = tfCfee.getText().trim();

            try {
                String query = "UPDATE courses SET  course_name=?, course_code=?, sector=?, entry_qualification=?, type=?, mode=?, language=?, duration=?,  course_fee=? WHERE id=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, course_name);
                pst.setString(2, code);
                pst.setString(3, sector);
                pst.setString(4, entry_qualification);
                pst.setString(5, type);
                pst.setString(6, mode);
                pst.setString(7, language);
                pst.setString(8, duration);
                pst.setString(9, course_fee);

                pst.setString(10, model3.getValueAt(index, 0).toString());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Course Updaded.");

                setDefault();

                pst.close();
                loadCourseIntoComboBox2();
                loadCourseNames();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage());

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update.");
        }
    }

    //clear
    private void textfiledclear() {

        tfcname.setText("");
        tfCcode.setText("");
        tfmonths.setText("");
        tfCfee.setText("");
        elbCname.setText("");

        elbCfee.setText("");
        elbMonths.setText("");
        modecombobox.setSelectedIndex(0);
        languagecombobox.setSelectedIndex(0);
        typecombobox.setSelectedIndex(0);
        qualificationcombobox.setSelectedIndex(0);
        sectorcombobox.setSelectedIndex(0);

        dataview.clearSelection();

    }

    private void deletecourse() {

        if (dataview.getSelectedRowCount() == 1) {

            int index = dataview.getSelectedRow();

            String name = (String) model3.getValueAt(index, 2);

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete" + name + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String query = "DELETE FROM courses WHERE id = ?";

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, model3.getValueAt(index, 0).toString());

                    pst.execute();

                    setDefault();

                    pst.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a row to Delete.");
        }

    }

    private boolean isDuplicate(String course_name, String course_code, String sector, String entry_qualification, String type, String mode, String language, String duration, String course_fee) {
        boolean exists = false;
        String checkQuery = "SELECT COUNT(*) FROM courses WHERE course_name=? AND course_code=? sector=?  AND entry_qualification=? AND type=? AND mode=? AND mode=? AND lanaguage=? AND duration AND course_fee";

        try (PreparedStatement pstCheck = con.prepareStatement(checkQuery)) {
            pstCheck.setString(1, course_name);
            pstCheck.setString(2, course_code);
            pstCheck.setString(3, sector);
            pstCheck.setString(4, entry_qualification);
            pstCheck.setString(5, type);
            pstCheck.setString(6, mode);
            pstCheck.setString(7, language);
            pstCheck.setString(8, duration);
            pstCheck.setString(9, course_fee);

            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0; // Returns true if count is more than 0
            }
        } catch (Exception e) {
            System.out.println("Check Error: " + e.getMessage());
        }
        return exists;
    }

    public boolean isValidate() {
        if (tfcname.getText().isEmpty()) {
            elbCname.setText("Can not be Empty.");
            btncourse.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$", tfcname.getText().trim())) {

            elbCname.setText("Enter Valid Course name (Ex: Software Developer)");
            btncourse.setEnabled(false);
            return false;
        } else {
            elbCname.setText("");
            btncourse.setEnabled(true);

        }

        if (tfCfee.getText().isEmpty()) {
            elbCfee.setText("Can not be Empty.");
            btncourse.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^\\d+(\\.\\d{1,2})?$", tfCfee.getText())) {
            elbCfee.setText("Invalid course fees");
            btncourse.setEnabled(false);
            return false;
        } else {
            elbCfee.setText("");
            btncourse.setEnabled(true);

        }

        if (tfmonths.getText().isEmpty()) {
            elbMonths.setText("Can not be Empty.");
            btncourse.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^(0?[1-9]|1[0-2])$", tfmonths.getText())) {
            elbMonths.setText("Enter valid month ex:01");
            btncourse.setEnabled(false);
            return false;
        } else {
            elbMonths.setText("");
            btncourse.setEnabled(true);
        }
        if (sectorcombobox.getSelectedItem().toString().equals("-Select-")) {
            elb.setText("Please Check Details Before add");
            btncourse.setEnabled(false);
            return false;
        } else {
            elb.setText("");
            btncourse.setEnabled(true);
        }

        if (languagecombobox.getSelectedItem().toString().equals("-Select-")) {
            elb.setText("Please Check Details Before add");
            btncourse.setEnabled(false);
            return false;
        } else {
            elb.setText("");
            btncourse.setEnabled(true);
        }

        if (qualificationcombobox.getSelectedItem().toString().equals("-Select-")) {
            elb.setText("Please Check Details Before add");
            btncourse.setEnabled(false);
            return false;
        } else {
            elb.setText("");
            btncourse.setEnabled(true);
        }

        if (typecombobox.getSelectedItem().toString().equals("-Select-")) {
            elb.setText("Please Check Details Before add");
            btncourse.setEnabled(false);
            return false;
        } else {
            elb.setText("");
            btncourse.setEnabled(true);
        }

        if (modecombobox.getSelectedItem().toString().equals("-Select-")) {
            elb.setText("Please Check Details Before add");
            btncourse.setEnabled(false);
            return false;
        } else {
            elb.setText("");
            btncourse.setEnabled(true);
        }
        return true;

    }

    private boolean isDuplicate(String registrationNo, String centerName, String address, String contactNo, String gpsLocation, String district) {
        boolean exists = false;
        String checkQuery = "SELECT COUNT(*) FROM training_centers WHERE registration_no = ? AND center_name = ? AND address AND countact_no=? AND gps_location = ? AND district";

        try (PreparedStatement pstCheck = con.prepareStatement(checkQuery)) {
            pstCheck.setString(1, registrationNo);
            pstCheck.setString(2, centerName);
            pstCheck.setString(3, address);
            pstCheck.setString(4, contactNo);
            pstCheck.setString(5, gpsLocation);
            pstCheck.setString(6, district);

            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0; // Returns true if count is more than 0
            }
        } catch (Exception e) {
            System.out.println("Check Error: " + e.getMessage());
        }
        return exists;
    }

    public boolean isValidate1() {
        if (tfCName.getText().isEmpty()) {
            elbCName.setText("Can not be Empty.");
            jbAddCenter.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$", tfCName.getText().trim())) {

            elbCName.setText("Enter Valid center name (Ex: Kaluthara North)");
            jbAddCenter.setEnabled(false);
            return false;
        } else {
            elbCName.setText("");
            jbAddCenter.setEnabled(true);

        }

        if (tfAddress.getText().isEmpty()) {
            elbAddress.setText("Can not be Empty.");
            jbAddCenter.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^[a-zA-Z0-9\\s,.'\\-\\/\\(\\)]+$", tfAddress.getText())) {
            elbAddress.setText("Enter Valid Address ");
            jbAddCenter.setEnabled(false);
            return false;
        } else {
            elbAddress.setText("");
            jbAddCenter.setEnabled(true);
        }

        if (tfConNo.getText().isEmpty()) {
            elbConNo.setText("Can not be Empty.");
            jbAddCenter.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^\\+?[0-9\\s\\-()]{7,15}$", tfConNo.getText())) {
            elbConNo.setText("Enter Valid Contact No (Ex: 0729286735)");
            jbAddCenter.setEnabled(false);
            return false;
        } else {
            elbConNo.setText("");
            jbAddCenter.setEnabled(true);
        }

        if (tfGPS.getText().isEmpty()) {
            elbGPS.setText("Can not be Empty.");
            jbAddCenter.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)$", tfGPS.getText())) {
            elbGPS.setText("Enter Valid GPS Location (Ex: 6.9271)");
            jbAddCenter.setEnabled(false);
            return false;
        } else {
            elbGPS.setText("");
            jbAddCenter.setEnabled(true);
        }

        if (tfDistrict.getSelectedIndex() == 0) {
            elbDistrict.setText("Please select a province.");
            jbAddCenter.setEnabled(false);
            return false;
        } else {
            elbDistrict.setText("");
        }

        return false;

    }

    private void insertData() {
        String teacherid = tfTId.getText().trim();

        String teachername = tfTName.getText().trim();
        String teachernic = tfNIC.getText().trim();
        String centername = cmbCenterName.getSelectedItem().toString().trim();

        String query = "INSERT INTO teachers (teacher_id, teacher_name, nic, center_name ) VALUES (?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, teacherid);
            pst.setString(2, teachername);
            pst.setString(3, teachernic);
            pst.setString(4, centername);

            pst.execute();
            JOptionPane.showMessageDialog(this, "Teacher is added");

            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }

        setDefault();
        loadTeacherId();
    }

    private void insert2() {

        String teacherid = cmbTeacherId.getSelectedItem().toString().trim();
        String coursename = cmbCourseName.getSelectedItem().toString().trim();
        String query = "INSERT INTO teacher_course (teacher_id,course_code) VALUES (?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, teacherid);
            pst.setString(2, coursename);

            pst.execute();

            JOptionPane.showMessageDialog(this, "Teacher_Course is added");

            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
        setDefault();
    }

    private ArrayList<TeacherManegement> getTeacherManegementList(String query) {
        ArrayList<TeacherManegement> list = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                TeacherManegement teacher = new TeacherManegement(
                        rs.getInt("id"),
                        rs.getString("teacher_id"),
                        rs.getString("teacher_name"),
                        rs.getString("nic"),
                        rs.getString("center_name")
                );
                list.add(teacher);
            }
            return list;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        return list;
    }

    private void setTeacherManegementList(String query) {
        model4.setRowCount(0);

        ArrayList<TeacherManegement> teacherList = getTeacherManegementList(query);

        for (TeacherManegement teacher : teacherList) {
            model4.addRow(new Object[]{
                teacher.getId(),
                teacher.getTeacher_id(),
                teacher.getTeacher_name(),
                teacher.getNic(),
                teacher.getCenter_name()
            });
        }
    }

    private ArrayList<TeacherCourse> getTeacherCourseList(String query) {
        ArrayList<TeacherCourse> list = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                TeacherCourse teacher = new TeacherCourse(
                        rs.getInt("id"),
                        rs.getString("teacher_id"),
                        rs.getString("course_code")
                );
                list.add(teacher);
            }
            return list;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        return list;
    }

    private void setTeacherCourse(String query) {
        model5.setRowCount(0);

        ArrayList<TeacherCourse> teacherList = getTeacherCourseList(query);

        for (TeacherCourse teacher : teacherList) {
            model5.addRow(new Object[]{
                teacher.getId(),
                teacher.getTeacherId(),
                teacher.getCourseCode()

            });
        }
    }

    private void loadCourseNames() {
        cmbCourseName.removeAllItems();
        cmbCourseName.addItem("-Select-");

        String query = "SELECT course_code FROM courses";

        try (PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                cmbCourseName.addItem(rs.getString("course_code"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading courses: " + e.getMessage());
        }
    }

    private void loadTeacherId() {
        cmbTeacherId.removeAllItems();
        cmbTeacherId.addItem("-Select-");

        String query = "SELECT teacher_id  FROM teachers";

        try (PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                cmbTeacherId.addItem(rs.getString("teacher_id"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading courses: " + e.getMessage());
        }
    }

    private void loadCenterNames() {
        cmbCenterName.removeAllItems();
        cmbCenterName.addItem("-Select-");

        String query = "SELECT center_name FROM training_centers";

        try (PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                cmbCenterName.addItem(rs.getString("center_name"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading training_centers: " + e.getMessage());
        }
    }

    private void loadSelectedTeachers() {

        int row = Teachertable.getSelectedRow();

        tfTId.setText(model4.getValueAt(row, 1).toString());
        tfTName.setText(model4.getValueAt(row, 2).toString());
        tfNIC.setText(model4.getValueAt(row, 3).toString());
        cmbCenterName.setSelectedItem(model4.getValueAt(row, 4).toString());
    }

    private void loadSelectedTeacherCourse() {

        int row = tbTCRegistry.getSelectedRow();

        cmbTeacherId.setSelectedItem(model5.getValueAt(row, 1).toString());
        cmbCourseName.setSelectedItem(model5.getValueAt(row, 2).toString());
    }

    private void updateTeachers() {
        if (Teachertable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please Select a row First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int index = Teachertable.getSelectedRow();

        String teacherid = tfTId.getText().trim();
        String teachername = tfTName.getText().trim();
        String teachernic = tfNIC.getText().trim();
        String centername = cmbCenterName.getSelectedItem().toString().trim();

        String query = "UPDATE teachers SET teacher_id = ?, teacher_name = ?, nic = ?, center_name = ? WHERE id = ? ";

        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, teacherid);
            pst.setString(2, teachername);
            pst.setString(3, teachernic);
            pst.setString(4, centername);

            pst.setString(5, model4.getValueAt(index, 0).toString());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Teacher Updated Successfully");
            setDefault();
            clearSelection();
            loadTeacherId();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
    }

    private void updateTeacherCourse() {
        if (tbTCRegistry.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please Select a row First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int index = tbTCRegistry.getSelectedRow();

        String teacherid = cmbTeacherId.getSelectedItem().toString().trim();
        String coursename = cmbCourseName.getSelectedItem().toString().trim();

        String query = "UPDATE teacher_course SET teacher_id = ?, course_code  = ? WHERE id = ? ";

        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, teacherid);
            pst.setString(2, coursename);

            pst.setString(3, model5.getValueAt(index, 0).toString());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Teacher_Corse Updated Successfully");
            setDefault();
            clearSelection1();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
    }

    private void deleteTeachers() {
        if (Teachertable.getSelectedRowCount() == 1) {
            int index = Teachertable.getSelectedRow();

            int conform = JOptionPane.showConfirmDialog(this, "Are You Sure about Delete this data", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (conform == JOptionPane.YES_OPTION) {
                String query = "DELETE FROM teachers WHERE id = ?";

                try (PreparedStatement pst = con.prepareStatement(query)) {

                    pst.setString(1, model4.getValueAt(index, 0).toString());

                    pst.executeUpdate();

                    setDefault();
                    clearSelection();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a row First");
        }
    }

    private void deleteTeacherCourse() {
        if (tbTCRegistry.getSelectedRowCount() == 1) {
            int index = tbTCRegistry.getSelectedRow();

            int conform = JOptionPane.showConfirmDialog(this, "Are You Sure about Delete this data", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (conform == JOptionPane.YES_OPTION) {
                String query = "DELETE FROM teacher_course WHERE id = ?";

                try (PreparedStatement pst = con.prepareStatement(query)) {

                    pst.setString(1, model5.getValueAt(index, 0).toString());

                    pst.executeUpdate();

                    setDefault();
                    clearSelection();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a row First");
        }
    }

    private void clearSelection() {

        Teachertable.clearSelection();

        cmbCenterName.setSelectedIndex(0);

        tfTId.setText(null);

        tfTName.setText(null);

        tfNIC.setText(null);

    }

    private void clearSelection1() {

        tbTCRegistry.clearSelection();

        cmbTeacherId.setSelectedIndex(0);
        cmbCourseName.setSelectedIndex(0);

    }

    public boolean isValidate2() {
        boolean valid = true;

        if (tfTName.getText().trim().isEmpty()) {
            erlbTName.setText("Cannot be empty");
            Insertbtn.setEnabled(false);
            valid = false;
        } else if (!Pattern.matches("^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$", tfTName.getText().trim())) {
            erlbTName.setText("Please Enter a Valid NameEX: Chamari Athapaththu");
            Insertbtn.setEnabled(false);
            valid = false;
        } else {
            erlbTName.setText("");
            Insertbtn.setEnabled(true);
        }

        if (tfNIC.getText().trim().isEmpty()) {
            erlbNIC.setText("Cannot be empty");
            Insertbtn.setEnabled(false);
            valid = false;
        } else if (!Pattern.matches("^\\d{12}$", tfNIC.getText().trim())) {
            erlbNIC.setText("Incorrect NIC");
            Insertbtn.setEnabled(false);
            valid = false;
        } else {
            erlbNIC.setText("");
            Insertbtn.setEnabled(true);
        }

        if (cmbCenterName.getSelectedItem().toString().equals("-Select-")) {
            erlbCenterName.setText("*Select a field");
            Insertbtn.setEnabled(false);
            valid = false;
        } else {
            erlbCenterName.setText("");
            Insertbtn.setEnabled(true);
        }

        return valid;
    }

    public boolean isValidate3() {
        boolean valid = true;

        if (cmbTeacherId.getSelectedItem().toString().equals("-Select-")) {
            erlbCourseName.setText("*Select a field");
            Insertbtn1.setEnabled(false);
            valid = false;
        } else {
            erlbCourseName.setText("");
            Insertbtn1.setEnabled(true);
        }

        if (cmbCourseName.getSelectedItem().toString().equals("-Select-")) {
            erlbCourseName1.setText("*Select a field");
            Insertbtn1.setEnabled(false);
            valid = false;
        } else {
            erlbCourseName1.setText("");
            Insertbtn1.setEnabled(true);
        }

        return valid;
    }

    private void loadLebel() {

        String query = "SELECT COUNT(*) FROM training_centers";

        try (PreparedStatement stmt = con.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                int count = rs.getInt(1);

                lbcTCenter.setText(count + "");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());

        }

        String query1 = "SELECT COUNT(*) FROM courses";

        try (PreparedStatement stm = con.prepareStatement(query1); ResultSet rs = stm.executeQuery()) {

            if (rs.next()) {
                int count1 = rs.getInt(1);

                lbcCourse.setText(count1 + "");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());

        }

        String query2 = "SELECT COUNT(*) FROM teachers";

        try (PreparedStatement stm = con.prepareStatement(query2); ResultSet rs = stm.executeQuery()) {

            if (rs.next()) {
                int count2 = rs.getInt(1);

                lbcTeacher.setText(count2 + "");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());

        }

        String query3 = "SELECT COUNT(*) FROM course_planner";

        try (PreparedStatement stm = con.prepareStatement(query3); ResultSet rs = stm.executeQuery()) {

            if (rs.next()) {
                int count3 = rs.getInt(1);

                lbcTPlaner.setText(count3 + "");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());

        }

    }

    public void generateCourseCode() {

        String courseName = tfcname.getText().trim();

        if (courseName.isEmpty()) {
            tfCcode.setText("");
            return;
        }

        String[] words = courseName.split("\\s+");
        StringBuilder codeBuilder = new StringBuilder();

        if (words.length > 0) {
            String firstWord = words[0].toUpperCase();

            codeBuilder.append(firstWord.charAt(0));

            if (firstWord.length() >= 4) {
                codeBuilder.append(firstWord.charAt(3));
            } else {

                codeBuilder.append(firstWord.charAt(firstWord.length() - 1));
            }

            for (int i = 1; i < words.length; i++) {
                if (!words[i].isEmpty()) {
                    codeBuilder.append(words[i].toUpperCase().charAt(0));
                }
            }
        }

        String generatedCode = codeBuilder.toString() + "/VTA/CC07";

        try {

            String query = "SELECT COUNT(*) FROM courses WHERE course_name = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, courseName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {

                    tfCcode.setText(generatedCode + "/01");
                } else {
                    tfCcode.setText(generatedCode);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generateTechCode() {

        String courseName = tfCName.getText().trim();

        if (courseName.isEmpty()) {
            tfReNo.setText("");
            return;
        }

        String[] words = courseName.split("\\s+");
        StringBuilder codeBuilder = new StringBuilder();

        if (words.length > 0) {
            String firstWord = words[0].toUpperCase();

            codeBuilder.append(firstWord.charAt(0));

            if (firstWord.length() >= 4) {
                codeBuilder.append(firstWord.charAt(1));
                codeBuilder.append(firstWord.charAt(3));
            } else {

                codeBuilder.append(firstWord.charAt(firstWord.length() - 1));
            }

            for (int i = 1; i < words.length; i++) {
                if (!words[i].isEmpty()) {
                    codeBuilder.append(words[i].toUpperCase().charAt(0));
                }
            }
        }

        String generatedCode = "VTA/RC00/" + codeBuilder.toString();

        try {

            String query = "SELECT COUNT(*) FROM training_centers WHERE center_name = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, courseName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {

                    tfReNo.setText(generatedCode + "/01");
                } else {
                    tfReNo.setText(generatedCode);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generateTeacherCode() {
        String teacherName = tfTName.getText().trim();

        if (teacherName.isEmpty()) {
            tfTId.setText("");
            return;
        }

        String[] words = teacherName.split("\\s+");
        StringBuilder prefixBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                prefixBuilder.append(word.toUpperCase().charAt(0));
            }
        }

        String prefix = prefixBuilder.toString();

        try {

            String query = "SELECT teacher_id FROM teachers WHERE teacher_id LIKE ? ORDER BY teacher_id DESC LIMIT 1";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, prefix + "%");
            ResultSet rs = pst.executeQuery();

            int nextNumber = 1;

            if (rs.next()) {
                String lastId = rs.getString("teacher_id"); // e.g., "CK001/VTA"

                if (lastId.contains("/VTA") && lastId.length() > prefix.length()) {

                    int vtaIndex = lastId.indexOf("/VTA");
                    String numberPart = lastId.substring(prefix.length(), vtaIndex);

                    try {
                        int lastNumber = Integer.parseInt(numberPart);
                        nextNumber = lastNumber + 1;
                    } catch (NumberFormatException e) {
                        nextNumber = 1;
                    }
                }
            }

            if (nextNumber > 999) {
                nextNumber = 999;
            }

            String formattedNumber = String.format("%03d", nextNumber);

            String finalTeacherCode = prefix + formattedNumber + "/VTA";
            tfTId.setText(finalTeacherCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchTrainingCenter() {
        String searchTerm = tfSearchTC.getText().trim();

        if (searchTerm.isEmpty()) {
            setDefault();
            return;
        }

        String query = "SELECT * FROM training_centers WHERE "
                + " Registration_No LIKE '%" + searchTerm + "%' OR "
                + " center_name LIKE '%" + searchTerm + "%' OR "
                + " Address LIKE '%" + searchTerm + "%' OR "
                + " contact_no LIKE '%" + searchTerm + "%' OR "
                + " GPS_Location LIKE '%" + searchTerm + "%' OR "
                + " District LIKE '%" + searchTerm + "%'";

        setstudentTableData(query);
    }

    private void searchTeacher() {
        String searchTerm = tfsearchT.getText().trim();

        if (searchTerm.isEmpty()) {
            setDefault();
            return;
        }

        String query = "SELECT * FROM teachers WHERE "
                + "teacher_id LIKE '%" + searchTerm + "%' OR "
                + "teacher_name LIKE '%" + searchTerm + "%' OR "
                + "nic LIKE '%" + searchTerm + "%' OR "
                + "center_name LIKE '%" + searchTerm + "%'";

        setTeacherManegementList(query);
    }

    private void searchTeacherCourse() {
        String searchTerm = tfsearchTCo.getText().trim();

        if (searchTerm.isEmpty()) {
            setDefault();
            return;
        }

        String query = "SELECT * FROM teacher_course WHERE "
                + "teacher_id LIKE '%" + searchTerm + "%' OR "
                + "course_code  LIKE '%" + searchTerm + "%'";

        setTeacherCourse(query);
    }

    private void searchCourse() {
        String searchTerm = tfSearchC.getText().trim();

        if (searchTerm.isEmpty()) {
            setDefault();
            return;
        }

        String query = "SELECT * FROM courses WHERE "
                + " course_name LIKE '%" + searchTerm + "%' OR "
                + " course_code  LIKE '%" + searchTerm + "%' OR "
                + " sector LIKE '%" + searchTerm + "%' OR "
                + " entry_qualification LIKE '%" + searchTerm + "%' OR "
                + " type LIKE '%" + searchTerm + "%' OR "
                + " mode LIKE '%" + searchTerm + "%' OR "
                + " language LIKE '%" + searchTerm + "%' OR "
                + " course_fee LIKE '%" + searchTerm + "%'";

        setStudentList(query);
    }

    private void searchCourseePlaner() {
        String searchTerm = tfsearchCP.getText().trim();

        if (searchTerm.isEmpty()) {
            setDefault();
            return;
        }

        String query = "SELECT * FROM course_planner WHERE "
                + " center_name   LIKE '%" + searchTerm + "%' OR "
                + " course_name   LIKE '%" + searchTerm + "%' OR "
                + " year          LIKE '%" + searchTerm + "%' OR "
                + " start_month   LIKE '%" + searchTerm + "%'";

        TrainingPlane(query);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Clearbtn1;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Deletebtn1;
    private javax.swing.JButton Insertbtn;
    private javax.swing.JButton Insertbtn1;
    private javax.swing.JButton JbUpdate;
    private javax.swing.JTable Teachertable;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JButton Updatebtn1;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnACD;
    private javax.swing.JButton btncourse;
    private javax.swing.JComboBox<String> cbCenter;
    private javax.swing.JComboBox<String> cbCourse;
    private javax.swing.JComboBox<String> cbSMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JComboBox<String> cmbCenterName;
    private javax.swing.JComboBox<String> cmbCourseName;
    private javax.swing.JComboBox<String> cmbTeacherId;
    private javax.swing.JTable dataview;
    private javax.swing.JLabel elb;
    private javax.swing.JLabel elbAddress;
    private javax.swing.JLabel elbCName;
    private javax.swing.JLabel elbCfee;
    private javax.swing.JLabel elbCname;
    private javax.swing.JLabel elbConNo;
    private javax.swing.JLabel elbDistrict;
    private javax.swing.JLabel elbGPS;
    private javax.swing.JLabel elbMonths;
    private javax.swing.JLabel erlbCenterName;
    private javax.swing.JLabel erlbCourseName;
    private javax.swing.JLabel erlbCourseName1;
    private javax.swing.JLabel erlbNIC;
    private javax.swing.JLabel erlbTName;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbAddCenter;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbDelete;
    private javax.swing.JCheckBox jcValid;
    private javax.swing.JComboBox<String> languagecombobox;
    private javax.swing.JLabel lbAbout;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbCName;
    private javax.swing.JLabel lbCapacity;
    private javax.swing.JLabel lbCcode;
    private javax.swing.JLabel lbCenterName;
    private javax.swing.JLabel lbCfee;
    private javax.swing.JLabel lbConNo;
    private javax.swing.JLabel lbCourse;
    private javax.swing.JLabel lbCourseName;
    private javax.swing.JLabel lbCourseName1;
    private javax.swing.JLabel lbDistrict;
    private javax.swing.JLabel lbGPS;
    private javax.swing.JLabel lbGPS1;
    private javax.swing.JLabel lbLanguage;
    private javax.swing.JLabel lbMode;
    private javax.swing.JLabel lbMonths;
    private javax.swing.JLabel lbMonths1;
    private javax.swing.JLabel lbNIC;
    private javax.swing.JLabel lbNIC1;
    private javax.swing.JLabel lbNIC2;
    private javax.swing.JLabel lbQualification;
    private javax.swing.JLabel lbReNo;
    private javax.swing.JLabel lbSector;
    private javax.swing.JLabel lbTCenters;
    private javax.swing.JLabel lbTId;
    private javax.swing.JLabel lbTName;
    private javax.swing.JLabel lbTPlaner;
    private javax.swing.JLabel lbTeacher;
    private javax.swing.JLabel lbType;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JLabel lbcCourse;
    private javax.swing.JLabel lbcTCenter;
    private javax.swing.JLabel lbcTPlaner;
    private javax.swing.JLabel lbcTeacher;
    private javax.swing.JLabel lbcname;
    private javax.swing.JLabel lbvalid;
    private javax.swing.JComboBox<String> modecombobox;
    private javax.swing.JComboBox<String> qualificationcombobox;
    private javax.swing.JPanel roundPanel;
    private javax.swing.JComboBox<String> sectorcombobox;
    private javax.swing.JTable tbCenter;
    private javax.swing.JTable tbMPlaner;
    private javax.swing.JTable tbTCRegistry;
    private javax.swing.JScrollPane tfAbout;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfCName;
    private javax.swing.JTextField tfCapacity;
    private javax.swing.JTextField tfCcode;
    private javax.swing.JTextField tfCfee;
    private javax.swing.JTextField tfConNo;
    private javax.swing.JComboBox<String> tfDistrict;
    private javax.swing.JTextField tfGPS;
    private javax.swing.JTextField tfNIC;
    private javax.swing.JTextField tfReNo;
    private javax.swing.JTextField tfSearchC;
    private javax.swing.JTextField tfSearchTC;
    private javax.swing.JTextField tfTId;
    private javax.swing.JTextField tfTName;
    private javax.swing.JTextField tfcname;
    private javax.swing.JTextField tfmonths;
    private javax.swing.JTextField tfsearchCP;
    private javax.swing.JTextField tfsearchT;
    private javax.swing.JTextField tfsearchTCo;
    private javax.swing.JPanel topPanel;
    private javax.swing.JComboBox<String> typecombobox;
    // End of variables declaration//GEN-END:variables
}
