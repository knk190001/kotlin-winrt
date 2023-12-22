package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.RoutedEventArgs
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

@ABIMarker(TextChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextChangedEventArgs;{71c37e43-7be7-52fc-bf8c-9867f44be5f4})")
@WinRTByReference(brClass = TextChangedEventArgs.ByReference::class)
public class TextChangedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ITextChangedEventArgs.WithDefault, IWinRTObject {
  private val __411178455_Interface: ITextChangedEventArgs.WithDefault by lazy {
    as_411178455()
  }


  public override val __411178455_Ptr: JNAPointer? by lazy {
    __411178455_Interface.__411178455_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__411178455_Interface)

  private fun as_411178455(): ITextChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextChangedEventArgs.ABI.makeITextChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextChangedEventArgs.ABI.makeITextChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextChangedEventArgs> {
    public override fun getValue() = TextChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextChangedEventArgs {
      val address = segment.toRawLongValue()
      return TextChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
