package com.jtc.CollectionWorkbook;
//Example using Timer and TimerTask.....
import java.util.*;
 class Reminder {
		 Timer timer;
		  public Reminder(int seconds) {
			timer = new Timer();
			timer.schedule(new RemindTask(), seconds*1000);
		}
		  class RemindTask extends TimerTask{
			  @Override
			  public void run() {
				// TODO Auto-generated method stub
				  System.out.println("Time's up!");
//                  new Reminder(5);
				  timer.cancel();

			}
		  }
	}


public class Jtc13{
	public static void main(String[] args) {
		System.out.println("About to schedule task");
		new Reminder(5);
		System.out.println("Task Scheduled..");
	}
}

