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

@ABIMarker(SmsStatusMessage.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsStatusMessage;{e6d28342-b70b-4677-9379-c9783fdff8f4})")
@WinRTByReference(brClass = SmsStatusMessage.ByReference::class)
public class SmsStatusMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsStatusMessage.WithDefault, ISmsMessageBase.WithDefault, IWinRTObject {
  private val __2019809640_Interface: ISmsStatusMessage.WithDefault by lazy {
    as_2019809640()
  }


  private val __1120832021_Interface: ISmsMessageBase.WithDefault by lazy {
    as_1120832021()
  }


  public override val __2019809640_Ptr: JNAPointer? by lazy {
    __2019809640_Interface.__2019809640_Ptr
  }


  public override val __1120832021_Ptr: JNAPointer? by lazy {
    __1120832021_Interface.__1120832021_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2019809640_Interface, __1120832021_Interface)

  private fun as_2019809640(): ISmsStatusMessage.WithDefault {
    if(pointer == NULL) {
      return(ISmsStatusMessage.ABI.makeISmsStatusMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsStatusMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsStatusMessage.ABI.makeISmsStatusMessage(ref.value))
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
      IByReference<SmsStatusMessage> {
    public override fun getValue() = SmsStatusMessage(pointer.getPointer(0))

    public fun setValue(value: SmsStatusMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsStatusMessage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsStatusMessage {
      val address = segment.toRawLongValue()
      return SmsStatusMessage(Pointer(address))
    }

    public override fun toNative(obj: SmsStatusMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
