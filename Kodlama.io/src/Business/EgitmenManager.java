package Business;

import java.util.ArrayList;
import java.util.List;

import Core.Logger;
import DataAcces.EgitmenDao;
import Entities.Egitmen;

public class EgitmenManager {

	private EgitmenDao egitmenDao;
	private List<Egitmen> egitmens = new ArrayList<>();
	private Logger[] loggers;
	
	
	
	
	
	public EgitmenManager(EgitmenDao egitmenDao, Logger[] loggers) {
		this.egitmenDao = egitmenDao;
		this.loggers = loggers;
	}
	
	public void add(Egitmen egitmen) throws Exception {
		for(Egitmen egitmens : egitmens) {
			if(egitmens == egitmen) {
				throw new Exception("kayýtlý eðitmen eklenemez ");
			}
	
		}
		egitmens.add(egitmen);
		egitmenDao.add(egitmen);
		for(Logger logger : loggers) {
			logger.log(egitmen.getFirstName()+" "+egitmen.getLastName());
		}
	}
	

	
	
}
