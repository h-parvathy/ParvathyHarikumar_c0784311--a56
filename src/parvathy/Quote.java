package parvathy;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Main Class has all the definitions
 */
public class Quote {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Option option; //Enum
    private Service service;
    private Item item;
    private Double serviceCost;
    private Double optionCost;
    private Double itemCost;
    private Double serviceHours;
    private Double optionDay;
    private Double itemBox;
    private Double totalCost;


    public Quote() {
//        this.userName = userName;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//        this.option = option;
//        this.service = service;
//        this.item = item;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return firstName;
    }

    public void setUserName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return lastName;
    }

    public void setPassword(String lastName) {
        this.lastName = lastName;
    }

    public Service getService() {
        return service;
    }

    public Option getOption() {
        return option;
    }

    public Item getItem() {
        return item;
    }


    public void setOption(Option option) {
        this.option = option;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setService(Service service) {
        this.service = service;
    }


    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Double getOptionCost() {
        return optionCost;
    }

    public void setOptionCost(Double optionCost) {
        this.optionCost = optionCost;
    }

    public Double getItemCost() {
        return itemCost;
    }

    public void setItemCost(Double itemCost) {
        this.itemCost = itemCost;
    }

    public Double getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(Double serviceHours) {
        this.serviceHours = serviceHours;
    }

    public Double getOptionDay() {
        return optionDay;
    }

    public void setOptionDay(Double optionDay) {
        this.optionDay = optionDay;
    }

    public Double getItemBox() {
        return itemBox;
    }

    public void setItemBox(Double itemBox) {
        this.itemBox = itemBox;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }


    public void validateCredentials() throws FileNotFoundException {
        JFrame fname;
        fname = new JFrame();
        int count = 3;
        boolean found = false;
        while (count>0){
            String username = JOptionPane.showInputDialog(fname, "Enter the username:");
            String pass = JOptionPane.showInputDialog(fname, "Enter the password:");
            String tempUsername = "";
            String tempPassword = "";
            while (!found) {
                tempUsername = "parvathy";
                tempPassword = "paaru339";
                System.out.println(tempPassword);

                if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(pass.trim())) {
                    found = true;
                    setUserName(username);
                    setPassword(pass);
                    break;
                }
                else {
                    JOptionPane.showMessageDialog(fname, "Wrong username or password.\n Please try again", "Alert", JOptionPane.WARNING_MESSAGE);
                    break;
                }
            }
            }
            count--;

        if (!found) {
            JFrame err;
            err = new JFrame();
            JOptionPane.showMessageDialog(err, "You have exceeded your try’s, goodbye.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }


    public void inputName(){
        JFrame name;
        name=new JFrame();
        String fName = JOptionPane.showInputDialog(name, "Enter your firstname:");
        String lName = JOptionPane.showInputDialog(name, "Enter your lastname:");
        setFirstName(fName);
        setLastName(lName);
    }

    public void inputChoice(){
        JFrame choice;
        choice=new JFrame();
        int input = JOptionPane.showConfirmDialog(null, "Do you want to enter Service hours?");
        System.out.println(input);
        if (input==0){
            String pack = JOptionPane.showInputDialog(choice, "What service did you use? \n Package A or Package B:");
            String Shours = JOptionPane.showInputDialog(choice, "Enter the hours of services worked.");
            setServiceHours(Double.parseDouble(Shours));
            if ((pack.toUpperCase(Locale.ROOT)).equals("A"))
                setService(Service.A);
            else setService(Service.B);
            }
        input = JOptionPane.showConfirmDialog(null, "Do you want to enter Storage Option?");
        System.out.println(input);

        if (input==0){
            String pack = JOptionPane.showInputDialog(choice, "What Storage option do you need? \n SMALL or LARGE:");
            String Shours = JOptionPane.showInputDialog(choice, "How many day do you need it for?");
            setOptionDay(Double.parseDouble(Shours));
            if ((pack.toUpperCase(Locale.ROOT)).equals("SMALL"))
                setOption(Option.SMALL);
            else setOption(Option.LARGE);
        }
        input = JOptionPane.showConfirmDialog(null, "Do you want to enter Items/Boxes size?");
        if (input==0){
            String pack = JOptionPane.showInputDialog(choice, "What box size do you need? \n SMALL or LARGE:");
            String box = JOptionPane.showInputDialog(choice, "How many boxes do you need it for?");
            setOptionDay(Double.parseDouble(box));
            if ((pack.toUpperCase(Locale.ROOT)).equals("SMALL"))
                setItem(Item.SMALL);
            else setItem(Item.LARGE);
        }
    }

    public void printServiceCost(){
        double cost = getServiceHours()*getService().getFinalService();
        setServiceCost(cost);
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Total Service Cost is: \n\t"
                +getServiceCost());
    }

    public void printItemCost(){
        double cost = getItemBox()*getItem().getFinalItem();
        setItemCost(cost);
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Total Item Cost is: \n\t"
                +getItemCost());
    }

    public void printOptionCost(){
        double cost = getOptionDay()*getOption().getFinalOption();
        setOptionCost(cost);
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Total Option Cost is: \n\t"
                +getOptionCost());
    }

    public void printTotalCost(){
        double total = getOptionCost()+getItemCost()+getServiceCost();
        setTotalCost(total);
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Hi " +getFirstName()+ " "+getLastName()+" !"+
                "Your Total Cost is: \n\t"
                +getTotalCost());

    }


}
