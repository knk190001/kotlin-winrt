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
@Signature("rc(Windows.UI.Xaml.Controls.TextControlCuttingToClipboardEventArgs;{5f894995-a58d-4cf3-b589-b5e500e06475})")
@WinRTByReference(brClass = TextControlCuttingToClipboardEventArgs.ByReference::class)
public class TextControlCuttingToClipboardEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextControlCuttingToClipboardEventArgs.WithDefault, IWinRTObject {
  private val __1070394024_Interface: ITextControlCuttingToClipboardEventArgs.WithDefault by lazy {
    as_1070394024()
  }


  public override val __1070394024_Ptr: JNAPointer? by lazy {
    __1070394024_Interface.__1070394024_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1070394024_Interface)

  private fun as_1070394024(): ITextControlCuttingToClipboardEventArgs.WithDefault {
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
