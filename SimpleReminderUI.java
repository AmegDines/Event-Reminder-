import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class SimpleReminderUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Reminder");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        reminderManager manager = new reminderManager();

        JTextField titleField = new JTextField(15);
        JTextField descField = new JTextField(15);
        JTextField dateField = new JTextField(10);
        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        JButton addBtn = new JButton("Add");

        frame.add(new JLabel("Title:"));
        frame.add(titleField);
        frame.add(new JLabel("Description:"));
        frame.add(descField);
        frame.add(new JLabel("Date (yyyy-mm-dd):"));
        frame.add(dateField);
        frame.add(addBtn);
        frame.add(new JScrollPane(outputArea));

        addBtn.addActionListener(e -> {
            try {
                String title = titleField.getText();
                String desc = descField.getText();
                LocalDate date = LocalDate.parse(dateField.getText());

                manager.addEvent(new Event(title, desc, date));
                titleField.setText("");
                descField.setText("");
                dateField.setText("");

                // Refresh output
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < manager.arr.size(); i++) {
                    Event ev = manager.arr.get(i);
                    sb.append((i + 1) + ". " + ev.getTitle() + " - " + ev.getDate() + "\n");
                }
                outputArea.setText(sb.toString());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input.");
            }
        });

        frame.setVisible(true);
    }
}
