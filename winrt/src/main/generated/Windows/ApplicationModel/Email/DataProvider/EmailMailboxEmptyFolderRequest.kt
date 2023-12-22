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

@ABIMarker(EmailMailboxEmptyFolderRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxEmptyFolderRequest;{fe4b03ab-f86d-46d9-b4ce-bc8a6d9e9268})")
@WinRTByReference(brClass = EmailMailboxEmptyFolderRequest.ByReference::class)
public class EmailMailboxEmptyFolderRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxEmptyFolderRequest.WithDefault, IWinRTObject {
  private val __1412558306_Interface: IEmailMailboxEmptyFolderRequest.WithDefault by lazy {
    as_1412558306()
  }


  public override val __1412558306_Ptr: JNAPointer? by lazy {
    __1412558306_Interface.__1412558306_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1412558306_Interface)

  private fun as_1412558306(): IEmailMailboxEmptyFolderRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxEmptyFolderRequest.ABI.makeIEmailMailboxEmptyFolderRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxEmptyFolderRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxEmptyFolderRequest.ABI.makeIEmailMailboxEmptyFolderRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxEmptyFolderRequest> {
    public override fun getValue() = EmailMailboxEmptyFolderRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxEmptyFolderRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxEmptyFolderRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxEmptyFolderRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxEmptyFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxEmptyFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
