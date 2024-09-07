This is a Java-based Computer Based Test (CBT) application that allows users to answer a series of multiple-choice questions. The program features a graphical user interface (GUI) built using the Java Swing library, with functionalities like question navigation, bookmarking, and result calculation based on user performance.

* Features \
**Multiple Choice Questions**: The user can answer a series of 10 questions, each with four options.
**Next Button**: Progress to the next question.
**Bookmark Button**: Bookmark a question to revisit it later.
**Result Calculation**: The user will see a result (PASS or FAIL) based on the number of correct answers. A passing score requires at least 4 correct answers.
**User-Friendly Interface**: The GUI is clean and intuitive, built using Java Swing.

* How It Works\
**Question Display**: The application presents questions one by one, with four radio buttons for selecting answers.\
**Next Button**: After answering a question, the user clicks the "Next" button to proceed to the next one.\
**Bookmarking**: Users can click "Bookmark" to mark a question they want to revisit later. A new button is created for each bookmark.\
**Final Result**: Once the user has answered all the questions, they can view their result. If they score 4 or more correct answers, they pass; otherwise, they fail.

* Code Structure\
**Main Class**: cbt is the main class that extends JFrame and implements ActionListener to manage user interactions.\
**GUI Elements**: The GUI is constructed using JLabel for displaying questions, JRadioButton for the options, and JButton for "Next" and "Bookmark".\
**Event Handling**: The actionPerformed method handles all button events, navigating between questions and managing bookmarks.\
**Question Logic**: The set() method sets the question text and options, while the check() method evaluates whether the selected answer is correct.

* Prerequisites\
Java Development Kit (JDK) 8 or above.\
An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.

* How to Run\
Clone or download the repository.\
Open the project in your preferred Java IDE.\
Run the cbt.java file.\
The GUI will launch, and you can start answering questions.\
Answer the multiple-choice questions.\
Use the "Next" button to go to the next question.\
Bookmark any question you want to review later by clicking the "Bookmark" button.\
After the last question, view your score and result.
