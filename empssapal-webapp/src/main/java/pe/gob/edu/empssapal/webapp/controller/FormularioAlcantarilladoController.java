package pe.gob.edu.empssapal.webapp.controller;



import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Cajaregistradora;
import pe.gob.edu.empssapal.core.domain.Camaapoyo;
import pe.gob.edu.empssapal.core.domain.Camposalcantarillado;
import pe.gob.edu.empssapal.core.domain.Eliminacionexedente;
import pe.gob.edu.empssapal.core.domain.Empalmered;
import pe.gob.edu.empssapal.core.domain.Excavacion;
import pe.gob.edu.empssapal.core.domain.Pruebahidraulica;
import pe.gob.edu.empssapal.core.domain.Relleno;
import pe.gob.edu.empssapal.core.domain.Reposicion;
import pe.gob.edu.empssapal.core.domain.Rotura;
import pe.gob.edu.empssapal.core.domain.Tendido;
import pe.gob.edu.empssapal.core.domain.Tipopista;
import pe.gob.edu.empssapal.core.domain.Vereda;
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
		model.addAttribute("FormularioAlcantarillado", new Camposalcantarillado());
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme6alcantarillado());
		return "FormularioAlcantarillado/dashboard6";
	}
	
	@RequestMapping(value = "FormularioAlcantarillado/dashboard160", method = RequestMethod.GET)
	public String dashboard160(Model model) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard160:::::::::::::::");
		model.addAttribute("FormularioAlcantarillado", new Camposalcantarillado());
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme160alcantarillado());
		return "FormularioAlcantarillado/dashboard160";
	}
	
	@RequestMapping(value = "FormularioAlcantarillado/dashboard200", method = RequestMethod.GET)
	public String dashboard200(Model model) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard200:::::::::::::::");
		model.addAttribute("FormularioAlcantarillado", new Camposalcantarillado());
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme200alcantarillado());
		return "FormularioAlcantarillado/dashboard200";
	}
	
	
	
	
	//guardar los formularios
	@RequestMapping(value = "FormularioAlcantarillado/guardar160", method = RequestMethod.POST)
	public String guardarpresupuestoagua160(@ModelAttribute("FormularioAlcantarillado") Camposalcantarillado FormularioAlcantarillado, Model model) {
		
		empssapalService.guardandopresupuestoalcantarillado(FormularioAlcantarillado);
		
		Vereda vereda = empssapalService.findByIdVeredaCorrecto(FormularioAlcantarillado.getVereda().getId());
		model.addAttribute("vereda",vereda);
		Double numvere = vereda.getCostovere();
		model.addAttribute("VeredaPrecioXdistancia", empssapalService.Limite(numvere));

		
		Tipopista pistas = empssapalService.findByIdPista(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("pistas",pistas);
		Double Medida = FormularioAlcantarillado.getDistancia()*0.8;
		Double numpista = pistas.getCostopista()*Medida;
		empssapalService.Limite(numpista);
		model.addAttribute("pistatotal", empssapalService.Limite(numpista));
		

		Excavacion excavacion=empssapalService.findByIdExcavacion(FormularioAlcantarillado.getExcavacion().getId());
		model.addAttribute("excavacion", excavacion);
		Double numexca = excavacion.getPrecioexcavacion()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("excavaciontotal", empssapalService.Limite(numexca));

		
		Camaapoyo camaapoyo = empssapalService.findByIdCamaapoyo(FormularioAlcantarillado.getCamaapoyo().getId());
		model.addAttribute("camaapoyo",camaapoyo);
		Double numcama = camaapoyo.getPreciocama()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("camaapoyototal", empssapalService.Limite(numcama));
		
		Tendido tendido = empssapalService.findByIdTendido160(FormularioAlcantarillado.getDiametroalcantarilado().getId());
		model.addAttribute("tendido",tendido);
		Double numtend = tendido.getCostotendido()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("tendidototal", empssapalService.Limite(numtend));
		
		Cajaregistradora cajaregistradora = empssapalService.findByIdCajaregistradora160(FormularioAlcantarillado.getDiametroalcantarilado().getId());
		model.addAttribute("cajaregistradora", cajaregistradora);
		Double numcajareg = cajaregistradora.getPreciocajaregistradora();
		model.addAttribute("totalcajaregistradora", empssapalService.Limite(numcajareg));
		
		Empalmered empalmeared = empssapalService.findByIdEmpalmered(FormularioAlcantarillado.getEmpalmered().getId());
		model.addAttribute("empalmeared", empalmeared);
		Double numempal = empalmeared.getPrecioempalme();
		model.addAttribute("totalempalmeared", empssapalService.Limite(numempal));
		
		Relleno relleno   =  empssapalService.findByIdRelleno(FormularioAlcantarillado.getRelleno().getId());
		model.addAttribute("relleno", relleno);
		Double numrell = relleno.getCostorelleno()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totalrelleno", empssapalService.Limite(numrell));
		
		Eliminacionexedente eliminacion= empssapalService.findByIdEliminacionexedente(FormularioAlcantarillado.getEliminacionexcedente().getId());
		model.addAttribute("eliminacion", eliminacion);
		Double numelimi = eliminacion.getCostoeliminacion()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totaleliminacion", empssapalService.Limite(numelimi));
		
		Pruebahidraulica prueba = empssapalService.findByIdPruebahidraulica(FormularioAlcantarillado.getPruebahidrahulica().getId());
		model.addAttribute("prueba", prueba);
		Double numprue = prueba.getCostoprueba()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totalprueba", empssapalService.Limite(numprue));

		//reporte de rotura
			Rotura rotura = empssapalService.findbyidrotura(FormularioAlcantarillado.getTipopista().getId());
			model.addAttribute("rotura", rotura);
		//reporte de reposicion
			Reposicion reposicion = empssapalService.findbyidreposicion(FormularioAlcantarillado.getTipopista().getId());
			model.addAttribute("reposicion",reposicion);
		
		
		Double resultado = numcajareg+numcama+numelimi+numempal+numexca+numpista+numprue+numrell+numtend+numvere;
		model.addAttribute("total", empssapalService.Limite(resultado));
		
		
		Double igv = resultado*0.18;
		model.addAttribute("igv", empssapalService.Limite(igv));
		
		Double importetotal = resultado + igv;
		model.addAttribute("importetotal", empssapalService.Limite(importetotal));
	
		model.addAttribute("importetotalredondeado", empssapalService.Limite1decimal(importetotal));
		
		BigDecimal a= empssapalService.Limite(importetotal);
		Double aa = a.doubleValue();
		BigDecimal b= empssapalService.Limite1decimal(importetotal);
		Double bb = b.doubleValue();
		Double cc = aa-bb;
		model.addAttribute("deciredondeo", empssapalService.Limite(cc));		
		
		
		return "FormularioAlcantarillado/Reporte";
	}
		
		

	@RequestMapping(value = "FormularioAlcantarillado/guardar200", method = RequestMethod.POST)
	public String guardarpresupuestoagua200(@ModelAttribute("FormularioAlcantarillado") Camposalcantarillado FormularioAlcantarillado, Model model) {
		empssapalService.guardandopresupuestoalcantarillado(FormularioAlcantarillado);
		
		Vereda vereda = empssapalService.findByIdVeredaCorrecto(FormularioAlcantarillado.getVereda().getId());
		model.addAttribute("vereda",vereda);
		Double numvere = vereda.getCostovere();
		model.addAttribute("VeredaPrecioXdistancia", empssapalService.Limite(numvere));

		Tipopista pistas = empssapalService.findByIdPista(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("pistas",pistas);
		Double Medida = FormularioAlcantarillado.getDistancia()*0.8;
		model.addAttribute("Medida", empssapalService.Limite(Medida));
		Double numpista = pistas.getCostopista()*Medida;
		model.addAttribute("pistatotal", empssapalService.Limite(numpista));
		
		
		Excavacion excavacion = empssapalService.findByIdExcavacion(FormularioAlcantarillado.getExcavacion().getId());
		model.addAttribute("excavacion", excavacion);
		Double numexca = excavacion.getPrecioexcavacion()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("excavaciontotal", empssapalService.Limite(numexca));

		
		Camaapoyo camaapoyo = empssapalService.findByIdCamaapoyo(FormularioAlcantarillado.getCamaapoyo().getId());
		model.addAttribute("camaapoyo",camaapoyo);
		Double numcama = camaapoyo.getPreciocama()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("camaapoyototal", empssapalService.Limite(numcama));
		
		Tendido tendido = empssapalService.findByIdTendido200(FormularioAlcantarillado.getDiametroalcantarilado().getId());
		model.addAttribute("tendido",tendido);
		Double numtend = tendido.getCostotendido()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("tendidototal", empssapalService.Limite(numtend));
		
		Cajaregistradora cajaregistradora = empssapalService.findByIdCajaregistradora200(FormularioAlcantarillado.getDiametroalcantarilado().getId());
		model.addAttribute("cajaregistradora", cajaregistradora);
		Double numcajareg = cajaregistradora.getPreciocajaregistradora();
		model.addAttribute("totalcajaregistradora", empssapalService.Limite(numcajareg));
		
		Empalmered empalmeared = empssapalService.findByIdEmpalmered(FormularioAlcantarillado.getEmpalmered().getId());
		model.addAttribute("empalmeared", empalmeared);
		Double numempal = empalmeared.getPrecioempalme();
		model.addAttribute("totalempalmeared", empssapalService.Limite(numempal));
		
		Relleno relleno   =  empssapalService.findByIdRelleno(FormularioAlcantarillado.getRelleno().getId());
		model.addAttribute("relleno", relleno);
		Double numrell = relleno.getCostorelleno()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totalrelleno", empssapalService.Limite(numrell));
		
		Eliminacionexedente eliminacion = empssapalService.findByIdEliminacionexedente(FormularioAlcantarillado.getEliminacionexcedente().getId());
		model.addAttribute("eliminacion", eliminacion);
		Double numelimi = eliminacion.getCostoeliminacion()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totaleliminacion", empssapalService.Limite(numelimi));
		
		Pruebahidraulica prueba = empssapalService.findByIdPruebahidraulica(FormularioAlcantarillado.getPruebahidrahulica().getId());
		model.addAttribute("prueba", prueba);
		Double numprue = prueba.getCostoprueba()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totalprueba", empssapalService.Limite(numprue));

		//reporte de rotura
		Rotura rotura = empssapalService.findbyidrotura(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("rotura", rotura);
		//reporte de reposicion
		Reposicion reposicion = empssapalService.findbyidreposicion(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("reposicion",reposicion);
				
				
		
		
		Double resultado = numcajareg+numcama+numelimi+numempal+numexca+numpista+numprue+numrell+numtend+numvere;
		model.addAttribute("total", empssapalService.Limite(resultado));
		
		
		Double igv = resultado*0.18;
		model.addAttribute("igv", empssapalService.Limite(igv));
		
		Double importetotal = resultado + igv;
		model.addAttribute("importetotal", empssapalService.Limite(importetotal));
	
		model.addAttribute("importetotalredondeado", empssapalService.Limite1decimal(importetotal));

		BigDecimal a= empssapalService.Limite(importetotal);
		Double aa = a.doubleValue();
		BigDecimal b= empssapalService.Limite1decimal(importetotal);
		Double bb = b.doubleValue();
		Double cc = aa-bb;
		model.addAttribute("deciredondeo", empssapalService.Limite(cc));		
		
		
		return "FormularioAlcantarillado/Reporte";
	
	}
		
	@RequestMapping(value = "FormularioAlcantarillado/guardar6", method = RequestMethod.POST)
	public String guardarpresupuestoagua6(
			@ModelAttribute("FormularioAlcantarillado") Camposalcantarillado FormularioAlcantarillado, Model model) {
		empssapalService.guardandopresupuestoalcantarillado(FormularioAlcantarillado);
		
		Vereda vereda = empssapalService.findByIdVeredaCorrecto(FormularioAlcantarillado.getVereda().getId());
		model.addAttribute("vereda",vereda);
		Double numvere = vereda.getCostovere();
		model.addAttribute("VeredaPrecioXdistancia", empssapalService.Limite(numvere));

		Tipopista pistas = empssapalService.findByIdPista(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("pistas",pistas);
		Double Medida = FormularioAlcantarillado.getDistancia()*0.8;
		model.addAttribute("Medida", empssapalService.Limite(Medida));
		Double numpista = pistas.getCostopista()*Medida;
		
		model.addAttribute("pistatotal", empssapalService.Limite(numpista));
		
		Excavacion excavacion=empssapalService.findByIdExcavacion(FormularioAlcantarillado.getExcavacion().getId());
		model.addAttribute("excavacion", excavacion);
		Double numexca = excavacion.getPrecioexcavacion()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("excavaciontotal", empssapalService.Limite(numexca));

		
		Camaapoyo camaapoyo = empssapalService.findByIdCamaapoyo(FormularioAlcantarillado.getCamaapoyo().getId());
		model.addAttribute("camaapoyo",camaapoyo);
		Double numcama = camaapoyo.getPreciocama()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("camaapoyototal", empssapalService.Limite(numcama));
		
		Tendido tendido = empssapalService.findByIdTendido6(FormularioAlcantarillado.getDiametroalcantarilado().getId());
		model.addAttribute("tendido",tendido);
		Double numtend = tendido.getCostotendido()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("tendidototal", empssapalService.Limite(numtend));
		
		Cajaregistradora cajaregistradora = empssapalService.findByIdCajaregistradora6(FormularioAlcantarillado.getDiametroalcantarilado().getId());
		model.addAttribute("cajaregistradora", cajaregistradora);
		Double numcajareg = cajaregistradora.getPreciocajaregistradora();
		model.addAttribute("totalcajaregistradora", empssapalService.Limite(numcajareg));
		
		Empalmered empalmeared = empssapalService.findByIdEmpalmered(FormularioAlcantarillado.getEmpalmered().getId());
		model.addAttribute("empalmeared", empalmeared);
		Double numempal = empalmeared.getPrecioempalme();
		model.addAttribute("totalempalmeared", empssapalService.Limite(numempal));
		
		Relleno relleno   =  empssapalService.findByIdRelleno(FormularioAlcantarillado.getRelleno().getId());
		model.addAttribute("relleno", relleno);
		Double numrell = relleno.getCostorelleno()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totalrelleno", empssapalService.Limite(numrell));
		
		Eliminacionexedente eliminacion= empssapalService.findByIdEliminacionexedente(FormularioAlcantarillado.getEliminacionexcedente().getId());
		model.addAttribute("eliminacion", eliminacion);
		Double numelimi = eliminacion.getCostoeliminacion()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totaleliminacion", empssapalService.Limite(numelimi));
		
		Pruebahidraulica prueba = empssapalService.findByIdPruebahidraulica(FormularioAlcantarillado.getPruebahidrahulica().getId());
		model.addAttribute("prueba", prueba);
		Double numprue = prueba.getCostoprueba()*FormularioAlcantarillado.getDistancia();
		model.addAttribute("totalprueba", empssapalService.Limite(numprue));


		//reporte de rotura
		Rotura rotura = empssapalService.findbyidrotura(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("rotura", rotura);
		//reporte de reposicion
		Reposicion reposicion = empssapalService.findbyidreposicion(FormularioAlcantarillado.getTipopista().getId());
		model.addAttribute("reposicion",reposicion);
		

		Double resultado = numcajareg+numcama+numelimi+numempal+numexca+numpista+numprue+numrell+numtend+numvere;
		model.addAttribute("total", empssapalService.Limite(resultado));
		
		
		Double igv = resultado*0.18;
		model.addAttribute("igv", empssapalService.Limite(igv));
		
		Double importetotal = resultado + igv;
		model.addAttribute("importetotal", empssapalService.Limite(importetotal));
	
		model.addAttribute("importetotalredondeado", empssapalService.Limite1decimal(importetotal));
		
		BigDecimal a= empssapalService.Limite(importetotal);
		Double aa = a.doubleValue();
		BigDecimal b= empssapalService.Limite1decimal(importetotal);
		Double bb = b.doubleValue();
		Double cc = aa-bb;
		model.addAttribute("deciredondeo", empssapalService.Limite(cc));		
		
		
		return "FormularioAlcantarillado/Reporte";
	}
		
}
