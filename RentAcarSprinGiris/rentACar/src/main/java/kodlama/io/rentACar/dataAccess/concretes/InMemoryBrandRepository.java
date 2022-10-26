package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // bu sınıf bir dataAcces Nesnesidirrrrrr
public class InMemoryBrandRepository implements BrandRepository{

	List<Brand> brands; // fonksiyon içerisinde erişebilmem için sanırım singleteon tasarım deseni kullanıyoru 
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();// bu hareket sonucu elimizde boi bir liste var 
		// megerki db olmasın kendim yaptım
		brands.add(new Brand(1,"bmw"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Audi"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault"));
		
	}
	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
