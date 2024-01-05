/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setResizable(true);
         this.setLocationRelativeTo(null);
        setTitle("Quản Lý DÂN CƯ");
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangChu, jlbTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu", jpnTrangChu, jlbTrangChu));
        listItem.add(new DanhMucBean("NhanKhau", jpnTrangChu1, jlbNhanKhau));
        listItem.add(new DanhMucBean("TamTruTamVang", jpnTamTruTamVang, jlbTamTruTamVang));
        listItem.add(new DanhMucBean("PhatThuong", jpnPhatThuong, jlbPhatThuong));
        listItem.add(new DanhMucBean("HoKhau", jpnHoKhau, jlbHoKhau));
        listItem.add(new DanhMucBean("QLThuPhi", jpnQLThuPhi, jlbQLThuPhi));
        listItem.add(new DanhMucBean("ThongKe", jpnThongKe, jlbThongKe));
        controller.setEvent(listItem);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnTrangChu1 = new javax.swing.JPanel();
        jlbNhanKhau = new javax.swing.JLabel();
        jpnHoKhau = new javax.swing.JPanel();
        jlbHoKhau = new javax.swing.JLabel();
        jpnTamTruTamVang = new javax.swing.JPanel();
        jlbTamTruTamVang = new javax.swing.JLabel();
        jpnPhatThuong = new javax.swing.JPanel();
        jlbPhatThuong = new javax.swing.JLabel();
        jpnQLThuPhi = new javax.swing.JPanel();
        jlbQLThuPhi = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(167, 199, 231));
        jpnMenu.setForeground(new java.awt.Color(167, 199, 231));

        jPanel5.setBackground(new java.awt.Color(132, 180, 203));

        jLabel1.setBackground(new java.awt.Color(167, 199, 231));
        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-male-user-96.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ DÂN CƯ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jpnTrangChu.setBackground(new java.awt.Color(132, 180, 203));

        jlbTrangChu.setBackground(new java.awt.Color(132, 180, 203));
        jlbTrangChu.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-64.png"))); // NOI18N
        jlbTrangChu.setText("  Trang chủ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTrangChu1.setBackground(new java.awt.Color(132, 180, 203));

        jlbNhanKhau.setBackground(new java.awt.Color(132, 180, 203));
        jlbNhanKhau.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanKhau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNhanKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-conference-64.png"))); // NOI18N
        jlbNhanKhau.setText("  Nhân khẩu");

        javax.swing.GroupLayout jpnTrangChu1Layout = new javax.swing.GroupLayout(jpnTrangChu1);
        jpnTrangChu1.setLayout(jpnTrangChu1Layout);
        jpnTrangChu1Layout.setHorizontalGroup(
            jpnTrangChu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChu1Layout.setVerticalGroup(
            jpnTrangChu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnHoKhau.setBackground(new java.awt.Color(132, 180, 203));

        jlbHoKhau.setBackground(new java.awt.Color(132, 180, 203));
        jlbHoKhau.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbHoKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoKhau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbHoKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-address-64.png"))); // NOI18N
        jlbHoKhau.setText("  Hộ khẩu");

        javax.swing.GroupLayout jpnHoKhauLayout = new javax.swing.GroupLayout(jpnHoKhau);
        jpnHoKhau.setLayout(jpnHoKhauLayout);
        jpnHoKhauLayout.setHorizontalGroup(
            jpnHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHoKhauLayout.setVerticalGroup(
            jpnHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTamTruTamVang.setBackground(new java.awt.Color(132, 180, 203));

        jlbTamTruTamVang.setBackground(new java.awt.Color(132, 180, 203));
        jlbTamTruTamVang.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbTamTruTamVang.setForeground(new java.awt.Color(255, 255, 255));
        jlbTamTruTamVang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTamTruTamVang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-property-64.png"))); // NOI18N
        jlbTamTruTamVang.setText(" Tạm trú/Tạm vắng");

        javax.swing.GroupLayout jpnTamTruTamVangLayout = new javax.swing.GroupLayout(jpnTamTruTamVang);
        jpnTamTruTamVang.setLayout(jpnTamTruTamVangLayout);
        jpnTamTruTamVangLayout.setHorizontalGroup(
            jpnTamTruTamVangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTamTruTamVangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTamTruTamVang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        jpnTamTruTamVangLayout.setVerticalGroup(
            jpnTamTruTamVangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTamTruTamVangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTamTruTamVang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnPhatThuong.setBackground(new java.awt.Color(132, 180, 203));

        jlbPhatThuong.setBackground(new java.awt.Color(132, 180, 203));
        jlbPhatThuong.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbPhatThuong.setForeground(new java.awt.Color(255, 255, 255));
        jlbPhatThuong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbPhatThuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-antivirus-52.png"))); // NOI18N
        jlbPhatThuong.setText("   Phát thưởng");

        javax.swing.GroupLayout jpnPhatThuongLayout = new javax.swing.GroupLayout(jpnPhatThuong);
        jpnPhatThuong.setLayout(jpnPhatThuongLayout);
        jpnPhatThuongLayout.setHorizontalGroup(
            jpnPhatThuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhatThuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPhatThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnPhatThuongLayout.setVerticalGroup(
            jpnPhatThuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPhatThuongLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbPhatThuong)
                .addContainerGap())
        );

        jpnQLThuPhi.setBackground(new java.awt.Color(132, 180, 203));

        jlbQLThuPhi.setBackground(new java.awt.Color(132, 180, 203));
        jlbQLThuPhi.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbQLThuPhi.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLThuPhi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbQLThuPhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-hospital-3-64.png"))); // NOI18N
        jlbQLThuPhi.setText(" QL Thu phí");

        javax.swing.GroupLayout jpnQLThuPhiLayout = new javax.swing.GroupLayout(jpnQLThuPhi);
        jpnQLThuPhi.setLayout(jpnQLThuPhiLayout);
        jpnQLThuPhiLayout.setHorizontalGroup(
            jpnQLThuPhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLThuPhiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLThuPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQLThuPhiLayout.setVerticalGroup(
            jpnQLThuPhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLThuPhiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbQLThuPhi))
        );

        jpnThongKe.setBackground(new java.awt.Color(132, 180, 203));

        jlbThongKe.setBackground(new java.awt.Color(132, 180, 203));
        jlbThongKe.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-bar-chart-64.png"))); // NOI18N
        jlbThongKe.setText(" Thống kê");
        jlbThongKe.setToolTipText("");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbThongKe)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnPhatThuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHoKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTrangChu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTamTruTamVang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQLThuPhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnTrangChu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnTamTruTamVang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnPhatThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnQLThuPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(167, 199, 231));
        jpnView.setPreferredSize(new java.awt.Dimension(760, 760));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jlbHoKhau;
    private javax.swing.JLabel jlbNhanKhau;
    private javax.swing.JLabel jlbPhatThuong;
    private javax.swing.JLabel jlbQLThuPhi;
    private javax.swing.JLabel jlbTamTruTamVang;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnHoKhau;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnPhatThuong;
    private javax.swing.JPanel jpnQLThuPhi;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTamTruTamVang;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnTrangChu1;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
