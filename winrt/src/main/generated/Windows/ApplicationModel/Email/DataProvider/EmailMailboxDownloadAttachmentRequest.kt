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

@ABIMarker(EmailMailboxDownloadAttachmentRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxDownloadAttachmentRequest;{0b1dbbb4-750c-48e1-bce4-8d589684ffbc})")
@WinRTByReference(brClass = EmailMailboxDownloadAttachmentRequest.ByReference::class)
public class EmailMailboxDownloadAttachmentRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxDownloadAttachmentRequest.WithDefault, IWinRTObject {
  private val __1927398182_Interface: IEmailMailboxDownloadAttachmentRequest.WithDefault by lazy {
    as_1927398182()
  }


  public override val __1927398182_Ptr: JNAPointer? by lazy {
    __1927398182_Interface.__1927398182_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1927398182_Interface)

  private fun as_1927398182(): IEmailMailboxDownloadAttachmentRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxDownloadAttachmentRequest.ABI.makeIEmailMailboxDownloadAttachmentRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxDownloadAttachmentRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxDownloadAttachmentRequest.ABI.makeIEmailMailboxDownloadAttachmentRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxDownloadAttachmentRequest> {
    public override fun getValue() = EmailMailboxDownloadAttachmentRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxDownloadAttachmentRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxDownloadAttachmentRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxDownloadAttachmentRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxDownloadAttachmentRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxDownloadAttachmentRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
