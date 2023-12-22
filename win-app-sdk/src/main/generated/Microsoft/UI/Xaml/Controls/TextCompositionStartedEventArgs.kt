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

@ABIMarker(TextCompositionStartedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextCompositionStartedEventArgs;{a604ff71-5d44-5859-8d71-72030ed78bc8})")
@WinRTByReference(brClass = TextCompositionStartedEventArgs.ByReference::class)
public class TextCompositionStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextCompositionStartedEventArgs.WithDefault, IWinRTObject {
  private val __1886815028_Interface: ITextCompositionStartedEventArgs.WithDefault by lazy {
    as_1886815028()
  }


  public override val __1886815028_Ptr: JNAPointer? by lazy {
    __1886815028_Interface.__1886815028_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1886815028_Interface)

  private fun as_1886815028(): ITextCompositionStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextCompositionStartedEventArgs.ABI.makeITextCompositionStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextCompositionStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextCompositionStartedEventArgs.ABI.makeITextCompositionStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextCompositionStartedEventArgs> {
    public override fun getValue() = TextCompositionStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextCompositionStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextCompositionStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextCompositionStartedEventArgs {
      val address = segment.toRawLongValue()
      return TextCompositionStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextCompositionStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
