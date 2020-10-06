import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class TestGeoServiceImpl {
    @Test
    public void testGeoServiceImplByIp() {
            //given
        final GeoService original = new GeoServiceImpl();
        final String argument = "172.0.0.99";
        final Country expected = Country.RUSSIA;

            //when
        final Country result = original.byIp(argument).getCountry();

            //then
        Assertions. assertEquals(expected, result);
    }

}
