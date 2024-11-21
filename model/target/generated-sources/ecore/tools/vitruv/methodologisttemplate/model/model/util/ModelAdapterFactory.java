/**
 */
package tools.vitruv.methodologisttemplate.model.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.methodologisttemplate.model.model.Component;
import tools.vitruv.methodologisttemplate.model.model.Device;
import tools.vitruv.methodologisttemplate.model.model.Link;
import tools.vitruv.methodologisttemplate.model.model.ModelPackage;
import tools.vitruv.methodologisttemplate.model.model.Protocol;
import tools.vitruv.methodologisttemplate.model.model.Server;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.methodologisttemplate.model.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>()
		{
			@Override
			public Adapter caseComponent(Component object)
			{
				return createComponentAdapter();
			}
			@Override
			public Adapter caseLink(Link object)
			{
				return createLinkAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object)
			{
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseDevice(Device object)
			{
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseServer(Server object)
			{
				return createServerAdapter();
			}
			@Override
			public Adapter caseSystem(tools.vitruv.methodologisttemplate.model.model.System object)
			{
				return createSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.methodologisttemplate.model.model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.methodologisttemplate.model.model.Component
	 * @generated
	 */
	public Adapter createComponentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.methodologisttemplate.model.model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.methodologisttemplate.model.model.Link
	 * @generated
	 */
	public Adapter createLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.methodologisttemplate.model.model.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.methodologisttemplate.model.model.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.methodologisttemplate.model.model.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.methodologisttemplate.model.model.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.methodologisttemplate.model.model.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.methodologisttemplate.model.model.Server
	 * @generated
	 */
	public Adapter createServerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.vitruv.methodologisttemplate.model.model.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.vitruv.methodologisttemplate.model.model.System
	 * @generated
	 */
	public Adapter createSystemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ModelAdapterFactory
