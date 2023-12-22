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

@ABIMarker(TextControlPasteEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextControlPasteEventArgs;{fc5e567e-3aa9-5c57-88d4-834ad3b62e9e})")
@WinRTByReference(brClass = TextControlPasteEventArgs.ByReference::class)
public class TextControlPasteEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextControlPasteEventArgs.WithDefault, IWinRTObject {
  private val __418380563_Interface: ITextControlPasteEventArgs.WithDefault by lazy {
    as_418380563()
  }


  public override val __418380563_Ptr: JNAPointer? by lazy {
    __418380563_Interface.__418380563_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__418380563_Interface)

  private fun as_418380563(): ITextControlPasteEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextControlPasteEventArgs.ABI.makeITextControlPasteEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextControlPasteEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextControlPasteEventArgs.ABI.makeITextControlPasteEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextControlPasteEventArgs> {
    public override fun getValue() = TextControlPasteEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextControlPasteEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextControlPasteEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextControlPasteEventArgs {
      val address = segment.toRawLongValue()
      return TextControlPasteEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextControlPasteEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
