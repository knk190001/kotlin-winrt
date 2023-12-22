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

@ABIMarker(EmailMailboxDownloadMessageRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxDownloadMessageRequest;{497b4187-5b4d-4b23-816c-f3842beb753e})")
@WinRTByReference(brClass = EmailMailboxDownloadMessageRequest.ByReference::class)
public class EmailMailboxDownloadMessageRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxDownloadMessageRequest.WithDefault, IWinRTObject {
  private val __996535718_Interface: IEmailMailboxDownloadMessageRequest.WithDefault by lazy {
    as_996535718()
  }


  public override val __996535718_Ptr: JNAPointer? by lazy {
    __996535718_Interface.__996535718_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__996535718_Interface)

  private fun as_996535718(): IEmailMailboxDownloadMessageRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxDownloadMessageRequest.ABI.makeIEmailMailboxDownloadMessageRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxDownloadMessageRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxDownloadMessageRequest.ABI.makeIEmailMailboxDownloadMessageRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxDownloadMessageRequest> {
    public override fun getValue() = EmailMailboxDownloadMessageRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxDownloadMessageRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxDownloadMessageRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxDownloadMessageRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxDownloadMessageRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxDownloadMessageRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
