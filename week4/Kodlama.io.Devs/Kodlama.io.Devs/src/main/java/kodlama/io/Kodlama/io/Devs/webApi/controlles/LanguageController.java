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
	public void add(@RequestBody Language language) throws Exception{
		languageService.add(language);
	}
	@GetMapping("/delete")
	public void delete(@RequestBody int id) throws Exception{
		languageService.delete(id);
	}
	@GetMapping("/update")
	public void update(@RequestBody Language language,@RequestBody int id) throws Exception{
		languageService.update(language,id);
	}
	@GetMapping("/getById")
    public Language getById(@PathVariable() int id) throws Exception{
        return languageService.getById(id);
    }
}
