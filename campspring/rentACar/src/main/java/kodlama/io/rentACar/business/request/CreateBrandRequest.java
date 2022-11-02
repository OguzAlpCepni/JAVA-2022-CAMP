package kodlama.io.rentACar.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//response requstpattern
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	private String name;
}
