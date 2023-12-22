package Windows.ApplicationModel.Payments

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPaymentMediator.ABI::class)
@Signature("{fb0ee829-ec0c-449a-83da-7ae3073365a2}")
@Guid("fb0ee829ec0c449a83da7ae3073365a2")
@WinRTInterface("fb0ee829ec0c449a83da7ae3073365a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentMediator.ByReference::class)
public interface IPaymentMediator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSupportedMethodIdsAsync(): IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(1)
  public fun SubmitPaymentRequestAsync(paymentRequest: PaymentRequest?):
      IAsyncOperation<PaymentRequestSubmitResult?>?

  @InterfaceMethod(2)
  public fun SubmitPaymentRequestAsync(paymentRequest: PaymentRequest?,
      changeHandler: PaymentRequestChangedHandler?): IAsyncOperation<PaymentRequestSubmitResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentMediator> {
    public override fun getValue() = ABI.makeIPaymentMediator(pointer.getPointer(0))

    public fun setValue(value: IPaymentMediator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentMediator {
    public val __2112268167_Ptr: Pointer?

    public val _2112268167_VtblPtr: Pointer?
      get() = __2112268167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSupportedMethodIdsAsync(): IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _2112268167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__2112268167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SubmitPaymentRequestAsync(paymentRequest: PaymentRequest?):
        IAsyncOperation<PaymentRequestSubmitResult?>? {
      val fnPtr = _2112268167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentRequestSubmitResult?>>()
      val hr = fn.invokeHR(arrayOf(__2112268167_Ptr, marshalToNative(paymentRequest), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PaymentRequestSubmitResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SubmitPaymentRequestAsync(paymentRequest: PaymentRequest?,
        changeHandler: PaymentRequestChangedHandler?):
        IAsyncOperation<PaymentRequestSubmitResult?>? {
      val fnPtr = _2112268167_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentRequestSubmitResult?>>()
      val hr = fn.invokeHR(arrayOf(__2112268167_Ptr, marshalToNative(paymentRequest),
          marshalToNative(changeHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PaymentRequestSubmitResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentMediator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2112268167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentMediator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb0ee829ec0c449a83da7ae3073365a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentMediator(ptr: Pointer?): WithDefault = IPaymentMediator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentMediator {
      val address = segment.toRawLongValue()
      return makeIPaymentMediator(Pointer(address))
    }

    public override fun toNative(obj: IPaymentMediator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2112268167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentMediator): Array<IPaymentMediator?> = (elements as
        Array<IPaymentMediator?>).castToImpl<IPaymentMediator,IPaymentMediator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentMediator?> =
        arrayOfNulls<IPaymentMediator_Impl>(size) as Array<IPaymentMediator?>
  }
}
