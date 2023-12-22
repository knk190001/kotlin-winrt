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

@ABIMarker(EmailMailboxGetAutoReplySettingsRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxGetAutoReplySettingsRequestEventArgs;{d79f55c2-fd45-4004-8a91-9bacf38b7022})")
@WinRTByReference(brClass = EmailMailboxGetAutoReplySettingsRequestEventArgs.ByReference::class)
public class EmailMailboxGetAutoReplySettingsRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxGetAutoReplySettingsRequestEventArgs.WithDefault, IWinRTObject {
  private val __604936602_Interface: IEmailMailboxGetAutoReplySettingsRequestEventArgs.WithDefault
      by lazy {
    as_604936602()
  }


  public override val __604936602_Ptr: JNAPointer? by lazy {
    __604936602_Interface.__604936602_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__604936602_Interface)

  private fun as_604936602(): IEmailMailboxGetAutoReplySettingsRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxGetAutoReplySettingsRequestEventArgs.ABI.makeIEmailMailboxGetAutoReplySettingsRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxGetAutoReplySettingsRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxGetAutoReplySettingsRequestEventArgs.ABI.makeIEmailMailboxGetAutoReplySettingsRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxGetAutoReplySettingsRequestEventArgs> {
    public override fun getValue() =
        EmailMailboxGetAutoReplySettingsRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxGetAutoReplySettingsRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxGetAutoReplySettingsRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxGetAutoReplySettingsRequestEventArgs {
      val address = segment.toRawLongValue()
      return EmailMailboxGetAutoReplySettingsRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxGetAutoReplySettingsRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
