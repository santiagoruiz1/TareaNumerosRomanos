import static org.junit.Assert.*;
import org.junit.Test;
import co.udea.NumRomano;

public class NumRomanoTest {
	
	@Test
	public void convertirARomanoTestX() {
		
		NumRomano romano = new NumRomano();
		String nRomano = romano.convertirARomano(10);
		assertEquals("X", nRomano );
		
	}
	
	@Test
	public void convertirARomanoTestUnidades() {
		
		NumRomano romano = new NumRomano();
		String nRomano = romano.convertirARomano(5);
		assertEquals("V", nRomano );
		
	}
	
	@Test
	public void convertirARomanoTestDencenas() {
		
		NumRomano romano = new NumRomano();
		String nRomano = romano.convertirARomano(50);
		assertEquals("L", nRomano );
		
	}
	
	@Test
	public void convertirARomanoTestCentenas() {
		
		NumRomano romano = new NumRomano();
		String nRomano = romano.convertirARomano(500);
		assertEquals("D", nRomano );
		
	}
	
	@Test
	public void convertirARomanoTestMil() {
		
		NumRomano romano = new NumRomano();
		String nRomano = romano.convertirARomano(1000);
		assertEquals("M", nRomano );
		
	}
	
	@Test
	public void convertirARomanoTest() {
		
		NumRomano romano = new NumRomano();
		String nRomano = romano.convertirARomano(546);
		assertEquals("DXLVI", nRomano );
		
	}

}
