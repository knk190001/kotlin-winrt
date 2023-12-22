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

@ABIMarker(EmailMailboxServerSearchReadBatchRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxServerSearchReadBatchRequest;{090eebdf-5a96-41d3-8ad8-34912f9aa60e})")
@WinRTByReference(brClass = EmailMailboxServerSearchReadBatchRequest.ByReference::class)
public class EmailMailboxServerSearchReadBatchRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxServerSearchReadBatchRequest.WithDefault, IWinRTObject {
  private val __1361130688_Interface: IEmailMailboxServerSearchReadBatchRequest.WithDefault by
      lazy {
    as_1361130688()
  }


  public override val __1361130688_Ptr: JNAPointer? by lazy {
    __1361130688_Interface.__1361130688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1361130688_Interface)

  private fun as_1361130688(): IEmailMailboxServerSearchReadBatchRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxServerSearchReadBatchRequest.ABI.makeIEmailMailboxServerSearchReadBatchRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxServerSearchReadBatchRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxServerSearchReadBatchRequest.ABI.makeIEmailMailboxServerSearchReadBatchRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxServerSearchReadBatchRequest> {
    public override fun getValue() = EmailMailboxServerSearchReadBatchRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxServerSearchReadBatchRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxServerSearchReadBatchRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxServerSearchReadBatchRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxServerSearchReadBatchRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxServerSearchReadBatchRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
