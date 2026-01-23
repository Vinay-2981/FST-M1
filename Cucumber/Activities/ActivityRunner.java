package testRunners;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME,
  value = "stepDefinitions")

//you can use or to run all activites at once ie activity1 or activity2 or so on

//@ConfigurationParameter(
  //key = Constants.FILTER_TAGS_PROPERTY_NAME,
  //value = "@Activity1")
@ConfigurationParameter(
		  key = Constants.FILTER_TAGS_PROPERTY_NAME,
		  value = "@Activity3")
/* If we need reports we need to add below parameter
@ConfigurationParameter(
		key = Constants.PLUGIN_PROPERTY_NAME,
		value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
		)
*/
public class ActivityRunner {}