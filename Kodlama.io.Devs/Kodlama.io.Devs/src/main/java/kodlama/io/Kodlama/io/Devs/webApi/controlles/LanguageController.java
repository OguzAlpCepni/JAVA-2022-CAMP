package kodlama.io.Kodlama.io.Devs.webApi.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.Business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
private LanguageService languageService;
@Autowired
public LanguageController(LanguageService languageService) {
	super();
	this.languageService = languageService;
}
	
	@GetMapping("/getall")
	public List<Language> getAll()throws Exception{
		return languageService.getAll();
		}
	@GetMapping("/add")
	public void add(@RequestBody String name) throws Exception{
		languageService.add(name);
	}
	@GetMapping("/delete")
	public void delete(@RequestBody String name) throws Exception{
		languageService.delete(name);
	}
	@GetMapping("/update")
	public void update(@RequestBody String ChangeName,@RequestBody String name) throws Exception{
		languageService.update(ChangeName, name);
	}
	@GetMapping("/getById")
    public Language getById(@PathVariable() int id) throws Exception{
        return languageService.getById(id);
    }
}
