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

@ABIMarker(MobileBroadbandPcoDataChangeTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandPcoDataChangeTriggerDetails;{263f5114-64e0-4493-909b-2d14a01962b1})")
@WinRTByReference(brClass = MobileBroadbandPcoDataChangeTriggerDetails.ByReference::class)
public class MobileBroadbandPcoDataChangeTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandPcoDataChangeTriggerDetails.WithDefault, IWinRTObject {
  private val __33803588_Interface: IMobileBroadbandPcoDataChangeTriggerDetails.WithDefault by
      lazy {
    as_33803588()
  }


  public override val __33803588_Ptr: JNAPointer? by lazy {
    __33803588_Interface.__33803588_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__33803588_Interface)

  private fun as_33803588(): IMobileBroadbandPcoDataChangeTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandPcoDataChangeTriggerDetails.ABI.makeIMobileBroadbandPcoDataChangeTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandPcoDataChangeTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandPcoDataChangeTriggerDetails.ABI.makeIMobileBroadbandPcoDataChangeTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandPcoDataChangeTriggerDetails> {
    public override fun getValue() =
        MobileBroadbandPcoDataChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandPcoDataChangeTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandPcoDataChangeTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandPcoDataChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return MobileBroadbandPcoDataChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandPcoDataChangeTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
