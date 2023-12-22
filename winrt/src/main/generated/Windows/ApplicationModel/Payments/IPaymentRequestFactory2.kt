package Windows.ApplicationModel.Payments

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IPaymentRequestFactory2.ABI::class)
@Signature("{e6ce1325-a506-4372-b7ef-1a031d5662d1}")
@Guid("e6ce1325a5064372b7ef1a031d5662d1")
@WinRTInterface("e6ce1325a5064372b7ef1a031d5662d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentRequestFactory2.ByReference::class)
public interface IPaymentRequestFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithMerchantInfoOptionsAndId(
    details: PaymentDetails?,
    methodData: IIterable<PaymentMethodData?>?,
    merchantInfo: PaymentMerchantInfo?,
    options: PaymentOptions?,
    id: String?
  ): PaymentRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentRequestFactory2> {
    public override fun getValue() = ABI.makeIPaymentRequestFactory2(pointer.getPointer(0))

    public fun setValue(value: IPaymentRequestFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentRequestFactory2 {
    public val __1045506307_Ptr: Pointer?

    public val _1045506307_VtblPtr: Pointer?
      get() = __1045506307_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithMerchantInfoOptionsAndId(
      details: PaymentDetails?,
      methodData: IIterable<PaymentMethodData?>?,
      merchantInfo: PaymentMerchantInfo?,
      options: PaymentOptions?,
      id: String?
    ): PaymentRequest? {
      val fnPtr = _1045506307_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequest>()
      val hr = fn.invokeHR(arrayOf(__1045506307_Ptr, marshalToNative(details),
          marshalToNative(methodData), marshalToNative(merchantInfo), marshalToNative(options),
          marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequest>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentRequestFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1045506307_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentRequestFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6ce1325a5064372b7ef1a031d5662d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentRequestFactory2(ptr: Pointer?): WithDefault =
        IPaymentRequestFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentRequestFactory2 {
      val address = segment.toRawLongValue()
      return makeIPaymentRequestFactory2(Pointer(address))
    }

    public override fun toNative(obj: IPaymentRequestFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1045506307_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentRequestFactory2): Array<IPaymentRequestFactory2?>
        = (elements as
        Array<IPaymentRequestFactory2?>).castToImpl<IPaymentRequestFactory2,IPaymentRequestFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentRequestFactory2?> =
        arrayOfNulls<IPaymentRequestFactory2_Impl>(size) as Array<IPaymentRequestFactory2?>
  }
}
