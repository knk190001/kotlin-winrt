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

@ABIMarker(SpatialSurfaceMeshBuffer.ABI::class)
@Signature("rc(Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer;{93cf59e0-871f-33f8-98b2-03d101458f6f})")
@WinRTByReference(brClass = SpatialSurfaceMeshBuffer.ByReference::class)
public class SpatialSurfaceMeshBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialSurfaceMeshBuffer.WithDefault, IWinRTObject {
  private val __144981329_Interface: ISpatialSurfaceMeshBuffer.WithDefault by lazy {
    as_144981329()
  }


  public override val __144981329_Ptr: JNAPointer? by lazy {
    __144981329_Interface.__144981329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__144981329_Interface)

  private fun as_144981329(): ISpatialSurfaceMeshBuffer.WithDefault {
    if(pointer == NULL) {
      return(ISpatialSurfaceMeshBuffer.ABI.makeISpatialSurfaceMeshBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialSurfaceMeshBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialSurfaceMeshBuffer.ABI.makeISpatialSurfaceMeshBuffer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialSurfaceMeshBuffer> {
    public override fun getValue() = SpatialSurfaceMeshBuffer(pointer.getPointer(0))

    public fun setValue(value: SpatialSurfaceMeshBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialSurfaceMeshBuffer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialSurfaceMeshBuffer {
      val address = segment.toRawLongValue()
      return SpatialSurfaceMeshBuffer(Pointer(address))
    }

    public override fun toNative(obj: SpatialSurfaceMeshBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
