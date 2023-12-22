package Microsoft.UI.Xaml.Controls

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

@ABIMarker(SemanticZoom.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SemanticZoom;{7e14616d-55ef-548c-a997-c923e302718f})")
@WinRTByReference(brClass = SemanticZoom.ByReference::class)
public class SemanticZoom(
  ptr: JNAPointer? = NULL
) : Control(ptr), ISemanticZoom.WithDefault, IWinRTObject {
  private val __1894780416_Interface: ISemanticZoom.WithDefault by lazy {
    as_1894780416()
  }


  public override val __1894780416_Ptr: JNAPointer? by lazy {
    __1894780416_Interface.__1894780416_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1894780416_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1894780416(): ISemanticZoom.WithDefault {
    if(pointer == NULL) {
      return(ISemanticZoom.ABI.makeISemanticZoom(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticZoom>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticZoom.ABI.makeISemanticZoom(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SemanticZoom> {
    public override fun getValue() = SemanticZoom(pointer.getPointer(0))

    public fun setValue(value: SemanticZoom): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SemanticZoom, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISemanticZoomStatics_Instance: ISemanticZoomStatics by lazy {
      createISemanticZoomStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SemanticZoom".toHandle(),
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

    public fun createISemanticZoomStatics(): ISemanticZoomStatics {
      val refiid = Guid.REFIID(ISemanticZoomStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SemanticZoom".toHandle(),refiid,interfacePtr)
      val result = ISemanticZoomStatics.ABI.makeISemanticZoomStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SemanticZoom {
      val address = segment.toRawLongValue()
      return SemanticZoom(Pointer(address))
    }

    public override fun toNative(obj: SemanticZoom): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ZoomedInViewProperty() =
        ABI.ISemanticZoomStatics_Instance.get_ZoomedInViewProperty()

    public fun get_ZoomedOutViewProperty() =
        ABI.ISemanticZoomStatics_Instance.get_ZoomedOutViewProperty()

    public fun get_IsZoomedInViewActiveProperty() =
        ABI.ISemanticZoomStatics_Instance.get_IsZoomedInViewActiveProperty()

    public fun get_CanChangeViewsProperty() =
        ABI.ISemanticZoomStatics_Instance.get_CanChangeViewsProperty()

    public fun get_IsZoomOutButtonEnabledProperty() =
        ABI.ISemanticZoomStatics_Instance.get_IsZoomOutButtonEnabledProperty()
  }
}
