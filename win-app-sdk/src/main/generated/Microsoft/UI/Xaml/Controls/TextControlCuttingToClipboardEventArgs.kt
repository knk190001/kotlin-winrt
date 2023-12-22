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

@ABIMarker(TextControlCuttingToClipboardEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextControlCuttingToClipboardEventArgs;{9d73671f-ea30-555d-8129-5a96aec73a14})")
@WinRTByReference(brClass = TextControlCuttingToClipboardEventArgs.ByReference::class)
public class TextControlCuttingToClipboardEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextControlCuttingToClipboardEventArgs.WithDefault, IWinRTObject {
  private val __2013589187_Interface: ITextControlCuttingToClipboardEventArgs.WithDefault by lazy {
    as_2013589187()
  }


  public override val __2013589187_Ptr: JNAPointer? by lazy {
    __2013589187_Interface.__2013589187_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2013589187_Interface)

  private fun as_2013589187(): ITextControlCuttingToClipboardEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextControlCuttingToClipboardEventArgs.ABI.makeITextControlCuttingToClipboardEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextControlCuttingToClipboardEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextControlCuttingToClipboardEventArgs.ABI.makeITextControlCuttingToClipboardEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextControlCuttingToClipboardEventArgs> {
    public override fun getValue() = TextControlCuttingToClipboardEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextControlCuttingToClipboardEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextControlCuttingToClipboardEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextControlCuttingToClipboardEventArgs {
      val address = segment.toRawLongValue()
      return TextControlCuttingToClipboardEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextControlCuttingToClipboardEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
