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

import pe.gob.edu.empssapal.core.domain.Excavacion;
import pe.gob.edu.empssapal.core.domain.Pruebahidraulica;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class PruebahidrahulicaController {
	
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Pruebahidrahulica/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Pruebahidrahulica/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Pruebahidrahulica", empssapalService.PruebaHidraulicalist());
			request.getSession().setAttribute("menuHeader", "Pruebahidrahulica");
			return "Pruebahidrahulica/dashboard";
		}
		
		@RequestMapping(value = "Pruebahidrahulica/{IdPruebaHidraulica}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdPruebaHidraulica, Model model) {
			model.addAttribute("Pruebahidrahulica", empssapalService.FindIdPruebahidraulica(Integer.parseInt(IdPruebaHidraulica)));
			return "Pruebahidrahulica/form";
		}
		@RequestMapping(value = "Pruebahidrahulica/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Pruebahidrahulica") Pruebahidraulica excava,
				Model model) {	empssapalService.updatePruebahidraulica(excava);
			return "redirect:/Pruebahidrahulica/dashboard";
		}
		
		
}

	
	

