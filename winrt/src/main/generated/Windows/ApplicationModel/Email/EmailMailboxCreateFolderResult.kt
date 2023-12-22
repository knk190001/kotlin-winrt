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

@ABIMarker(EmailMailboxCreateFolderResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailboxCreateFolderResult;{b228557f-2885-4998-b595-8a2d374ce950})")
@WinRTByReference(brClass = EmailMailboxCreateFolderResult.ByReference::class)
public class EmailMailboxCreateFolderResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailboxCreateFolderResult.WithDefault, IWinRTObject {
  private val __828412982_Interface: IEmailMailboxCreateFolderResult.WithDefault by lazy {
    as_828412982()
  }


  public override val __828412982_Ptr: JNAPointer? by lazy {
    __828412982_Interface.__828412982_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__828412982_Interface)

  private fun as_828412982(): IEmailMailboxCreateFolderResult.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailboxCreateFolderResult.ABI.makeIEmailMailboxCreateFolderResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailboxCreateFolderResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailboxCreateFolderResult.ABI.makeIEmailMailboxCreateFolderResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMailboxCreateFolderResult> {
    public override fun getValue() = EmailMailboxCreateFolderResult(pointer.getPointer(0))

    public fun setValue(value: EmailMailboxCreateFolderResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailboxCreateFolderResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailboxCreateFolderResult {
      val address = segment.toRawLongValue()
      return EmailMailboxCreateFolderResult(Pointer(address))
    }

    public override fun toNative(obj: EmailMailboxCreateFolderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
