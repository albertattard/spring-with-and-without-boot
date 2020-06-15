package demo.noboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactUsController {

  @GetMapping( "/countries" )
  public List<Country> countries() {
    return List.of(
      new Country( "Australia" ),
      new Country( "Brazil" ),
      new Country( "Canada" ),
      new Country( "Chile" ),
      new Country( "China" ),
      new Country( "Ecuador" ),
      new Country( "Germany" ),
      new Country( "India" ),
      new Country( "Italy" ),
      new Country( "Singapore" ),
      new Country( "Spain" ),
      new Country( "Thailand" ),
      new Country( "United Kingdom" ),
      new Country( "United States of America" )
    );
  }
}
