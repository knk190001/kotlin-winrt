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

@ABIMarker(GuidanceManeuver.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceManeuver;{fc09326c-ecc9-4928-a2a1-7232b99b94a1})")
@WinRTByReference(brClass = GuidanceManeuver.ByReference::class)
public class GuidanceManeuver(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceManeuver.WithDefault, IWinRTObject {
  private val __1691285424_Interface: IGuidanceManeuver.WithDefault by lazy {
    as_1691285424()
  }


  public override val __1691285424_Ptr: JNAPointer? by lazy {
    __1691285424_Interface.__1691285424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1691285424_Interface)

  private fun as_1691285424(): IGuidanceManeuver.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceManeuver.ABI.makeIGuidanceManeuver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceManeuver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceManeuver.ABI.makeIGuidanceManeuver(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceManeuver> {
    public override fun getValue() = GuidanceManeuver(pointer.getPointer(0))

    public fun setValue(value: GuidanceManeuver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceManeuver, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GuidanceManeuver {
      val address = segment.toRawLongValue()
      return GuidanceManeuver(Pointer(address))
    }

    public override fun toNative(obj: GuidanceManeuver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
