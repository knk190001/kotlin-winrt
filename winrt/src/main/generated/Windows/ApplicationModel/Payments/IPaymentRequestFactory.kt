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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentRequestFactory.ABI::class)
@Signature("{3e8a79dc-6b74-42d3-b103-f0de35fb1848}")
@Guid("3e8a79dc6b7442d3b103f0de35fb1848")
@WinRTInterface("3e8a79dc6b7442d3b103f0de35fb1848")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentRequestFactory.ByReference::class)
public interface IPaymentRequestFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(details: PaymentDetails?, methodData: IIterable<PaymentMethodData?>?):
      PaymentRequest?

  @InterfaceMethod(1)
  public fun CreateWithMerchantInfo(
    details: PaymentDetails?,
    methodData: IIterable<PaymentMethodData?>?,
    merchantInfo: PaymentMerchantInfo?
  ): PaymentRequest?

  @InterfaceMethod(2)
  public fun CreateWithMerchantInfoAndOptions(
    details: PaymentDetails?,
    methodData: IIterable<PaymentMethodData?>?,
    merchantInfo: PaymentMerchantInfo?,
    options: PaymentOptions?
  ): PaymentRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentRequestFactory> {
    public override fun getValue() = ABI.makeIPaymentRequestFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentRequestFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentRequestFactory {
    public val __1351747313_Ptr: Pointer?

    public val _1351747313_VtblPtr: Pointer?
      get() = __1351747313_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(details: PaymentDetails?,
        methodData: IIterable<PaymentMethodData?>?): PaymentRequest? {
      val fnPtr = _1351747313_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequest>()
      val hr = fn.invokeHR(arrayOf(__1351747313_Ptr, marshalToNative(details),
          marshalToNative(methodData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithMerchantInfo(
      details: PaymentDetails?,
      methodData: IIterable<PaymentMethodData?>?,
      merchantInfo: PaymentMerchantInfo?
    ): PaymentRequest? {
      val fnPtr = _1351747313_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequest>()
      val hr = fn.invokeHR(arrayOf(__1351747313_Ptr, marshalToNative(details),
          marshalToNative(methodData), marshalToNative(merchantInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithMerchantInfoAndOptions(
      details: PaymentDetails?,
      methodData: IIterable<PaymentMethodData?>?,
      merchantInfo: PaymentMerchantInfo?,
      options: PaymentOptions?
    ): PaymentRequest? {
      val fnPtr = _1351747313_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequest>()
      val hr = fn.invokeHR(arrayOf(__1351747313_Ptr, marshalToNative(details),
          marshalToNative(methodData), marshalToNative(merchantInfo), marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequest>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentRequestFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1351747313_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentRequestFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e8a79dc6b7442d3b103f0de35fb1848")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentRequestFactory(ptr: Pointer?): WithDefault =
        IPaymentRequestFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentRequestFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentRequestFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentRequestFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1351747313_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentRequestFactory): Array<IPaymentRequestFactory?> =
        (elements as
        Array<IPaymentRequestFactory?>).castToImpl<IPaymentRequestFactory,IPaymentRequestFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentRequestFactory?> =
        arrayOfNulls<IPaymentRequestFactory_Impl>(size) as Array<IPaymentRequestFactory?>
  }
}
