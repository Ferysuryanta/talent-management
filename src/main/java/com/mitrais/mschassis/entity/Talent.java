package com.mitrais.mschassis.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "mst_talent")
public class Talent {

	@Id
	@GeneratedValue(generator = "talent_uuid")
	@GenericGenerator(name = "talent_uuid", strategy = "uuid")
	@Column(unique = true)
	private String id;
	private String name;
	private String group;
	private String jobFamily;
	private String officeBased;
	private String grade;
	@OneToMany(mappedBy = "talent")
	@JsonBackReference(value = "comments")
	@ToString.Exclude
	private Collection<Comment> comments = new ArrayList<>();
}