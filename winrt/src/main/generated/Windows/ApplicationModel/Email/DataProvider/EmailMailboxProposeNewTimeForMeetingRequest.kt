package Windows.ApplicationModel.Email.DataProvider

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

@ABIMarker(EmailMailboxProposeNewTimeForMeetingRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxProposeNewTimeForMeetingRequest;{5aeff152-9799-4f9f-a399-ff07f3eef04e})")
@WinRTByReference(brClass = EmailMailboxProposeNewTimeForMeetingRequest.ByReference::class)
public class EmailMailboxProposeNewTimeForMeetingRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxProposeNewTimeForMeetingRequest.WithDefault, IWinRTObject {
  private val __1602283236_Interface: IEmailMailboxProposeNewTimeForMeetingRequest.WithDefault by
      lazy {
    as_1602283236()
  }


  public override val __1602283236_Ptr: JNAPointer? by lazy {
    __1602283236_Interface.__1602283236_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1602283236_Interface)

  private fun as_1602283236(): IEmailMailboxProposeNewTimeForMeetingRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxProposeNewTimeForMeetingRequest.ABI.makeIEmailMailboxProposeNewTimeForMeetingRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxProposeNewTimeForMeetingRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxProposeNewTimeForMeetingRequest.ABI.makeIEmailMailboxProposeNewTimeForMeetingRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxProposeNewTimeForMeetingRequest> {
    public override fun getValue() =
        EmailMailboxProposeNewTimeForMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxProposeNewTimeForMeetingRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxProposeNewTimeForMeetingRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxProposeNewTimeForMeetingRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxProposeNewTimeForMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxProposeNewTimeForMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
