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

import pe.gob.edu.empssapal.core.domain.Relleno;
import pe.gob.edu.empssapal.core.domain.Reposicion;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class ReposicionController {

	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Reposicion/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Reposicion/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Reposicion", empssapalService.Reposicionlist());
			request.getSession().setAttribute("menuHeader", "Reposicion");
			return "Reposicion/dashboard";
		}
		
		@RequestMapping(value = "Reposicion/{IdReposicion}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdReposicion, Model model) {
			model.addAttribute("Reposicion", empssapalService.FindIdReposicion(Integer.parseInt(IdReposicion)));
			return "Reposicion/form";
		}
		
		@RequestMapping(value = "Reposicion/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Reposicion") Reposicion reposicion,
				Model model) {	empssapalService.updateReposicion(reposicion);
			return "redirect:/Reposicion/dashboard";
		}
}
