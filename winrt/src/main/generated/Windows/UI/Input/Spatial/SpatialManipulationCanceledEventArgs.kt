package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialManipulationCanceledEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialManipulationCanceledEventArgs;{2d40d1cb-e7da-4220-b0bf-819301674780})")
@WinRTByReference(brClass = SpatialManipulationCanceledEventArgs.ByReference::class)
public class SpatialManipulationCanceledEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialManipulationCanceledEventArgs.WithDefault, IWinRTObject {
  private val __2066437419_Interface: ISpatialManipulationCanceledEventArgs.WithDefault by lazy {
    as_2066437419()
  }


  public override val __2066437419_Ptr: JNAPointer? by lazy {
    __2066437419_Interface.__2066437419_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2066437419_Interface)

  private fun as_2066437419(): ISpatialManipulationCanceledEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialManipulationCanceledEventArgs.ABI.makeISpatialManipulationCanceledEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialManipulationCanceledEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialManipulationCanceledEventArgs.ABI.makeISpatialManipulationCanceledEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialManipulationCanceledEventArgs> {
    public override fun getValue() = SpatialManipulationCanceledEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialManipulationCanceledEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialManipulationCanceledEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialManipulationCanceledEventArgs {
      val address = segment.toRawLongValue()
      return SpatialManipulationCanceledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialManipulationCanceledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
