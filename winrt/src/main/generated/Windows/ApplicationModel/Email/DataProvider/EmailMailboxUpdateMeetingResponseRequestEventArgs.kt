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

@ABIMarker(EmailMailboxUpdateMeetingResponseRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxUpdateMeetingResponseRequestEventArgs;{6898d761-56c9-4f17-be31-66fda94ba159})")
@WinRTByReference(brClass = EmailMailboxUpdateMeetingResponseRequestEventArgs.ByReference::class)
public class EmailMailboxUpdateMeetingResponseRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxUpdateMeetingResponseRequestEventArgs.WithDefault, IWinRTObject {
  private val __111836655_Interface: IEmailMailboxUpdateMeetingResponseRequestEventArgs.WithDefault
      by lazy {
    as_111836655()
  }


  public override val __111836655_Ptr: JNAPointer? by lazy {
    __111836655_Interface.__111836655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__111836655_Interface)

  private fun as_111836655(): IEmailMailboxUpdateMeetingResponseRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxUpdateMeetingResponseRequestEventArgs.ABI.makeIEmailMailboxUpdateMeetingResponseRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxUpdateMeetingResponseRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxUpdateMeetingResponseRequestEventArgs.ABI.makeIEmailMailboxUpdateMeetingResponseRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxUpdateMeetingResponseRequestEventArgs> {
    public override fun getValue() =
        EmailMailboxUpdateMeetingResponseRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxUpdateMeetingResponseRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxUpdateMeetingResponseRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxUpdateMeetingResponseRequestEventArgs {
      val address = segment.toRawLongValue()
      return EmailMailboxUpdateMeetingResponseRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxUpdateMeetingResponseRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
