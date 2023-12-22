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

@ABIMarker(GuidanceRoadSegment.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceRoadSegment;{b32758a6-be78-4c63-afe7-6c2957479b3e})")
@WinRTByReference(brClass = GuidanceRoadSegment.ByReference::class)
public class GuidanceRoadSegment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceRoadSegment.WithDefault, IGuidanceRoadSegment2.WithDefault,
    IWinRTObject {
  private val __1655683260_Interface: IGuidanceRoadSegment.WithDefault by lazy {
    as_1655683260()
  }


  private val __213426442_Interface: IGuidanceRoadSegment2.WithDefault by lazy {
    as_213426442()
  }


  public override val __1655683260_Ptr: JNAPointer? by lazy {
    __1655683260_Interface.__1655683260_Ptr
  }


  public override val __213426442_Ptr: JNAPointer? by lazy {
    __213426442_Interface.__213426442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1655683260_Interface, __213426442_Interface)

  private fun as_1655683260(): IGuidanceRoadSegment.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceRoadSegment.ABI.makeIGuidanceRoadSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceRoadSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceRoadSegment.ABI.makeIGuidanceRoadSegment(ref.value))
  }

  private fun as_213426442(): IGuidanceRoadSegment2.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceRoadSegment2.ABI.makeIGuidanceRoadSegment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceRoadSegment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceRoadSegment2.ABI.makeIGuidanceRoadSegment2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceRoadSegment> {
    public override fun getValue() = GuidanceRoadSegment(pointer.getPointer(0))

    public fun setValue(value: GuidanceRoadSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceRoadSegment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GuidanceRoadSegment {
      val address = segment.toRawLongValue()
      return GuidanceRoadSegment(Pointer(address))
    }

    public override fun toNative(obj: GuidanceRoadSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
