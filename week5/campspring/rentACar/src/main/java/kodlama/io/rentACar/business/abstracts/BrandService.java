package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponses;

public interface BrandService {
	// iş kurallarının olacağı yapılar
	// response requent pattern ===?????
	List<GetAllBrandResponses> getAll();
	
	void add(CreateBrandRequest createBrandRequest);
}
