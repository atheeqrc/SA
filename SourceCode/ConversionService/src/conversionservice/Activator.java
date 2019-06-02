package conversionservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.implementations.conversionServiceImpl;
import com.sliit.sa.interfaces.conversionService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		this.registerConversionService();
		System.out.println("Conversion Service started");
	}

	public void registerConversionService() {
		conversionService conversion_service = new conversionServiceImpl();
		context.registerService(conversionService.class, conversion_service, null);
	}
	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
