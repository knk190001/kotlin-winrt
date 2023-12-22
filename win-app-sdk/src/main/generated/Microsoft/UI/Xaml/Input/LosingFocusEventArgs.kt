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

@ABIMarker(LosingFocusEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.LosingFocusEventArgs;{fa0e5ffa-2b1b-52f8-bb66-e35f51e73cf3})")
@WinRTByReference(brClass = LosingFocusEventArgs.ByReference::class)
public class LosingFocusEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ILosingFocusEventArgs.WithDefault, IWinRTObject {
  private val __731772580_Interface: ILosingFocusEventArgs.WithDefault by lazy {
    as_731772580()
  }


  public override val __731772580_Ptr: JNAPointer? by lazy {
    __731772580_Interface.__731772580_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__731772580_Interface)

  private fun as_731772580(): ILosingFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILosingFocusEventArgs.ABI.makeILosingFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILosingFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILosingFocusEventArgs.ABI.makeILosingFocusEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LosingFocusEventArgs> {
    public override fun getValue() = LosingFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: LosingFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LosingFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LosingFocusEventArgs {
      val address = segment.toRawLongValue()
      return LosingFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LosingFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
