package Windows.Devices.Sms

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

@ABIMarker(SmsSendMessageResult.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsSendMessageResult;{db139af2-78c9-4feb-9622-452328088d62})")
@WinRTByReference(brClass = SmsSendMessageResult.ByReference::class)
public class SmsSendMessageResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsSendMessageResult.WithDefault, IWinRTObject {
  private val __341400433_Interface: ISmsSendMessageResult.WithDefault by lazy {
    as_341400433()
  }


  public override val __341400433_Ptr: JNAPointer? by lazy {
    __341400433_Interface.__341400433_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__341400433_Interface)

  private fun as_341400433(): ISmsSendMessageResult.WithDefault {
    if(pointer == NULL) {
      return(ISmsSendMessageResult.ABI.makeISmsSendMessageResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsSendMessageResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsSendMessageResult.ABI.makeISmsSendMessageResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsSendMessageResult> {
    public override fun getValue() = SmsSendMessageResult(pointer.getPointer(0))

    public fun setValue(value: SmsSendMessageResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsSendMessageResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsSendMessageResult {
      val address = segment.toRawLongValue()
      return SmsSendMessageResult(Pointer(address))
    }

    public override fun toNative(obj: SmsSendMessageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
