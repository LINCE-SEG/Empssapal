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

import pe.gob.edu.empssapal.core.domain.Empalmered;
import pe.gob.edu.empssapal.core.domain.Excavacion;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class ExcavacionController {
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "Excavacion/dashboard", method = RequestMethod.GET)
		public String dashboard(Model model, HttpServletRequest request) {
			logger.info("::::::::::::Excavacion/dashboard:::::::::::::::" + empssapalService);
			model.addAttribute("listexcavacion", empssapalService.listarexcavacion());
//			model.addAttribute("listItem", resolucionService.ListarItem());

			request.getSession().setAttribute("menuHeader", "Excavacion");
			return "Excavacion/dashboard";
		}
		
		@RequestMapping(value = "Excavacion/{IdEscavacion}", method = RequestMethod.GET)
		public String getFormulario(@PathVariable String IdEscavacion, Model model) {
			model.addAttribute("Excavacion",
					empssapalService.FindIdExcavacion(Integer.parseInt(IdEscavacion)));
//					resolucionService.IdItemResolItem(Integer.parseInt(id)));
			return "Excavacion/form";
		}
		@RequestMapping(value = "Excavacion/actualizar", method = RequestMethod.POST)
		public String guardar(@ModelAttribute("Excavacion") Excavacion excava,
				Model model) {	empssapalService.UpdateExcavacion(excava);;
			return "redirect:/Excavacion/dashboard";
		}
		
}
