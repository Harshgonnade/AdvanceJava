package com.cdac.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdac.training.springweb.model.Reservation;

@Controller
public class ReservationController {
	
	@GetMapping("/ticket")
	public String bookingForm(Model theModel) {
		Reservation res= new Reservation();
		theModel.addAttribute("reservation", res);
		return "reservation"; //it has reservation obj/attribute
	}
	
	@PostMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res)  
	{  
		
	    return "confirmation";   // returns confirmation.jsp + reservation object
	}  
	

}
