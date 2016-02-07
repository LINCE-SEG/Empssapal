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

import pe.gob.edu.empssapal.core.domain.Cajamedidor;
import pe.gob.edu.empssapal.core.domain.Cajaregistradora;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller
public class CajaRegistradoraController {
	protected Log logger = LogFactory.getLog(getClass());
	 @Autowired
	 private CamposaguaServiceImpl empssapalService;
		@RequestMapping(value = "CajaRegistradora/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::CajaRegistradora/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("CajaRegistradora", empssapalService.Cajaregistradoralist());
			request.getSession().setAttribute("menuHeader", "CajaRegistradora");
			return "CajaRegistradora/dashboard";
		}
		@RequestMapping(value = "CajaRegistradora/{IdCajaRegistradora}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdCajaRegistradora, Model model) {
			model.addAttribute("CajaRegistradora", empssapalService.FindIdCajaRegistradora(Integer.parseInt(IdCajaRegistradora)));
			return "CajaRegistradora/form";
		}
		@RequestMapping(value = "CajaRegistradora/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("CajaRegistradora") Cajaregistradora cajareg,
				Model model) {	empssapalService.updateCajaregistradora(cajareg);
			return "redirect:/CajaRegistradora/dashboard";
		}
}
