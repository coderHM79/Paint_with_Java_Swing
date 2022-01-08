package MHPaintClasses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

import MHPaintSetting.SettingForm;

public class BackgroundPanel extends JPanel {

	private Color shapeColor;

	private ToolBox Tools;
	private InfoPanel Infos;
	private DrawPanel Draw;

	private SettingForm set;

	// Left Attributes
	private JPanel leftPanel;
	private BufferedImage imgToolsName;
	private JButton jbtnToolsName;
	private BufferedImage imgSetting;
	public JButton jbtnSetting;

	// Center Attributes
	private JPanel centerPanel;
	private JPanel centerBack;

	// Right Attributes
	private JPanel rightPanel;
	private JPanel jpnlSpace;
	private JPanel jpnlColor;
	private BufferedImage imgInfoName;
	private JButton jbtnInfoName;
	private BufferedImage imgClearAll;
	private JButton jbtnClearAll;
	private BufferedImage imgColorPicker;
	private JButton jbtnColorPicker;

	public BackgroundPanel() throws IOException {
		super();
		this.setOpaque(true);
		this.setPreferredSize(new Dimension(MHMMain.GWIDTH, 605));
		if (MHMMain.Mode == 0)
			this.setBackground(new Color(206, 216, 231));
		else
			this.setBackground(new Color(36, 36, 36));
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		flow.setVgap(0);
		this.setLayout(flow);

		// pnlTitle = new MenusBackgroundPanel();
		Infos = new InfoPanel();
		Draw = new DrawPanel(Infos);
		Tools = new ToolBox(Draw);

		// this.add(pnlTitle);

		/////////////////////////////////////////////////////
		// >>>>>>>>>>>>>>>>>>>>>>>>>LEFT PANEL<<<<<<<<<<<<<<<<<<<<<<
		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(80, 596));
		leftPanel.setOpaque(false);
		leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(leftPanel);

		imgToolsName = ImageIO.read(new File("Images/Tools.png"));
		jbtnToolsName = new JButton(new ImageIcon(imgToolsName));
		jbtnToolsName.setPreferredSize(new Dimension(80, 80));
		jbtnToolsName.setMargin(new Insets(0, 0, -14, 18));
		jbtnToolsName.setBorderPainted(false);
		jbtnToolsName.setFocusPainted(false);
		jbtnToolsName.setContentAreaFilled(false);

		Space space = new Space();
		space.setPreferredSize(new Dimension(50, 55));

		imgSetting = ImageIO.read(new File("Images/SettingBW.png"));
		jbtnSetting = new JButton(new ImageIcon(imgSetting));
		jbtnSetting.setPreferredSize(new Dimension(50, 50));
		jbtnSetting.setMargin(new Insets(0, 10, 0, 0));
		jbtnSetting.setBorderPainted(false);
		jbtnSetting.setFocusPainted(false);
		jbtnSetting.setContentAreaFilled(false);
		jbtnSetting.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				set = new SettingForm(Draw);
				set.setVisible(true);

			}
		});
		jbtnSetting.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				jbtnSetting.setIcon(new ImageIcon("Images/SettingBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				jbtnSetting.setIcon(new ImageIcon("Images/Setting.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		leftPanel.add(jbtnToolsName);
		leftPanel.add(Tools);
		leftPanel.add(space);
		leftPanel.add(jbtnSetting);
		////////////////////////////////////////////////////

		/////////////////////////////////////////////////////
		// >>>>>>>>>>>>>>>>>>>>>>>>>CENTER PANEL<<<<<<<<<<<<<<<<<<<<<<
		centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(750, 596));
		centerPanel.setOpaque(false);
		centerPanel.setLayout(new FlowLayout());
		this.add(centerPanel);

		centerBack = new JPanel();
		centerBack.setPreferredSize(new Dimension(500, 150));
		centerBack.setOpaque(false);
		centerBack.setLayout(new FlowLayout());

		centerPanel.add(Draw);
		centerPanel.add(centerBack);
		////////////////////////////////////////////////////

		/////////////////////////////////////////////////////
		// >>>>>>>>>>>>>>>>>>>>>>>>>RIGHT PANEL<<<<<<<<<<<<<<<<<<<<<<
		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(350, 596));
		rightPanel.setOpaque(false);
		leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(rightPanel);

		imgInfoName = ImageIO.read(new File("Images/InformationTitle.png"));
		jbtnInfoName = new JButton(new ImageIcon(imgInfoName));
		jbtnInfoName.setPreferredSize(new Dimension(120, 80));
		jbtnInfoName.setMargin(new Insets(0, 0, -50, 18));
		jbtnInfoName.setBorderPainted(false);
		jbtnInfoName.setFocusPainted(false);
		jbtnInfoName.setContentAreaFilled(false);

		jpnlSpace = new JPanel();
		jpnlSpace.setPreferredSize(new Dimension(300, 120));
		jpnlSpace.setOpaque(false);
		jpnlSpace.setLayout(new FlowLayout());

		jpnlColor = new JPanel();
		jpnlColor.setPreferredSize(new Dimension(300, 70));
		jpnlColor.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpnlColor.setOpaque(false);

		imgClearAll = ImageIO.read(new File("Images/imgClearAllBW.png"));
		jbtnClearAll = new JButton(new ImageIcon(imgClearAll));
		jbtnClearAll.setPreferredSize(new Dimension(55, 70));
		jbtnClearAll.setMargin(new Insets(0, 0, 0, 0));
		jbtnClearAll.setBorderPainted(false);
		jbtnClearAll.setFocusPainted(false);
		jbtnClearAll.setContentAreaFilled(false);
		jbtnClearAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.Clear();
			}
		});
		jbtnClearAll.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				jbtnClearAll.setIcon(new ImageIcon("Images/imgClearAllBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				jbtnClearAll.setIcon(new ImageIcon("Images/imgClearAll.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		imgColorPicker = ImageIO.read(new File("Images/imgColorPickerBW.png"));
		jbtnColorPicker = new JButton(new ImageIcon(imgColorPicker));
		jbtnColorPicker.setPreferredSize(new Dimension(55, 70));
		jbtnColorPicker.setMargin(new Insets(0, 0, 0, 0));
		jbtnColorPicker.setBorderPainted(false);
		jbtnColorPicker.setFocusPainted(false);
		jbtnColorPicker.setContentAreaFilled(false);
		jbtnColorPicker.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shapeColor = JColorChooser.showDialog(null, "Select  a  color for shapes", Color.black);
				Draw.setShapeColor(shapeColor);
			}
		});
		jbtnColorPicker.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				jbtnColorPicker.setIcon(new ImageIcon("Images/imgColorPickerBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				jbtnColorPicker.setIcon(new ImageIcon("Images/imgColorPicker.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		jpnlColor.add(jbtnClearAll);
		jpnlColor.add(jbtnColorPicker);

		rightPanel.add(jbtnInfoName);
		rightPanel.add(Infos);
		rightPanel.add(jpnlSpace);
		rightPanel.add(jpnlColor);
		////////////////////////////////////////////////////

	}// end of Constructor

	public void DrawUndo() {
		Draw.Undo();
	}

	public void DrawRedo() {
		Draw.Redo();
	}

	public void Pencil() {
		Draw.setShapeTools(ShapeTools.Pencil);
	}

	public void PencilColorSize(Color c, int size) {
		Draw.setPenColorSize(c, size);
	}

}// end of Class
