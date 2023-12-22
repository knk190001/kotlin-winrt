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

@ABIMarker(EmailMailboxForwardMeetingRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxForwardMeetingRequestEventArgs;{2bd8f33a-2974-4759-a5a5-58f44d3c0275})")
@WinRTByReference(brClass = EmailMailboxForwardMeetingRequestEventArgs.ByReference::class)
public class EmailMailboxForwardMeetingRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxForwardMeetingRequestEventArgs.WithDefault, IWinRTObject {
  private val __707372488_Interface: IEmailMailboxForwardMeetingRequestEventArgs.WithDefault by
      lazy {
    as_707372488()
  }


  public override val __707372488_Ptr: JNAPointer? by lazy {
    __707372488_Interface.__707372488_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__707372488_Interface)

  private fun as_707372488(): IEmailMailboxForwardMeetingRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxForwardMeetingRequestEventArgs.ABI.makeIEmailMailboxForwardMeetingRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxForwardMeetingRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxForwardMeetingRequestEventArgs.ABI.makeIEmailMailboxForwardMeetingRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxForwardMeetingRequestEventArgs> {
    public override fun getValue() =
        EmailMailboxForwardMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxForwardMeetingRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxForwardMeetingRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxForwardMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return EmailMailboxForwardMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxForwardMeetingRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
