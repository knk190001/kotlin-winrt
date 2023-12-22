package Windows.UI.Xaml.Automation

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AutomationAnnotation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.AutomationAnnotation;{fb3c30ca-03d8-4618-91bf-e4d84f4af318})")
@WinRTByReference(brClass = AutomationAnnotation.ByReference::class)
public class AutomationAnnotation(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAutomationAnnotation.WithDefault, IWinRTObject {
  private val __4645825_Interface: IAutomationAnnotation.WithDefault by lazy {
    as_4645825()
  }


  public override val __4645825_Ptr: JNAPointer? by lazy {
    __4645825_Interface.__4645825_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__4645825_Interface)

  public constructor() : this(ABI.activate())

  public constructor(type: AnnotationType) : this(ABI.activate(type))

  public constructor(type: AnnotationType, element: UIElement) : this(ABI.activate(type, element))

  private fun as_4645825(): IAutomationAnnotation.WithDefault {
    if(pointer == NULL) {
      return(IAutomationAnnotation.ABI.makeIAutomationAnnotation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationAnnotation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationAnnotation.ABI.makeIAutomationAnnotation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationAnnotation> {
    public override fun getValue() = AutomationAnnotation(pointer.getPointer(0))

    public fun setValue(value: AutomationAnnotation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationAnnotation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAutomationAnnotationStatics_Instance: IAutomationAnnotationStatics by lazy {
      createIAutomationAnnotationStatics()
    }


    public val IAutomationAnnotationFactory_Instance: IAutomationAnnotationFactory by lazy {
      createIAutomationAnnotationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationAnnotation".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIAutomationAnnotationStatics(): IAutomationAnnotationStatics {
      val refiid = Guid.REFIID(IAutomationAnnotationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationAnnotation".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationAnnotationStatics.ABI.makeIAutomationAnnotationStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationAnnotationFactory(): IAutomationAnnotationFactory {
      val refiid = Guid.REFIID(IAutomationAnnotationFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationAnnotation".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAutomationAnnotationFactory.ABI.makeIAutomationAnnotationFactory(factoryActivatorPtr.value))
    }

    public fun activate(type: AnnotationType): JNAPointer? =
        IAutomationAnnotationFactory_Instance.CreateInstance(type)?.pointer

    public fun activate(type: AnnotationType, element: UIElement): JNAPointer? =
        IAutomationAnnotationFactory_Instance.CreateWithElementParameter(type, element)?.pointer

    public override fun fromNative(segment: MemoryAddress): AutomationAnnotation {
      val address = segment.toRawLongValue()
      return AutomationAnnotation(Pointer(address))
    }

    public override fun toNative(obj: AutomationAnnotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TypeProperty() = ABI.IAutomationAnnotationStatics_Instance.get_TypeProperty()

    public fun get_ElementProperty() =
        ABI.IAutomationAnnotationStatics_Instance.get_ElementProperty()
  }
}
