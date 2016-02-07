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

import pe.gob.edu.empssapal.core.domain.Cajaregistradora;
import pe.gob.edu.empssapal.core.domain.Camaapoyo;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class CamaapoyoController {

	
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Camaapoyo/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Camaapoyo/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("Camaapoyo", empssapalService.Camaapoyolist());
			request.getSession().setAttribute("menuHeader", "Camaapoyo");
			return "Camaapoyo/dashboard";
		}

		@RequestMapping(value = "Camaapoyo/{IdCama}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdCama, Model model) {
			model.addAttribute("Camaapoyo", empssapalService.FindIdCamaapoyo(Integer.parseInt(IdCama)));
			return "Camaapoyo/form";
		}
		
		@RequestMapping(value = "Camaapoyo/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Camaapoyo") Camaapoyo cama,
				Model model) {	empssapalService.updatecamaapoyo(cama);
			return "redirect:/Camaapoyo/dashboard";
		}
}
