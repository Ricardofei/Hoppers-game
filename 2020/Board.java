import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Board implements ActionListener {
	private static Square[] squArr = new Square[25];
	Square startSqu, endSqu;
	static int s1 = -1;
	static int s2 = -1;
    int step = 1;

    public Board() {
        JFrame frame = new JFrame("Game");

		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);

		placeComponets(panel);

		frame.setVisible(true);
    }

    void placeComponets(JPanel panel) {
        
    
    GridLayout gl = new GridLayout(5, 5);
    panel.setLayout(gl);

    for (int i=0; i<squArr.length; i++){
        int row = i / 5;
        int col = i % 5;
        String info = "";
       info = Square.Water;
        if(i==4){
        info= Square.GreenFrog;}
        if ((row + col) % 2 != 0)
				squArr[i] = new Square(i, info);
            else{
				squArr[i] = new Square(i, Square.LilyPad);
            }
            
           
           
               

            squArr[i].getBtn().addActionListener(this);
			squArr[i].getBtn().setActionCommand(i + "");
			panel.add(squArr[i].getBtn());
    }
    
}

public void actionPerformed(ActionEvent e) {
    
		int num = Integer.parseInt(e.getActionCommand());
	if (squArr[num].getInfo().equals(Square.GreenFrog)) {
            squArr[num].setInfo(Square.GreenFrog2);
        } else if (squArr[num].getInfo().equals(Square.GreenFrog2)) {
            squArr[num].setInfo(Square.GreenFrog);
        }

        else if (squArr[num].getInfo().equals(Square.LilyPad)) {

            if (0 <= num - 12 && num + 12 >= 24) {

                if (squArr[num - 12].getInfo().equals(Square.GreenFrog2)) {
                    if (squArr[num - 6].getInfo().equals(Square.GreenFrog)) {
                        squArr[num - 12].setInfo(Square.LilyPad);
                        squArr[num].setInfo(Square.GreenFrog);
                        squArr[num - 6].setInfo(Square.LilyPad);

                    }
                } else if (squArr[num + 12].getInfo().equals(Square.GreenFrog2)) {
                    if (squArr[num + 6].getInfo().equals(Square.GreenFrog)) {
                        squArr[num + 12].setInfo(Square.LilyPad);
                        squArr[num].setInfo(Square.GreenFrog);
                        squArr[num + 6].setInfo(Square.LilyPad);

                    }
                } else if (squArr[num - 8].getInfo().equals(Square.GreenFrog2)) {
                    if (squArr[num - 4].getInfo().equals(Square.GreenFrog)) {
                        squArr[num - 8].setInfo(Square.LilyPad);
                        squArr[num].setInfo(Square.GreenFrog);
                        squArr[num - 4].setInfo(Square.LilyPad);

                    }
                } else if (squArr[num + 8].getInfo().equals(Square.GreenFrog2)) {
                    if (squArr[num + 4].getInfo().equals(Square.GreenFrog)) {
                        squArr[num + 8].setInfo(Square.LilyPad);
                        squArr[num].setInfo(Square.GreenFrog);
                        squArr[num + 4].setInfo(Square.LilyPad);

                    }

                }
            }else if(0<=num-8&&num+8<=24){
             

                    if (squArr[num - 12].getInfo().equals(Square.GreenFrog2)) {
                        if (squArr[num - 6].getInfo().equals(Square.GreenFrog)) {
                            squArr[num - 12].setInfo(Square.LilyPad);
                            squArr[num].setInfo(Square.GreenFrog);
                            squArr[num - 6].setInfo(Square.LilyPad);
    
                        }
                    } else if (squArr[num + 12].getInfo().equals(Square.GreenFrog2)) {
                        if (squArr[num + 6].getInfo().equals(Square.GreenFrog)) {
                            squArr[num + 12].setInfo(Square.LilyPad);
                            squArr[num].setInfo(Square.GreenFrog);
                            squArr[num + 6].setInfo(Square.LilyPad);
    
                        }
                    } else if (squArr[num - 8].getInfo().equals(Square.GreenFrog2)) {
                        if (squArr[num - 4].getInfo().equals(Square.GreenFrog)) {
                            squArr[num - 8].setInfo(Square.LilyPad);
                            squArr[num].setInfo(Square.GreenFrog);
                            squArr[num - 4].setInfo(Square.LilyPad);
    
                        }
                    } else if (squArr[num + 8].getInfo().equals(Square.GreenFrog2)) {
                        if (squArr[num + 4].getInfo().equals(Square.GreenFrog)) {
                            squArr[num + 8].setInfo(Square.LilyPad);
                            squArr[num].setInfo(Square.GreenFrog);
                            squArr[num + 4].setInfo(Square.LilyPad);
    
                        }
    
                    }
                
            }
        }
		
}


}
    
