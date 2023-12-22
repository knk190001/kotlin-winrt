package Windows.ApplicationModel.Payments

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IPaymentResponse.ABI::class)
@Signature("{e1389457-8bd2-4888-9fa8-97985545108e}")
@Guid("e13894578bd248889fa897985545108e")
@WinRTInterface("e13894578bd248889fa897985545108e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentResponse.ByReference::class)
public interface IPaymentResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaymentToken(): PaymentToken?

  @InterfaceMethod(1)
  public fun get_ShippingOption(): PaymentShippingOption?

  @InterfaceMethod(2)
  public fun get_ShippingAddress(): PaymentAddress?

  @InterfaceMethod(3)
  public fun get_PayerEmail(): String?

  @InterfaceMethod(4)
  public fun get_PayerName(): String?

  @InterfaceMethod(5)
  public fun get_PayerPhoneNumber(): String?

  @InterfaceMethod(6)
  public fun CompleteAsync(status: PaymentRequestCompletionStatus?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentResponse> {
    public override fun getValue() = ABI.makeIPaymentResponse(pointer.getPointer(0))

    public fun setValue(value: IPaymentResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentResponse {
    public val __1622268715_Ptr: Pointer?

    public val _1622268715_VtblPtr: Pointer?
      get() = __1622268715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaymentToken(): PaymentToken? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentToken>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShippingOption(): PaymentShippingOption? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentShippingOption>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentShippingOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ShippingAddress(): PaymentAddress? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentAddress>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PayerEmail(): String? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PayerName(): String? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PayerPhoneNumber(): String? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CompleteAsync(status: PaymentRequestCompletionStatus?): IAsyncAction? {
      val fnPtr = _1622268715_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1622268715_Ptr, marshalToNative(status), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1622268715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e13894578bd248889fa897985545108e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentResponse(ptr: Pointer?): WithDefault = IPaymentResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentResponse {
      val address = segment.toRawLongValue()
      return makeIPaymentResponse(Pointer(address))
    }

    public override fun toNative(obj: IPaymentResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1622268715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentResponse): Array<IPaymentResponse?> = (elements as
        Array<IPaymentResponse?>).castToImpl<IPaymentResponse,IPaymentResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentResponse?> =
        arrayOfNulls<IPaymentResponse_Impl>(size) as Array<IPaymentResponse?>
  }
}
