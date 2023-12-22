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

@ABIMarker(EmailMailboxSetAutoReplySettingsRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxSetAutoReplySettingsRequest;{75a422d0-a88e-4e54-8dc7-c243186b774e})")
@WinRTByReference(brClass = EmailMailboxSetAutoReplySettingsRequest.ByReference::class)
public class EmailMailboxSetAutoReplySettingsRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxSetAutoReplySettingsRequest.WithDefault, IWinRTObject {
  private val __1254619511_Interface: IEmailMailboxSetAutoReplySettingsRequest.WithDefault by lazy {
    as_1254619511()
  }


  public override val __1254619511_Ptr: JNAPointer? by lazy {
    __1254619511_Interface.__1254619511_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1254619511_Interface)

  private fun as_1254619511(): IEmailMailboxSetAutoReplySettingsRequest.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxSetAutoReplySettingsRequest.ABI.makeIEmailMailboxSetAutoReplySettingsRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxSetAutoReplySettingsRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxSetAutoReplySettingsRequest.ABI.makeIEmailMailboxSetAutoReplySettingsRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxSetAutoReplySettingsRequest> {
    public override fun getValue() = EmailMailboxSetAutoReplySettingsRequest(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxSetAutoReplySettingsRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxSetAutoReplySettingsRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxSetAutoReplySettingsRequest {
      val address = segment.toRawLongValue()
      return EmailMailboxSetAutoReplySettingsRequest(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxSetAutoReplySettingsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
