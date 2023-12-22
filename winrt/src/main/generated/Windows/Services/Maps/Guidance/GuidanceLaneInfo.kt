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

@ABIMarker(GuidanceLaneInfo.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceLaneInfo;{8404d114-6581-43b7-ac15-c9079bf90df1})")
@WinRTByReference(brClass = GuidanceLaneInfo.ByReference::class)
public class GuidanceLaneInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceLaneInfo.WithDefault, IWinRTObject {
  private val __52843375_Interface: IGuidanceLaneInfo.WithDefault by lazy {
    as_52843375()
  }


  public override val __52843375_Ptr: JNAPointer? by lazy {
    __52843375_Interface.__52843375_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__52843375_Interface)

  private fun as_52843375(): IGuidanceLaneInfo.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceLaneInfo.ABI.makeIGuidanceLaneInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceLaneInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceLaneInfo.ABI.makeIGuidanceLaneInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceLaneInfo> {
    public override fun getValue() = GuidanceLaneInfo(pointer.getPointer(0))

    public fun setValue(value: GuidanceLaneInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceLaneInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GuidanceLaneInfo {
      val address = segment.toRawLongValue()
      return GuidanceLaneInfo(Pointer(address))
    }

    public override fun toNative(obj: GuidanceLaneInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
