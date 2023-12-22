package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(IconElement.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.IconElement;{18f69350-279e-50ea-8d23-138e717ed939})")
@WinRTByReference(brClass = IconElement.ByReference::class)
public open class IconElement(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IIconElement.WithDefault, IWinRTObject {
  private val __429576220_Interface: IIconElement.WithDefault by lazy {
    as_429576220()
  }


  public override val __429576220_Ptr: JNAPointer? by lazy {
    __429576220_Interface.__429576220_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__429576220_Interface)

  private fun as_429576220(): IIconElement.WithDefault {
    if(pointer == NULL) {
      return(IIconElement.ABI.makeIIconElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIconElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIconElement.ABI.makeIIconElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IconElement> {
    public override fun getValue() = IconElement(pointer.getPointer(0))

    public fun setValue(value: IconElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IconElement, MemoryAddress> {
    public val IIconElementStatics_Instance: IIconElementStatics by lazy {
      createIIconElementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIconElementStatics(): IIconElementStatics {
      val refiid = Guid.REFIID(IIconElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.IconElement".toHandle(),refiid,interfacePtr)
      val result = IIconElementStatics.ABI.makeIIconElementStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): IconElement {
      val address = segment.toRawLongValue()
      return IconElement(Pointer(address))
    }

    public override fun toNative(obj: IconElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ForegroundProperty() = ABI.IIconElementStatics_Instance.get_ForegroundProperty()
  }
}
