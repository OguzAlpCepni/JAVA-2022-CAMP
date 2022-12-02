package kodlama.io.Kodlama.io.Devs.webApi.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.Business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.Business.requests.Language.LanguageRequest;
import kodlama.io.Kodlama.io.Devs.Business.responses.GetAllLanguagesResponse;

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
	public List<GetAllLanguagesResponse> getAll()throws Exception{
		return languageService.getAll();
		}
	@PostMapping("/add") 
	public void add(@RequestBody LanguageRequest languageRequest)throws Exception{ 
		this.languageService.add(languageRequest);
	}
}
