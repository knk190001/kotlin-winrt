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

@ABIMarker(SpatialStationaryFrameOfReference.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialStationaryFrameOfReference;{09dbccb9-bcf8-3e7f-be7e-7edccbb178a8})")
@WinRTByReference(brClass = SpatialStationaryFrameOfReference.ByReference::class)
public class SpatialStationaryFrameOfReference(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialStationaryFrameOfReference.WithDefault, IWinRTObject {
  private val __137756124_Interface: ISpatialStationaryFrameOfReference.WithDefault by lazy {
    as_137756124()
  }


  public override val __137756124_Ptr: JNAPointer? by lazy {
    __137756124_Interface.__137756124_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__137756124_Interface)

  private fun as_137756124(): ISpatialStationaryFrameOfReference.WithDefault {
    if(pointer == NULL) {
      return(ISpatialStationaryFrameOfReference.ABI.makeISpatialStationaryFrameOfReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialStationaryFrameOfReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialStationaryFrameOfReference.ABI.makeISpatialStationaryFrameOfReference(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialStationaryFrameOfReference> {
    public override fun getValue() = SpatialStationaryFrameOfReference(pointer.getPointer(0))

    public fun setValue(value: SpatialStationaryFrameOfReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialStationaryFrameOfReference, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialStationaryFrameOfReference {
      val address = segment.toRawLongValue()
      return SpatialStationaryFrameOfReference(Pointer(address))
    }

    public override fun toNative(obj: SpatialStationaryFrameOfReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
