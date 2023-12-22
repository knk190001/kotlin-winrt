package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(Border.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Border;{1ca13b47-ff5c-5abc-a411-a177df9482a9})")
@WinRTByReference(brClass = Border.ByReference::class)
public class Border(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IBorder.WithDefault, IWinRTObject {
  private val __1878954163_Interface: IBorder.WithDefault by lazy {
    as_1878954163()
  }


  public override val __1878954163_Ptr: JNAPointer? by lazy {
    __1878954163_Interface.__1878954163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1878954163_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1878954163(): IBorder.WithDefault {
    if(pointer == NULL) {
      return(IBorder.ABI.makeIBorder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBorder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBorder.ABI.makeIBorder(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Border> {
    public override fun getValue() = Border(pointer.getPointer(0))

    public fun setValue(value: Border): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Border, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBorderStatics_Instance: IBorderStatics by lazy {
      createIBorderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Border".toHandle(),
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

    public fun createIBorderStatics(): IBorderStatics {
      val refiid = Guid.REFIID(IBorderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Border".toHandle(),refiid,interfacePtr)
      val result = IBorderStatics.ABI.makeIBorderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Border {
      val address = segment.toRawLongValue()
      return Border(Pointer(address))
    }

    public override fun toNative(obj: Border): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BorderBrushProperty() = ABI.IBorderStatics_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IBorderStatics_Instance.get_BorderThicknessProperty()

    public fun get_BackgroundProperty() = ABI.IBorderStatics_Instance.get_BackgroundProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IBorderStatics_Instance.get_BackgroundSizingProperty()

    public fun get_CornerRadiusProperty() = ABI.IBorderStatics_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IBorderStatics_Instance.get_PaddingProperty()

    public fun get_ChildTransitionsProperty() =
        ABI.IBorderStatics_Instance.get_ChildTransitionsProperty()
  }
}
