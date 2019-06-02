package calculatorconsumer;


import javax.swing.JOptionPane;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.sliit.sa.interfaces.ProgrammerInterfaces;
import com.sliit.sa.interfaces.ScientificInterfaces;
import com.sliit.sa.interfaces.ShapeService;
import com.sliit.sa.interfaces.SolidShapeService;
import com.sliit.sa.interfaces.SpecialOfferService;
import com.sliit.sa.interfaces.conversionService;
import com.sliit.sa.interfaces.BasicServiceInterfaces;
import com.sliit.sa.interfaces.FactoryService;
import com.sliit.sa.interfaces.NumberSeriesInterfaces;


public class Activator implements BundleActivator {

	private static BundleContext context;
	
	private static ServiceTracker basicTracker;
	private static ServiceTracker programmerTracker;
	private static ServiceTracker scientificTracker;
	private static ServiceTracker shapeTracker;
	private static ServiceTracker specialOffersTracker;
	private static ServiceTracker numberSeriesTracker;
	private static ServiceTracker conversionTracker;
	
	private static BasicServiceInterfaces basic_service;
	private static ProgrammerInterfaces programmer_service;
	private static ScientificInterfaces scientific_service;
	private static FactoryService shape_service;
	private static SpecialOfferService offer_service;
	private static NumberSeriesInterfaces numberSeries_service;
	private static conversionService conversion_service;

	static BundleContext getContext() {
		return context;
	}

	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		int type =1;
		String input;
		
		//tracking the services 
		basicTracker = new ServiceTracker(context, BasicServiceInterfaces.class.getName(), null);
		programmerTracker = new ServiceTracker(context, ProgrammerInterfaces.class.getName(), null);
		scientificTracker = new ServiceTracker(context, ScientificInterfaces.class.getName(), null);
		shapeTracker = new ServiceTracker(context, FactoryService.class.getName(), null);
		specialOffersTracker = new ServiceTracker(context, SpecialOfferService.class.getName(), null);
		numberSeriesTracker = new ServiceTracker(context, NumberSeriesInterfaces.class.getName(), null);
		conversionTracker =  new ServiceTracker(context,conversionService.class.getName(),null);
		
		//service trackers are opened
		basicTracker.open();
		programmerTracker.open();
		scientificTracker.open();
		shapeTracker.open();
		specialOffersTracker.open();
		numberSeriesTracker.open();
		conversionTracker.open();
				
		while(type!=0) {
		// The input box is popped	
		input=	JOptionPane.showInputDialog(null,"Press 1 - Basic Service \n Press 2 - Scientific Service \n Press 3 - Programmer Service \n\n"
												+ "Press 4 - Shape Service \n Press 5 - Special Offer Service \n\n Press 6 - Number Series Service \n\n "
												+ "Press 7 - Conversion Service \n\n Press 0 - Exit ");
		if(Validate.validateNumber(input)) {
			type=Integer.parseInt(input);
			//Depending on the service selected, the user can access the services
			// If the service is stopped, it will show an error message
			if(type==1) {
				//getting the reference of the basic service
				basic_service = (BasicServiceInterfaces) basicTracker.getService();
				if (basic_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Basic Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				
				BasicCalculator basicCalculator = new BasicCalculator();
				basicCalculator.BasicCalculatorOperations(basic_service);
			}
			if(type==2) {
				//getting the reference of the scientific service
				scientific_service = (ScientificInterfaces) scientificTracker.getService();
				if (scientific_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Scientific Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				ScientificCalculator scientificCalculator = new ScientificCalculator();
				scientificCalculator.ScientificCalculatorOperations(scientific_service);
			}
			if(type==3) {
				//getting the reference of the programmer service
				programmer_service = (ProgrammerInterfaces) programmerTracker.getService();
				if (programmer_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Programmer Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				ProgrammerCalculator programmerCalculator = new ProgrammerCalculator();
				programmerCalculator.ProgrammerCalculatorOperations(programmer_service);
			}
			if(type==4) {
				//getting the reference of the shape factory service
				shape_service = (FactoryService) shapeTracker.getService();
				if(shape_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Shape Calculator Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				ShapeCalculator shapeCalculator = new ShapeCalculator();
				shapeCalculator.shapeCalculatorOperations(shape_service);
			}
			if(type==5) {
				//getting the reference of the discount service
				offer_service = (SpecialOfferService) specialOffersTracker.getService();
				if(offer_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Special Offer Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				DiscountCalculator discountCalculator = new DiscountCalculator();
				discountCalculator.DiscountCalculatorOperation(offer_service);
			}
			
			if (type==6) {
				//getting the reference of the shape numberSeries service
				numberSeries_service = (NumberSeriesInterfaces) numberSeriesTracker.getService();
				if(numberSeries_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Number Series Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				NumberSeriesCalculator numberSeriesCalculator = new NumberSeriesCalculator();
				numberSeriesCalculator.NumberSeriesCalculatorOperations(numberSeries_service);
			}
			if (type==7) {
				//getting the reference of the conversion service
				conversion_service = (conversionService) conversionTracker.getService();
				if(conversion_service==null) {
					JOptionPane.showMessageDialog(null, "Please Run the Number Series Service", "Service Failure",JOptionPane.OK_OPTION );
        			continue;
				}
				ConversionCalculator conversionCalculator = new ConversionCalculator();
				conversionCalculator.ConversionCalculatorOperation(conversion_service);
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter the correct service", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
			continue;
		}
		}
	}

	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		// service trackers are closed
		basicTracker.close();;
		programmerTracker.close();
		scientificTracker.close();
		shapeTracker.close();
		specialOffersTracker.close();
		numberSeriesTracker.close();
	}

}
