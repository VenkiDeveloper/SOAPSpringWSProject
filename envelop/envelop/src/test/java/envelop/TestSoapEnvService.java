package envelop;

public class TestSoapEnvService {
	

	public static void main(String[] args) throws Exception{
        String fromCurrency ="USD";
        String toCurrency="INR";
		
		
		String response = SoapRequestService.getCurrencyValue(fromCurrency,toCurrency);
		
		System.out.println("Currency Value is"+response);
	}
	
	
	
	
}
