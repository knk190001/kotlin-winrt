package Windows.UI.Xaml.Controls

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

@ABIMarker(InkToolbarToggleButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarToggleButton;{b4a278fa-f5f0-4b1f-beb0-0b8a29905a4a})")
@WinRTByReference(brClass = InkToolbarToggleButton.ByReference::class)
public open class InkToolbarToggleButton(
  ptr: JNAPointer? = NULL
) : CheckBox(ptr), IInkToolbarToggleButton.WithDefault, IWinRTObject {
  private val __1307244521_Interface: IInkToolbarToggleButton.WithDefault by lazy {
    as_1307244521()
  }


  public override val __1307244521_Ptr: JNAPointer? by lazy {
    __1307244521_Interface.__1307244521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1307244521_Interface)

  private fun as_1307244521(): IInkToolbarToggleButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarToggleButton.ABI.makeIInkToolbarToggleButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarToggleButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarToggleButton.ABI.makeIInkToolbarToggleButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarToggleButton> {
    public override fun getValue() = InkToolbarToggleButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarToggleButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarToggleButton, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkToolbarToggleButton {
      val address = segment.toRawLongValue()
      return InkToolbarToggleButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
