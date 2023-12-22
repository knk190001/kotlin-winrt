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

@ABIMarker(EmailMailboxMoveFolderRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxMoveFolderRequest;{10ba2856-4a95-4068-91cc-67cc7acf454f})")
@WinRTByReference(brClass = EmailMailboxMoveFolderRequest.ByReference::class)
public class EmailMailboxMoveFolderRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxMoveFolderRequest.WithDefault, IWinRTObject {
  private val __2018571130_Interface: IEmailMailboxMoveFolderRequest.WithDefault by lazy {
    as_2018571130()
  }


  public override val __2018571130_Ptr: JNAPointer? by lazy {
    __2018571130_Interface.__2018571130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2018571130_Interface)

  private fun as_2018571130(): IEmailMailboxMoveFolderRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxMoveFolderRequest.ABI.makeIEmailMailboxMoveFolderRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxMoveFolderRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxMoveFolderRequest.ABI.makeIEmailMailboxMoveFolderRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxMoveFolderRequest> {
    public override fun getValue() = EmailMailboxMoveFolderRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxMoveFolderRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxMoveFolderRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxMoveFolderRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxMoveFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxMoveFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
