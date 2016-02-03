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

import pe.gob.edu.empssapal.core.domain.Pruebahidraulica;
import pe.gob.edu.empssapal.core.domain.Relleno;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller


public class RellenoController {

	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Relleno/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Relleno/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Relleno", empssapalService.Rellenolist());
			request.getSession().setAttribute("menuHeader", "Relleno");
			return "Relleno/dashboard";
		}
		
		@RequestMapping(value = "Relleno/{IdRelleno}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdRelleno, Model model) {
			model.addAttribute("Relleno", empssapalService.FindIdRelleno(Integer.parseInt(IdRelleno)));
			return "Relleno/form";
		}
		
		@RequestMapping(value = "Relleno/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Relleno") Relleno relleno,
				Model model) {	empssapalService.updateRelleno(relleno);
			return "redirect:/Relleno/dashboard";
		}
}
