package kodlama.io.Kodlama.io.Devs.Business.requests.Language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLanguageRequest {
	private int id;
	private String name;
}
