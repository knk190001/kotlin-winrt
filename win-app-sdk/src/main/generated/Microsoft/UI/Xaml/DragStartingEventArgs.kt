package Microsoft.UI.Xaml

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

@ABIMarker(DragStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DragStartingEventArgs;{ad17bace-9613-5666-a31b-79a73fba77cf})")
@WinRTByReference(brClass = DragStartingEventArgs.ByReference::class)
public class DragStartingEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDragStartingEventArgs.WithDefault, IWinRTObject {
  private val __260705660_Interface: IDragStartingEventArgs.WithDefault by lazy {
    as_260705660()
  }


  public override val __260705660_Ptr: JNAPointer? by lazy {
    __260705660_Interface.__260705660_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__260705660_Interface)

  private fun as_260705660(): IDragStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragStartingEventArgs.ABI.makeIDragStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragStartingEventArgs.ABI.makeIDragStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragStartingEventArgs> {
    public override fun getValue() = DragStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragStartingEventArgs {
      val address = segment.toRawLongValue()
      return DragStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
