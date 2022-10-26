package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotation bilgilendirme ifadesidir 
@RequestMapping("/api/brands") //adresimizin sonunu api/brands derse burayı ifade ediyor demek adresleme 
public class BrandsController { // api isimlendirmesinde cogul kullanılır http keyword kaynaklı 

	private BrandService brandService;
@Autowired // git paremetrelerine bak brand service git uygulamayı tara kin bu brand serviceyi implemente etti onun newlenmiş halini bana ver 
public BrandsController(BrandService brandService) {
	this.brandService = brandService;
}
	@GetMapping("/getall")  //www.kodlama.io/api/brands/getAll diyince sen calısssss
	public List<Brand> getAll(){
		// IOC 
		
		return brandService.getAll();
	}

}
