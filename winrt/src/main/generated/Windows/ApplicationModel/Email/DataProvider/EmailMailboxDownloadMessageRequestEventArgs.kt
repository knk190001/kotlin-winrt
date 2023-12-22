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

@ABIMarker(EmailMailboxDownloadMessageRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxDownloadMessageRequestEventArgs;{470409ad-d0a0-4a5b-bb2a-37621039c53e})")
@WinRTByReference(brClass = EmailMailboxDownloadMessageRequestEventArgs.ByReference::class)
public class EmailMailboxDownloadMessageRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxDownloadMessageRequestEventArgs.WithDefault, IWinRTObject {
  private val __1303702877_Interface: IEmailMailboxDownloadMessageRequestEventArgs.WithDefault by
      lazy {
    as_1303702877()
  }


  public override val __1303702877_Ptr: JNAPointer? by lazy {
    __1303702877_Interface.__1303702877_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1303702877_Interface)

  private fun as_1303702877(): IEmailMailboxDownloadMessageRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxDownloadMessageRequestEventArgs.ABI.makeIEmailMailboxDownloadMessageRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxDownloadMessageRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxDownloadMessageRequestEventArgs.ABI.makeIEmailMailboxDownloadMessageRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxDownloadMessageRequestEventArgs> {
    public override fun getValue() =
        EmailMailboxDownloadMessageRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxDownloadMessageRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxDownloadMessageRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxDownloadMessageRequestEventArgs {
      val address = segment.toRawLongValue()
      return EmailMailboxDownloadMessageRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxDownloadMessageRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
