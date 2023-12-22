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

@ABIMarker(EmailMailboxSyncManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxSyncManager;{517ac55a-3591-4b5d-85bc-c71dde862263})")
@WinRTByReference(brClass = EmailMailboxSyncManager.ByReference::class)
public class EmailMailboxSyncManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxSyncManager.WithDefault, IEmailMailboxSyncManager2.WithDefault,
    IWinRTObject {
  private val __783260541_Interface: IEmailMailboxSyncManager.WithDefault by lazy {
    as_783260541()
  }


  private val __1488727055_Interface: IEmailMailboxSyncManager2.WithDefault by lazy {
    as_1488727055()
  }


  public override val __783260541_Ptr: JNAPointer? by lazy {
    __783260541_Interface.__783260541_Ptr
  }


  public override val __1488727055_Ptr: JNAPointer? by lazy {
    __1488727055_Interface.__1488727055_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__783260541_Interface, __1488727055_Interface)

  private fun as_783260541(): IEmailMailboxSyncManager.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxSyncManager.ABI.makeIEmailMailboxSyncManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxSyncManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxSyncManager.ABI.makeIEmailMailboxSyncManager(ref.value))
  }

  private fun as_1488727055(): IEmailMailboxSyncManager2.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxSyncManager2.ABI.makeIEmailMailboxSyncManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxSyncManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxSyncManager2.ABI.makeIEmailMailboxSyncManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxSyncManager> {
    public override fun getValue() = EmailMailboxSyncManager(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxSyncManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxSyncManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxSyncManager {
      val address = segment.toRawLongValue()
      return EmailMailboxSyncManager(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
