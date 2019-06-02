package basicservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.implementations.BasicService;
import com.sliit.sa.interfaces.BasicServiceInterfaces;


public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		this.registerBasicService();
		System.out.println("Basic Service Started");
	}

	public void registerBasicService() {
		BasicServiceInterfaces basic_service = new BasicService();
		context.registerService(BasicServiceInterfaces.class, basic_service, null);
	}
	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Basic Service Stopped");
	}

}
