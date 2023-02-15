package com.test;

public class Employee{
	
	 
	    private Integer rank;
	    private String name;

		public Integer getRank() {
			return rank;
		}

		public void setRank(Integer rank) {
			this.rank = rank;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((rank == null) ? 0 : rank.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (rank == null) {
				if (other.rank != null)
					return false;
			} else if (!rank.equals(other.rank))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Employee [rank=" + rank + ", name=" + name + "]";
		}

		public Employee(Integer rank, String name) {
			super();
			this.rank = rank;
			this.name = name;
		}
		
		
	 
	  
		

}

