package exp3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test {
	// ���������
	private JFrame f = new JFrame("Calculator");
	// �������
	private JPanel inputPanel = new JPanel();
	// �Ӽ��˳����
	private JPanel operationPanel = new JPanel();
	// �������
	private JPanel buttonsPanel = new JPanel();
	// ���������ı���
	private JTextField input = new JTextField(20);
	// �˸��
	private JButton backspace = new JButton("BackSpace");
	// ���
	private JButton CE = new JButton("CE ");
	// ɾ��
	private JButton C = new JButton("C ");
	// ����������ż�
	private JButton add = new JButton("+");
	private JButton sub = new JButton("-");
	private JButton mul = new JButton("*");
	private JButton div = new JButton("/");
	// С����
	private JButton decimal = new JButton(".");
	// �Ⱥ�
	private JButton equal = new JButton("=");
	// ���ּ�
	private JButton zero = new JButton("0");
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private String num1 = "";// �����һ����������
	private String operator = "";// �����������

	public static void main(String[] args) {
		new Test();// new������ʵ��
	}

	public Test() {
		// ������������
		inputPanel.add(input);
		f.add(inputPanel, BorderLayout.NORTH);
		operationPanel.add(CE);
		operationPanel.add(C);
		operationPanel.add(backspace);
		operationPanel.setLayout(new GridLayout(1, 3, 5, 5));
		buttonsPanel.add(div);
		f.add(operationPanel, BorderLayout.CENTER);
		buttonsPanel.add(seven);
		buttonsPanel.add(eight);
		buttonsPanel.add(nine);
		buttonsPanel.add(mul);
		buttonsPanel.add(four);
		buttonsPanel.add(five);
		buttonsPanel.add(six);
		buttonsPanel.add(sub);
		buttonsPanel.add(one);
		buttonsPanel.add(two);
		buttonsPanel.add(three);
		buttonsPanel.add(add);
		buttonsPanel.add(zero);
		buttonsPanel.add(decimal);
		buttonsPanel.add(equal);
		buttonsPanel.setLayout(new GridLayout(4, 4, 5, 5));
		f.add(buttonsPanel, BorderLayout.SOUTH);
		// ע�������������¼�
		backspace.addMouseListener(new OperationMouseListener());
		CE.addMouseListener(new OperationMouseListener());
		C.addMouseListener(new OperationMouseListener());
		decimal.addMouseListener(new OperationMouseListener());
		equal.addMouseListener(new OperationMouseListener());
		// ע�������������
		add.addMouseListener(new CalcMouseListener());
		sub.addMouseListener(new CalcMouseListener());
		mul.addMouseListener(new CalcMouseListener());
		div.addMouseListener(new CalcMouseListener());
		// ע�����ּ����¼�
		zero.addMouseListener(new NumberMouseListener());
		one.addMouseListener(new NumberMouseListener());
		two.addMouseListener(new NumberMouseListener());
		three.addMouseListener(new NumberMouseListener());
		four.addMouseListener(new NumberMouseListener());
		five.addMouseListener(new NumberMouseListener());
		six.addMouseListener(new NumberMouseListener());
		seven.addMouseListener(new NumberMouseListener());
		eight.addMouseListener(new NumberMouseListener());
		nine.addMouseListener(new NumberMouseListener());
		f.setVisible(true);
		f.pack();
		f.setSize(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private class NumberMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			if (input.getText().trim().equals("0")) {// ����ı����Ѿ���0���������0
				input.setText(((JButton) e.getSource()).getText().trim());
			} else {// ����Ļ�����0��ӵ����棬Ʃ���ı�����1�������Ϊ10
				input.setText(input.getText().concat(((JButton) e.getSource()).getText().trim()));
			}
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}
	}

	private class CalcMouseListener implements MouseListener {
		// ����������������ţ������һ��������������
		public void mouseClicked(MouseEvent e) {
			num1 = input.getText().trim();
			input.setText("");
			operator = ((JButton) e.getSource()).getText().trim();
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}
	}

	private class OperationMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == backspace) {// �˸����ɾ��һ��ֱ��û���ַ�ɾ��
				String inputText = input.getText();
				if (inputText.length() > 0) {
					input.setText(inputText.substring(0, inputText.length() - 1));
				}
			} else if (e.getSource() == C) {
				input.setText("0");// C����������������ֺͷ���
				num1 = "";
			} else if (e.getSource() == CE) {
				input.setText("0");// CE-->���ı�����Ϊ0
			} else if (e.getSource() == decimal) {
				String text = input.getText().trim();
				// �������С���㣬����ı����Ѿ���С���㣬�����κβ����������ڽ���������С����
				if (text.indexOf(".") == -1) {
					input.setText(text.concat("."));
				}
			} else if (e.getSource() == equal) {
				// ����ǵȺ�
				if (!operator.trim().equals("")) {
					if (!input.getText().trim().equals("")) {
						double result = 0D;
						if (operator.equals("+")) {// ִ�мӷ�����
							result = Double.parseDouble(num1) + Double.parseDouble(input.getText().trim());
						} else if (operator.equals("-")) {// ��������
							result = Double.parseDouble(num1) - Double.parseDouble(input.getText().trim());
						} else if (operator.equals("*")) {// �˷�����
							result = Double.parseDouble(num1) * Double.parseDouble(input.getText().trim());
						} else if (operator.equals("/")) {// ��������
							result = Double.parseDouble(num1) / Double.parseDouble(input.getText().trim());
						}
						// ��ʽ�����ս����������λС����
						input.setText(new DecimalFormat("0.00").format(result));
					}
				}
			}
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}
	}
}
