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

@ABIMarker(EmailMessageBatch.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMessageBatch;{605cd08f-25d9-4f1b-9e51-0514c0149653})")
@WinRTByReference(brClass = EmailMessageBatch.ByReference::class)
public class EmailMessageBatch(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMessageBatch.WithDefault, IWinRTObject {
  private val __358346872_Interface: IEmailMessageBatch.WithDefault by lazy {
    as_358346872()
  }


  public override val __358346872_Ptr: JNAPointer? by lazy {
    __358346872_Interface.__358346872_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__358346872_Interface)

  private fun as_358346872(): IEmailMessageBatch.WithDefault {
    if(pointer == NULL) {
      return(IEmailMessageBatch.ABI.makeIEmailMessageBatch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMessageBatch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMessageBatch.ABI.makeIEmailMessageBatch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailMessageBatch> {
    public override fun getValue() = EmailMessageBatch(pointer.getPointer(0))

    public fun setValue(value: EmailMessageBatch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMessageBatch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMessageBatch {
      val address = segment.toRawLongValue()
      return EmailMessageBatch(Pointer(address))
    }

    public override fun toNative(obj: EmailMessageBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
