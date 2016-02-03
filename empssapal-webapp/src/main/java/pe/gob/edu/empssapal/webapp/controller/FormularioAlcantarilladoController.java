package pe.gob.edu.empssapal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Camposagua;
import pe.gob.edu.empssapal.core.domain.Camposalcantarillado;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class FormularioAlcantarilladoController {
	protected Log logger = LogFactory.getLog(getClass());
	
	 @Autowired
	 private CamposaguaServiceImpl empssapalService;
	 //cargar los formularios
	@RequestMapping(value = "FormularioAlcantarillado/dashboard6", method = RequestMethod.GET)
	public String dashboard6(Model model) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard6:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAlcantarillado");
		model.addAttribute("FormularioAlcantarillado", new Camposalcantarillado());
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme6alcantarillado());
		return "FormularioAlcantarillado/dashboard6";
	}
	
	@RequestMapping(value = "FormularioAlcantarillado/dashboard160", method = RequestMethod.GET)
	public String dashboard160(Model model) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard160:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAlcantarillado");
		model.addAttribute("FormularioAlcantarillado", new Camposalcantarillado());
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme160alcantarillado());
		return "FormularioAlcantarillado/dashboard160";
	}
	
	@RequestMapping(value = "FormularioAlcantarillado/dashboard200", method = RequestMethod.GET)
	public String dashboard200(Model model) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard200:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAlcantarillado");
		model.addAttribute("FormularioAlcantarillado", new Camposalcantarillado());
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme200alcantarillado());
		return "FormularioAlcantarillado/dashboard200";
	}
	
	//guardar los formularios
	@RequestMapping(value = "FormularioAlcantarillado/guardar160", method = RequestMethod.POST)
	public String guardarpresupuestoagua160(
			@ModelAttribute("FormularioAlcantarillado") Camposalcantarillado FormularioAlcantarillado, Model model) {
		empssapalService.guardandopresupuestoalcantarillado(FormularioAlcantarillado);
		
		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAlcantarillado.getVereda().getId()));
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAlcantarillado.getTipopista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAlcantarillado.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAlcantarillado.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido160(FormularioAlcantarillado.getDiametroalcantarilado().getId()));
		model.addAttribute("cajaregistradora", empssapalService.findByIdCajaregistradora160(FormularioAlcantarillado.getDiametroalcantarilado().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAlcantarillado.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAlcantarillado.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAlcantarillado.getEliminacionexcedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAlcantarillado.getPruebahidrahulica().getId()));
		
		
		
		
		
		model.addAttribute("Vereda",empssapalService.findByIdVereda(FormularioAlcantarillado.getVereda().getId()));
		return "FormularioAlcantarillado/Reporte";
	}
	
	
	@RequestMapping(value = "FormularioAlcantarillado/guardar200", method = RequestMethod.POST)
	public String guardarpresupuestoagua200(
			@ModelAttribute("FormularioAlcantarillado") Camposalcantarillado FormularioAlcantarillado, Model model) {
		empssapalService.guardandopresupuestoalcantarillado(FormularioAlcantarillado);
		
		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAlcantarillado.getVereda().getId()));
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAlcantarillado.getTipopista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAlcantarillado.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAlcantarillado.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido200(FormularioAlcantarillado.getDiametroalcantarilado().getId()));
		model.addAttribute("cajaregistradora", empssapalService.findByIdCajaregistradora200(FormularioAlcantarillado.getDiametroalcantarilado().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAlcantarillado.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAlcantarillado.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAlcantarillado.getEliminacionexcedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAlcantarillado.getPruebahidrahulica().getId()));
		
		
		return "FormularioAlcantarillado/Reporte";
	}
	@RequestMapping(value = "FormularioAlcantarillado/guardar6", method = RequestMethod.POST)
	public String guardarpresupuestoagua6(
			@ModelAttribute("FormularioAlcantarillado") Camposalcantarillado FormularioAlcantarillado, Model model) {
		empssapalService.guardandopresupuestoalcantarillado(FormularioAlcantarillado);
		
		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAlcantarillado.getVereda().getId()));
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAlcantarillado.getTipopista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAlcantarillado.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAlcantarillado.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido6(FormularioAlcantarillado.getDiametroalcantarilado().getId()));
		model.addAttribute("cajaregistradora", empssapalService.findByIdCajaregistradora6(FormularioAlcantarillado.getDiametroalcantarilado().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAlcantarillado.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAlcantarillado.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAlcantarillado.getEliminacionexcedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAlcantarillado.getPruebahidrahulica().getId()));
		
		
		return "FormularioAlcantarillado/Reporte";
	}
}
