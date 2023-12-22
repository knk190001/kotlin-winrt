package Windows.Devices.Sms

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SmsTextMessage.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsTextMessage;{d61c904c-a495-487f-9a6f-971548c5bc9f})")
@WinRTByReference(brClass = SmsTextMessage.ByReference::class)
public class SmsTextMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsTextMessage.WithDefault, ISmsMessage.WithDefault, IWinRTObject {
  private val __132191091_Interface: ISmsTextMessage.WithDefault by lazy {
    as_132191091()
  }


  private val __1172998138_Interface: ISmsMessage.WithDefault by lazy {
    as_1172998138()
  }


  public override val __132191091_Ptr: JNAPointer? by lazy {
    __132191091_Interface.__132191091_Ptr
  }


  public override val __1172998138_Ptr: JNAPointer? by lazy {
    __1172998138_Interface.__1172998138_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__132191091_Interface, __1172998138_Interface)

  public constructor() : this(ABI.activate())

  private fun as_132191091(): ISmsTextMessage.WithDefault {
    if(pointer == NULL) {
      return(ISmsTextMessage.ABI.makeISmsTextMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsTextMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsTextMessage.ABI.makeISmsTextMessage(ref.value))
  }

  private fun as_1172998138(): ISmsMessage.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessage.ABI.makeISmsMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessage.ABI.makeISmsMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SmsTextMessage>
      {
    public override fun getValue() = SmsTextMessage(pointer.getPointer(0))

    public fun setValue(value: SmsTextMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsTextMessage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISmsTextMessageStatics_Instance: ISmsTextMessageStatics by lazy {
      createISmsTextMessageStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsTextMessage".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createISmsTextMessageStatics(): ISmsTextMessageStatics {
      val refiid = Guid.REFIID(ISmsTextMessageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsTextMessage".toHandle(),refiid,interfacePtr)
      val result = ISmsTextMessageStatics.ABI.makeISmsTextMessageStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmsTextMessage {
      val address = segment.toRawLongValue()
      return SmsTextMessage(Pointer(address))
    }

    public override fun toNative(obj: SmsTextMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromBinaryMessage(binaryMessage: SmsBinaryMessage) =
        ABI.ISmsTextMessageStatics_Instance.FromBinaryMessage(binaryMessage)

    public fun FromBinaryData(format: SmsDataFormat, value: Array<Byte>) =
        ABI.ISmsTextMessageStatics_Instance.FromBinaryData(format, value)
  }
}
