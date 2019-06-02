package programmerservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.sliit.sa.implementations.ProgrammerImplementations;
import com.sliit.sa.interfaces.ProgrammerInterfaces;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		this.registerProgrammerService();
		System.out.println("Programmer Calculator Service Started");
	}
	
	public void registerProgrammerService() {
		ProgrammerInterfaces program_service = new ProgrammerImplementations();
		context.registerService(ProgrammerInterfaces.class, program_service, null);
	}

	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Programmer Calculator Service Stopped");
	}

}
