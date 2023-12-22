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

@ABIMarker(EmailQueryOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailQueryOptions;{45504b9b-3e7f-4d52-b6dd-d6fd4e1fbd9a})")
@WinRTByReference(brClass = EmailQueryOptions.ByReference::class)
public class EmailQueryOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailQueryOptions.WithDefault, IWinRTObject {
  private val __1865757115_Interface: IEmailQueryOptions.WithDefault by lazy {
    as_1865757115()
  }


  public override val __1865757115_Ptr: JNAPointer? by lazy {
    __1865757115_Interface.__1865757115_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1865757115_Interface)

  public constructor() : this(ABI.activate())

  public constructor(text: String) : this(ABI.activate(text))

  public constructor(text: String, fields: EmailQuerySearchFields) : this(ABI.activate(text,
      fields))

  private fun as_1865757115(): IEmailQueryOptions.WithDefault {
    if(pointer == NULL) {
      return(IEmailQueryOptions.ABI.makeIEmailQueryOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailQueryOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailQueryOptions.ABI.makeIEmailQueryOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailQueryOptions> {
    public override fun getValue() = EmailQueryOptions(pointer.getPointer(0))

    public fun setValue(value: EmailQueryOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailQueryOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEmailQueryOptionsFactory_Instance: IEmailQueryOptionsFactory by lazy {
      createIEmailQueryOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailQueryOptions".toHandle(),
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

    public fun createIEmailQueryOptionsFactory(): IEmailQueryOptionsFactory {
      val refiid = Guid.REFIID(IEmailQueryOptionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailQueryOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEmailQueryOptionsFactory.ABI.makeIEmailQueryOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(text: String): JNAPointer? =
        IEmailQueryOptionsFactory_Instance.CreateWithText(text)?.pointer

    public fun activate(text: String, fields: EmailQuerySearchFields): JNAPointer? =
        IEmailQueryOptionsFactory_Instance.CreateWithTextAndFields(text, fields)?.pointer

    public override fun fromNative(segment: MemoryAddress): EmailQueryOptions {
      val address = segment.toRawLongValue()
      return EmailQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: EmailQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
