package guessingmusic;

import java.awt.*; //그래픽 처리 클래스 경로설정
import java.awt.event.*; //AWT이벤트 사용을 위한 경로설정
import java.util.ArrayList;

import javax.swing.*; //Swing컴포넌트 클래스들의 경로설정

public class GuessingMusic extends JFrame implements ActionListener, MouseListener, KeyListener{
	
	String [] musiclist = {"친구","이별택시","achoo",
			"사랑안해","썸탈거야","liarliar","tt"};

	int index = 0;
	
	private JFrame frame; // 최상위 컨테이너 // 컨테이너 최소1개
	private JPanel[] panel = new JPanel[10]; // 사용할 panel의 개수
	private JButton []buttons = new JButton[10];
	private JLabel TitleLB, InputBar,Answer, Wrong; // 컴포넌트
	private JTextField[] jtfield = new JTextField[1]; // 컴포넌트
	private JPanel CardPanel = new JPanel();
	private CardLayout card = new CardLayout();
	MusicPlayer MP3 = new MusicPlayer("music", true);
	//MusicPlayer RMP = new MUsicPlayer(,true);
	
	ArrayList<MusicPlayer> player = new ArrayList<MusicPlayer>();
	//List<String> list = Arrays.asList(musiclist);			



	public GuessingMusic() {

		for(int i = 0 ; i < musiclist.length ; i++) {
			player.add(new MusicPlayer(musiclist[i],false));
		}
		/////////////////////////////////////////////////////// @@PANEL@@////////////////////////////////////////////////////////////////////////

		panel[0] = new JPanel() { // panel에 들어가는 background
			ImageIcon i = new ImageIcon("src/img/guessing_music_background.jpg");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};

		panel[1] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/music_listning.jpg");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};

		panel[2] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/answer_background.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};
		
