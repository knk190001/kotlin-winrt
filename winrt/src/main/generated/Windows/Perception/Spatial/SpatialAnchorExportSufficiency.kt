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

@ABIMarker(SpatialAnchorExportSufficiency.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialAnchorExportSufficiency;{77c25b2b-3409-4088-b91b-fdfd05d1648f})")
@WinRTByReference(brClass = SpatialAnchorExportSufficiency.ByReference::class)
public class SpatialAnchorExportSufficiency(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAnchorExportSufficiency.WithDefault, IWinRTObject {
  private val __479718562_Interface: ISpatialAnchorExportSufficiency.WithDefault by lazy {
    as_479718562()
  }


  public override val __479718562_Ptr: JNAPointer? by lazy {
    __479718562_Interface.__479718562_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__479718562_Interface)

  private fun as_479718562(): ISpatialAnchorExportSufficiency.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAnchorExportSufficiency.ABI.makeISpatialAnchorExportSufficiency(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAnchorExportSufficiency>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAnchorExportSufficiency.ABI.makeISpatialAnchorExportSufficiency(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAnchorExportSufficiency> {
    public override fun getValue() = SpatialAnchorExportSufficiency(pointer.getPointer(0))

    public fun setValue(value: SpatialAnchorExportSufficiency): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAnchorExportSufficiency, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialAnchorExportSufficiency {
      val address = segment.toRawLongValue()
      return SpatialAnchorExportSufficiency(Pointer(address))
    }

    public override fun toNative(obj: SpatialAnchorExportSufficiency): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
