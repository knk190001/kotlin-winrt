package Windows.Perception.Spatial

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

@ABIMarker(SpatialCoordinateSystem.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialCoordinateSystem;{69ebca4b-60a3-3586-a653-59a7bd676d07})")
@WinRTByReference(brClass = SpatialCoordinateSystem.ByReference::class)
public class SpatialCoordinateSystem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialCoordinateSystem.WithDefault, IWinRTObject {
  private val __44105864_Interface: ISpatialCoordinateSystem.WithDefault by lazy {
    as_44105864()
  }


  public override val __44105864_Ptr: JNAPointer? by lazy {
    __44105864_Interface.__44105864_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__44105864_Interface)

  private fun as_44105864(): ISpatialCoordinateSystem.WithDefault {
    if(pointer == NULL) {
      return(ISpatialCoordinateSystem.ABI.makeISpatialCoordinateSystem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialCoordinateSystem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialCoordinateSystem.ABI.makeISpatialCoordinateSystem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialCoordinateSystem> {
    public override fun getValue() = SpatialCoordinateSystem(pointer.getPointer(0))

    public fun setValue(value: SpatialCoordinateSystem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialCoordinateSystem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialCoordinateSystem {
      val address = segment.toRawLongValue()
      return SpatialCoordinateSystem(Pointer(address))
    }

    public override fun toNative(obj: SpatialCoordinateSystem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
