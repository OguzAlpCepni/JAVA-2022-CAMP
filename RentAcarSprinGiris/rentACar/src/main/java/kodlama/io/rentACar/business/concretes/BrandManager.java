package kodlama.io.rentACar.business.concretes;

import java.util.List;


import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
// IOC nedir git bellekte bir şeyi newle bellekte yer ayır isteyene o referansı ver 
@Service    // bu sınıf bir business nesnesidir 
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	//@Autowired yazmasakta olur 
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// iş kuralları yaz 
		
		return brandRepository.getAll();
	}

	
}
