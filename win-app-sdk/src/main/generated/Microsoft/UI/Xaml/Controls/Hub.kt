package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IHubFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(Hub.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Hub;{b867e995-0f2e-51a6-a090-e0be2e7cf3ec})")
@WinRTByReference(brClass = Hub.ByReference::class)
public open class Hub(
  ptr: JNAPointer? = NULL
) : Control(ptr), IHub.WithDefault, ISemanticZoomInformation.WithDefault, IWinRTObject {
  private val __753212878_Interface: IHub.WithDefault by lazy {
    as_753212878()
  }


  private val __685461260_Interface: ISemanticZoomInformation.WithDefault by lazy {
    as_685461260()
  }


  public override val __753212878_Ptr: JNAPointer? by lazy {
    __753212878_Interface.__753212878_Ptr
  }


  public override val __685461260_Ptr: JNAPointer? by lazy {
    __685461260_Interface.__685461260_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__753212878_Interface, __685461260_Interface)

  public constructor() : this(ABI.activate())

  private fun as_753212878(): IHub.WithDefault {
    if(pointer == NULL) {
      return(IHub.ABI.makeIHub(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHub>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHub.ABI.makeIHub(ref.value))
  }

  private fun as_685461260(): ISemanticZoomInformation.WithDefault {
    if(pointer == NULL) {
      return(ISemanticZoomInformation.ABI.makeISemanticZoomInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticZoomInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticZoomInformation.ABI.makeISemanticZoomInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Hub> {
    public override fun getValue() = Hub(pointer.getPointer(0))

    public fun setValue(value: Hub): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Hub, MemoryAddress> {
    public val IHubStatics_Instance: IHubStatics by lazy {
      createIHubStatics()
    }


    public val IHubFactory_Instance: IHubFactory by lazy {
      createIHubFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHubStatics(): IHubStatics {
      val refiid = Guid.REFIID(IHubStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Hub".toHandle(),refiid,interfacePtr)
      val result = IHubStatics.ABI.makeIHubStatics(interfacePtr.value)
      return result
    }

    public fun createIHubFactory(): IHubFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Hub".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHubFactory.ABI.makeIHubFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IHubFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Hub {
      val address = segment.toRawLongValue()
      return Hub(Pointer(address))
    }

    public override fun toNative(obj: Hub): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.IHubStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() = ABI.IHubStatics_Instance.get_HeaderTemplateProperty()

    public fun get_OrientationProperty() = ABI.IHubStatics_Instance.get_OrientationProperty()

    public fun get_DefaultSectionIndexProperty() =
        ABI.IHubStatics_Instance.get_DefaultSectionIndexProperty()

    public fun get_SemanticZoomOwnerProperty() =
        ABI.IHubStatics_Instance.get_SemanticZoomOwnerProperty()

    public fun get_IsActiveViewProperty() = ABI.IHubStatics_Instance.get_IsActiveViewProperty()

    public fun get_IsZoomedInViewProperty() = ABI.IHubStatics_Instance.get_IsZoomedInViewProperty()
  }
}
