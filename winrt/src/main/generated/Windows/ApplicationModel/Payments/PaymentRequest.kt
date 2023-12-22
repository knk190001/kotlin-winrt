package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentRequestFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(PaymentRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentRequest;{b74942e1-ed7b-47eb-bc08-78cc5d6896b6})")
@WinRTByReference(brClass = PaymentRequest.ByReference::class)
public class PaymentRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentRequest.WithDefault, IPaymentRequest2.WithDefault, IWinRTObject {
  private val __84508539_Interface: IPaymentRequest.WithDefault by lazy {
    as_84508539()
  }


  private val __1675202537_Interface: IPaymentRequest2.WithDefault by lazy {
    as_1675202537()
  }


  public override val __84508539_Ptr: JNAPointer? by lazy {
    __84508539_Interface.__84508539_Ptr
  }


  public override val __1675202537_Ptr: JNAPointer? by lazy {
    __1675202537_Interface.__1675202537_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__84508539_Interface, __1675202537_Interface)

  public constructor(details: PaymentDetails, methodData: IIterable<PaymentMethodData?>) :
      this(ABI.activate(details, methodData))

  public constructor(
    details: PaymentDetails,
    methodData: IIterable<PaymentMethodData?>,
    merchantInfo: PaymentMerchantInfo
  ) : this(ABI.activate(details, methodData, merchantInfo))

  public constructor(
    details: PaymentDetails,
    methodData: IIterable<PaymentMethodData?>,
    merchantInfo: PaymentMerchantInfo,
    options: PaymentOptions
  ) : this(ABI.activate(details, methodData, merchantInfo, options))

  public constructor(
    details: PaymentDetails,
    methodData: IIterable<PaymentMethodData?>,
    merchantInfo: PaymentMerchantInfo,
    options: PaymentOptions,
    id: String
  ) : this(ABI.activate(details, methodData, merchantInfo, options, id))

  private fun as_84508539(): IPaymentRequest.WithDefault {
    if(pointer == NULL) {
      return(IPaymentRequest.ABI.makeIPaymentRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentRequest.ABI.makeIPaymentRequest(ref.value))
  }

  private fun as_1675202537(): IPaymentRequest2.WithDefault {
    if(pointer == NULL) {
      return(IPaymentRequest2.ABI.makeIPaymentRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentRequest2.ABI.makeIPaymentRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PaymentRequest>
      {
    public override fun getValue() = PaymentRequest(pointer.getPointer(0))

    public fun setValue(value: PaymentRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentRequest, MemoryAddress> {
    public val IPaymentRequestFactory_Instance: IPaymentRequestFactory by lazy {
      createIPaymentRequestFactory()
    }


    public val IPaymentRequestFactory2_Instance: IPaymentRequestFactory2 by lazy {
      createIPaymentRequestFactory2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentRequestFactory(): IPaymentRequestFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentRequestFactory.ABI.makeIPaymentRequestFactory(factoryActivatorPtr.value))
    }

    public fun createIPaymentRequestFactory2(): IPaymentRequestFactory2 {
      val refiid = Guid.REFIID(IPaymentRequestFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentRequestFactory2.ABI.makeIPaymentRequestFactory2(factoryActivatorPtr.value))
    }

    public fun activate(details: PaymentDetails, methodData: IIterable<PaymentMethodData?>):
        JNAPointer? = IPaymentRequestFactory_Instance.Create(details, methodData)?.pointer

    public fun activate(
      details: PaymentDetails,
      methodData: IIterable<PaymentMethodData?>,
      merchantInfo: PaymentMerchantInfo
    ): JNAPointer? = IPaymentRequestFactory_Instance.CreateWithMerchantInfo(details, methodData,
        merchantInfo)?.pointer

    public fun activate(
      details: PaymentDetails,
      methodData: IIterable<PaymentMethodData?>,
      merchantInfo: PaymentMerchantInfo,
      options: PaymentOptions
    ): JNAPointer? = IPaymentRequestFactory_Instance.CreateWithMerchantInfoAndOptions(details,
        methodData, merchantInfo, options)?.pointer

    public fun activate(
      details: PaymentDetails,
      methodData: IIterable<PaymentMethodData?>,
      merchantInfo: PaymentMerchantInfo,
      options: PaymentOptions,
      id: String
    ): JNAPointer? = IPaymentRequestFactory2_Instance.CreateWithMerchantInfoOptionsAndId(details,
        methodData, merchantInfo, options, id)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentRequest {
      val address = segment.toRawLongValue()
      return PaymentRequest(Pointer(address))
    }

    public override fun toNative(obj: PaymentRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
