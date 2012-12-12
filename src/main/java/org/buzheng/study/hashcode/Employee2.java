package org.buzheng.study.hashcode;

public class Employee2 {
	private Integer id;
	private String firstname;
	private String lastName;
	private String department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result
//				+ ((department == null) ? 0 : department.hashCode());
//		result = prime * result
//				+ ((firstname == null) ? 0 : firstname.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result
//				+ ((lastName == null) ? 0 : lastName.hashCode());
//		return result;
		
		return 10000;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee2)) {
			return false;
		}
		Employee2 other = (Employee2) obj;
		if (department == null) {
			if (other.department != null) {
				return false;
			}
		} else if (!department.equals(other.department)) {
			return false;
		}
		if (firstname == null) {
			if (other.firstname != null) {
				return false;
			}
		} else if (!firstname.equals(other.firstname)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		return true;
	}

	

//	@Override
//	public boolean equals(Object o) {
//		if (o == null) 
//			return false;
//		
//		if (o == this) 
//			return true;
//		
//		if (this.getClass() != o.getClass()) 
//			return false;
//		
//		Employee e = (Employee) o;
//		return this.getId() == e.getId();
//		
//	}
	
	
	
}