package com.virtualpet.virtualpetspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/virtual-pet-spring-0.0.1-SNAPSHOT")
public class VirtualPetSpringController {

	LitterBox litterBox = new LitterBox();
	VirtualPetShelter shelter = new VirtualPetShelter(litterBox);

	@RequestMapping("/")
	public String landingPad(Model model) {
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/feed")
	public String feed(Model model) {
		shelter.tick();
		shelter.feed();
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/water")
	public String water(Model model) {
		shelter.tick();
		shelter.water();
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/play")
	public String play(@RequestParam(value = "name", required = false, defaultValue = "") String name, Model model) {
		shelter.tick();
		shelter.play(name);
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/walk")
	public String walk(Model model) {
		shelter.tick();
		shelter.walk();
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/oil")
	public String oil(Model model) {
		shelter.oilAllRobots();
		shelter.tick();
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/cleanCages")
	public String cleanCages(Model model) {
		shelter.tick();
		shelter.cleanCages();
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/emptyLitterBox")
	public String emptyLitterBox(Model model) {
		shelter.tick();
		shelter.emptyLitterBox();
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/restart")
	public String restart(Model model) {
		litterBox = new LitterBox();
		shelter = new VirtualPetShelter(litterBox);
		everyRequest(model);
		return "index";
	}

	@RequestMapping("/admit")
	public String admit(@RequestParam(value = "name", required = false, defaultValue = "") String name,
			@RequestParam(value = "description", required = false, defaultValue = "") String description,
			@RequestParam(value = "type", required = false, defaultValue = "OrganicDog") String type, Model model) {
		shelter.tick();
		if (type.equals("OrganicDog")) {
			shelter.add(new OrganicDog(name, description));
		} else if (type.equals("OrganicCat")) {
			shelter.add(new OrganicCat(name, description, litterBox));
		} else if (type.equals("RoboticDog")) {
			shelter.add(new RoboticDog(name, description));
		} else if (type.equals("RoboticCat")) {
			shelter.add(new RoboticCat(name, description));
		}
		everyRequest(model);
		return "index";
	}

	private void everyRequest(Model model) {
		model.addAttribute("shelter", shelter);
		model.addAttribute("Organic", Organic.class);
	}

}
