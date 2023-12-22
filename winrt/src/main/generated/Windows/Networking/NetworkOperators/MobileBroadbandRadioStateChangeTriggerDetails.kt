package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandRadioStateChangeTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChangeTriggerDetails;{71301ace-093c-42c6-b0db-ad1f75a65445})")
@WinRTByReference(brClass = MobileBroadbandRadioStateChangeTriggerDetails.ByReference::class)
public class MobileBroadbandRadioStateChangeTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandRadioStateChangeTriggerDetails.WithDefault, IWinRTObject {
  private val __1077216020_Interface: IMobileBroadbandRadioStateChangeTriggerDetails.WithDefault by
      lazy {
    as_1077216020()
  }


  public override val __1077216020_Ptr: JNAPointer? by lazy {
    __1077216020_Interface.__1077216020_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1077216020_Interface)

  private fun as_1077216020(): IMobileBroadbandRadioStateChangeTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandRadioStateChangeTriggerDetails.ABI.makeIMobileBroadbandRadioStateChangeTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandRadioStateChangeTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandRadioStateChangeTriggerDetails.ABI.makeIMobileBroadbandRadioStateChangeTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandRadioStateChangeTriggerDetails> {
    public override fun getValue() =
        MobileBroadbandRadioStateChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandRadioStateChangeTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandRadioStateChangeTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandRadioStateChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return MobileBroadbandRadioStateChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandRadioStateChangeTriggerDetails): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
