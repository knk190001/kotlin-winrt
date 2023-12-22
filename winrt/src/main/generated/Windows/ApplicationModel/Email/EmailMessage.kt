package Windows.ApplicationModel.Email

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

@ABIMarker(EmailMessage.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMessage;{6c6d948d-80b5-48f8-b0b1-e04e430f44e5})")
@WinRTByReference(brClass = EmailMessage.ByReference::class)
public class EmailMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMessage.WithDefault, IEmailMessage2.WithDefault,
    IEmailMessage3.WithDefault, IEmailMessage4.WithDefault, IWinRTObject {
  private val __40954910_Interface: IEmailMessage.WithDefault by lazy {
    as_40954910()
  }


  private val __1269602160_Interface: IEmailMessage2.WithDefault by lazy {
    as_1269602160()
  }


  private val __1269602159_Interface: IEmailMessage3.WithDefault by lazy {
    as_1269602159()
  }


  private val __1269602158_Interface: IEmailMessage4.WithDefault by lazy {
    as_1269602158()
  }


  public override val __40954910_Ptr: JNAPointer? by lazy {
    __40954910_Interface.__40954910_Ptr
  }


  public override val __1269602160_Ptr: JNAPointer? by lazy {
    __1269602160_Interface.__1269602160_Ptr
  }


  public override val __1269602159_Ptr: JNAPointer? by lazy {
    __1269602159_Interface.__1269602159_Ptr
  }


  public override val __1269602158_Ptr: JNAPointer? by lazy {
    __1269602158_Interface.__1269602158_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__40954910_Interface, __1269602160_Interface, __1269602159_Interface,
        __1269602158_Interface)

  public constructor() : this(ABI.activate())

  private fun as_40954910(): IEmailMessage.WithDefault {
    if(pointer == NULL) {
      return(IEmailMessage.ABI.makeIEmailMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMessage.ABI.makeIEmailMessage(ref.value))
  }

  private fun as_1269602160(): IEmailMessage2.WithDefault {
    if(pointer == NULL) {
      return(IEmailMessage2.ABI.makeIEmailMessage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMessage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMessage2.ABI.makeIEmailMessage2(ref.value))
  }

  private fun as_1269602159(): IEmailMessage3.WithDefault {
    if(pointer == NULL) {
      return(IEmailMessage3.ABI.makeIEmailMessage3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMessage3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMessage3.ABI.makeIEmailMessage3(ref.value))
  }

  private fun as_1269602158(): IEmailMessage4.WithDefault {
    if(pointer == NULL) {
      return(IEmailMessage4.ABI.makeIEmailMessage4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMessage4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMessage4.ABI.makeIEmailMessage4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EmailMessage> {
    public override fun getValue() = EmailMessage(pointer.getPointer(0))

    public fun setValue(value: EmailMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMessage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailMessage".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): EmailMessage {
      val address = segment.toRawLongValue()
      return EmailMessage(Pointer(address))
    }

    public override fun toNative(obj: EmailMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
