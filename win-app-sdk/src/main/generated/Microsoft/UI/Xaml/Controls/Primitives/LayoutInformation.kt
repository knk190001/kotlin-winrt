package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.FrameworkElement
import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LayoutInformation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.LayoutInformation;{ceea0a8c-5a4f-5d7a-8fea-77b5e0e0230c})")
@WinRTByReference(brClass = LayoutInformation.ByReference::class)
public class LayoutInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILayoutInformation.WithDefault, IWinRTObject {
  private val __1831288975_Interface: ILayoutInformation.WithDefault by lazy {
    as_1831288975()
  }


  public override val __1831288975_Ptr: JNAPointer? by lazy {
    __1831288975_Interface.__1831288975_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1831288975_Interface)

  private fun as_1831288975(): ILayoutInformation.WithDefault {
    if(pointer == NULL) {
      return(ILayoutInformation.ABI.makeILayoutInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayoutInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayoutInformation.ABI.makeILayoutInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LayoutInformation> {
    public override fun getValue() = LayoutInformation(pointer.getPointer(0))

    public fun setValue(value: LayoutInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LayoutInformation, MemoryAddress> {
    public val ILayoutInformationStatics_Instance: ILayoutInformationStatics by lazy {
      createILayoutInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILayoutInformationStatics(): ILayoutInformationStatics {
      val refiid = Guid.REFIID(ILayoutInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.LayoutInformation".toHandle(),refiid,interfacePtr)
      val result = ILayoutInformationStatics.ABI.makeILayoutInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LayoutInformation {
      val address = segment.toRawLongValue()
      return LayoutInformation(Pointer(address))
    }

    public override fun toNative(obj: LayoutInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetLayoutExceptionElement(dispatcher: IUnknown) =
        ABI.ILayoutInformationStatics_Instance.GetLayoutExceptionElement(dispatcher)

    public fun GetLayoutSlot(element: FrameworkElement) =
        ABI.ILayoutInformationStatics_Instance.GetLayoutSlot(element)

    public fun GetAvailableSize(element: UIElement) =
        ABI.ILayoutInformationStatics_Instance.GetAvailableSize(element)
  }
}
