# aidTec_Temperature_converter
Intern task
#PROCEDURE
step 1:import the necessary Java Swing classes and packages.
Step 2:Defined a class called TemperatureConverter that extends JFrame to create our GUI window.
Step 3:Inside the TemperatureConverter class, we declare several instance variables inputField,resultLabel,scaleComboBox,outputField.
Step 4:TemperatureConverter constructor initializes the GUI components:Sets the title of the window,Sets the default close operation to exit the application when the window is closed,Disables window resizing,Creates labels, buttons, and text fields using Swing components,Adds action listeners to the "Convert" and "Clear" buttons to handle their respective actions.
Step 5:"convertTemperature" method is called when the "Convert" button is clicked. It performs the temperature conversion based on the user input and the selected scale from the combo box.
Step 6:"clear" method is called when the "Clear" button is clicked. It resets the input and output fields, and the result label.
Step 7:"main" method creates an instance of the TemperatureConverter class and makes it visible by invoking the setVisible(true) method.


