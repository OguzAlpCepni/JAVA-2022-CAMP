package Business;

import Core.Logger;
import DataAcces.KursDao;
import Entities.Kurs;

public class KursManager {
	
	private KursDao kursDao;
	private Logger[] loggers;
	public KursManager(KursDao kursDao, Logger[] loggers) {
		this.kursDao = kursDao;
		this.loggers = loggers;
	}
	public void add(Kurs kurs) throws Exception{
		if(kurs.getKursPrice()<10) {
			throw  new Exception("kurs ucreti 10dan kucuk olamaz");
		}
		kursDao.add(kurs);
		
		for(Logger logger : loggers) {
			logger.log(kurs.getKursName());
		}
		
	}
	
	
	

}
