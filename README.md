# Tower-Of-Hanoi-JavaSwings
<h3>This is a console-based implementation of the classic Tower of Hanoi game developed using Java. The Tower of Hanoi is a mathematical puzzle that involves three pegs and a number of disks of different sizes. The objective of the game is to move all the disks from the source peg to the target peg, using the auxiliary peg, following certain rules.
  <h1>Game Rules
    <h3>The rules of the Tower of Hanoi game are as follows:

<h3> -->Only one disk can be moved at a time.
<h3> -->Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty peg.
<h3> -->No disk may be placed on top of a smaller disk.
  <h1>Getting Started
    <h3>To run the Tower of Hanoi game, make sure you have Java Development Kit (JDK) installed on your system. You can download the latest JDK version from the official Oracle website.
      <h3> -->Clone or download this repository to your local machine.
<h3> -->Open a terminal or command prompt and navigate to the project directory.

<h3> -->Compile the Java source files using the following command:
  <h2> javac GameMain.java
    <h3>Run the game using the following command:
      <h2>java G  ameMain
        <h1>How to Play
          <h3>-->Upon starting the game, you will be prompted to enter the number of disks to use in the game.
<h3>-->Enter a positive integer to specify the number of disks. For example, entering "3" will create three disks for the game.
<h3>-->The game will display the initial state of the three pegs, with the disks represented by numbers, where smaller numbers indicate larger disks.
<h3>-->To make a move, enter the source peg and the target peg separated by a space. For example, entering "1 3" will move the top disk from peg 1 to peg 3.
<h3>-->Continue making moves until you successfully move all the disks to the target peg.
  <h1>Code Structure
    <h2>About.java
      <h4>This class represents the "About" page of the game. It provides information about the game, its objective, and any additional details or credits.
        <h2>FirstPage.java
          <h4>This class represents the first page or the welcome page of the game. It serves as the entry point for the game and provides options for the user to start the game or access other sections of the game.
            <h2>GameHold.java
              <h4>This class holds the current state of the game. It keeps track of the number of disks, the moves made, and the state of each peg. It also includes methods to update the game state based on user input and check for a winning condition.
                <h2>GameMain.java
                  <h4>This class serves as the main game controller. It initializes the game, handles user input, updates the game state, and displays the current state of the game on the console or graphical user interface.
                    <h2>HowToPlay.java
                      <h4>This class represents the "How to Play" section of the game. It provides instructions and rules for playing the Tower of Hanoi game.
                        <h2>MenuFrame.java
                          <h4>This class represents the graphical user interface (GUI) menu frame for the game. It provides buttons and options for the user to navigate through different sections of the game.
                            <h2>Tower.java
                              <h4>This class represents a single tower or peg in the game. It maintains a stack of disks and includes methods to manipulate the disks, such as adding a disk, removing a disk, and checking the top disk.
                                <h2>Contributions
                                  <h3>Contributions to this project are welcome. If you have any suggestions, improvements, or bug fixes, please feel free to submit a pull request or open an issue in the project repository.
                                    <h2>Team Members
                                      <h4>Aman Kumar
                                        <h4>Kanwaljot Singh
                                          <h4>Aditya Singh
