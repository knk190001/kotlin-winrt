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

@ABIMarker(EmailMailboxCreateFolderRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxCreateFolderRequest;{184d3775-c921-4c39-a309-e16c9f22b04b})")
@WinRTByReference(brClass = EmailMailboxCreateFolderRequest.ByReference::class)
public class EmailMailboxCreateFolderRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxCreateFolderRequest.WithDefault, IWinRTObject {
  private val __1992972219_Interface: IEmailMailboxCreateFolderRequest.WithDefault by lazy {
    as_1992972219()
  }


  public override val __1992972219_Ptr: JNAPointer? by lazy {
    __1992972219_Interface.__1992972219_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1992972219_Interface)

  private fun as_1992972219(): IEmailMailboxCreateFolderRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxCreateFolderRequest.ABI.makeIEmailMailboxCreateFolderRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxCreateFolderRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxCreateFolderRequest.ABI.makeIEmailMailboxCreateFolderRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxCreateFolderRequest> {
    public override fun getValue() = EmailMailboxCreateFolderRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxCreateFolderRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxCreateFolderRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxCreateFolderRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxCreateFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxCreateFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
