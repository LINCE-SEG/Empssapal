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

import pe.gob.edu.empssapal.core.domain.Reposicion;
import pe.gob.edu.empssapal.core.domain.Rotura;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class RoturaController {
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Rotura/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Rotura/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Rotura", empssapalService.Roturalist());
			request.getSession().setAttribute("menuHeader", "Rotura");
			return "Rotura/dashboard";
		}
		@RequestMapping(value = "Rotura/{IdRotura}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdRotura, Model model) {
			model.addAttribute("Rotura", empssapalService.FindIdRotura(Integer.parseInt(IdRotura)));
			return "Rotura/form";
		}
		
		@RequestMapping(value = "Rotura/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Rotura") Rotura rotura,
				Model model) {	empssapalService.updateRotura(rotura);
			return "redirect:/Rotura/dashboard";
		}
		
		
}
