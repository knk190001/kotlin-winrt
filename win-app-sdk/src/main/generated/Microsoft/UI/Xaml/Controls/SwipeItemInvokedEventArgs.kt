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

@ABIMarker(SwipeItemInvokedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SwipeItemInvokedEventArgs;{7bf51c95-53a2-5a0d-bb32-2b4b1f7d2f20})")
@WinRTByReference(brClass = SwipeItemInvokedEventArgs.ByReference::class)
public class SwipeItemInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISwipeItemInvokedEventArgs.WithDefault, IWinRTObject {
  private val __1957595983_Interface: ISwipeItemInvokedEventArgs.WithDefault by lazy {
    as_1957595983()
  }


  public override val __1957595983_Ptr: JNAPointer? by lazy {
    __1957595983_Interface.__1957595983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1957595983_Interface)

  private fun as_1957595983(): ISwipeItemInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISwipeItemInvokedEventArgs.ABI.makeISwipeItemInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwipeItemInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwipeItemInvokedEventArgs.ABI.makeISwipeItemInvokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SwipeItemInvokedEventArgs> {
    public override fun getValue() = SwipeItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SwipeItemInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwipeItemInvokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SwipeItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return SwipeItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SwipeItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
