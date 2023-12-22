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

@ABIMarker(EmailMailboxChangedDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxChangedDeferral;{779a74c1-97c5-4b54-b30d-306232623e6d})")
@WinRTByReference(brClass = EmailMailboxChangedDeferral.ByReference::class)
public class EmailMailboxChangedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxChangedDeferral.WithDefault, IWinRTObject {
  private val __992582224_Interface: IEmailMailboxChangedDeferral.WithDefault by lazy {
    as_992582224()
  }


  public override val __992582224_Ptr: JNAPointer? by lazy {
    __992582224_Interface.__992582224_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__992582224_Interface)

  private fun as_992582224(): IEmailMailboxChangedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxChangedDeferral.ABI.makeIEmailMailboxChangedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxChangedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxChangedDeferral.ABI.makeIEmailMailboxChangedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxChangedDeferral> {
    public override fun getValue() = EmailMailboxChangedDeferral(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxChangedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxChangedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxChangedDeferral {
      val address = segment.toRawLongValue()
      return EmailMailboxChangedDeferral(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxChangedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
