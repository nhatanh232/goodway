package mksgroup.goodway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mksgroup.goodway.entity.DeliveryBatch;
import mksgroup.goodway.repository.DeliveryBatchRepository;

@Controller
public class DeliveryPlanController {

	@Autowired
	private DeliveryBatchRepository deliveryRepository;
	
	@RequestMapping(value = {"/deliveryplan","/deliveryplan/delivery-sreach"})
	public String goDeliveryPlanSreach() {
		return "deliveryplan/delivery-sreach";
	}
	
	@RequestMapping(value = {"/deliveryplan/listcar","/deliveryplan/delivery-listcar"})
	public String goDeliveryPlanListCar() {
		return "deliveryplan/delivery-listcar";
	}
	
	@RequestMapping(value = {"/deliveryplan/findway","/deliveryplan/delivery-result"})
	public String goDeliveryPlanResult() {
		return "deliveryplan/delivery-result";
	}
	
	@GetMapping("/delivery/load-deliverylist")
	@ResponseBody
	public Iterable<DeliveryBatch> loadDelivery(){
		Iterable<DeliveryBatch> deliveryList = deliveryRepository.findAll();
		return deliveryList;
	}
}
