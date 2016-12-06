/**
 * 
 */
package com.mycompany.myapp.mycomponent;

/**
 * @author paran
 *
 */
public class Professor extends PersonBase {
	//public class Professor extends PersonBase implements Person {
		private String  title;
		
		public Professor(String _name, Integer _age, String _title) {
			super(_name, _age);
			setTitle(_title);
		}
		
		/* (non-Javadoc)
		 * @see com.mycompany.myapp.mycomponent.Person#getName()
		 */
		@Override
		public String getName() {
			return "Prof: " + super.getName();
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}


	}
