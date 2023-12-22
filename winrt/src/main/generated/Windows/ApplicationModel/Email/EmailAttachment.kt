package Windows.ApplicationModel.Email

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(EmailAttachment.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailAttachment;{f353caf9-57c8-4adb-b992-60fceb584f54})")
@WinRTByReference(brClass = EmailAttachment.ByReference::class)
public class EmailAttachment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailAttachment.WithDefault, IEmailAttachment2.WithDefault, IWinRTObject {
  private val __589696152_Interface: IEmailAttachment.WithDefault by lazy {
    as_589696152()
  }


  private val __1100711478_Interface: IEmailAttachment2.WithDefault by lazy {
    as_1100711478()
  }


  public override val __589696152_Ptr: JNAPointer? by lazy {
    __589696152_Interface.__589696152_Ptr
  }


  public override val __1100711478_Ptr: JNAPointer? by lazy {
    __1100711478_Interface.__1100711478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__589696152_Interface, __1100711478_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    fileName: String,
    `data`: IRandomAccessStreamReference,
    mimeType: String
  ) : this(ABI.activate(fileName, data, mimeType))

  public constructor(fileName: String, `data`: IRandomAccessStreamReference) :
      this(ABI.activate(fileName, data))

  private fun as_589696152(): IEmailAttachment.WithDefault {
    if(pointer == NULL) {
      return(IEmailAttachment.ABI.makeIEmailAttachment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailAttachment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailAttachment.ABI.makeIEmailAttachment(ref.value))
  }

  private fun as_1100711478(): IEmailAttachment2.WithDefault {
    if(pointer == NULL) {
      return(IEmailAttachment2.ABI.makeIEmailAttachment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailAttachment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailAttachment2.ABI.makeIEmailAttachment2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailAttachment> {
    public override fun getValue() = EmailAttachment(pointer.getPointer(0))

    public fun setValue(value: EmailAttachment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailAttachment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEmailAttachmentFactory2_Instance: IEmailAttachmentFactory2 by lazy {
      createIEmailAttachmentFactory2()
    }


    public val IEmailAttachmentFactory_Instance: IEmailAttachmentFactory by lazy {
      createIEmailAttachmentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailAttachment".toHandle(),
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

    public fun createIEmailAttachmentFactory2(): IEmailAttachmentFactory2 {
      val refiid = Guid.REFIID(IEmailAttachmentFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailAttachment".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEmailAttachmentFactory2.ABI.makeIEmailAttachmentFactory2(factoryActivatorPtr.value))
    }

    public fun createIEmailAttachmentFactory(): IEmailAttachmentFactory {
      val refiid = Guid.REFIID(IEmailAttachmentFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailAttachment".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEmailAttachmentFactory.ABI.makeIEmailAttachmentFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      fileName: String,
      `data`: IRandomAccessStreamReference,
      mimeType: String
    ): JNAPointer? = IEmailAttachmentFactory2_Instance.Create(fileName, data, mimeType)?.pointer

    public fun activate(fileName: String, `data`: IRandomAccessStreamReference): JNAPointer? =
        IEmailAttachmentFactory_Instance.Create(fileName, data)?.pointer

    public override fun fromNative(segment: MemoryAddress): EmailAttachment {
      val address = segment.toRawLongValue()
      return EmailAttachment(Pointer(address))
    }

    public override fun toNative(obj: EmailAttachment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
