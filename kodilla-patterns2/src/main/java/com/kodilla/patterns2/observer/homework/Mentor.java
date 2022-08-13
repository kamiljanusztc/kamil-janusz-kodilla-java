package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private final String mentor;
    private int updateCount;

    public Mentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void update(StudentTask studentTasks) {
        System.out.println(mentor + ": New messages in topic " + studentTasks.getStudent() + "\n" +
                " (total: " + studentTasks.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getMentor() {
        return mentor;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
