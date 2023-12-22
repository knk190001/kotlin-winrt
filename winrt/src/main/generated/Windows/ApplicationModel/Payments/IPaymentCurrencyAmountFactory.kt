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

@ABIMarker(IPaymentCurrencyAmountFactory.ABI::class)
@Signature("{3257d338-140c-4575-8535-f773178c09a7}")
@Guid("3257d338140c45758535f773178c09a7")
@WinRTInterface("3257d338140c45758535f773178c09a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentCurrencyAmountFactory.ByReference::class)
public interface IPaymentCurrencyAmountFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(value: String?, currency: String?): PaymentCurrencyAmount?

  @InterfaceMethod(1)
  public fun CreateWithCurrencySystem(
    value: String?,
    currency: String?,
    currencySystem: String?
  ): PaymentCurrencyAmount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentCurrencyAmountFactory> {
    public override fun getValue() = ABI.makeIPaymentCurrencyAmountFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentCurrencyAmountFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentCurrencyAmountFactory {
    public val __1692006163_Ptr: Pointer?

    public val _1692006163_VtblPtr: Pointer?
      get() = __1692006163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(value: String?, currency: String?): PaymentCurrencyAmount? {
      val fnPtr = _1692006163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentCurrencyAmount>()
      val hr = fn.invokeHR(arrayOf(__1692006163_Ptr, marshalToNative(value),
          marshalToNative(currency), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentCurrencyAmount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithCurrencySystem(
      value: String?,
      currency: String?,
      currencySystem: String?
    ): PaymentCurrencyAmount? {
      val fnPtr = _1692006163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentCurrencyAmount>()
      val hr = fn.invokeHR(arrayOf(__1692006163_Ptr, marshalToNative(value),
          marshalToNative(currency), marshalToNative(currencySystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentCurrencyAmount>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentCurrencyAmountFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1692006163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentCurrencyAmountFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3257d338140c45758535f773178c09a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentCurrencyAmountFactory(ptr: Pointer?): WithDefault =
        IPaymentCurrencyAmountFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentCurrencyAmountFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentCurrencyAmountFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentCurrencyAmountFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1692006163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentCurrencyAmountFactory):
        Array<IPaymentCurrencyAmountFactory?> = (elements as
        Array<IPaymentCurrencyAmountFactory?>).castToImpl<IPaymentCurrencyAmountFactory,IPaymentCurrencyAmountFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentCurrencyAmountFactory?> =
        arrayOfNulls<IPaymentCurrencyAmountFactory_Impl>(size) as
        Array<IPaymentCurrencyAmountFactory?>
  }
}
