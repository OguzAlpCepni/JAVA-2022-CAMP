package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponses;
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
	public List<GetAllBrandResponses> getAll() {
		// iş kuralları yaz 
			List<Brand> brands = brandRepository.findAll(); // bu tipi yukardaki tipe çevirmem lazım 
			List<GetAllBrandResponses> brandsResponse = new ArrayList<GetAllBrandResponses>();
			for (Brand brand : brands) { 
				GetAllBrandResponses responseItem= new GetAllBrandResponses();
				responseItem.setId(brand.getId());
				responseItem.setName(brand.getName());
				
				brandsResponse.add(responseItem);
				
				
			 // Brand --> id , name , qualtiy 
			// response--> (diyoeumki banddaki id ve name yi bundaki değerlere ata ) id , name 
				
			}
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);
		
	}

	
}
