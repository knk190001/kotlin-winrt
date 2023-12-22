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

@ABIMarker(SpatialAnchorRawCoordinateSystemAdjustedEventArgs.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialAnchorRawCoordinateSystemAdjustedEventArgs;{a1e81eb8-56c7-3117-a2e4-81e0fcf28e00})")
@WinRTByReference(brClass = SpatialAnchorRawCoordinateSystemAdjustedEventArgs.ByReference::class)
public class SpatialAnchorRawCoordinateSystemAdjustedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.WithDefault, IWinRTObject {
  private val __39238480_Interface: ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.WithDefault
      by lazy {
    as_39238480()
  }


  public override val __39238480_Ptr: JNAPointer? by lazy {
    __39238480_Interface.__39238480_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__39238480_Interface)

  private fun as_39238480(): ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.ABI.makeISpatialAnchorRawCoordinateSystemAdjustedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.ABI.makeISpatialAnchorRawCoordinateSystemAdjustedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAnchorRawCoordinateSystemAdjustedEventArgs> {
    public override fun getValue() =
        SpatialAnchorRawCoordinateSystemAdjustedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialAnchorRawCoordinateSystemAdjustedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAnchorRawCoordinateSystemAdjustedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpatialAnchorRawCoordinateSystemAdjustedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialAnchorRawCoordinateSystemAdjustedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialAnchorRawCoordinateSystemAdjustedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
