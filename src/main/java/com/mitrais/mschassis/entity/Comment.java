package com.mitrais.mschassis.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "mst_comment")
public class Comment {

	@Id
	@GeneratedValue(generator = "comment_uuid")
	@GenericGenerator(name = "comment_uuid", strategy = "uuid")
	@Column(unique = true)
	private String id;
	@ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value ={"comments"})
	private Talent talent;
	private Timestamp timestamp;
	private String createdBy;
	private String category;
	private String description;
	private String status;
}