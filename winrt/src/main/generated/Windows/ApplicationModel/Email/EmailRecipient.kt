package Windows.ApplicationModel.Email

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(EmailRecipient.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailRecipient;{cae825b3-4478-4814-b900-c902b5e19b53})")
@WinRTByReference(brClass = EmailRecipient.ByReference::class)
public class EmailRecipient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailRecipient.WithDefault, IWinRTObject {
  private val __1557134132_Interface: IEmailRecipient.WithDefault by lazy {
    as_1557134132()
  }


  public override val __1557134132_Ptr: JNAPointer? by lazy {
    __1557134132_Interface.__1557134132_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1557134132_Interface)

  public constructor() : this(ABI.activate())

  public constructor(address: String) : this(ABI.activate(address))

  public constructor(address: String, name: String) : this(ABI.activate(address, name))

  private fun as_1557134132(): IEmailRecipient.WithDefault {
    if(pointer == NULL) {
      return(IEmailRecipient.ABI.makeIEmailRecipient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailRecipient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailRecipient.ABI.makeIEmailRecipient(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EmailRecipient>
      {
    public override fun getValue() = EmailRecipient(pointer.getPointer(0))

    public fun setValue(value: EmailRecipient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailRecipient, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEmailRecipientFactory_Instance: IEmailRecipientFactory by lazy {
      createIEmailRecipientFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailRecipient".toHandle(),
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

    public fun createIEmailRecipientFactory(): IEmailRecipientFactory {
      val refiid = Guid.REFIID(IEmailRecipientFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailRecipient".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEmailRecipientFactory.ABI.makeIEmailRecipientFactory(factoryActivatorPtr.value))
    }

    public fun activate(address: String): JNAPointer? =
        IEmailRecipientFactory_Instance.Create(address)?.pointer

    public fun activate(address: String, name: String): JNAPointer? =
        IEmailRecipientFactory_Instance.CreateWithName(address, name)?.pointer

    public override fun fromNative(segment: MemoryAddress): EmailRecipient {
      val address = segment.toRawLongValue()
      return EmailRecipient(Pointer(address))
    }

    public override fun toNative(obj: EmailRecipient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
