import com.formdev.flatlaf.FlatLightLaf;

public class Tema
	extends FlatLightLaf
{
	public static final String NAME = "Tema";

	public static boolean setup() {
		return setup( new Tema() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, Tema.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
