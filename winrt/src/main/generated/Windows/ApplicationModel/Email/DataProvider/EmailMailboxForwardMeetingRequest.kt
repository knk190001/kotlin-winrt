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

@ABIMarker(EmailMailboxForwardMeetingRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxForwardMeetingRequest;{616d6af1-70d4-4832-b869-b80542ae9be8})")
@WinRTByReference(brClass = EmailMailboxForwardMeetingRequest.ByReference::class)
public class EmailMailboxForwardMeetingRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxForwardMeetingRequest.WithDefault, IWinRTObject {
  private val __597744241_Interface: IEmailMailboxForwardMeetingRequest.WithDefault by lazy {
    as_597744241()
  }


  public override val __597744241_Ptr: JNAPointer? by lazy {
    __597744241_Interface.__597744241_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597744241_Interface)

  private fun as_597744241(): IEmailMailboxForwardMeetingRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxForwardMeetingRequest.ABI.makeIEmailMailboxForwardMeetingRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxForwardMeetingRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxForwardMeetingRequest.ABI.makeIEmailMailboxForwardMeetingRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxForwardMeetingRequest> {
    public override fun getValue() = EmailMailboxForwardMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxForwardMeetingRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxForwardMeetingRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxForwardMeetingRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxForwardMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxForwardMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
