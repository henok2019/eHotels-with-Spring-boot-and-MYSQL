package com.hhhkk.eHotels.domains;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="ImgPath")
public class ImageModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	

	
	
	private String path;
	
	@ManyToOne
	@JoinColumn(name="hotelId",nullable=true)
	private Hotel hotelId;
}
