/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ry.id;

/**
 *
 * @author user
 */
import javax.swing.*;
public class RyId {
public static void main(String[] args) {
JFrame kotak;
kotak=new JFrame();
String name = JOptionPane.showInputDialog(kotak,"Input In your Name");
JOptionPane.showMessageDialog(kotak,"Wellcome To My Clas, "+name);
}
