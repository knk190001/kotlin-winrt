package Microsoft.UI.Xaml.Input

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

@ABIMarker(PointerRoutedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.PointerRoutedEventArgs;{66e78a9a-1bec-5f92-b1a1-ea6334ee511c})")
@WinRTByReference(brClass = PointerRoutedEventArgs.ByReference::class)
public class PointerRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IPointerRoutedEventArgs.WithDefault, IWinRTObject {
  private val __557658006_Interface: IPointerRoutedEventArgs.WithDefault by lazy {
    as_557658006()
  }


  public override val __557658006_Ptr: JNAPointer? by lazy {
    __557658006_Interface.__557658006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__557658006_Interface)

  private fun as_557658006(): IPointerRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPointerRoutedEventArgs.ABI.makeIPointerRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerRoutedEventArgs.ABI.makeIPointerRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerRoutedEventArgs> {
    public override fun getValue() = PointerRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PointerRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerRoutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PointerRoutedEventArgs {
      val address = segment.toRawLongValue()
      return PointerRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PointerRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
