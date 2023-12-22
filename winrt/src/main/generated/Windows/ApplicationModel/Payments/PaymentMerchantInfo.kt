package Windows.ApplicationModel.Payments

import Windows.Foundation.Uri
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

@ABIMarker(PaymentMerchantInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentMerchantInfo;{63445050-0e94-4ed6-aacb-e6012bd327a7})")
@WinRTByReference(brClass = PaymentMerchantInfo.ByReference::class)
public class PaymentMerchantInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentMerchantInfo.WithDefault, IWinRTObject {
  private val __514794794_Interface: IPaymentMerchantInfo.WithDefault by lazy {
    as_514794794()
  }


  public override val __514794794_Ptr: JNAPointer? by lazy {
    __514794794_Interface.__514794794_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__514794794_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uri: Uri) : this(ABI.activate(uri))

  private fun as_514794794(): IPaymentMerchantInfo.WithDefault {
    if(pointer == NULL) {
      return(IPaymentMerchantInfo.ABI.makeIPaymentMerchantInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentMerchantInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentMerchantInfo.ABI.makeIPaymentMerchantInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentMerchantInfo> {
    public override fun getValue() = PaymentMerchantInfo(pointer.getPointer(0))

    public fun setValue(value: PaymentMerchantInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentMerchantInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPaymentMerchantInfoFactory_Instance: IPaymentMerchantInfoFactory by lazy {
      createIPaymentMerchantInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentMerchantInfo".toHandle(),
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

    public fun createIPaymentMerchantInfoFactory(): IPaymentMerchantInfoFactory {
      val refiid = Guid.REFIID(IPaymentMerchantInfoFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentMerchantInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentMerchantInfoFactory.ABI.makeIPaymentMerchantInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(uri: Uri): JNAPointer? =
        IPaymentMerchantInfoFactory_Instance.Create(uri)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentMerchantInfo {
      val address = segment.toRawLongValue()
      return PaymentMerchantInfo(Pointer(address))
    }

    public override fun toNative(obj: PaymentMerchantInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
