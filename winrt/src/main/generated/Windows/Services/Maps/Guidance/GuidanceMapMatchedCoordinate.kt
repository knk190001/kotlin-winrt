package Windows.Services.Maps.Guidance

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

@ABIMarker(GuidanceMapMatchedCoordinate.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceMapMatchedCoordinate;{b7acb168-2912-4a99-aff1-798609b981fe})")
@WinRTByReference(brClass = GuidanceMapMatchedCoordinate.ByReference::class)
public class GuidanceMapMatchedCoordinate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceMapMatchedCoordinate.WithDefault, IWinRTObject {
  private val __1266895127_Interface: IGuidanceMapMatchedCoordinate.WithDefault by lazy {
    as_1266895127()
  }


  public override val __1266895127_Ptr: JNAPointer? by lazy {
    __1266895127_Interface.__1266895127_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1266895127_Interface)

  private fun as_1266895127(): IGuidanceMapMatchedCoordinate.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceMapMatchedCoordinate.ABI.makeIGuidanceMapMatchedCoordinate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceMapMatchedCoordinate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceMapMatchedCoordinate.ABI.makeIGuidanceMapMatchedCoordinate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceMapMatchedCoordinate> {
    public override fun getValue() = GuidanceMapMatchedCoordinate(pointer.getPointer(0))

    public fun setValue(value: GuidanceMapMatchedCoordinate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceMapMatchedCoordinate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GuidanceMapMatchedCoordinate {
      val address = segment.toRawLongValue()
      return GuidanceMapMatchedCoordinate(Pointer(address))
    }

    public override fun toNative(obj: GuidanceMapMatchedCoordinate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
