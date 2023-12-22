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

@ABIMarker(SpatialManipulationDelta.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialManipulationDelta;{a7ec967a-d123-3a81-a15b-992923dcbe91})")
@WinRTByReference(brClass = SpatialManipulationDelta.ByReference::class)
public class SpatialManipulationDelta(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialManipulationDelta.WithDefault, IWinRTObject {
  private val __480321295_Interface: ISpatialManipulationDelta.WithDefault by lazy {
    as_480321295()
  }


  public override val __480321295_Ptr: JNAPointer? by lazy {
    __480321295_Interface.__480321295_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__480321295_Interface)

  private fun as_480321295(): ISpatialManipulationDelta.WithDefault {
    if(pointer == NULL) {
      return(ISpatialManipulationDelta.ABI.makeISpatialManipulationDelta(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialManipulationDelta>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialManipulationDelta.ABI.makeISpatialManipulationDelta(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialManipulationDelta> {
    public override fun getValue() = SpatialManipulationDelta(pointer.getPointer(0))

    public fun setValue(value: SpatialManipulationDelta): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialManipulationDelta, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialManipulationDelta {
      val address = segment.toRawLongValue()
      return SpatialManipulationDelta(Pointer(address))
    }

    public override fun toNative(obj: SpatialManipulationDelta): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
