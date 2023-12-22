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

@ABIMarker(TextCompositionEndedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextCompositionEndedEventArgs;{19d0a5c5-8d0f-5118-8c30-e709326f1283})")
@WinRTByReference(brClass = TextCompositionEndedEventArgs.ByReference::class)
public class TextCompositionEndedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextCompositionEndedEventArgs.WithDefault, IWinRTObject {
  private val __541566925_Interface: ITextCompositionEndedEventArgs.WithDefault by lazy {
    as_541566925()
  }


  public override val __541566925_Ptr: JNAPointer? by lazy {
    __541566925_Interface.__541566925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__541566925_Interface)

  private fun as_541566925(): ITextCompositionEndedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextCompositionEndedEventArgs.ABI.makeITextCompositionEndedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextCompositionEndedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextCompositionEndedEventArgs.ABI.makeITextCompositionEndedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextCompositionEndedEventArgs> {
    public override fun getValue() = TextCompositionEndedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextCompositionEndedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextCompositionEndedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextCompositionEndedEventArgs {
      val address = segment.toRawLongValue()
      return TextCompositionEndedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextCompositionEndedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
