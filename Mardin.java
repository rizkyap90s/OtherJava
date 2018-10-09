package kik;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class Mardin extends javax.swing.JFrame {
public Mardin() {
		initComponents();
	}
public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Mardin().setVisible(true);
			}
		});
	}
	@SuppressWarnings("unchecked")
class garis extends JPanel {
	public void paintComponent(Graphics garis) {
			super.paintComponent(garis);
			garis.setColor(Color.DARK_GRAY);
			garis.drawLine(10, 100, 150, 100);
		}
	}
class titik extends JPanel {
	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(80, 90, 81, 90);
		}
	}
class segiempat extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(30, 50, 100, 100);
	}
}
class segitiga extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		int[] x = {20, 80, 140};
		int[] y = {150, 40, 150};
		g.fillPolygon(x, y, 3);
	}
}
class bulat extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillOval(30, 45, 105, 105);
	}
}
class polygon extends JPanel {
	public void paintComponent(Graphics a) {
		super.paintComponent(a);
		int[] x = {25, 55, 115, 145, 115, 55};
		int[] y = {57, 7, 7, 57, 107, 107};
		a.setColor(Color.ORANGE);
		a.fillPolygon(x, y, 6);
	}
}
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		panel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		poligon = new javax.swing.JButton();
		sgTiga = new javax.swing.JButton();
		bulat = new javax.swing.JButton();
		kotak = new javax.swing.JButton();
		garis = new javax.swing.JButton();
		titik = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Membuat Bangun Datar");
		getContentPane().setLayout(null);
		jPanel1.setLayout(new java.awt.GridLayout(1, 0));
		getContentPane().add(jPanel1);
		jPanel1.setBounds(110, 398, 0, 0);
		panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		panel.setForeground(new java.awt.Color(255, 255, 0));
		panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
		jScrollPane1.setBorder(null);
		javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
		panel.setLayout(panelLayout);
		panelLayout.setHorizontalGroup(
				panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
		);
		panelLayout.setVerticalGroup(
				panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
		);
		getContentPane().add(panel);
		panel.setBounds(20, 20, 170, 200);
		poligon.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		poligon.setText("Polygon");
		poligon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				poligonActionPerformed(evt);
			}
		});
		getContentPane().add(poligon);
		poligon.setBounds(210, 195, 100, 25);
		sgTiga.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		sgTiga.setText("Segi Tiga");
		sgTiga.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sgTigaActionPerformed(evt);
			}
		});
		getContentPane().add(sgTiga);
		sgTiga.setBounds(210, 125, 100, 25);
		bulat.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		bulat.setText("Bulat");
		bulat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bulatActionPerformed(evt);
			}
		});
		getContentPane().add(bulat);
		bulat.setBounds(210, 160, 100, 25);
		kotak.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		kotak.setText("Segi Empat");
		kotak.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				kotakActionPerformed(evt);
			}
		});	
		getContentPane().add(kotak);
		kotak.setBounds(210, 90, 100, 25);
		garis.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		garis.setText("Garis");
		garis.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				garisActionPerformed(evt);
			}
		});
		getContentPane().add(garis);
		garis.setBounds(210, 55, 100, 25);
		titik.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		titik.setText("Titik");
		titik.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				titikActionPerformed(evt);
			}
		});
		getContentPane().add(titik);
		titik.setBounds(210, 20, 100, 25);
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width-354)/2, (screenSize.height-283)/2, 354, 283);
		}// </editor-fold>//GEN-END:initComponents
			private void poligonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poligonActionPerformed
				panel = new polygon();
				panel.repaint();
				jScrollPane1.setViewportView(panel);
				panel.setAutoscrolls(true);
			}//GEN-LAST:event_poligonActionPerformed
			private void sgTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgTigaActionPerformed
				panel = new segitiga();
				panel.repaint();
				jScrollPane1.setViewportView(panel);
				panel.setAutoscrolls(true);
			}//GEN-LAST:event_sgTigaActionPerformed
			private void bulatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulatActionPerformed
				panel = new bulat();
				panel.repaint();
				jScrollPane1.setViewportView(panel);
				panel.setAutoscrolls(true);
			}//GEN-LAST:event_bulatActionPerformed
			private void kotakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotakActionPerformed
				panel = new segiempat();
				panel.repaint();
				jScrollPane1.setViewportView(panel);
				panel.setAutoscrolls(true); // TODO add your handling code here:
			}//GEN-LAST:event_kotakActionPerformed
			private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
				panel = new titik();
				panel.repaint();
				jScrollPane1.setViewportView(panel);
				panel.setAutoscrolls(true);
			}//GEN-LAST:event_titikActionPerformed
			private void garisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garisActionPerformed
				panel = new garis();
				panel.repaint();
				jScrollPane1.setViewportView(panel);
				panel.setAutoscrolls(true);
			}//GEN-LAST:event_garisActionPerformed
// Variables declaration – do not modify//GEN-BEGIN:variables
private javax.swing.JButton bulat;
private javax.swing.JButton garis;
private javax.swing.JPanel jPanel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JButton kotak;
private javax.swing.JPanel panel;
private javax.swing.JButton poligon;
private javax.swing.JButton sgTiga;
private javax.swing.JButton titik;
// End of variables declaration//GEN-END:variables
}


