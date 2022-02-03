package com.demo.jpacascaderemove.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	private int s_id;
	public Subject() {}	
	public Subject(int s_id, String name, int mark) {
			super();
			this.s_id = s_id;
			this.name = name;
			this.mark = mark;
		}
	public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMark() {
			return mark;
		}
		public void setMark(int mark) {
			this.mark = mark;
		}
	private String name;
	private int mark;
	}

