# Using the release plugin

In this demo I will be using a simple demo service exposed as artifact for anyone to use and explain the steps of using the `versions` plugin

## Application

The source creates a simple application with one rest endpoint exposed over 'http://localhost:8181/' and returns a string `"hello Spring!"`

### Building Snapshot version

The current `pom.xml` will allow you to publish the artifacts more details below

```bash
mvn clean package deploy
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< me.samarthya:release-demo >----------------------
[INFO] Building release-demo 1.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ release-demo ---
[INFO] Deleting /Users/samarthya/sourcebox/github.com/release-demo/target
[INFO] 
[INFO] --- maven-enforcer-plugin:3.0.0:enforce (enforce-build-tools-versions) @ release-demo ---
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ release-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ release-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/samarthya/sourcebox/github.com/release-demo/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ release-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /Users/samarthya/sourcebox/github.com/release-demo/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ release-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/samarthya/sourcebox/github.com/release-demo/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ release-demo ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running me.samarthya.GreetingControllerTest
19:00:44.856 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
19:00:44.871 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
19:00:44.903 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [me.samarthya.GreetingControllerTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
19:00:44.910 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [me.samarthya.GreetingControllerTest], using SpringBootContextLoader
19:00:44.913 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [me.samarthya.GreetingControllerTest]: class path resource [me/samarthya/GreetingControllerTest-context.xml] does not exist
19:00:44.914 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [me.samarthya.GreetingControllerTest]: class path resource [me/samarthya/GreetingControllerTestContext.groovy] does not exist
19:00:44.914 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [me.samarthya.GreetingControllerTest]: no resource found for suffixes {-context.xml, Context.groovy}.
19:00:44.914 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [me.samarthya.GreetingControllerTest]: GreetingControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
19:00:44.954 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [me.samarthya.GreetingControllerTest]
19:00:45.014 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/Users/samarthya/sourcebox/github.com/release-demo/target/classes/me/samarthya/StartPoint.class]
19:00:45.015 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration me.samarthya.StartPoint for test class me.samarthya.GreetingControllerTest
19:00:45.091 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [me.samarthya.GreetingControllerTest]: using defaults.
19:00:45.091 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
19:00:45.100 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
19:00:45.101 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
19:00:45.101 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@727eb8cb, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@39d9314d, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@b978d10, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@5b7a8434, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@5c45d770, org.springframework.test.context.support.DirtiesContextTestExecutionListener@2ce6c6ec, org.springframework.test.context.event.EventPublishingTestExecutionListener@1bae316d, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@147a5d08, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@6676f6a0, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@7cbd9d24, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1672fe87, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@5026735c, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@1b45c0e]
19:00:45.104 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@352c1b98 testClass = GreetingControllerTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@21129f1f testClass = GreetingControllerTest, locations = '{}', classes = '{class me.samarthya.StartPoint}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@41c2284a, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@1fb700ee, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@52102734, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@55b53d44, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@55536d9e, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@57855c9a], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false]], class annotated with @DirtiesContext [false] with mode [null].
19:00:45.115 [main] DEBUG org.springframework.test.context.support.DependencyInjectionTestExecutionListener - Performing dependency injection for test context [[DefaultTestContext@352c1b98 testClass = GreetingControllerTest, testInstance = me.samarthya.GreetingControllerTest@1115ec15, testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@21129f1f testClass = GreetingControllerTest, locations = '{}', classes = '{class me.samarthya.StartPoint}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@41c2284a, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@1fb700ee, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@52102734, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@55b53d44, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@55536d9e, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@57855c9a], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false, 'org.springframework.test.context.event.ApplicationEventsTestExecutionListener.recordApplicationEvents' -> false]]].
19:00:45.135 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

2021-09-23 19:00:45.378  INFO 7040 --- [           main] me.samarthya.GreetingControllerTest      : Starting GreetingControllerTest using Java 17 on C02Z45LYLVDR with PID 7040 (started by samarthya in /Users/samarthya/sourcebox/github.com/release-demo)
2021-09-23 19:00:45.380  INFO 7040 --- [           main] me.samarthya.GreetingControllerTest      : No active profile set, falling back to default profiles: default
2021-09-23 19:00:46.408  INFO 7040 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2021-09-23 19:00:46.418  INFO 7040 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-09-23 19:00:46.418  INFO 7040 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.52]
2021-09-23 19:00:46.776  INFO 7040 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-09-23 19:00:46.777  INFO 7040 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1378 ms
2021-09-23 19:00:47.574  INFO 7040 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2021-09-23 19:00:47.660  INFO 7040 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 63611 (http) with context path ''
2021-09-23 19:00:47.674  INFO 7040 --- [           main] me.samarthya.GreetingControllerTest      : Started GreetingControllerTest in 2.537 seconds (JVM running for 3.424)
applicationAvailability
applicationTaskExecutor
basicErrorController
beanNameHandlerMapping
beanNameViewResolver
characterEncodingFilter
classLoaderMetrics
commandLineRunner
controllerEndpointDiscoverer
controllerEndpointHandlerMapping
controllerExposeExcludePropertyEndpointFilter
conventionErrorViewResolver
defaultServletHandlerMapping
defaultViewResolver
diskSpaceHealthIndicator
dispatcherServlet
dispatcherServletRegistration
endpointCachingOperationInvokerAdvisor
endpointMediaTypes
endpointOperationParameterMapper
envInfoContributor
error
errorAttributes
errorPageCustomizer
errorPageRegistrarBeanPostProcessor
fileDescriptorMetrics
flashMapManager
forceAutoProxyCreatorToUseClassProxying
formContentFilter
greetingController
handlerExceptionResolver
handlerFunctionAdapter
healthContributorRegistry
healthEndpoint
healthEndpointGroups
healthEndpointGroupsBeanPostProcessor
healthEndpointWebExtension
healthHttpCodeStatusMapper
healthStatusAggregator
httpRequestHandlerAdapter
jacksonObjectMapper
jacksonObjectMapperBuilder
jsonComponentModule
jvmGcMetrics
jvmMemoryMetrics
jvmThreadMetrics
lifecycleProcessor
localeCharsetMappingsCustomizer
localeResolver
logbackMetrics
management.endpoint.health-org.springframework.boot.actuate.autoconfigure.health.HealthEndpointProperties
management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties
management.endpoints.web.cors-org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties
management.health.diskspace-org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthIndicatorProperties
management.info-org.springframework.boot.actuate.autoconfigure.info.InfoContributorProperties
management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties
management.metrics.export.simple-org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleProperties
management.server-org.springframework.boot.actuate.autoconfigure.web.server.ManagementServerProperties
managementServletContext
mappingJackson2HttpMessageConverter
messageConverters
meterRegistryPostProcessor
metricsHttpClientUriTagFilter
metricsHttpServerUriTagFilter
metricsRestTemplateCustomizer
metricsWebMvcConfigurer
micrometerClock
multipartConfigElement
multipartResolver
mvcContentNegotiationManager
mvcConversionService
mvcHandlerMappingIntrospector
mvcPathMatcher
mvcPatternParser
mvcResourceUrlProvider
mvcUriComponentsContributor
mvcUrlPathHelper
mvcValidator
mvcViewResolver
org.springframework.aop.config.internalAutoProxyCreator
org.springframework.boot.actuate.autoconfigure.availability.AvailabilityHealthContributorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration$WebMvcServletEndpointManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration$WebEndpointServletConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointWebExtensionConfiguration
org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.LogbackMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.integration.IntegrationMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.client.RestTemplateMetricsConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat.TomcatMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthContributorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration
org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration$EnableSameManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementContextAutoConfiguration
org.springframework.boot.autoconfigure.AutoConfigurationPackages
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration
org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration
org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration
org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration
org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration
org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration
org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration
org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration
org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration
org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter
org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration
org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration
org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration
org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration
org.springframework.boot.context.internalConfigurationPropertiesBinder
org.springframework.boot.context.internalConfigurationPropertiesBinderFactory
org.springframework.boot.context.properties.BoundConfigurationProperties
org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor
org.springframework.boot.test.mock.mockito.MockitoPostProcessor
org.springframework.boot.test.mock.mockito.MockitoPostProcessor$SpyPostProcessor
org.springframework.boot.test.web.client.TestRestTemplate
org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer$TestRestTemplateRegistrar
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalCommonAnnotationProcessor
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.event.internalEventListenerFactory
org.springframework.context.event.internalEventListenerProcessor
parameterNamesModule
pathMappedEndpoints
pingHealthContributor
preserveErrorControllerTargetClassPostProcessor
processorMetrics
propertiesMeterFilter
propertySourcesPlaceholderConfigurer
requestContextFilter
requestMappingHandlerAdapter
requestMappingHandlerMapping
resourceHandlerMapping
restTemplateBuilder
restTemplateBuilderConfigurer
restTemplateExchangeTagsProvider
routerFunctionMapping
scheduledBeanLazyInitializationExcludeFilter
server-org.springframework.boot.autoconfigure.web.ServerProperties
servletEndpointDiscoverer
servletEndpointRegistrar
servletExposeExcludePropertyEndpointFilter
servletWebChildContextFactory
servletWebServerFactoryCustomizer
simpleConfig
simpleControllerHandlerAdapter
simpleMeterRegistry
spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties
spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties
spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties
spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties
spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
spring.web-org.springframework.boot.autoconfigure.web.WebProperties
standardJacksonObjectMapperBuilderCustomizer
startPoint
stringHttpMessageConverter
taskExecutorBuilder
taskSchedulerBuilder
themeResolver
tomcatMetricsBinder
tomcatServletWebServerFactory
tomcatServletWebServerFactoryCustomizer
tomcatWebServerFactoryCustomizer
uptimeMetrics
viewControllerHandlerMapping
viewNameTranslator
viewResolver
webEndpointDiscoverer
webEndpointPathMapper
webEndpointServletHandlerMapping
webExposeExcludePropertyEndpointFilter
webMvcMetricsFilter
webMvcTagsProvider
webServerFactoryCustomizerBeanPostProcessor
websocketServletWebServerCustomizer
welcomePageHandlerMapping
2021-09-23 19:00:47.984  INFO 7040 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring TestDispatcherServlet ''
2021-09-23 19:00:47.984  INFO 7040 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2021-09-23 19:00:47.985  INFO 7040 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 1 ms
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.283 s - in me.samarthya.GreetingControllerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ release-demo ---
[INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT.jar
[INFO] 
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ release-demo >>>
[INFO] 
[INFO] --- maven-enforcer-plugin:3.0.0:enforce (enforce-build-tools-versions) @ release-demo ---
[INFO] 
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ release-demo <<<
[INFO] 
[INFO] 
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ release-demo ---
[INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT-sources.jar
[INFO] 
[INFO] --- maven-javadoc-plugin:3.3.0:jar (attach-javadocs) @ release-demo ---
[INFO] No previous run data found, generating javadoc.
[WARNING] Javadoc Warnings
[WARNING] warning: The -footer option is no longer supported and will be ignored.
[WARNING] It may be removed in a future release.
[WARNING] Loading source files for package me.samarthya...
[WARNING] Constructing Javadoc information...
[WARNING] Building index for all the packages and classes...
[WARNING] Standard Doclet version 17+0
[WARNING] Building tree for all the packages and classes...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/GreetingController.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/StartPoint.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/package-summary.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/package-tree.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/class-use/StartPoint.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/class-use/GreetingController.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/me/samarthya/package-use.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/overview-tree.html...
[WARNING] Building index for all classes...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/allclasses-index.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/allpackages-index.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/index-all.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/index.html...
[WARNING] Generating /Users/samarthya/sourcebox/github.com/release-demo/target/apidocs/help-doc.html...
[WARNING] 1 warning
[INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT-javadoc.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.5.4:repackage (default) @ release-demo ---
[INFO] Replacing main artifact with repackaged archive
[INFO] 
[INFO] --- maven-enforcer-plugin:3.0.0:enforce (enforce-build-tools-versions) @ release-demo ---
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ release-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ release-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/samarthya/sourcebox/github.com/release-demo/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ release-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /Users/samarthya/sourcebox/github.com/release-demo/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ release-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/samarthya/sourcebox/github.com/release-demo/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ release-demo ---
[INFO] Skipping execution of surefire because it has already been run for this configuration
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ release-demo ---
[INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT.jar
[INFO] 
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ release-demo >>>
[INFO] 
[INFO] --- maven-enforcer-plugin:3.0.0:enforce (enforce-build-tools-versions) @ release-demo ---
[INFO] 
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ release-demo <<<
[INFO] 
[INFO] 
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ release-demo ---
[WARNING] artifact me.samarthya:release-demo:java-source:sources:1.0.1-SNAPSHOT already attached, replace previous instance
[INFO] 
[INFO] --- maven-javadoc-plugin:3.3.0:jar (attach-javadocs) @ release-demo ---
[INFO] Skipping javadoc generation, everything is up to date.
[INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT-javadoc.jar
[WARNING] artifact me.samarthya:release-demo:javadoc:javadoc:1.0.1-SNAPSHOT already attached, replace previous instance
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.5.4:repackage (default) @ release-demo ---
[INFO] Replacing main artifact with repackaged archive
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ release-demo ---
[INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT.jar to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-SNAPSHOT.jar
[INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/pom.xml to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-SNAPSHOT.pom
[INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT-sources.jar to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-SNAPSHOT-sources.jar
[INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0.1-SNAPSHOT-javadoc.jar to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-SNAPSHOT-javadoc.jar
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ release-demo ---
Downloading from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml
Downloaded from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml (1.2 kB at 1.2 kB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5.jar
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5.jar (19 MB at 2.1 MB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5.pom
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5.pom (8.5 kB at 6.9 kB/s)
Downloading from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml
Downloaded from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml (415 B at 918 B/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml (1.2 kB at 1.1 kB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml (358 B at 347 B/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5-sources.jar
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5-sources.jar (4.2 kB at 3.4 kB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml (1.2 kB at 1.2 kB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5-javadoc.jar
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/release-demo-1.0.1-20210923.133041-5-javadoc.jar (125 kB at 80 kB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0.1-SNAPSHOT/maven-metadata.xml (1.2 kB at 1.2 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  30.192 s
[INFO] Finished at: 2021-09-23T19:01:11+05:30
[INFO] ------------------------------------------------------------------------
```
### Step 1:
Configure the `spring-boot` application to run.

