package Windows.ApplicationModel.Payments.Provider

import Windows.ApplicationModel.Payments.PaymentAddress
import Windows.ApplicationModel.Payments.PaymentRequest
import Windows.ApplicationModel.Payments.PaymentRequestChangedResult
import Windows.ApplicationModel.Payments.PaymentShippingOption
import Windows.ApplicationModel.Payments.PaymentToken
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentTransaction.ABI::class)
@Signature("{62581da0-26a5-4e9b-a6eb-66606cf001d3}")
@Guid("62581da026a54e9ba6eb66606cf001d3")
@WinRTInterface("62581da026a54e9ba6eb66606cf001d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentTransaction.ByReference::class)
public interface IPaymentTransaction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaymentRequest(): PaymentRequest?

  @InterfaceMethod(1)
  public fun get_PayerEmail(): String?

  @InterfaceMethod(2)
  public fun put_PayerEmail(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_PayerName(): String?

  @InterfaceMethod(4)
  public fun put_PayerName(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_PayerPhoneNumber(): String?

  @InterfaceMethod(6)
  public fun put_PayerPhoneNumber(value: String?): Unit

  @InterfaceMethod(7)
  public fun UpdateShippingAddressAsync(shippingAddress: PaymentAddress?):
      IAsyncOperation<PaymentRequestChangedResult?>?

  @InterfaceMethod(8)
  public fun UpdateSelectedShippingOptionAsync(selectedShippingOption: PaymentShippingOption?):
      IAsyncOperation<PaymentRequestChangedResult?>?

  @InterfaceMethod(9)
  public fun AcceptAsync(paymentToken: PaymentToken?):
      IAsyncOperation<PaymentTransactionAcceptResult?>?

  @InterfaceMethod(10)
  public fun Reject(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentTransaction> {
    public override fun getValue() = ABI.makeIPaymentTransaction(pointer.getPointer(0))

    public fun setValue(value: IPaymentTransaction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentTransaction {
    public val __1240339449_Ptr: Pointer?

    public val _1240339449_VtblPtr: Pointer?
      get() = __1240339449_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaymentRequest(): PaymentRequest? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequest>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PayerEmail(): String? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_PayerEmail(value: String?): Unit {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PayerName(): String? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_PayerName(value: String?): Unit {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PayerPhoneNumber(): String? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PayerPhoneNumber(value: String?): Unit {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun UpdateShippingAddressAsync(shippingAddress: PaymentAddress?):
        IAsyncOperation<PaymentRequestChangedResult?>? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentRequestChangedResult?>>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, marshalToNative(shippingAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PaymentRequestChangedResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun UpdateSelectedShippingOptionAsync(selectedShippingOption: PaymentShippingOption?):
        IAsyncOperation<PaymentRequestChangedResult?>? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentRequestChangedResult?>>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, marshalToNative(selectedShippingOption),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PaymentRequestChangedResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun AcceptAsync(paymentToken: PaymentToken?):
        IAsyncOperation<PaymentTransactionAcceptResult?>? {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentTransactionAcceptResult?>>()
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, marshalToNative(paymentToken), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PaymentTransactionAcceptResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun Reject(): Unit {
      val fnPtr = _1240339449_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1240339449_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPaymentTransaction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1240339449_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentTransaction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62581da026a54e9ba6eb66606cf001d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentTransaction(ptr: Pointer?): WithDefault = IPaymentTransaction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentTransaction {
      val address = segment.toRawLongValue()
      return makeIPaymentTransaction(Pointer(address))
    }

    public override fun toNative(obj: IPaymentTransaction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1240339449_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentTransaction): Array<IPaymentTransaction?> =
        (elements as
        Array<IPaymentTransaction?>).castToImpl<IPaymentTransaction,IPaymentTransaction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentTransaction?> =
        arrayOfNulls<IPaymentTransaction_Impl>(size) as Array<IPaymentTransaction?>
  }
}
