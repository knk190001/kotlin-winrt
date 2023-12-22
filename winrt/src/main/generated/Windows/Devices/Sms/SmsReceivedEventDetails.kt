package Windows.Devices.Sms

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

@ABIMarker(SmsReceivedEventDetails.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsReceivedEventDetails;{5bb50f15-e46d-4c82-847d-5a0304c1d53d})")
@WinRTByReference(brClass = SmsReceivedEventDetails.ByReference::class)
public class SmsReceivedEventDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsReceivedEventDetails.WithDefault, ISmsReceivedEventDetails2.WithDefault,
    IWinRTObject {
  private val __1704950346_Interface: ISmsReceivedEventDetails.WithDefault by lazy {
    as_1704950346()
  }


  private val __1313853124_Interface: ISmsReceivedEventDetails2.WithDefault by lazy {
    as_1313853124()
  }


  public override val __1704950346_Ptr: JNAPointer? by lazy {
    __1704950346_Interface.__1704950346_Ptr
  }


  public override val __1313853124_Ptr: JNAPointer? by lazy {
    __1313853124_Interface.__1313853124_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1704950346_Interface, __1313853124_Interface)

  private fun as_1704950346(): ISmsReceivedEventDetails.WithDefault {
    if(pointer == NULL) {
      return(ISmsReceivedEventDetails.ABI.makeISmsReceivedEventDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsReceivedEventDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsReceivedEventDetails.ABI.makeISmsReceivedEventDetails(ref.value))
  }

  private fun as_1313853124(): ISmsReceivedEventDetails2.WithDefault {
    if(pointer == NULL) {
      return(ISmsReceivedEventDetails2.ABI.makeISmsReceivedEventDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsReceivedEventDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsReceivedEventDetails2.ABI.makeISmsReceivedEventDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsReceivedEventDetails> {
    public override fun getValue() = SmsReceivedEventDetails(pointer.getPointer(0))

    public fun setValue(value: SmsReceivedEventDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsReceivedEventDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsReceivedEventDetails {
      val address = segment.toRawLongValue()
      return SmsReceivedEventDetails(Pointer(address))
    }

    public override fun toNative(obj: SmsReceivedEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
