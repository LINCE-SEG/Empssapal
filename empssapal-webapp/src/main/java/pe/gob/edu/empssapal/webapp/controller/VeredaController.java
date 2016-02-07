package pe.gob.edu.empssapal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Tendido;
import pe.gob.edu.empssapal.core.domain.Vereda;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class VeredaController {
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Vereda/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Vereda/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Vereda", empssapalService.Veredalist());
			request.getSession().setAttribute("menuHeader", "Vereda");
			return "Vereda/dashboard";
		}
		@RequestMapping(value = "Vereda/{IdVereda}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdVereda, Model model) {
			model.addAttribute("Vereda", empssapalService.FindIdVereda(Integer.parseInt(IdVereda)));
			return "Vereda/form";
		}
		
		@RequestMapping(value = "Vereda/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Vereda") Vereda vereda,
				Model model) {	empssapalService.updateVereda(vereda);
			return "redirect:/Vereda/dashboard";
		}

}
