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

@ABIMarker(MobileBroadbandPinLockStateChangeTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails;{d338c091-3e91-4d38-9036-aee83a6e79ad})")
@WinRTByReference(brClass = MobileBroadbandPinLockStateChangeTriggerDetails.ByReference::class)
public class MobileBroadbandPinLockStateChangeTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandPinLockStateChangeTriggerDetails.WithDefault, IWinRTObject {
  private val __111338791_Interface: IMobileBroadbandPinLockStateChangeTriggerDetails.WithDefault by
      lazy {
    as_111338791()
  }


  public override val __111338791_Ptr: JNAPointer? by lazy {
    __111338791_Interface.__111338791_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__111338791_Interface)

  private fun as_111338791(): IMobileBroadbandPinLockStateChangeTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandPinLockStateChangeTriggerDetails.ABI.makeIMobileBroadbandPinLockStateChangeTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandPinLockStateChangeTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandPinLockStateChangeTriggerDetails.ABI.makeIMobileBroadbandPinLockStateChangeTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandPinLockStateChangeTriggerDetails> {
    public override fun getValue() =
        MobileBroadbandPinLockStateChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandPinLockStateChangeTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandPinLockStateChangeTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandPinLockStateChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return MobileBroadbandPinLockStateChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandPinLockStateChangeTriggerDetails):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
