package de.unistuttgart.iaas.pse.ex07.p1;

/**
 * Represents a bank account. Allows to deposit and withdraw money.
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class BankAccount {

	double balance;

	public BankAccount (double i) {
		if (i < 0.0) {
			this.balance = 0.0;
		} else {
			this.balance = i;
		}
	}
	public void deposit (double j) {
		if (j > 0.0) {
			this.balance += j;
		}
	}
	public boolean withdraw (double k) {
		if (k > 0) {
			if (this.balance - k > 0) {
				this.balance -= k;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
