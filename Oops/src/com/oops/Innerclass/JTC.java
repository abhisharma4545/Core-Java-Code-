package com.oops.Innerclass;
// write a program to design a banking application as per the following instructions.......
// there are 4 different categories..
// 1. Saving Account,2.current account,3.loan , 4.Over draft..
//  (only saving account holder can apply for loan , and only current account holder can apply for Over draft

class SavingAcc{
	class Loan{
		void applyLoan() {
			Loan l1 = new Loan();
			System.out.println("Loan  section --");
		}
	}
	
}

class CuurentAcc{
	class OverDraft{
		void applyOverDraft() {
			OverDraft o1 = new OverDraft();
			System.out.println("OverDraft Section");
		}
		
	}
	
}
public class JTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAcc.Loan s1 =new SavingAcc(). new Loan();
		CuurentAcc.OverDraft  c1 = new CuurentAcc().new OverDraft();
		s1.applyLoan();
		c1.applyOverDraft();

	}

}
