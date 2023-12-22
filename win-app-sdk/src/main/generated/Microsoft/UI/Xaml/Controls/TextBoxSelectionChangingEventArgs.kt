package Microsoft.UI.Xaml.Controls

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TextBoxSelectionChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextBoxSelectionChangingEventArgs;{6dce20db-894e-5ff6-825b-f9891af79516})")
@WinRTByReference(brClass = TextBoxSelectionChangingEventArgs.ByReference::class)
public class TextBoxSelectionChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextBoxSelectionChangingEventArgs.WithDefault, IWinRTObject {
  private val __1480791957_Interface: ITextBoxSelectionChangingEventArgs.WithDefault by lazy {
    as_1480791957()
  }


  public override val __1480791957_Ptr: JNAPointer? by lazy {
    __1480791957_Interface.__1480791957_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1480791957_Interface)

  private fun as_1480791957(): ITextBoxSelectionChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextBoxSelectionChangingEventArgs.ABI.makeITextBoxSelectionChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBoxSelectionChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBoxSelectionChangingEventArgs.ABI.makeITextBoxSelectionChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextBoxSelectionChangingEventArgs> {
    public override fun getValue() = TextBoxSelectionChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextBoxSelectionChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBoxSelectionChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextBoxSelectionChangingEventArgs {
      val address = segment.toRawLongValue()
      return TextBoxSelectionChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextBoxSelectionChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
