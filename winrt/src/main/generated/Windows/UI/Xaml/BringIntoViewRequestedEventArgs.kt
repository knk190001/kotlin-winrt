package Windows.UI.Xaml

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

@ABIMarker(BringIntoViewRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.BringIntoViewRequestedEventArgs;{0e629ec4-2206-4c8b-94ae-bdb66a4ebfd1})")
@WinRTByReference(brClass = BringIntoViewRequestedEventArgs.ByReference::class)
public class BringIntoViewRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IBringIntoViewRequestedEventArgs.WithDefault, IWinRTObject {
  private val __690201454_Interface: IBringIntoViewRequestedEventArgs.WithDefault by lazy {
    as_690201454()
  }


  public override val __690201454_Ptr: JNAPointer? by lazy {
    __690201454_Interface.__690201454_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__690201454_Interface)

  private fun as_690201454(): IBringIntoViewRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBringIntoViewRequestedEventArgs.ABI.makeIBringIntoViewRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBringIntoViewRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBringIntoViewRequestedEventArgs.ABI.makeIBringIntoViewRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BringIntoViewRequestedEventArgs> {
    public override fun getValue() = BringIntoViewRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BringIntoViewRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BringIntoViewRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BringIntoViewRequestedEventArgs {
      val address = segment.toRawLongValue()
      return BringIntoViewRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BringIntoViewRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
