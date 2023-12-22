package Windows.Devices.Geolocation

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

@ABIMarker(GeovisitTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.GeovisitTriggerDetails;{ea770d9e-d1c9-454b-99b7-b2f8cdd2482f})")
@WinRTByReference(brClass = GeovisitTriggerDetails.ByReference::class)
public class GeovisitTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeovisitTriggerDetails.WithDefault, IWinRTObject {
  private val __473880291_Interface: IGeovisitTriggerDetails.WithDefault by lazy {
    as_473880291()
  }


  public override val __473880291_Ptr: JNAPointer? by lazy {
    __473880291_Interface.__473880291_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__473880291_Interface)

  private fun as_473880291(): IGeovisitTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IGeovisitTriggerDetails.ABI.makeIGeovisitTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeovisitTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeovisitTriggerDetails.ABI.makeIGeovisitTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeovisitTriggerDetails> {
    public override fun getValue() = GeovisitTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: GeovisitTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeovisitTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GeovisitTriggerDetails {
      val address = segment.toRawLongValue()
      return GeovisitTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: GeovisitTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
