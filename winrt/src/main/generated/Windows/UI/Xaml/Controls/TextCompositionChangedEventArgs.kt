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

@ABIMarker(TextCompositionChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TextCompositionChangedEventArgs;{b9c7e0f2-50b7-441d-990c-68553e2e056b})")
@WinRTByReference(brClass = TextCompositionChangedEventArgs.ByReference::class)
public class TextCompositionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextCompositionChangedEventArgs.WithDefault, IWinRTObject {
  private val __57799932_Interface: ITextCompositionChangedEventArgs.WithDefault by lazy {
    as_57799932()
  }


  public override val __57799932_Ptr: JNAPointer? by lazy {
    __57799932_Interface.__57799932_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__57799932_Interface)

  private fun as_57799932(): ITextCompositionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextCompositionChangedEventArgs.ABI.makeITextCompositionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextCompositionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextCompositionChangedEventArgs.ABI.makeITextCompositionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextCompositionChangedEventArgs> {
    public override fun getValue() = TextCompositionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextCompositionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextCompositionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextCompositionChangedEventArgs {
      val address = segment.toRawLongValue()
      return TextCompositionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextCompositionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
