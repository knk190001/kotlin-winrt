package Windows.Devices.Sms

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SmsBinaryMessage.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsBinaryMessage;{5bf4e813-3b53-4c6e-b61a-d86a63755650})")
@WinRTByReference(brClass = SmsBinaryMessage.ByReference::class)
public class SmsBinaryMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsBinaryMessage.WithDefault, ISmsMessage.WithDefault, IWinRTObject {
  private val __1840365177_Interface: ISmsBinaryMessage.WithDefault by lazy {
    as_1840365177()
  }


  private val __1172998138_Interface: ISmsMessage.WithDefault by lazy {
    as_1172998138()
  }


  public override val __1840365177_Ptr: JNAPointer? by lazy {
    __1840365177_Interface.__1840365177_Ptr
  }


  public override val __1172998138_Ptr: JNAPointer? by lazy {
    __1172998138_Interface.__1172998138_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1840365177_Interface, __1172998138_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1840365177(): ISmsBinaryMessage.WithDefault {
    if(pointer == NULL) {
      return(ISmsBinaryMessage.ABI.makeISmsBinaryMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsBinaryMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsBinaryMessage.ABI.makeISmsBinaryMessage(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsBinaryMessage> {
    public override fun getValue() = SmsBinaryMessage(pointer.getPointer(0))

    public fun setValue(value: SmsBinaryMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsBinaryMessage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsBinaryMessage".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SmsBinaryMessage {
      val address = segment.toRawLongValue()
      return SmsBinaryMessage(Pointer(address))
    }

    public override fun toNative(obj: SmsBinaryMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
