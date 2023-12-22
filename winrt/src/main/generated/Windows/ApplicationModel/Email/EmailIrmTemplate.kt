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

@ABIMarker(EmailIrmTemplate.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailIrmTemplate;{f327758d-546d-4bea-a963-54a38b2cc016})")
@WinRTByReference(brClass = EmailIrmTemplate.ByReference::class)
public class EmailIrmTemplate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailIrmTemplate.WithDefault, IWinRTObject {
  private val __1691692199_Interface: IEmailIrmTemplate.WithDefault by lazy {
    as_1691692199()
  }


  public override val __1691692199_Ptr: JNAPointer? by lazy {
    __1691692199_Interface.__1691692199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1691692199_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    id: String,
    name: String,
    description: String
  ) : this(ABI.activate(id, name, description))

  private fun as_1691692199(): IEmailIrmTemplate.WithDefault {
    if(pointer == NULL) {
      return(IEmailIrmTemplate.ABI.makeIEmailIrmTemplate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailIrmTemplate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailIrmTemplate.ABI.makeIEmailIrmTemplate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailIrmTemplate> {
    public override fun getValue() = EmailIrmTemplate(pointer.getPointer(0))

    public fun setValue(value: EmailIrmTemplate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailIrmTemplate, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEmailIrmTemplateFactory_Instance: IEmailIrmTemplateFactory by lazy {
      createIEmailIrmTemplateFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailIrmTemplate".toHandle(),
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

    public fun createIEmailIrmTemplateFactory(): IEmailIrmTemplateFactory {
      val refiid = Guid.REFIID(IEmailIrmTemplateFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailIrmTemplate".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEmailIrmTemplateFactory.ABI.makeIEmailIrmTemplateFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      id: String,
      name: String,
      description: String
    ): JNAPointer? = IEmailIrmTemplateFactory_Instance.Create(id, name, description)?.pointer

    public override fun fromNative(segment: MemoryAddress): EmailIrmTemplate {
      val address = segment.toRawLongValue()
      return EmailIrmTemplate(Pointer(address))
    }

    public override fun toNative(obj: EmailIrmTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
