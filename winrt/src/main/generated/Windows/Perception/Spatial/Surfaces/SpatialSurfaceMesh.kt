package Windows.Perception.Spatial.Surfaces

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

@ABIMarker(SpatialSurfaceMesh.ABI::class)
@Signature("rc(Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh;{108f57d9-df0d-3950-a0fd-f972c77c27b4})")
@WinRTByReference(brClass = SpatialSurfaceMesh.ByReference::class)
public class SpatialSurfaceMesh(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialSurfaceMesh.WithDefault, IWinRTObject {
  private val __496204367_Interface: ISpatialSurfaceMesh.WithDefault by lazy {
    as_496204367()
  }


  public override val __496204367_Ptr: JNAPointer? by lazy {
    __496204367_Interface.__496204367_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__496204367_Interface)

  private fun as_496204367(): ISpatialSurfaceMesh.WithDefault {
    if(pointer == NULL) {
      return(ISpatialSurfaceMesh.ABI.makeISpatialSurfaceMesh(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialSurfaceMesh>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialSurfaceMesh.ABI.makeISpatialSurfaceMesh(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialSurfaceMesh> {
    public override fun getValue() = SpatialSurfaceMesh(pointer.getPointer(0))

    public fun setValue(value: SpatialSurfaceMesh): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialSurfaceMesh, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialSurfaceMesh {
      val address = segment.toRawLongValue()
      return SpatialSurfaceMesh(Pointer(address))
    }

    public override fun toNative(obj: SpatialSurfaceMesh): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
