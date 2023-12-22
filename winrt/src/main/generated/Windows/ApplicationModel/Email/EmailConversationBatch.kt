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

@ABIMarker(EmailConversationBatch.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailConversationBatch;{b8c1ab81-01c5-432a-9df1-fe85d98a279a})")
@WinRTByReference(brClass = EmailConversationBatch.ByReference::class)
public class EmailConversationBatch(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailConversationBatch.WithDefault, IWinRTObject {
  private val __871128430_Interface: IEmailConversationBatch.WithDefault by lazy {
    as_871128430()
  }


  public override val __871128430_Ptr: JNAPointer? by lazy {
    __871128430_Interface.__871128430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__871128430_Interface)

  private fun as_871128430(): IEmailConversationBatch.WithDefault {
    if(pointer == NULL) {
      return(IEmailConversationBatch.ABI.makeIEmailConversationBatch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailConversationBatch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailConversationBatch.ABI.makeIEmailConversationBatch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailConversationBatch> {
    public override fun getValue() = EmailConversationBatch(pointer.getPointer(0))

    public fun setValue(value: EmailConversationBatch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailConversationBatch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailConversationBatch {
      val address = segment.toRawLongValue()
      return EmailConversationBatch(Pointer(address))
    }

    public override fun toNative(obj: EmailConversationBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
