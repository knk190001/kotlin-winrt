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

@ABIMarker(EmailMailboxAction.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxAction;{ac9889fa-21fa-4927-9210-d410582fdf3e})")
@WinRTByReference(brClass = EmailMailboxAction.ByReference::class)
public class EmailMailboxAction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxAction.WithDefault, IWinRTObject {
  private val __1221189723_Interface: IEmailMailboxAction.WithDefault by lazy {
    as_1221189723()
  }


  public override val __1221189723_Ptr: JNAPointer? by lazy {
    __1221189723_Interface.__1221189723_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1221189723_Interface)

  private fun as_1221189723(): IEmailMailboxAction.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxAction.ABI.makeIEmailMailboxAction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxAction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxAction.ABI.makeIEmailMailboxAction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxAction> {
    public override fun getValue() = EmailMailboxAction(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxAction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxAction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxAction {
      val address = segment.toRawLongValue()
      return EmailMailboxAction(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
