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

import pe.gob.edu.empssapal.core.domain.Eliminacionexedente;
import pe.gob.edu.empssapal.core.domain.Empalmered;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller


public class EmpalmealaredController {

	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Empalmealared/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Empalmealared/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Empalmealared", empssapalService.Empalmeredlist());
			request.getSession().setAttribute("menuHeader", "Empalmealared");
			return "Empalmealared/dashboard";
		}
		@RequestMapping(value = "Empalmealared/{IdEmpalmeRed}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdEmpalmeRed, Model model) {
			model.addAttribute("Empalmealared", empssapalService.FindIdEmpalmered(Integer.parseInt(IdEmpalmeRed)));
			return "Empalmealared/form";
		}
		
		@RequestMapping(value = "Empalmealared/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Empalmealared") Empalmered eliminacion,
				Model model) {	empssapalService.updateEmpalmered(eliminacion);
			return "redirect:/Empalmealared/dashboard";
		}
}
