package com.mitrais.mschassis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mst_talent")
public class Talent {

	  @Id
	  private String id;
	  private String name;
	  private String jobFamily;
	  private String officeBased;
}