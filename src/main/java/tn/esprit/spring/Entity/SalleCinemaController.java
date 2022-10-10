package tn.esprit.spring.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SalleCinemaController {

	@Autowired
	private SalleCinemaImpl salleCinemaService ;
}
