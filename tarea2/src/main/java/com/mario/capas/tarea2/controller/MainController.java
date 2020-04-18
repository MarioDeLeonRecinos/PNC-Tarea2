package com.mario.capas.tarea2.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		// http://localhost:8080/alumno
		String fname, lname, idcard, major, year;
		fname = "Mario";
		lname = "De León";
		idcard = "00353715";
		major = "Ing. Informatica";
		year = "4°";
		return "Nombre: " + fname + " Apellido: " + lname + " Carnet: " + idcard + " Carrera: " + major + " Año: "
				+ year;
	}

	@RequestMapping("/dia")
	public @ResponseBody String dia(HttpServletRequest request) {
		// http://localhost:8080/dia?dia=20&mes=4&anno=2020
		Integer dayInteger = Integer.parseInt(request.getParameter("dia"));
		Integer monthInteger = Integer.parseInt(request.getParameter("mes"));
		Integer yearInteger = Integer.parseInt(request.getParameter("anno"));
		LocalDate dLocalDate = LocalDate.of(yearInteger, monthInteger, dayInteger);
		return "Dia de la semana es " + dLocalDate.getDayOfWeek() + " para la fecha " + dLocalDate;
	}

}
