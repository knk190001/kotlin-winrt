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

@ABIMarker(EmailMailboxUpdateMeetingResponseRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxUpdateMeetingResponseRequest;{5b99ac93-b2cf-4888-ba4f-306b6b66df30})")
@WinRTByReference(brClass = EmailMailboxUpdateMeetingResponseRequest.ByReference::class)
public class EmailMailboxUpdateMeetingResponseRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxUpdateMeetingResponseRequest.WithDefault, IWinRTObject {
  private val __687758554_Interface: IEmailMailboxUpdateMeetingResponseRequest.WithDefault by lazy {
    as_687758554()
  }


  public override val __687758554_Ptr: JNAPointer? by lazy {
    __687758554_Interface.__687758554_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__687758554_Interface)

  private fun as_687758554(): IEmailMailboxUpdateMeetingResponseRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxUpdateMeetingResponseRequest.ABI.makeIEmailMailboxUpdateMeetingResponseRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxUpdateMeetingResponseRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxUpdateMeetingResponseRequest.ABI.makeIEmailMailboxUpdateMeetingResponseRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxUpdateMeetingResponseRequest> {
    public override fun getValue() = EmailMailboxUpdateMeetingResponseRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxUpdateMeetingResponseRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxUpdateMeetingResponseRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxUpdateMeetingResponseRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxUpdateMeetingResponseRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxUpdateMeetingResponseRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
