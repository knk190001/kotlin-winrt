package Windows.ApplicationModel.Payments

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

@ABIMarker(PaymentDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentDetails;{53bb2d7d-e0eb-4053-8eae-ce7c48e02945})")
@WinRTByReference(brClass = PaymentDetails.ByReference::class)
public class PaymentDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentDetails.WithDefault, IWinRTObject {
  private val __546537262_Interface: IPaymentDetails.WithDefault by lazy {
    as_546537262()
  }


  public override val __546537262_Ptr: JNAPointer? by lazy {
    __546537262_Interface.__546537262_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__546537262_Interface)

  public constructor() : this(ABI.activate())

  public constructor(total: PaymentItem) : this(ABI.activate(total))

  public constructor(total: PaymentItem, displayItems: IIterable<PaymentItem?>) :
      this(ABI.activate(total, displayItems))

  private fun as_546537262(): IPaymentDetails.WithDefault {
    if(pointer == NULL) {
      return(IPaymentDetails.ABI.makeIPaymentDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentDetails.ABI.makeIPaymentDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PaymentDetails>
      {
    public override fun getValue() = PaymentDetails(pointer.getPointer(0))

    public fun setValue(value: PaymentDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentDetails, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPaymentDetailsFactory_Instance: IPaymentDetailsFactory by lazy {
      createIPaymentDetailsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentDetails".toHandle(),
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

    public fun createIPaymentDetailsFactory(): IPaymentDetailsFactory {
      val refiid = Guid.REFIID(IPaymentDetailsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentDetails".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentDetailsFactory.ABI.makeIPaymentDetailsFactory(factoryActivatorPtr.value))
    }

    public fun activate(total: PaymentItem): JNAPointer? =
        IPaymentDetailsFactory_Instance.Create(total)?.pointer

    public fun activate(total: PaymentItem, displayItems: IIterable<PaymentItem?>): JNAPointer? =
        IPaymentDetailsFactory_Instance.CreateWithDisplayItems(total, displayItems)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentDetails {
      val address = segment.toRawLongValue()
      return PaymentDetails(Pointer(address))
    }

    public override fun toNative(obj: PaymentDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
