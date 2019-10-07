package day10;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	 Scanner sc = new Scanner(System.in);
	 static Random random = new Random();
	 static String [][]board = new String[3][3];
	 
	 public void play() {
		 reset();
		 for(int i=0;i<9;i++) {
			 if(i%2==0) {
				 System.out.println("\nComputer's chance..\n");
				 computerChance();
				 showBoard();
			 }
			 else {
				 System.out.println("\nUser's chance..\n");
				 userChance();
				 showBoard();
			 }
			 if(i>4) {
				 diagonalsCheck();
				 rowsCheck();
				 colsCheck();
			 }
		 }
	 }
	 
	 public void reset() {
		 
		 for(int i= 0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 board[i][j] = null;
			 }
		 }
		 showBoard();
		 System.out.println("\nComputer plays first with 'X'.... :\n");
	 }
	 
	 public void showBoard() {
		 for(int i=0; i<3; i++) {
			 for(int j=0; j<3; j++) {
				 System.out.print(board[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
	
	 public void computerChance() {
		 while(true) {
			 int row = random.nextInt(3);
		 	 int col = random.nextInt(3);
		 	 if(board[row][col]==null) {
			 	board[row][col]="X";
			 	break;
		 	}
		 }
	 }
	 
	 public void userChance() {
		 while(true) {
			 System.out.println("enter row number between 0 to 2");
			 int row = sc.nextInt();
			 if(row>2) {
				 System.out.println("\nINVALID INDEX; row should be between 0 to 2");
				 continue;
			 }
			 System.out.println("\nenter column number between 0 to 2");
		 	 int col = random.nextInt(3);
		 	if(row>2) {
				 System.out.println("\nINVALID INDEX; column should be between 0 to 2");
				 continue;
			 }
		 	 if(board[row][col]==null) {
			 	board[row][col]="O";
			 	break;
		 	}
		 }
	 }
	 
	 public void endChoice() {
		 int choice;
		 while(true) {
			 System.out.println("\n1. START NEW GAME.....");
			 System.out.println("\n2.EXIT........");
			 choice = sc.nextInt();
			 switch(choice) {
			 	case 1: 
			 		play();
			 		break;
			 	case 2:
			 		return;
			 	default:
			 		System.out.println("Incorrect choice......try again!!!!");
			 		break;
			 }
		 }
	 }
	 public void diagonalsCheck() {
		 if(board[0][0]==board[1][1]) {
			 if(board[0][0]==board[2][2]) {
				 if(board[0][0]=="X") {
					 System.out.println("\n\nComputer won::::::");
					 endChoice();
				 }
				 else {
					 System.out.println("User won:::::::");
					 endChoice();
				 }
			 }
		 }
		 if(board[0][2]==board[1][1]) {
			 if(board[0][2]==board[2][0]) {
				 if(board[0][0]=="X") {
					 System.out.println("\n\nComputer won::::::\n\n");
					 endChoice();
				 }
				 else {
					 System.out.println("User won:::::::\n\n");
					 endChoice();
				 }
			 }
		 }
	 }
	 
	 public void rowsCheck() {
		 for(int row=0;row<3;row++) {
			 int col=0;
			 if(board[row][col++]==board[row][col]) {
				 if(board[row][col++]==board[row][col]) {
					 if(board[row][col]=="X") {
						 System.out.println("\n\nComputer won::::::\n\n");
						 endChoice();
					 }
					 else {
						 System.out.println("User won:::::::\n\n");
						 endChoice();
					 }
				 }
			 }
		 }
	 }
	 
	 public void colsCheck() {
		 for(int col=0;col<3;col++) {
			 int row=0;
			 if(board[row++][col]==board[row][col]) {
				 if(board[row++][col]==board[row][col]) {
					 if(board[row][col]=="X") {
						 System.out.println("\n\nComputer won::::::\n\n");
						 endChoice();
					 }
					 else {
						 System.out.println("User won:::::::\n\n");
						 endChoice();
					 }
				 }
			 }
		 }
	 }
	 
	 public static void main(String [] args) {
	
		 TicTacToe t = new TicTacToe();
		 t.play();
		 
	 }
}
