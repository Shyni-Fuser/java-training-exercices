package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IPeople;

/**
 * Created by Nicolas Zozol on 05/10/2016.
 */
public class People implements IPeople {

	int birthday;
    public void setBirthday(int date) {
        this.birthday = date;
    }

    public int getBirthday() {
        return this.birthday;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthday;
		return result;
	}

	@Override
	public boolean equals(IPeople obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (birthday != other.birthday)
			return false;
		return true;
	}
}
