package Windows.ApplicationModel.Payments

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

@ABIMarker(IPaymentTokenFactory.ABI::class)
@Signature("{988cd7aa-4753-4904-8373-dd7b08b995c1}")
@Guid("988cd7aa475349048373dd7b08b995c1")
@WinRTInterface("988cd7aa475349048373dd7b08b995c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentTokenFactory.ByReference::class)
public interface IPaymentTokenFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(paymentMethodId: String?): PaymentToken?

  @InterfaceMethod(1)
  public fun CreateWithJsonDetails(paymentMethodId: String?, jsonDetails: String?): PaymentToken?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentTokenFactory> {
    public override fun getValue() = ABI.makeIPaymentTokenFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentTokenFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentTokenFactory {
    public val __1676950373_Ptr: Pointer?

    public val _1676950373_VtblPtr: Pointer?
      get() = __1676950373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(paymentMethodId: String?): PaymentToken? {
      val fnPtr = _1676950373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentToken>()
      val hr = fn.invokeHR(arrayOf(__1676950373_Ptr, marshalToNative(paymentMethodId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithJsonDetails(paymentMethodId: String?, jsonDetails: String?):
        PaymentToken? {
      val fnPtr = _1676950373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentToken>()
      val hr = fn.invokeHR(arrayOf(__1676950373_Ptr, marshalToNative(paymentMethodId),
          marshalToNative(jsonDetails), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentToken>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentTokenFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1676950373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentTokenFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("988cd7aa475349048373dd7b08b995c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentTokenFactory(ptr: Pointer?): WithDefault = IPaymentTokenFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentTokenFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentTokenFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentTokenFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1676950373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentTokenFactory): Array<IPaymentTokenFactory?> =
        (elements as
        Array<IPaymentTokenFactory?>).castToImpl<IPaymentTokenFactory,IPaymentTokenFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentTokenFactory?> =
        arrayOfNulls<IPaymentTokenFactory_Impl>(size) as Array<IPaymentTokenFactory?>
  }
}
