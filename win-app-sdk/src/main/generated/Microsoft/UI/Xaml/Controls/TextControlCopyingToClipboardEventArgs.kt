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

@ABIMarker(TextControlCopyingToClipboardEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextControlCopyingToClipboardEventArgs;{1daac6d5-8db5-5d9f-9382-1e644f9aa437})")
@WinRTByReference(brClass = TextControlCopyingToClipboardEventArgs.ByReference::class)
public class TextControlCopyingToClipboardEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextControlCopyingToClipboardEventArgs.WithDefault, IWinRTObject {
  private val __1211339360_Interface: ITextControlCopyingToClipboardEventArgs.WithDefault by lazy {
    as_1211339360()
  }


  public override val __1211339360_Ptr: JNAPointer? by lazy {
    __1211339360_Interface.__1211339360_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1211339360_Interface)

  private fun as_1211339360(): ITextControlCopyingToClipboardEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextControlCopyingToClipboardEventArgs.ABI.makeITextControlCopyingToClipboardEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextControlCopyingToClipboardEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextControlCopyingToClipboardEventArgs.ABI.makeITextControlCopyingToClipboardEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextControlCopyingToClipboardEventArgs> {
    public override fun getValue() = TextControlCopyingToClipboardEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextControlCopyingToClipboardEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextControlCopyingToClipboardEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextControlCopyingToClipboardEventArgs {
      val address = segment.toRawLongValue()
      return TextControlCopyingToClipboardEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextControlCopyingToClipboardEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
