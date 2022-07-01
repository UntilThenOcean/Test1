package com.company;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class QuizCardPlayer {

    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private  QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main (String[] args) {
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go();
    }

    public void go(){
        // create and display gui
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD,24);

        display = new JTextArea(10,20);
        display.setFont(bigFont);

        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        nextButton = new JButton("Show Question");
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(640, 500);
        frame.setVisible(true);


    }  // close go()

    public class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // display answer if it is a quiz
            // else display next quiz
            // change flag to know that we are already watching the quiz or answer
            if (isShowAnswer) {
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer = false;

            } else {
                if (currentCardIndex < cardList.size()) {
                    showNextCard();
                } else {
                    display.setText("That was last card");
                    nextButton.setEnabled(false);

                }
            }
        }
    }

        public class OpenMenuListener implements ActionListener {
            public void actionPerformed(ActionEvent ev) {
                // create file discuss frame
                // lets users open a card setting
                JFileChooser fileOpen = new JFileChooser();
                fileOpen.showOpenDialog(frame);
                loadFile((fileOpen.getSelectedFile()));
            }
        }

        private void loadFile(File file) {
            // create card ArrayList, and reading them from txt file
            // OpenMenuListener
            // tells makeCard() create a new card
            cardList = new ArrayList<QuizCard>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = reader.readLine())!=null) {
                    makeCard(line);
                }
                reader.close();
            }catch (Exception ex) {
                System.out.println("couldn't read the card file");
                ex.printStackTrace();
            }
        } // show the first card

        private void makeCard(String lineTopParse) {
            // LoadFile
            // create a new QuizCard, through CardList turn it into ArrayList
            String[] result  = lineTopParse.split("/");
            QuizCard card = new QuizCard(result[0], result[1]);
            cardList.add(card);
            System.out.println("made a card");
        }

        private void showNextCard() {
            currentCard = cardList.get(currentCardIndex);
            currentCardIndex++;
            display.setText(currentCard.getQuestion());
            nextButton.setText("Show Answer");
            isShowAnswer = true;
        }
    } // close class

