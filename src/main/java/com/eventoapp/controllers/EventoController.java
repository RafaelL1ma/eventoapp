package com.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.eventosapp.repository.EventoRepository;
import com.eventoapp.models.Evento;


@Controller
public class EventoController {
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarevento", method=RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}
	@RequestMapping(value="/cadastrarevento", method=RequestMethod.POST)
	public String form(Evento evento) {
		
		er.save(evento);
		
		return "redirect:/cadastrarevento";
	}
}
