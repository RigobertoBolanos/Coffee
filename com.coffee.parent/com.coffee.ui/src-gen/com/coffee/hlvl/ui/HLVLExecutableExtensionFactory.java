/*
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.ui;

import com.coffee.ui.internal.CoffeeActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HLVLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CoffeeActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CoffeeActivator.getInstance().getInjector(CoffeeActivator.COM_COFFEE_HLVL_HLVL);
	}
	
}
