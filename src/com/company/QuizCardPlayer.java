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
    }

    class NextCardListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            // display answer if it is a quiz
            // else display next quiz
            // change flag to know that we are already watching the quiz or answer
        }

        class OpenMenuListener implements ActionListener {
            public void actionPerformed(ActionEvent ev) {
                // create file discuss frame
                // lets users open a card setting
            }
        }

        private void loadFile(File file) {
            // create card ArrayList, and reading them from txt file
            // OpenMenuListener
            // tells makeCard() create a new card
        }

        private void makeCard(String lineTopParse) {
            // LoadFile
            // create a new QuizCard, through CardList turn it into ArrayList
        }
    }
}
