import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class TestLocalizationServiceImpl {
    @Test
    public void testLocalizationServiceImplLocale() {
        //given
        final LocalizationService original = new LocalizationServiceImpl();
        final Country argument = Country.GERMANY;
        final String expected = "Welcome";

        //when
        final String result = original.locale(argument);

        //then
        Assertions. assertEquals(expected, result);
    }
}
