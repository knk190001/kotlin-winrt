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

@ABIMarker(SpatialManipulationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialManipulationCompletedEventArgs;{05086802-f301-4343-9250-2fbaa5f87a37})")
@WinRTByReference(brClass = SpatialManipulationCompletedEventArgs.ByReference::class)
public class SpatialManipulationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialManipulationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __327740053_Interface: ISpatialManipulationCompletedEventArgs.WithDefault by lazy {
    as_327740053()
  }


  public override val __327740053_Ptr: JNAPointer? by lazy {
    __327740053_Interface.__327740053_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__327740053_Interface)

  private fun as_327740053(): ISpatialManipulationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialManipulationCompletedEventArgs.ABI.makeISpatialManipulationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialManipulationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialManipulationCompletedEventArgs.ABI.makeISpatialManipulationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialManipulationCompletedEventArgs> {
    public override fun getValue() = SpatialManipulationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialManipulationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialManipulationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialManipulationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialManipulationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialManipulationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
