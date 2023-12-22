package Microsoft.UI.Windowing

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

@ABIMarker(DisplayAreaWatcher.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.DisplayAreaWatcher;{83f6562f-d3a0-548b-8e4f-a99be3d95c9c})")
@WinRTByReference(brClass = DisplayAreaWatcher.ByReference::class)
public class DisplayAreaWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayAreaWatcher.WithDefault, IWinRTObject {
  private val __617745246_Interface: IDisplayAreaWatcher.WithDefault by lazy {
    as_617745246()
  }


  public override val __617745246_Ptr: JNAPointer? by lazy {
    __617745246_Interface.__617745246_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__617745246_Interface)

  private fun as_617745246(): IDisplayAreaWatcher.WithDefault {
    if(pointer == NULL) {
      return(IDisplayAreaWatcher.ABI.makeIDisplayAreaWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayAreaWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayAreaWatcher.ABI.makeIDisplayAreaWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayAreaWatcher> {
    public override fun getValue() = DisplayAreaWatcher(pointer.getPointer(0))

    public fun setValue(value: DisplayAreaWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayAreaWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayAreaWatcher {
      val address = segment.toRawLongValue()
      return DisplayAreaWatcher(Pointer(address))
    }

    public override fun toNative(obj: DisplayAreaWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
