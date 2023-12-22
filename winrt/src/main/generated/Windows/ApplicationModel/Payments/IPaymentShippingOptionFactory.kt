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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentShippingOptionFactory.ABI::class)
@Signature("{5de5f917-b2d7-446b-9d73-6123fbca3bc6}")
@Guid("5de5f917b2d7446b9d736123fbca3bc6")
@WinRTInterface("5de5f917b2d7446b9d736123fbca3bc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentShippingOptionFactory.ByReference::class)
public interface IPaymentShippingOptionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(label: String?, amount: PaymentCurrencyAmount?): PaymentShippingOption?

  @InterfaceMethod(1)
  public fun CreateWithSelected(
    label: String?,
    amount: PaymentCurrencyAmount?,
    selected: Boolean
  ): PaymentShippingOption?

  @InterfaceMethod(2)
  public fun CreateWithSelectedAndTag(
    label: String?,
    amount: PaymentCurrencyAmount?,
    selected: Boolean,
    tag: String?
  ): PaymentShippingOption?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentShippingOptionFactory> {
    public override fun getValue() = ABI.makeIPaymentShippingOptionFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentShippingOptionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentShippingOptionFactory {
    public val __1545093197_Ptr: Pointer?

    public val _1545093197_VtblPtr: Pointer?
      get() = __1545093197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(label: String?, amount: PaymentCurrencyAmount?):
        PaymentShippingOption? {
      val fnPtr = _1545093197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentShippingOption>()
      val hr = fn.invokeHR(arrayOf(__1545093197_Ptr, marshalToNative(label),
          marshalToNative(amount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentShippingOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithSelected(
      label: String?,
      amount: PaymentCurrencyAmount?,
      selected: Boolean
    ): PaymentShippingOption? {
      val fnPtr = _1545093197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentShippingOption>()
      val hr = fn.invokeHR(arrayOf(__1545093197_Ptr, marshalToNative(label),
          marshalToNative(amount), selected, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentShippingOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithSelectedAndTag(
      label: String?,
      amount: PaymentCurrencyAmount?,
      selected: Boolean,
      tag: String?
    ): PaymentShippingOption? {
      val fnPtr = _1545093197_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentShippingOption>()
      val hr = fn.invokeHR(arrayOf(__1545093197_Ptr, marshalToNative(label),
          marshalToNative(amount), selected, marshalToNative(tag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentShippingOption>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentShippingOptionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1545093197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentShippingOptionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5de5f917b2d7446b9d736123fbca3bc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentShippingOptionFactory(ptr: Pointer?): WithDefault =
        IPaymentShippingOptionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentShippingOptionFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentShippingOptionFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentShippingOptionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1545093197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentShippingOptionFactory):
        Array<IPaymentShippingOptionFactory?> = (elements as
        Array<IPaymentShippingOptionFactory?>).castToImpl<IPaymentShippingOptionFactory,IPaymentShippingOptionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentShippingOptionFactory?> =
        arrayOfNulls<IPaymentShippingOptionFactory_Impl>(size) as
        Array<IPaymentShippingOptionFactory?>
  }
}
