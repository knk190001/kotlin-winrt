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

@ABIMarker(EmailMailboxProposeNewTimeForMeetingRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxProposeNewTimeForMeetingRequestEventArgs;{fb480b98-33ad-4a67-8251-0f9c249b6a20})")
@WinRTByReference(brClass = EmailMailboxProposeNewTimeForMeetingRequestEventArgs.ByReference::class)
public class EmailMailboxProposeNewTimeForMeetingRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.WithDefault,
    IWinRTObject {
  private val __382964755_Interface:
      IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.WithDefault by lazy {
    as_382964755()
  }


  public override val __382964755_Ptr: JNAPointer? by lazy {
    __382964755_Interface.__382964755_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__382964755_Interface)

  private fun as_382964755(): IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.ABI.makeIEmailMailboxProposeNewTimeForMeetingRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.ABI.makeIEmailMailboxProposeNewTimeForMeetingRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxProposeNewTimeForMeetingRequestEventArgs> {
    public override fun getValue() =
        EmailMailboxProposeNewTimeForMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxProposeNewTimeForMeetingRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxProposeNewTimeForMeetingRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxProposeNewTimeForMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return EmailMailboxProposeNewTimeForMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxProposeNewTimeForMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
