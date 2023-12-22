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

@ABIMarker(EmailMailboxValidateCertificatesRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxValidateCertificatesRequest;{a94d3931-e11a-4f97-b81a-187a70a8f41a})")
@WinRTByReference(brClass = EmailMailboxValidateCertificatesRequest.ByReference::class)
public class EmailMailboxValidateCertificatesRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxValidateCertificatesRequest.WithDefault, IWinRTObject {
  private val __1696887981_Interface: IEmailMailboxValidateCertificatesRequest.WithDefault by lazy {
    as_1696887981()
  }


  public override val __1696887981_Ptr: JNAPointer? by lazy {
    __1696887981_Interface.__1696887981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1696887981_Interface)

  private fun as_1696887981(): IEmailMailboxValidateCertificatesRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxValidateCertificatesRequest.ABI.makeIEmailMailboxValidateCertificatesRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxValidateCertificatesRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxValidateCertificatesRequest.ABI.makeIEmailMailboxValidateCertificatesRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxValidateCertificatesRequest> {
    public override fun getValue() = EmailMailboxValidateCertificatesRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxValidateCertificatesRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxValidateCertificatesRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxValidateCertificatesRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxValidateCertificatesRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxValidateCertificatesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