- You can simply execute `mvn spring-boot:run` and the application would start listening on the configured application port and you can validate the exposed end point by using `curl command`

#### curl -m2 http://localhost:8181/ -v

```bash
*   Trying 127.0.0.1...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8181 (#0)
> GET / HTTP/1.1
> Host: localhost:8181
> User-Agent: curl/7.64.1
> Accept: */*
> 
< HTTP/1.1 200 
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 13
< Date: Thu, 23 Sep 2021 08:41:17 GMT
< 
* Connection #0 to host localhost left intact
hello Spring!* Closing connection 0
- 
```

Same can be verified in the browser

<img src="images/Browser-Get.png"/>

## Maven release plugin

Whatever I have used is well explained in the [Official Documentation](http://maven.apache.org/maven-release/maven-release-plugin/).

Assuming you code is available in your repository

<img src="images/github-source.png"/>

### `maven deploy`

The snapshot build the original dev version can simply be deployed using maven clean deploy

<img src="images/snapshot-versions-published.png"/>

```bash
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.332 s - in me.samarthya.GreetingControllerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ release-demo ---
[INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.5.3:repackage (default) @ release-demo ---
[INFO] Replacing main artifact with repackaged archive
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ release-demo ---
[INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/target/release-demo-1.0-SNAPSHOT.jar to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0-SNAPSHOT/release-demo-1.0-SNAPSHOT.jar
[INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/pom.xml to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0-SNAPSHOT/release-demo-1.0-SNAPSHOT.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ release-demo ---
Downloading from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/maven-metadata.xml
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/release-demo-1.0-20210923.100706-1.jar
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/release-demo-1.0-20210923.100706-1.jar (19 MB at 3.1 MB/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/release-demo-1.0-20210923.100706-1.pom
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/release-demo-1.0-20210923.100706-1.pom (5.4 kB at 5.3 kB/s)
Downloading from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml
Downloaded from virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml (371 B at 806 B/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/maven-metadata.xml
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/1.0-SNAPSHOT/maven-metadata.xml (768 B at 853 B/s)
Uploading to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml
Uploaded to virtual-repo: http://reposerver.samarthya.me:8082/artifactory/virtual-maven-repo/me/samarthya/release-demo/maven-metadata.xml (316 B at 296 B/s)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  16.564 s
[INFO] Finished at: 2021-09-23T15:37:23+05:30
[INFO] ------------------------------------------------------------------------
```

## The release plugin

The first step essentially is to prepare for release `mvn release:prepare`. If you want to do a dry run you can pass the argument `-DdryRun=true` it will just verify the sanctity of the build.

```bash
release-demo@samarthya>mvn release:prepare  
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< me.samarthya:release-demo >----------------------
[INFO] Building release-demo 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-release-plugin:3.0.0-M4:prepare (default-cli) @ release-demo ---
[INFO] phase verify-release-configuration
[INFO] starting prepare goal, composed of 17 phases: check-poms, scm-check-modifications, check-dependency-snapshots, create-backup-poms, map-release-versions, input-variables, map-development-versions, rewrite-poms-for-release, generate-release-poms, run-preparation-goals, scm-commit-release, scm-tag, rewrite-poms-for-development, remove-release-poms, run-completion-goals, scm-commit-development, end-release
[INFO] Resuming release from phase 'scm-commit-release'
[INFO] [prepare] 11/17 scm-commit-release
[INFO] Checking in modified POMs...
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git add -- pom.xml
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git rev-parse --show-prefix
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git status --porcelain .
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[WARNING] Ignoring unrecognized line: ?? pom.xml.releaseBackup
[INFO] [prepare] 12/17 scm-tag
[INFO] Tagging release with the label v1.0.0...
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git tag -F /var/folders/ry/xrnmhhjx5_sdyq4mv8dk54s00000gn/T/maven-scm-1110674746.commit v1.0.0
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git push https://samarthya:********@github.com/samarthya/release-demo.git refs/tags/v1.0.0
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git ls-files
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] [prepare] 13/17 rewrite-poms-for-development
[INFO] Transforming 'release-demo'...
[INFO] [prepare] 14/17 remove-release-poms
[INFO] Not removing release POMs
[INFO] [prepare] 15/17 run-completion-goals
[INFO] [prepare] 16/17 scm-commit-development
[INFO] Checking in modified POMs...
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git add -- pom.xml
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git rev-parse --show-prefix
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git status --porcelain .
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[WARNING] Ignoring unrecognized line: ?? pom.xml.releaseBackup
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git commit --verbose -F /var/folders/ry/xrnmhhjx5_sdyq4mv8dk54s00000gn/T/maven-scm-1164629822.commit
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git symbolic-ref HEAD
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo && git push https://samarthya:********@github.com/samarthya/release-demo.git refs/heads/main:refs/heads/main
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo
[INFO] [prepare] 17/17 end-release
[INFO] Release preparation complete.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.106 s
[INFO] Finished at: 2021-09-23T17:00:30+05:30
[INFO] ------------------------------------------------------------------------
```

The second step is to perform the release using `mvn release:perform`. It essentialy builds on the first step and performs the tagging, artifact upload if configured and 

```bash
release-demo@samarthya>mvn release:perform
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< me.samarthya:release-demo >----------------------
[INFO] Building release-demo 1.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-release-plugin:3.0.0-M4:perform (default-cli) @ release-demo ---
[INFO] phase verify-release-configuration
[INFO] starting perform goal, composed of 3 phases: verify-completed-prepare-phases, checkout-project-from-scm, run-perform-goals
[INFO] [perform] 1/3 verify-completed-prepare-phases
[INFO] [perform] 2/3 checkout-project-from-scm
[INFO] Checking out the project to perform the release ...
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo/target && git clone --depth 1 --branch v1.0.0 https://samarthya:********@github.com/samarthya/release-demo.git checkout
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo/target
[INFO] Executing: /bin/sh -c cd /var/folders/ry/xrnmhhjx5_sdyq4mv8dk54s00000gn/T/ && git ls-remote https://samarthya:********@github.com/samarthya/release-demo.git
[INFO] Working directory: /var/folders/ry/xrnmhhjx5_sdyq4mv8dk54s00000gn/T
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo/target/checkout && git fetch https://samarthya:********@github.com/samarthya/release-demo.git
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo/target/checkout
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo/target/checkout && git checkout v1.0.0
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo/target/checkout
[INFO] Executing: /bin/sh -c cd /Users/samarthya/sourcebox/github.com/release-demo/target/checkout && git ls-files
[INFO] Working directory: /Users/samarthya/sourcebox/github.com/release-demo/target/checkout
[INFO] [perform] 3/3 run-perform-goals
[INFO] Invoking perform goals in directory /Users/samarthya/sourcebox/github.com/release-demo/target/checkout
[INFO] Executing goals 'deploy'...
[INFO] pomFileName is already set, ignoring the -f argument
[WARNING] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] [INFO] Scanning for projects...
[INFO] [INFO] 
[INFO] [INFO] ---------------------< me.samarthya:release-demo >----------------------
[INFO] [INFO] Building release-demo 1.0.0
[INFO] [INFO] --------------------------------[ jar ]---------------------------------
[INFO] [INFO] 
[INFO] [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ release-demo ---
[INFO] [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] [INFO] Copying 1 resource
[INFO] [INFO] 
[INFO] [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ release-demo ---
[INFO] [INFO] Changes detected - recompiling the module!
[INFO] [WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] [INFO] Compiling 2 source files to /Users/samarthya/sourcebox/github.com/release-demo/target/checkout/target/classes
[INFO] [INFO] 
[INFO] [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ release-demo ---
[INFO] [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] [INFO] skip non existing resourceDirectory /Users/samarthya/sourcebox/github.com/release-demo/target/checkout/src/test/resources
[INFO] [INFO] 
[INFO] [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ release-demo ---
[INFO] [INFO] Changes detected - recompiling the module!
[INFO] [WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] [INFO] Compiling 1 source file to /Users/samarthya/sourcebox/github.com/release-demo/target/checkout/target/test-classes
[INFO] [INFO] 
[INFO] [INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ release-demo ---
[INFO] [INFO] 
[INFO] [INFO] -------------------------------------------------------
[INFO] [INFO]  T E S T S
[INFO] [INFO] -------------------------------------------------------
[INFO] [INFO] Running me.samarthya.GreetingControllerTest
[INFO] 17:00:57.699 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
[INFO] 17:00:57.719 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
[INFO] 17:00:57.752 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [me.samarthya.GreetingControllerTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
[INFO] 17:00:57.760 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [me.samarthya.GreetingControllerTest], using SpringBootContextLoader
[INFO] 17:00:57.762 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [me.samarthya.GreetingControllerTest]: class path resource [me/samarthya/GreetingControllerTest-context.xml] does not exist
[INFO] 17:00:57.763 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [me.samarthya.GreetingControllerTest]: class path resource [me/samarthya/GreetingControllerTestContext.groovy] does not exist
[INFO] 17:00:57.763 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [me.samarthya.GreetingControllerTest]: no resource found for suffixes {-context.xml, Context.groovy}.
[INFO] 17:00:57.763 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [me.samarthya.GreetingControllerTest]: GreetingControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
[INFO] 17:00:57.806 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [me.samarthya.GreetingControllerTest]
[INFO] 17:00:57.862 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/Users/samarthya/sourcebox/github.com/release-demo/target/checkout/target/classes/me/samarthya/StartPoint.class]
[INFO] 17:00:57.863 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration me.samarthya.StartPoint for test class me.samarthya.GreetingControllerTest
[INFO] 17:00:57.936 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [me.samarthya.GreetingControllerTest]: using defaults.
[INFO] 17:00:57.936 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
[INFO] 17:00:57.947 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
[INFO] 17:00:57.947 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
[INFO] 17:00:57.947 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@727eb8cb, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@39d9314d, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@b978d10, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@5b7a8434, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@5c45d770, org.springframework.test.context.support.DirtiesContextTestExecutionListener@2ce6c6ec, org.springframework.test.context.event.EventPublishingTestExecutionListener@1bae316d, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@147a5d08, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@6676f6a0, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@7cbd9d24, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1672fe87, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@5026735c, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@1b45c0e]
[INFO] 17:00:57.950 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@352c1b98 testClass = GreetingControllerTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@21129f1f testClass = GreetingControllerTest, locations = '{}', classes = '{class me.samarthya.StartPoint}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@41c2284a, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@1fb700ee, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@52102734, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@55b53d44, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@55536d9e, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@57855c9a], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false]], class annotated with @DirtiesContext [false] with mode [null].
[INFO] 17:00:57.959 [main] DEBUG org.springframework.test.context.support.DependencyInjectionTestExecutionListener - Performing dependency injection for test context [[DefaultTestContext@352c1b98 testClass = GreetingControllerTest, testInstance = me.samarthya.GreetingControllerTest@1115ec15, testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@21129f1f testClass = GreetingControllerTest, locations = '{}', classes = '{class me.samarthya.StartPoint}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@41c2284a, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@1fb700ee, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@52102734, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@55b53d44, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@55536d9e, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@57855c9a], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false, 'org.springframework.test.context.event.ApplicationEventsTestExecutionListener.recordApplicationEvents' -> false]]].
[INFO] 17:00:57.985 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}
[INFO] 
[INFO]   .   ____          _            __ _ _
[INFO]  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
[INFO] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
[INFO]  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
[INFO]   '  |____| .__|_| |_|_| |_\__, | / / / /
[INFO]  =========|_|==============|___/=/_/_/_/
[INFO]  :: Spring Boot ::                (v2.5.3)
[INFO] 
[INFO] 2021-09-23 17:00:58.233  INFO 96184 --- [           main] me.samarthya.GreetingControllerTest      : Starting GreetingControllerTest using Java 17 on C02Z45LYLVDR with PID 96184 (started by samarthya in /Users/samarthya/sourcebox/github.com/release-demo/target/checkout)
[INFO] 2021-09-23 17:00:58.234  INFO 96184 --- [           main] me.samarthya.GreetingControllerTest      : No active profile set, falling back to default profiles: default
[INFO] 2021-09-23 17:00:59.151  INFO 96184 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
[INFO] 2021-09-23 17:00:59.160  INFO 96184 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
[INFO] 2021-09-23 17:00:59.160  INFO 96184 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.50]
[INFO] 2021-09-23 17:00:59.230  INFO 96184 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
[INFO] 2021-09-23 17:00:59.230  INFO 96184 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 976 ms
[INFO] 2021-09-23 17:00:59.891  INFO 96184 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
[INFO] 2021-09-23 17:00:59.963  INFO 96184 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 59861 (http) with context path ''
[INFO] 2021-09-23 17:00:59.974  INFO 96184 --- [           main] me.samarthya.GreetingControllerTest      : Started GreetingControllerTest in 1.987 seconds (JVM running for 2.819)
[INFO] applicationAvailability
[INFO] applicationTaskExecutor
[INFO] basicErrorController
[INFO] beanNameHandlerMapping
[INFO] beanNameViewResolver
[INFO] characterEncodingFilter
[INFO] classLoaderMetrics
[INFO] commandLineRunner
[INFO] controllerEndpointDiscoverer
[INFO] controllerEndpointHandlerMapping
[INFO] controllerExposeExcludePropertyEndpointFilter
[INFO] conventionErrorViewResolver
[INFO] defaultServletHandlerMapping
[INFO] defaultViewResolver
[INFO] diskSpaceHealthIndicator
[INFO] dispatcherServlet
[INFO] dispatcherServletRegistration
[INFO] endpointCachingOperationInvokerAdvisor
[INFO] endpointMediaTypes
[INFO] endpointOperationParameterMapper
[INFO] envInfoContributor
[INFO] error
[INFO] errorAttributes
[INFO] errorPageCustomizer
[INFO] errorPageRegistrarBeanPostProcessor
[INFO] fileDescriptorMetrics
[INFO] flashMapManager
[INFO] forceAutoProxyCreatorToUseClassProxying
[INFO] formContentFilter
[INFO] greetingController
[INFO] handlerExceptionResolver
[INFO] handlerFunctionAdapter
[INFO] healthContributorRegistry
[INFO] healthEndpoint
[INFO] healthEndpointGroups
[INFO] healthEndpointGroupsBeanPostProcessor
[INFO] healthEndpointWebExtension
[INFO] healthHttpCodeStatusMapper
[INFO] healthStatusAggregator
[INFO] httpRequestHandlerAdapter
[INFO] jacksonObjectMapper
[INFO] jacksonObjectMapperBuilder
[INFO] jsonComponentModule
[INFO] jvmGcMetrics
[INFO] jvmMemoryMetrics
[INFO] jvmThreadMetrics
[INFO] lifecycleProcessor
[INFO] localeCharsetMappingsCustomizer
[INFO] localeResolver
[INFO] logbackMetrics
[INFO] management.endpoint.health-org.springframework.boot.actuate.autoconfigure.health.HealthEndpointProperties
[INFO] management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties
[INFO] management.endpoints.web.cors-org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties
[INFO] management.health.diskspace-org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthIndicatorProperties
[INFO] management.info-org.springframework.boot.actuate.autoconfigure.info.InfoContributorProperties
[INFO] management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties
[INFO] management.metrics.export.simple-org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleProperties
[INFO] management.server-org.springframework.boot.actuate.autoconfigure.web.server.ManagementServerProperties
[INFO] managementServletContext
[INFO] mappingJackson2HttpMessageConverter
[INFO] messageConverters
[INFO] meterRegistryPostProcessor
[INFO] metricsHttpClientUriTagFilter
[INFO] metricsHttpServerUriTagFilter
[INFO] metricsRestTemplateCustomizer
[INFO] metricsWebMvcConfigurer
[INFO] micrometerClock
[INFO] multipartConfigElement
[INFO] multipartResolver
[INFO] mvcContentNegotiationManager
[INFO] mvcConversionService
[INFO] mvcHandlerMappingIntrospector
[INFO] mvcPathMatcher
[INFO] mvcPatternParser
[INFO] mvcResourceUrlProvider
[INFO] mvcUriComponentsContributor
[INFO] mvcUrlPathHelper
[INFO] mvcValidator
[INFO] mvcViewResolver
[INFO] org.springframework.aop.config.internalAutoProxyCreator
[INFO] org.springframework.boot.actuate.autoconfigure.availability.AvailabilityHealthContributorAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration$WebMvcServletEndpointManagementContextConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration$WebEndpointServletConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.health.HealthEndpointConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.health.HealthEndpointWebExtensionConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.LogbackMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.integration.IntegrationMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.web.client.RestTemplateMetricsConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat.TomcatMetricsAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthContributorAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration$EnableSameManagementContextConfiguration
[INFO] org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementContextAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.AutoConfigurationPackages
[INFO] org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
[INFO] org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration
[INFO] org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration
[INFO] org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration
[INFO] org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
[INFO] org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration
[INFO] org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration
[INFO] org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration
[INFO] org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration
[INFO] org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat
[INFO] org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter
[INFO] org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration
[INFO] org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration
[INFO] org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration
[INFO] org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration
[INFO] org.springframework.boot.context.internalConfigurationPropertiesBinder
[INFO] org.springframework.boot.context.internalConfigurationPropertiesBinderFactory
[INFO] org.springframework.boot.context.properties.BoundConfigurationProperties
[INFO] org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
[INFO] org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
[INFO] org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor
[INFO] org.springframework.boot.test.mock.mockito.MockitoPostProcessor
[INFO] org.springframework.boot.test.mock.mockito.MockitoPostProcessor$SpyPostProcessor
[INFO] org.springframework.boot.test.web.client.TestRestTemplate
[INFO] org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer$TestRestTemplateRegistrar
[INFO] org.springframework.context.annotation.internalAutowiredAnnotationProcessor
[INFO] org.springframework.context.annotation.internalCommonAnnotationProcessor
[INFO] org.springframework.context.annotation.internalConfigurationAnnotationProcessor
[INFO] org.springframework.context.event.internalEventListenerFactory
[INFO] org.springframework.context.event.internalEventListenerProcessor
[INFO] parameterNamesModule
[INFO] pathMappedEndpoints
[INFO] pingHealthContributor
[INFO] preserveErrorControllerTargetClassPostProcessor
[INFO] processorMetrics
[INFO] propertiesMeterFilter
[INFO] propertySourcesPlaceholderConfigurer
[INFO] requestContextFilter
[INFO] requestMappingHandlerAdapter
[INFO] requestMappingHandlerMapping
[INFO] resourceHandlerMapping
[INFO] restTemplateBuilder
[INFO] restTemplateBuilderConfigurer
[INFO] restTemplateExchangeTagsProvider
[INFO] routerFunctionMapping
[INFO] scheduledBeanLazyInitializationExcludeFilter
[INFO] server-org.springframework.boot.autoconfigure.web.ServerProperties
[INFO] servletEndpointDiscoverer
[INFO] servletEndpointRegistrar
[INFO] servletExposeExcludePropertyEndpointFilter
[INFO] servletWebChildContextFactory
[INFO] servletWebServerFactoryCustomizer
[INFO] simpleConfig
[INFO] simpleControllerHandlerAdapter
[INFO] simpleMeterRegistry
[INFO] spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
[INFO] spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties
[INFO] spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
[INFO] spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties
[INFO] spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties
[INFO] spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties
[INFO] spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
[INFO] spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
[INFO] spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
[INFO] spring.web-org.springframework.boot.autoconfigure.web.WebProperties
[INFO] standardJacksonObjectMapperBuilderCustomizer
[INFO] startPoint
[INFO] stringHttpMessageConverter
[INFO] taskExecutorBuilder
[INFO] taskSchedulerBuilder
[INFO] themeResolver
[INFO] tomcatMetricsBinder
[INFO] tomcatServletWebServerFactory
[INFO] tomcatServletWebServerFactoryCustomizer
[INFO] tomcatWebServerFactoryCustomizer
[INFO] uptimeMetrics
[INFO] viewControllerHandlerMapping
[INFO] viewNameTranslator
[INFO] viewResolver
[INFO] webEndpointDiscoverer
[INFO] webEndpointPathMapper
[INFO] webEndpointServletHandlerMapping
[INFO] webExposeExcludePropertyEndpointFilter
[INFO] webMvcMetricsFilter
[INFO] webMvcTagsProvider
[INFO] webServerFactoryCustomizerBeanPostProcessor
[INFO] websocketServletWebServerCustomizer
[INFO] welcomePageHandlerMapping
[INFO] 2021-09-23 17:01:00.289  INFO 96184 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring TestDispatcherServlet ''
[INFO] 2021-09-23 17:01:00.290  INFO 96184 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
[INFO] 2021-09-23 17:01:00.290  INFO 96184 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
[INFO] [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.757 s - in me.samarthya.GreetingControllerTest
[INFO] [INFO] 
[INFO] [INFO] Results:
[INFO] [INFO] 
[INFO] [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] [INFO] 
[INFO] [INFO] 
[INFO] [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ release-demo ---
[INFO] [INFO] Building jar: /Users/samarthya/sourcebox/github.com/release-demo/target/checkout/target/release-demo-1.0.0.jar
[INFO] [INFO] 
[INFO] [INFO] --- spring-boot-maven-plugin:2.5.3:repackage (default) @ release-demo ---
[INFO] [INFO] Replacing main artifact with repackaged archive
[INFO] [INFO] 
[INFO] [INFO] --- maven-install-plugin:2.4:install (default-install) @ release-demo ---
[INFO] [INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/target/checkout/target/release-demo-1.0.0.jar to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0.0/release-demo-1.0.0.jar
[INFO] [INFO] Installing /Users/samarthya/sourcebox/github.com/release-demo/target/checkout/pom.xml to /Users/samarthya/.m2/repository/me/samarthya/release-demo/1.0.0/release-demo-1.0.0.pom
[INFO] [INFO] 
[INFO] [INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ release-demo ---
[INFO] Uploading to virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/1.0.0/release-demo-1.0.0.jar
[INFO] Progress (1): 0.2/19 MB
[INFO] Progress (1): 0.4/19 MB
[INFO] Progress (1): 0.6/19 MB
[INFO] Progress (1): 0.8/19 MB
[INFO] Progress (1): 1.0/19 MB
[INFO] Progress (1): 1.2/19 MB
[INFO] Progress (1): 1.3/19 MB
[INFO] Progress (1): 1.5/19 MB
[INFO] Progress (1): 1.7/19 MB
[INFO] Progress (1): 1.9/19 MB
[INFO] Progress (1): 2.1/19 MB
[INFO] Progress (1): 2.3/19 MB
[INFO] Progress (1): 2.5/19 MB
[INFO] Progress (1): 2.7/19 MB
[INFO] Progress (1): 2.9/19 MB
[INFO] Progress (1): 3.1/19 MB
[INFO] Progress (1): 3.3/19 MB
[INFO] Progress (1): 3.5/19 MB
[INFO] Progress (1): 3.7/19 MB
[INFO] Progress (1): 3.9/19 MB
[INFO] Progress (1): 4.0/19 MB
[INFO] Progress (1): 4.2/19 MB
[INFO] Progress (1): 4.4/19 MB
[INFO] Progress (1): 4.6/19 MB
[INFO] Progress (1): 4.8/19 MB
[INFO] Progress (1): 5.0/19 MB
[INFO] Progress (1): 5.2/19 MB
[INFO] Progress (1): 5.4/19 MB
[INFO] Progress (1): 5.6/19 MB
[INFO] Progress (1): 5.8/19 MB
[INFO] Progress (1): 6.0/19 MB
[INFO] Progress (1): 6.2/19 MB
[INFO] Progress (1): 6.4/19 MB
[INFO] Progress (1): 6.5/19 MB
[INFO] Progress (1): 6.7/19 MB
[INFO] Progress (1): 6.9/19 MB
[INFO] Progress (1): 7.1/19 MB
[INFO] Progress (1): 7.3/19 MB
[INFO] Progress (1): 7.5/19 MB
[INFO] Progress (1): 7.7/19 MB
[INFO] Progress (1): 7.9/19 MB
[INFO] Progress (1): 8.1/19 MB
[INFO] Progress (1): 8.3/19 MB
[INFO] Progress (1): 8.5/19 MB
[INFO] Progress (1): 8.7/19 MB
[INFO] Progress (1): 8.9/19 MB
[INFO] Progress (1): 9.0/19 MB
[INFO] Progress (1): 9.2/19 MB
[INFO] Progress (1): 9.4/19 MB
[INFO] Progress (1): 9.6/19 MB
[INFO] Progress (1): 9.8/19 MB
[INFO] Progress (1): 10/19 MB 
[INFO] Progress (1): 10/19 MB
[INFO] Progress (1): 10/19 MB
[INFO] Progress (1): 11/19 MB
[INFO] Progress (1): 11/19 MB
[INFO] Progress (1): 11/19 MB
[INFO] Progress (1): 11/19 MB
[INFO] Progress (1): 11/19 MB
[INFO] Progress (1): 12/19 MB
[INFO] Progress (1): 12/19 MB
[INFO] Progress (1): 12/19 MB
[INFO] Progress (1): 12/19 MB
[INFO] Progress (1): 12/19 MB
[INFO] Progress (1): 13/19 MB
[INFO] Progress (1): 13/19 MB
[INFO] Progress (1): 13/19 MB
[INFO] Progress (1): 13/19 MB
[INFO] Progress (1): 13/19 MB
[INFO] Progress (1): 13/19 MB
[INFO] Progress (1): 14/19 MB
[INFO] Progress (1): 14/19 MB
[INFO] Progress (1): 14/19 MB
[INFO] Progress (1): 14/19 MB
[INFO] Progress (1): 14/19 MB
[INFO] Progress (1): 15/19 MB
[INFO] Progress (1): 15/19 MB
[INFO] Progress (1): 15/19 MB
[INFO] Progress (1): 15/19 MB
[INFO] Progress (1): 15/19 MB
[INFO] Progress (1): 16/19 MB
[INFO] Progress (1): 16/19 MB
[INFO] Progress (1): 16/19 MB
[INFO] Progress (1): 16/19 MB
[INFO] Progress (1): 16/19 MB
[INFO] Progress (1): 17/19 MB
[INFO] Progress (1): 17/19 MB
[INFO] Progress (1): 17/19 MB
[INFO] Progress (1): 17/19 MB
[INFO] Progress (1): 17/19 MB
[INFO] Progress (1): 18/19 MB
[INFO] Progress (1): 18/19 MB
[INFO] Progress (1): 18/19 MB
[INFO] Progress (1): 18/19 MB
[INFO] Progress (1): 18/19 MB
[INFO] Progress (1): 18/19 MB
[INFO] Progress (1): 19/19 MB
[INFO] Progress (1): 19/19 MB
[INFO] Progress (1): 19/19 MB
[INFO] Progress (1): 19/19 MB
[INFO] Progress (1): 19 MB   
[INFO]                    
[INFO] Uploaded to virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/1.0.0/release-demo-1.0.0.jar (19 MB at 2.8 MB/s)
[INFO] Uploading to virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/1.0.0/release-demo-1.0.0.pom
[INFO] Progress (1): 4.1/5.7 kB
[INFO] Progress (1): 5.7 kB    
[INFO]                     
[INFO] Uploaded to virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/1.0.0/release-demo-1.0.0.pom (5.7 kB at 6.5 kB/s)
[INFO] Downloading from virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/maven-metadata.xml
[INFO] Progress (1): 379 B
[INFO]                    
[INFO] Downloaded from virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/maven-metadata.xml (379 B at 1.3 kB/s)
[INFO] Uploading to virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/maven-metadata.xml
[INFO] Progress (1): 331 B
[INFO]                    
[INFO] Uploaded to virtual-repo-release: http://reposerver.samarthya.me:8082/artifactory/maven-local-release/me/samarthya/release-demo/maven-metadata.xml (331 B at 387 B/s)
[INFO] [INFO] ------------------------------------------------------------------------
[INFO] [INFO] BUILD SUCCESS
[INFO] [INFO] ------------------------------------------------------------------------
[INFO] [INFO] Total time:  15.368 s
[INFO] [INFO] Finished at: 2021-09-23T17:01:10+05:30
[INFO] [INFO] ------------------------------------------------------------------------
[INFO] phase cleanup
[INFO] Cleaning up after release...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  25.751 s
[INFO] Finished at: 2021-09-23T17:01:10+05:30
[INFO] ------------------------------------------------------------------------
```

In case there are errors you can use `mvn release:rollback` and `mvn release:clean` to clean up all the local changes.

<img src="images/maven-release-artifact.png"/>

### Help regarding a goal

You can get more informatio on this by invoking `mvn release:help -Dgoal=prepare`
