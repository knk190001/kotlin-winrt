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

@ABIMarker(DragItemsCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DragItemsCompletedEventArgs;{af05f22f-9e78-4b21-9a8e-41c2d1367a2a})")
@WinRTByReference(brClass = DragItemsCompletedEventArgs.ByReference::class)
public class DragItemsCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragItemsCompletedEventArgs.WithDefault, IWinRTObject {
  private val __437329660_Interface: IDragItemsCompletedEventArgs.WithDefault by lazy {
    as_437329660()
  }


  public override val __437329660_Ptr: JNAPointer? by lazy {
    __437329660_Interface.__437329660_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__437329660_Interface)

  private fun as_437329660(): IDragItemsCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragItemsCompletedEventArgs.ABI.makeIDragItemsCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragItemsCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragItemsCompletedEventArgs.ABI.makeIDragItemsCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragItemsCompletedEventArgs> {
    public override fun getValue() = DragItemsCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragItemsCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragItemsCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragItemsCompletedEventArgs {
      val address = segment.toRawLongValue()
      return DragItemsCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragItemsCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
