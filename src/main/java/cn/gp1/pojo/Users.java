package cn.gp1.pojo;

import javax.persistence.*;
@Entity
@Table(name="b_user")
public class Users {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column
		private Integer uid;
		@Column
		private String uname;
		@Column
		private String upwd;
		@Column
		private int state;
		@Column
		private String email;
		@Column
		private int age;
		@Column
		private int gender;
		
		
		@OneToOne(mappedBy="uid")
		private BorrowData bd;
		public Users() {
			super();
		}

		public Users(Integer uid, String uname, String upwd, int state, String email, int age, int gender) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.upwd = upwd;
			this.state = state;
			this.email = email;
			this.age = age;
			this.gender = gender;
		}

		public Integer getUid() {
			return uid;
		}

		public void setUid(Integer uid) {
			this.uid = uid;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getUpwd() {
			return upwd;
		}

		public void setUpwd(String upwd) {
			this.upwd = upwd;
		}

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getGender() {
			return gender;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Users [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", state=" + state + ", email=" + email
					+ ", age=" + age + ", gender=" + gender + "]";
		}
		
		
		
}
