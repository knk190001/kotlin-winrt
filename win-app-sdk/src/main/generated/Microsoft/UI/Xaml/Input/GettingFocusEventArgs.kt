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

@ABIMarker(GettingFocusEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.GettingFocusEventArgs;{37fd3af0-bd3c-5bf5-a9cd-71a1e87af950})")
@WinRTByReference(brClass = GettingFocusEventArgs.ByReference::class)
public class GettingFocusEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IGettingFocusEventArgs.WithDefault, IWinRTObject {
  private val __13548760_Interface: IGettingFocusEventArgs.WithDefault by lazy {
    as_13548760()
  }


  public override val __13548760_Ptr: JNAPointer? by lazy {
    __13548760_Interface.__13548760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__13548760_Interface)

  private fun as_13548760(): IGettingFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGettingFocusEventArgs.ABI.makeIGettingFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGettingFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGettingFocusEventArgs.ABI.makeIGettingFocusEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GettingFocusEventArgs> {
    public override fun getValue() = GettingFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: GettingFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GettingFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GettingFocusEventArgs {
      val address = segment.toRawLongValue()
      return GettingFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GettingFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
