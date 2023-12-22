package Windows.ApplicationModel.Email

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

@ABIMarker(EmailMailboxAutoReply.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxAutoReply;{e223254c-8ab4-485b-b31f-04d15476bd59})")
@WinRTByReference(brClass = EmailMailboxAutoReply.ByReference::class)
public class EmailMailboxAutoReply(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxAutoReply.WithDefault, IWinRTObject {
  private val __639390036_Interface: IEmailMailboxAutoReply.WithDefault by lazy {
    as_639390036()
  }


  public override val __639390036_Ptr: JNAPointer? by lazy {
    __639390036_Interface.__639390036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__639390036_Interface)

  private fun as_639390036(): IEmailMailboxAutoReply.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxAutoReply.ABI.makeIEmailMailboxAutoReply(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxAutoReply>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxAutoReply.ABI.makeIEmailMailboxAutoReply(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxAutoReply> {
    public override fun getValue() = EmailMailboxAutoReply(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxAutoReply): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxAutoReply, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxAutoReply {
      val address = segment.toRawLongValue()
      return EmailMailboxAutoReply(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxAutoReply): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
