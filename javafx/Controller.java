//package javaapplication2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Controller {

    @FXML
    private TextArea textareaResult;// = new TextArea();    
    @FXML
    private Button button1;// = new Button();

    @FXML
    protected void handleButton1Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "1");
    }    
    @FXML
    protected void handleButton2Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "2");
    }
    @FXML
    protected void handleButton3Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "3");
    }    
    @FXML
    protected void handleButton4Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "4");
    }
    @FXML
    protected void handleButton5Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "5");
    }    
    @FXML
    protected void handleButton6Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "6");
    }
    @FXML
    protected void handleButton7Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "7");
    }
    @FXML
    protected void handleButton8Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "8");
    }    
    @FXML
    protected void handleButton9Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "9");
    }
    @FXML
    protected void handleButton0Press(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "0");
    }
    
    @FXML
    protected void handleButtonAddPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "+");
    }
    @FXML
    protected void handleButtonSubtractionPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "-");
    }
    @FXML
    protected void handleButtonMultiplicationPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "*");
    }
    @FXML
    protected void handleButtonDivisionPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "/");
    }
    @FXML
    protected void handleButtonPowPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "^");
    }
    @FXML
    protected void handleButtonModulePress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "%");
    }
    @FXML
    protected void handleButtonLeftBracketPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "(");
    }
    @FXML
    protected void handleButtonRightBracketPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + ")");
    }
    @FXML
    protected void handleButtonXPress(ActionEvent event) {                
        textareaResult.setText(textareaResult.getText() + "x");
    }
    
    @FXML
    protected void handleButtonClearPress(ActionEvent event) {                
        textareaResult.setText("");
    }
    
    @FXML
    protected void handleButtonEqualsPress(ActionEvent event) {
        /**/
        String[] rows = textareaResult.getText().split("\n");
        /**/
        //String oper = textareaResult.getText();
        String oper = rows[rows.length-1];
        /**/
        Expression e = new ExpressionBuilder(oper)
        .variables("x")
        .build()
        .setVariable("x", 1);
        double result = e.evaluate();
        /**/
        //textareaResult.setText(textareaResult.getText()+"\n"+result);
        textareaResult.appendText("\n" + String.valueOf(result));
        //textareaResult.appendText("\n");
        /**/
        
    }
    
}
