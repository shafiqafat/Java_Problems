package com.mycompany.employeemanagementsystem;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PrimaryController {
    
    

    @FXML
    private BorderPane BorderPane;
    @FXML
    private Pane topPane;
    @FXML
    private Pane mainPane;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Button SaveButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button resetButton;
    @FXML
    private Label Id;
    @FXML
    private TextField newID;
    @FXML
    private TextField newName;
    @FXML
    private TextArea newAddress;
    @FXML
    private TextField newPhone;

    String FileRead()
    {
        String text = "";
        try
        {
            FileReader fr = new FileReader("employee.txt");  
            int i;  
            while((i = fr.read()) != -1)  
                text += "" + (char)i;  
            fr.close(); 
        }
        catch(Exception err)
        {
             System.out.print("Error : "+err);
        }
        return text;
    }
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void doSave(ActionEvent event) {
        String msg = "";
        String newid = newID.getText();
        String newname = newName.getText();
        String newaddress = newAddress.getText() ;
        String newphone = newPhone.getText();
        
        //////////
        msg = newid + ";" + newname + ";" + newaddress + ";" + newphone;
        
        String oldText = FileRead();
        oldText += "\n"+msg;
        FileWrite(oldText);  
        
    }
    void FileWrite(String msg)
    {
        try
        {  
            FileWriter fw = new FileWriter("employee.txt");  
            fw.write(msg);  
            fw.close();  
        }
        catch(Exception e)
        {
            System.out.print("Error : "+e);
        } 
    }
    

    @FXML
    private void doDelete(ActionEvent event)
    {
        
    }

    @FXML
    private void doUpdate(ActionEvent event) {
        updateButton.setText(" ");
        String id = updateButton.getText();
        String text = FileRead();
        StringTokenizer st = new StringTokenizer(text, "\n");
        while(st.hasMoreTokens())
        {
            String line = st.nextToken();
            StringTokenizer newst = new StringTokenizer(line, ";");
            while(newst.hasMoreTokens())
            {
                String idfromline = newst.nextToken();
                if(idfromline.compareTo(id) == 0)
                {
                    String name = newst.nextToken();
                    String address = newst.nextToken();
                    String phone = newst.nextToken();
                    String msg = "Name : "+name+"\n";
                    msg += "Address : "+address+"\n";
                    msg += "Phone : "+phone;
                    updateButton.setText(msg);
                }
            }
        }
    }

    @FXML
    private void doReset(ActionEvent event) {
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
