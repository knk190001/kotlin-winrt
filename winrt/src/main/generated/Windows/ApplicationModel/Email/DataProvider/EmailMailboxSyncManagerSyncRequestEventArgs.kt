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

@ABIMarker(EmailMailboxSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.DataProvider.EmailMailboxSyncManagerSyncRequestEventArgs;{439a031a-8fcc-4ae5-b9b5-d434e0a65aa8})")
@WinRTByReference(brClass = EmailMailboxSyncManagerSyncRequestEventArgs.ByReference::class)
public class EmailMailboxSyncManagerSyncRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxSyncManagerSyncRequestEventArgs.WithDefault, IWinRTObject {
  private val __132192587_Interface: IEmailMailboxSyncManagerSyncRequestEventArgs.WithDefault by
      lazy {
    as_132192587()
  }


  public override val __132192587_Ptr: JNAPointer? by lazy {
    __132192587_Interface.__132192587_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__132192587_Interface)

  private fun as_132192587(): IEmailMailboxSyncManagerSyncRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxSyncManagerSyncRequestEventArgs.ABI.makeIEmailMailboxSyncManagerSyncRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxSyncManagerSyncRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxSyncManagerSyncRequestEventArgs.ABI.makeIEmailMailboxSyncManagerSyncRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        EmailMailboxSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxSyncManagerSyncRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        EmailMailboxSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return EmailMailboxSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxSyncManagerSyncRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
