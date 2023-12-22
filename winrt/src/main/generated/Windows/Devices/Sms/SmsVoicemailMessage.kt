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

@ABIMarker(SmsVoicemailMessage.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsVoicemailMessage;{271aa0a6-95b1-44ff-bcb8-b8fdd7e08bc3})")
@WinRTByReference(brClass = SmsVoicemailMessage.ByReference::class)
public class SmsVoicemailMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsVoicemailMessage.WithDefault, ISmsMessageBase.WithDefault, IWinRTObject {
  private val __876639413_Interface: ISmsVoicemailMessage.WithDefault by lazy {
    as_876639413()
  }


  private val __1120832021_Interface: ISmsMessageBase.WithDefault by lazy {
    as_1120832021()
  }


  public override val __876639413_Ptr: JNAPointer? by lazy {
    __876639413_Interface.__876639413_Ptr
  }


  public override val __1120832021_Ptr: JNAPointer? by lazy {
    __1120832021_Interface.__1120832021_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__876639413_Interface, __1120832021_Interface)

  private fun as_876639413(): ISmsVoicemailMessage.WithDefault {
    if(pointer == NULL) {
      return(ISmsVoicemailMessage.ABI.makeISmsVoicemailMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsVoicemailMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsVoicemailMessage.ABI.makeISmsVoicemailMessage(ref.value))
  }

  private fun as_1120832021(): ISmsMessageBase.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessageBase.ABI.makeISmsMessageBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessageBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessageBase.ABI.makeISmsMessageBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsVoicemailMessage> {
    public override fun getValue() = SmsVoicemailMessage(pointer.getPointer(0))

    public fun setValue(value: SmsVoicemailMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsVoicemailMessage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsVoicemailMessage {
      val address = segment.toRawLongValue()
      return SmsVoicemailMessage(Pointer(address))
    }

    public override fun toNative(obj: SmsVoicemailMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
