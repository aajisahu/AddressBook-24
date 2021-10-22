package com.bridgelabz.stream;

import java.util.Comparator;

/*
 * method to sort by city
 */
public class Sort {
	static Comparator<Contacts> compareCity = new Comparator<Contacts>() {
		public int compare(Contacts one, Contacts two) {
			return one.getCity().compareTo(two.getCity());
		}
	};
	/*
	 * Method to State search
	 */
	static Comparator<Contacts> compareState = new Comparator<Contacts>() {
        public int compare(Contacts one, Contacts two) {
            return one.getState().compareTo(two.getState());
        }
    };
}