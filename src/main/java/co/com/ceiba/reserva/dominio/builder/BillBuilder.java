package co.com.ceiba.reserva.dominio.builder;

import co.com.ceiba.reserva.dominio.Bill;
import co.com.ceiba.reserva.dominio.entity.BillEntity;

public final class BillBuilder {

	
	private BillBuilder() {}

	public static Bill convertDomain(BillEntity billEntity) {
		
		Bill bill = null;
		
		if(billEntity != null) {
			bill = new Bill(billEntity.getPrice(),billEntity.getDiscountForPeople(),billEntity.getDiscpuntForDays(), null);	
		}
		
		return bill;
	}
	
	public static BillEntity convertEntity(Bill bill) {
		
		BillEntity billEntity = new BillEntity();
		
		billEntity.setPrice(bill.getPrice());
		billEntity.setDiscountForPeople(bill.getDiscountForPeople());
		billEntity.setDiscpuntForDays(bill.getDiscpuntForDays());
		
		return billEntity;
	}
	
}
