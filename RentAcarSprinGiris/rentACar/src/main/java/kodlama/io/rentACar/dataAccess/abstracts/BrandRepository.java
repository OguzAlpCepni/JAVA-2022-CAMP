package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {// veri tabanı işlemleri yapıcak sınıf DAO olarakta geçer
	List<Brand> getAll(); // bütün araba markalarını getir
}
