package kodlama.io.Kodlama.io.Devs.Business.requests.framework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateFrameworkRequest {
	private int id;
	private String name;
	private int programmingLanguageId;

}
