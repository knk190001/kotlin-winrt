package Microsoft.UI.Input

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

@ABIMarker(ContextMenuKeyEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.ContextMenuKeyEventArgs;{f6025762-9426-541a-b647-037abdbecefc})")
@WinRTByReference(brClass = ContextMenuKeyEventArgs.ByReference::class)
public class ContextMenuKeyEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContextMenuKeyEventArgs.WithDefault, IWinRTObject {
  private val __1307325485_Interface: IContextMenuKeyEventArgs.WithDefault by lazy {
    as_1307325485()
  }


  public override val __1307325485_Ptr: JNAPointer? by lazy {
    __1307325485_Interface.__1307325485_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1307325485_Interface)

  private fun as_1307325485(): IContextMenuKeyEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContextMenuKeyEventArgs.ABI.makeIContextMenuKeyEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContextMenuKeyEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContextMenuKeyEventArgs.ABI.makeIContextMenuKeyEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContextMenuKeyEventArgs> {
    public override fun getValue() = ContextMenuKeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContextMenuKeyEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContextMenuKeyEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContextMenuKeyEventArgs {
      val address = segment.toRawLongValue()
      return ContextMenuKeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContextMenuKeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
