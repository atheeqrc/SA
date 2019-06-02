package numberseriesservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.implementations.NumberSeriesImplemantation;
import com.sliit.sa.interfaces.NumberSeriesInterfaces;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		this.registerNumberSeriesService();
		System.out.println("Number Series Service started");
	}

	
	public void registerNumberSeriesService() {
		NumberSeriesInterfaces number_service = new NumberSeriesImplemantation();
		context.registerService(NumberSeriesInterfaces.class, number_service, null);
	}
	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