		panel[3] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/answer_background.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};
		
		
		panel[4] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/Thxforplaying.jpg");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};
		panel[5] = new JPanel() {	//info_1 panel
			ImageIcon i = new ImageIcon("src/img/info_1.png");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 794, 565, null);
			}
		};
		panel[6] = new JPanel() {	//info_2 panel
			ImageIcon i = new ImageIcon("src/img/info_2.png");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 794, 565, null);
			}
		};
		///////////////////////////////////////////////////// @@PANEL@@ /////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////// @@LABEL@@ /////////////////////////////////////////////////////////////////////
		TitleLB = new JLabel() {
			ImageIcon i = new ImageIcon("src/img/guessing_game_logo.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 295, 155, null);
			}
		};
		InputBar = new JLabel() {
			ImageIcon i = new ImageIcon("src/img/input_bar.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 289, 32, null);
			}
		};
		
		Answer = new JLabel() {
			ImageIcon i = new ImageIcon("src/img/answer_label.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 354, 284, null);
			}
		};
		Wrong = new JLabel() {
			ImageIcon i = new ImageIcon("src/img/answer_wrong.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 354, 284, null);
			}
		};
		///////////////////////////////////////////////////// @@LABEL@@ /////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////////////////////////// @@BUTTONS@@ ////////////////////////////////////////////////////////////////////
		buttons[0] = new JButton("Start") { // start button
			ImageIcon i = new ImageIcon("src/img/startbutton.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 318, 120, null);
			}
		};

		buttons[1] = new JButton("info") { // information button
			ImageIcon i = new ImageIcon("src/img/Information-icon.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 70, 70, null);
			}
		};
		
		buttons[2] = new JButton("play") { // play music button
			ImageIcon i = new ImageIcon("src/img/playbutton2.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 147, 147, null);
			}
		};
		
		buttons[3] = new JButton("ExitWhite") { // Exit button with White background 
			ImageIcon i = new ImageIcon("src/img/Exit_White.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[4] = new JButton("ExitBlack") { // Exit button
			ImageIcon i = new ImageIcon("src/img/Exit_Black.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[5] = new JButton("Retry") { // Retry button
			ImageIcon i = new ImageIcon("src/img/RetryButton.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[6] = new JButton("Retry") { // Retry button
			ImageIcon i = new ImageIcon("src/img/RetryButton.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[7] = new JButton("next") { // Next Information button
			ImageIcon i = new ImageIcon("src/img/next_button.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[8] = new JButton("Start_info") { // Next Information button
			ImageIcon i = new ImageIcon("src/img/startbutton_info.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 238, 42, null);
			}
		};
		//////////////////////////////////////////////////// @@BUTTONS@@ ////////////////////////////////////////////////////////////////////

		// frame 영역

		add(CardPanel);
		setTitle("Guessing Music!");
		setSize(800, 600); // 화면 해상도
		setResizable(false); // 화면 크기 고정
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		MP3.start();

		// end of frame

		////////////////////////////////////////////BUTTON AREA/////////////////////////////////////////////////
		buttons[0].setBounds(350, 450, 318, 120);// start button 위치 및 크기
		buttons[0].setContentAreaFilled(false); // 이미지의 배경을 투명하게 만듦
		buttons[0].setBorderPainted(false);
		buttons[0].addActionListener(this);
		buttons[0].setFocusPainted(false);
		
		buttons[0].addMouseListener(this);

		buttons[1].setBounds(700, 480, 70, 70); // info buttonW
		buttons[1].setContentAreaFilled(false);
		buttons[1].setBorderPainted(false);
		buttons[1].addActionListener(this);
		
		buttons[1].addMouseListener(this);

		buttons[2].setBounds(100, 350, 147, 147); // music player button
		buttons[2].setContentAreaFilled(false);
		buttons[2].setBorderPainted(false);
		buttons[2].addActionListener(this); // 이벤트 리스너 등록
		buttons[2].setFocusPainted(false);
		
		buttons[2].addMouseListener(this);
		
		buttons[3].setBounds(740, 0, 64, 64); // Exit button
		buttons[3].setContentAreaFilled(false);
		buttons[3].setBorderPainted(false);
		buttons[3].addActionListener(this); // 이벤트 리스너 등록
		buttons[3].setFocusPainted(false);
		
		buttons[3].addMouseListener(this);
		
		buttons[4].setBounds(740, 0, 64, 64); // Exit button
		buttons[4].setContentAreaFilled(false);
		buttons[4].setBorderPainted(false);
		buttons[4].addActionListener(this); // 이벤트 리스너 등록
		buttons[4].setFocusPainted(false);
		
		buttons[4].addMouseListener(this);
		
		//같은버튼 다른panel에 사용하기 위해
		buttons[5].setBounds(732, 500, 64, 64); // Retry button
		buttons[5].setContentAreaFilled(false);
		buttons[5].setBorderPainted(false);
		buttons[5].addActionListener(this); // 이벤트 리스너 등록
		buttons[5].addMouseListener(this);
		buttons[6].setBounds(732, 500, 64, 64); // Retry button
		buttons[6].setContentAreaFilled(false);
		buttons[6].setBorderPainted(false);
		buttons[6].addActionListener(this); // 이벤트 리스너 등록
		buttons[6].setFocusPainted(false);
		
		buttons[5].setFocusPainted(false);
		buttons[6].addMouseListener(this);
		
		buttons[7].setBounds(700, 250, 64, 64); // Retry button
		buttons[7].setContentAreaFilled(false);
		buttons[7].setBorderPainted(false);
		buttons[7].addActionListener(this); // 이벤트 리스너 등록
		buttons[7].setFocusPainted(false);
		
		buttons[8].setBounds(68, 180, 238, 42); // startbutton in infomation button
		buttons[8].setContentAreaFilled(false);
		buttons[8].setBorderPainted(false);
		buttons[8].addActionListener(this); // 이벤트 리스너 등록
		buttons[8].setFocusPainted(false);
		
		////////////////////////////////////////////BUTTON AREA/////////////////////////////////////////////////

		
		// TitleLB.setLayout(null);
		TitleLB.setBounds(300, 100, 295, 155);// guessing music logo 절대위치 지정
		InputBar.setBounds(50, 520, 289, 32);
		Answer.setBounds(225,145,354,284);
		Wrong.setBounds(225,145,354,284);
		//label end
		panel[0].add(TitleLB);
		panel[0].add(buttons[0]); // start button
		panel[0].add(buttons[1]);
		panel[0].add(buttons[3]);
		panel[0].setLayout(null);// <-- 모든 컨테이너들은 디폴트 레이아웃이 있어서 이를 제거


		panel[1].add(buttons[2]);
		panel[1].add(buttons[4]);
		panel[1].setLayout(null);

		panel[1].add(jtfield[0] = new JTextField(40));
		jtfield[0].setText("여기에 정답을 입력하세요!");
		jtfield[0].requestFocus();
		jtfield[0].setBounds(90,520,180,20);
		jtfield[0].addActionListener(this);
		jtfield[0].addMouseListener(this);
		jtfield[0].addKeyListener(this);
		
		panel[2].add(Answer);
		panel[2].add(buttons[5]);
		panel[2].setLayout(null);
		
		panel[3].add(Wrong);
		panel[3].add(buttons[6]);
		panel[3].setLayout(null);
		
		panel[4].setLayout(null);
		
		panel[5].setLayout(null);
		panel[5].add(buttons[7]);
		
		panel[6].add(buttons[8]);
		panel[6].setLayout(null);
		
		CardPanel.setLayout(card); // 카드레이아웃 사용
		CardPanel.add(panel[0], "main");
		CardPanel.add(panel[1], "start");
		CardPanel.add(panel[2], "answer");
		CardPanel.add(panel[3], "wrong");
		CardPanel.add(panel[4], "end");
		CardPanel.add(panel[5], "info_1");
		CardPanel.add(panel[6], "info_2");
		CardPanel.setFocusable(true);	//해줘야 리스너~어쩌구
		CardPanel.addKeyListener(this);
		CardPanel.addMouseListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")) {
			try {
				card.show(CardPanel, "start");
	               //void next(Container parent): 주어진 컨테이너에 포함된 다음 카드를 보여줍니다.
	               //void first(Container parent): 주어진 컨테이너에 포함된 첫 번째 카드를 보여줍니다.
	               //void last(Container parent): 주어진 컨테이너에 포함된 마지막 번째 카드를 보여줍니다.
	               //void previous(Container parent): 주어진 컨테이너에 포함된 이전 카드를 보여줍니다.
	               //void show(Container parent, String name): 주어진 컨테이너에 포함된 컴포넌트 중 주어진 이름을 가진 컴포넌트로 전환합니다(보여줍니다).
				MP3.close();//close the background music
				//MP3.suspend();
			} catch (Exception e2) {		
			}
		} else if (e.getActionCommand().equals("info")) {
				card.show(CardPanel, "info_1");
		} else if (e.getActionCommand().equals("next")) {
				card.show(CardPanel, "info_2");
		} else if (e.getActionCommand().equals("Start_info")) {
				card.first(CardPanel);
		} else if (e.getActionCommand().equals("play")) {
				player.get(index).start();
			//MP3.resume();
		} else if(e.getActionCommand().equals("ExitWhite")||e.getActionCommand().equals("ExitBlack")) {
			try {
				System.exit(0);
			} catch (Exception e2) {}
		} else if(e.getActionCommand().equals("Retry")) {			
			if(index<musiclist.length) {
				card.show(CardPanel, "start");
				index++;
				jtfield[0].setText("본 문제는 총 7문제 입니다!");
			}if(index==7){
				card.show(CardPanel, "end");
			}
		}
	}

	//CardPanel로 작동시켜야함
	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			if(e.getSource()==jtfield[0]) {
				jtfield[0].setText("");
			}/*else if(e.getSource()==buttons[2]) {
				
			//	MP3.start();

			}*/
		} catch (Exception e2) {
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

		
		
	}

	//////////////////Mouse Event Start//////////////////
	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	////////////////////Key Event Start//////////////////
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			player.get(index).close();
			if(jtfield[0].getText().equals(musiclist[index].toString())) {
				card.show(CardPanel, "answer");
			}else
				card.show(CardPanel, "wrong");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
