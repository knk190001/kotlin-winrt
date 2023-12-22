package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.AnnotationType
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(AutomationPeerAnnotation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.AutomationPeerAnnotation;{2738b92a-2528-5b63-973d-d29eb0593647})")
@WinRTByReference(brClass = AutomationPeerAnnotation.ByReference::class)
public class AutomationPeerAnnotation(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAutomationPeerAnnotation.WithDefault, IWinRTObject {
  private val __1039198325_Interface: IAutomationPeerAnnotation.WithDefault by lazy {
    as_1039198325()
  }


  public override val __1039198325_Ptr: JNAPointer? by lazy {
    __1039198325_Interface.__1039198325_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1039198325_Interface)

  public constructor() : this(ABI.activate())

  public constructor(type: AnnotationType) : this(ABI.activate(type))

  public constructor(type: AnnotationType, peer: AutomationPeer) : this(ABI.activate(type, peer))

  private fun as_1039198325(): IAutomationPeerAnnotation.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerAnnotation.ABI.makeIAutomationPeerAnnotation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerAnnotation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerAnnotation.ABI.makeIAutomationPeerAnnotation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationPeerAnnotation> {
    public override fun getValue() = AutomationPeerAnnotation(pointer.getPointer(0))

    public fun setValue(value: AutomationPeerAnnotation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationPeerAnnotation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAutomationPeerAnnotationStatics_Instance: IAutomationPeerAnnotationStatics by lazy {
      createIAutomationPeerAnnotationStatics()
    }


    public val IAutomationPeerAnnotationFactory_Instance: IAutomationPeerAnnotationFactory by lazy {
      createIAutomationPeerAnnotationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AutomationPeerAnnotation".toHandle(),
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

    public fun createIAutomationPeerAnnotationStatics(): IAutomationPeerAnnotationStatics {
      val refiid = Guid.REFIID(IAutomationPeerAnnotationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AutomationPeerAnnotation".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPeerAnnotationStatics.ABI.makeIAutomationPeerAnnotationStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationPeerAnnotationFactory(): IAutomationPeerAnnotationFactory {
      val refiid = Guid.REFIID(IAutomationPeerAnnotationFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AutomationPeerAnnotation".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAutomationPeerAnnotationFactory.ABI.makeIAutomationPeerAnnotationFactory(factoryActivatorPtr.value))
    }

    public fun activate(type: AnnotationType): JNAPointer? =
        IAutomationPeerAnnotationFactory_Instance.CreateInstance(type)?.pointer

    public fun activate(type: AnnotationType, peer: AutomationPeer): JNAPointer? =
        IAutomationPeerAnnotationFactory_Instance.CreateWithPeerParameter(type, peer)?.pointer

    public override fun fromNative(segment: MemoryAddress): AutomationPeerAnnotation {
      val address = segment.toRawLongValue()
      return AutomationPeerAnnotation(Pointer(address))
    }

    public override fun toNative(obj: AutomationPeerAnnotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TypeProperty() = ABI.IAutomationPeerAnnotationStatics_Instance.get_TypeProperty()

    public fun get_PeerProperty() = ABI.IAutomationPeerAnnotationStatics_Instance.get_PeerProperty()
  }
}
