package com.mitrais.mschassis.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mst_comment")
public class Comment {

  @Id
  private String id;
  private String talentName;
  private Timestamp timestamp;
  private String createdBy;
  private String category;
  private String description;
  private String status;

}
