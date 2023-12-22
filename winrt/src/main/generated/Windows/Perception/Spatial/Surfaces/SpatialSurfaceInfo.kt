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

@ABIMarker(SpatialSurfaceInfo.ABI::class)
@Signature("rc(Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo;{f8e9ebe7-39b7-3962-bb03-57f56e1fb0a1})")
@WinRTByReference(brClass = SpatialSurfaceInfo.ByReference::class)
public class SpatialSurfaceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialSurfaceInfo.WithDefault, IWinRTObject {
  private val __496315278_Interface: ISpatialSurfaceInfo.WithDefault by lazy {
    as_496315278()
  }


  public override val __496315278_Ptr: JNAPointer? by lazy {
    __496315278_Interface.__496315278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__496315278_Interface)

  private fun as_496315278(): ISpatialSurfaceInfo.WithDefault {
    if(pointer == NULL) {
      return(ISpatialSurfaceInfo.ABI.makeISpatialSurfaceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialSurfaceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialSurfaceInfo.ABI.makeISpatialSurfaceInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialSurfaceInfo> {
    public override fun getValue() = SpatialSurfaceInfo(pointer.getPointer(0))

    public fun setValue(value: SpatialSurfaceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialSurfaceInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialSurfaceInfo {
      val address = segment.toRawLongValue()
      return SpatialSurfaceInfo(Pointer(address))
    }

    public override fun toNative(obj: SpatialSurfaceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
