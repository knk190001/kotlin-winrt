package Windows.ApplicationModel.Email

import Windows.Foundation.DateTime
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(EmailIrmInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailIrmInfo;{90f52193-b1a0-4ebd-a6b6-ddca55606e0e})")
@WinRTByReference(brClass = EmailIrmInfo.ByReference::class)
public class EmailIrmInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailIrmInfo.WithDefault, IWinRTObject {
  private val __1069396749_Interface: IEmailIrmInfo.WithDefault by lazy {
    as_1069396749()
  }


  public override val __1069396749_Ptr: JNAPointer? by lazy {
    __1069396749_Interface.__1069396749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1069396749_Interface)

  public constructor() : this(ABI.activate())

  public constructor(expiration: DateTime, irmTemplate: EmailIrmTemplate) :
      this(ABI.activate(expiration, irmTemplate))

  private fun as_1069396749(): IEmailIrmInfo.WithDefault {
    if(pointer == NULL) {
      return(IEmailIrmInfo.ABI.makeIEmailIrmInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailIrmInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailIrmInfo.ABI.makeIEmailIrmInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EmailIrmInfo> {
    public override fun getValue() = EmailIrmInfo(pointer.getPointer(0))

    public fun setValue(value: EmailIrmInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailIrmInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEmailIrmInfoFactory_Instance: IEmailIrmInfoFactory by lazy {
      createIEmailIrmInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailIrmInfo".toHandle(),
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

    public fun createIEmailIrmInfoFactory(): IEmailIrmInfoFactory {
      val refiid = Guid.REFIID(IEmailIrmInfoFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailIrmInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEmailIrmInfoFactory.ABI.makeIEmailIrmInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(expiration: DateTime, irmTemplate: EmailIrmTemplate): JNAPointer? =
        IEmailIrmInfoFactory_Instance.Create(expiration, irmTemplate)?.pointer

    public override fun fromNative(segment: MemoryAddress): EmailIrmInfo {
      val address = segment.toRawLongValue()
      return EmailIrmInfo(Pointer(address))
    }

    public override fun toNative(obj: EmailIrmInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
