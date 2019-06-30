package sample3;

import javax.swing.JFrame;

public class Sample01 extends JFrame{

	private static final long serialVersionUID = 1L;

	/**
	 * 引数の和を返す。
	 * @param x
	 * @param y
	 * @return
	 */
	public static int tasizan(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		Sample01 frame = new Sample01();
		frame.setBounds(200, 200, 200, 150);
	}

}
