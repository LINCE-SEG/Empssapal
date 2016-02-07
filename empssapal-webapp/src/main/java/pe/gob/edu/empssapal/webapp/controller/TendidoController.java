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

import pe.gob.edu.empssapal.core.domain.Rotura;
import pe.gob.edu.empssapal.core.domain.Tendido;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class TendidoController {
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Tendido/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Tendido/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Tendido", empssapalService.Tendidolist());
			request.getSession().setAttribute("menuHeader", "Tendido");
			return "Tendido/dashboard";
		}
		
		@RequestMapping(value = "Tendido/{IdTendido}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdTendido, Model model) {
			model.addAttribute("Tendido", empssapalService.FindIdTendido(Integer.parseInt(IdTendido)));
			return "Tendido/form";
		}
		
		@RequestMapping(value = "Tendido/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Tendido") Tendido tendido,
				Model model) {	empssapalService.updateTendido(tendido);
			return "redirect:/Tendido/dashboard";
		}

}
