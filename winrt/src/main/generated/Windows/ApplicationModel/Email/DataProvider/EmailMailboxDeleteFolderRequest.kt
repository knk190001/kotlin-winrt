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

@ABIMarker(EmailMailboxDeleteFolderRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxDeleteFolderRequest;{9469e88a-a931-4779-923d-09a3ea292e29})")
@WinRTByReference(brClass = EmailMailboxDeleteFolderRequest.ByReference::class)
public class EmailMailboxDeleteFolderRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxDeleteFolderRequest.WithDefault, IWinRTObject {
  private val __66635628_Interface: IEmailMailboxDeleteFolderRequest.WithDefault by lazy {
    as_66635628()
  }


  public override val __66635628_Ptr: JNAPointer? by lazy {
    __66635628_Interface.__66635628_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__66635628_Interface)

  private fun as_66635628(): IEmailMailboxDeleteFolderRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxDeleteFolderRequest.ABI.makeIEmailMailboxDeleteFolderRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxDeleteFolderRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxDeleteFolderRequest.ABI.makeIEmailMailboxDeleteFolderRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxDeleteFolderRequest> {
    public override fun getValue() = EmailMailboxDeleteFolderRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxDeleteFolderRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxDeleteFolderRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxDeleteFolderRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxDeleteFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxDeleteFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
