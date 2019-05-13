package com.paycheck.controller;

import com.paycheck.entity.Employee;
import com.paycheck.entity.Paycheck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    public Button openBtnId;

    @FXML
    public Button printPaycheckId;

    @FXML
    public TextField nameId;

    @FXML
    public DatePicker dateOfBirthId;

    @FXML
    public TextField addressId;

    @FXML
    public TextField yearsOfExperience;

    @FXML
    public TextField welcomeId;

    private Employee employee;

    public void printPaycheckBtnAction(ActionEvent event) {
        if(employee != null) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Paycheck");
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
            File file = fileChooser.showSaveDialog(null);
            if(file != null){
                SaveFile(employee.toString(), file);
            }
            System.out.println(employee.toString());
        }
    }



    private void SaveFile(String content, File file){
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) { }
    }


    public void openBtnAction(ActionEvent actionEvent) {
        if (nameId.getText().isEmpty() || addressId.getText().isEmpty() || yearsOfExperience.getText().isEmpty()) {
            welcomeId.setFont(new Font("System", 15));
            welcomeId.setText("Please input all fields");
            return;
        }


        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {

            welcomeId.setFont(new Font("System", 23));
            welcomeId.setText("Welcome!");

            List<String> strings = readFromFile(selectedFile);
            int experience = Integer.parseInt(yearsOfExperience.getText());
            String date = dateOfBirthId.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            employee = new Employee(nameId.getText(), date, addressId.getText(), experience);
            employee.setPaycheck(new Paycheck(findWage(strings, employee.getYearsOfExperience())));
        }


    }


    private List<String> readFromFile(File file) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    private int findWage(List<String> list, int experience) {
        int from;
        int to;
        int wage = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).contains("+")) {
                from = Integer.parseInt(list.get(i).substring(0, list.get(i).indexOf('+')).trim()); 

                wage = Integer.parseInt(list.get(i).substring(list.get(i).indexOf('$'), list.get(i).length()).replaceAll("[^0-9]", "").trim());
                break;
            } else {
                from = Integer.parseInt(list.get(i).substring(0, list.get(i).indexOf('–')).trim());
                to = Integer.parseInt(list.get(i).substring(list.get(i).indexOf('–') + 1, list.get(i).indexOf('$')).trim());
            }
            if ((experience >= from && experience <= to)) {
                wage = Integer.parseInt(list.get(i).substring(list.get(i).indexOf('$'), list.get(i).length()).replaceAll("[^0-9]", "").trim());
                break;
            }
        }
        return wage;
    }

}
