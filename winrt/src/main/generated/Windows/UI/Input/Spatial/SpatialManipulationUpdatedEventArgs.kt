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

@ABIMarker(SpatialManipulationUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialManipulationUpdatedEventArgs;{5f230b9b-60c6-4dc6-bdc9-9f4a6f15fe49})")
@WinRTByReference(brClass = SpatialManipulationUpdatedEventArgs.ByReference::class)
public class SpatialManipulationUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialManipulationUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1509512091_Interface: ISpatialManipulationUpdatedEventArgs.WithDefault by lazy {
    as_1509512091()
  }


  public override val __1509512091_Ptr: JNAPointer? by lazy {
    __1509512091_Interface.__1509512091_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1509512091_Interface)

  private fun as_1509512091(): ISpatialManipulationUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialManipulationUpdatedEventArgs.ABI.makeISpatialManipulationUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialManipulationUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialManipulationUpdatedEventArgs.ABI.makeISpatialManipulationUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialManipulationUpdatedEventArgs> {
    public override fun getValue() = SpatialManipulationUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialManipulationUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialManipulationUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialManipulationUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialManipulationUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialManipulationUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
