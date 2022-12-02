package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;
																//primarykey id  int
public interface BrandRepository extends JpaRepository<Brand,Integer>{// veri tabanı işlemleri yapıcak sınıf DAO olarakta geçer
}
// generic bir yapıda calışıyor ve bizim için bellekte onu sanki implemente etmiş bir class uretmiş gibi davranıyor 