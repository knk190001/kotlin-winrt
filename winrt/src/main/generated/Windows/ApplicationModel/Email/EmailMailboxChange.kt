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

@ABIMarker(EmailMailboxChange.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxChange;{61edf54b-11ef-400c-adde-8cde65c85e66})")
@WinRTByReference(brClass = EmailMailboxChange.ByReference::class)
public class EmailMailboxChange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxChange.WithDefault, IWinRTObject {
  private val __1159875297_Interface: IEmailMailboxChange.WithDefault by lazy {
    as_1159875297()
  }


  public override val __1159875297_Ptr: JNAPointer? by lazy {
    __1159875297_Interface.__1159875297_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1159875297_Interface)

  private fun as_1159875297(): IEmailMailboxChange.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxChange.ABI.makeIEmailMailboxChange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxChange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxChange.ABI.makeIEmailMailboxChange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxChange> {
    public override fun getValue() = EmailMailboxChange(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxChange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxChange {
      val address = segment.toRawLongValue()
      return EmailMailboxChange(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
