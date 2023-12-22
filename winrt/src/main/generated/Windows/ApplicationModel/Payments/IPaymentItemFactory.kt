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

@ABIMarker(IPaymentItemFactory.ABI::class)
@Signature("{c6ab7ad8-2503-4d1d-a778-02b2e5927b2c}")
@Guid("c6ab7ad825034d1da77802b2e5927b2c")
@WinRTInterface("c6ab7ad825034d1da77802b2e5927b2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentItemFactory.ByReference::class)
public interface IPaymentItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(label: String?, amount: PaymentCurrencyAmount?): PaymentItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentItemFactory> {
    public override fun getValue() = ABI.makeIPaymentItemFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentItemFactory {
    public val __1213564573_Ptr: Pointer?

    public val _1213564573_VtblPtr: Pointer?
      get() = __1213564573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(label: String?, amount: PaymentCurrencyAmount?): PaymentItem? {
      val fnPtr = _1213564573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentItem>()
      val hr = fn.invokeHR(arrayOf(__1213564573_Ptr, marshalToNative(label),
          marshalToNative(amount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentItem>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213564573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6ab7ad825034d1da77802b2e5927b2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentItemFactory(ptr: Pointer?): WithDefault = IPaymentItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentItemFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213564573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentItemFactory): Array<IPaymentItemFactory?> =
        (elements as
        Array<IPaymentItemFactory?>).castToImpl<IPaymentItemFactory,IPaymentItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentItemFactory?> =
        arrayOfNulls<IPaymentItemFactory_Impl>(size) as Array<IPaymentItemFactory?>
  }
}
