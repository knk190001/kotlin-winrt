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

@ABIMarker(EmailRecipientResolutionResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailRecipientResolutionResult;{918338fa-8d8d-4573-80d1-07172a34b98d})")
@WinRTByReference(brClass = EmailRecipientResolutionResult.ByReference::class)
public class EmailRecipientResolutionResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailRecipientResolutionResult.WithDefault,
    IEmailRecipientResolutionResult2.WithDefault, IWinRTObject {
  private val __2016849091_Interface: IEmailRecipientResolutionResult.WithDefault by lazy {
    as_2016849091()
  }


  private val __1902187669_Interface: IEmailRecipientResolutionResult2.WithDefault by lazy {
    as_1902187669()
  }


  public override val __2016849091_Ptr: JNAPointer? by lazy {
    __2016849091_Interface.__2016849091_Ptr
  }


  public override val __1902187669_Ptr: JNAPointer? by lazy {
    __1902187669_Interface.__1902187669_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2016849091_Interface, __1902187669_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2016849091(): IEmailRecipientResolutionResult.WithDefault {
    if(pointer == NULL) {
      return(IEmailRecipientResolutionResult.ABI.makeIEmailRecipientResolutionResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailRecipientResolutionResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailRecipientResolutionResult.ABI.makeIEmailRecipientResolutionResult(ref.value))
  }

  private fun as_1902187669(): IEmailRecipientResolutionResult2.WithDefault {
    if(pointer == NULL) {
      return(IEmailRecipientResolutionResult2.ABI.makeIEmailRecipientResolutionResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailRecipientResolutionResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailRecipientResolutionResult2.ABI.makeIEmailRecipientResolutionResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailRecipientResolutionResult> {
    public override fun getValue() = EmailRecipientResolutionResult(pointer.getPointer(0))

    public fun setValue(value: EmailRecipientResolutionResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailRecipientResolutionResult, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Email.EmailRecipientResolutionResult".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): EmailRecipientResolutionResult {
      val address = segment.toRawLongValue()
      return EmailRecipientResolutionResult(Pointer(address))
    }

    public override fun toNative(obj: EmailRecipientResolutionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
