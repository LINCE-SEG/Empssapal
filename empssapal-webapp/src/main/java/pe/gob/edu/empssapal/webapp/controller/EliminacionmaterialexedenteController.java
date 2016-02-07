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

import pe.gob.edu.empssapal.core.domain.Camaapoyo;
import pe.gob.edu.empssapal.core.domain.Eliminacionexedente;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class EliminacionmaterialexedenteController {

	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Eliminacionmaterialexedente/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Eliminacionmaterialexedente/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Eliminacionmaterialexedente", empssapalService.Eliminacionexedentelist());
			request.getSession().setAttribute("menuHeader", "Eliminacionmaterialexedente");
			return "Eliminacionmaterialexedente/dashboard";
		}
		@RequestMapping(value = "Eliminacionmaterialexedente/{IdEliminacion}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdEliminacion, Model model) {
			model.addAttribute("Eliminacionmaterialexedente", empssapalService.FindIdEliminacionexedente(Integer.parseInt(IdEliminacion)));
			return "Eliminacionmaterialexedente/form";
		}
		
		@RequestMapping(value = "Eliminacionmaterialexedente/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Eliminacionmaterialexedente") Eliminacionexedente eliminacion,
				Model model) {	empssapalService.updateEliminacionexedente(eliminacion);
			return "redirect:/Eliminacionmaterialexedente/dashboard";
		}
}