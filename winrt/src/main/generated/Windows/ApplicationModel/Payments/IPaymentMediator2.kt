package Windows.ApplicationModel.Payments

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentMediator2.ABI::class)
@Signature("{ceef98f1-e407-4128-8e73-d93d5f822786}")
@Guid("ceef98f1e40741288e73d93d5f822786")
@WinRTInterface("ceef98f1e40741288e73d93d5f822786")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentMediator2.ByReference::class)
public interface IPaymentMediator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CanMakePaymentAsync(paymentRequest: PaymentRequest?):
      IAsyncOperation<PaymentCanMakePaymentResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentMediator2> {
    public override fun getValue() = ABI.makeIPaymentMediator2(pointer.getPointer(0))

    public fun setValue(value: IPaymentMediator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentMediator2 {
    public val __1055803787_Ptr: Pointer?

    public val _1055803787_VtblPtr: Pointer?
      get() = __1055803787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CanMakePaymentAsync(paymentRequest: PaymentRequest?):
        IAsyncOperation<PaymentCanMakePaymentResult?>? {
      val fnPtr = _1055803787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentCanMakePaymentResult?>>()
      val hr = fn.invokeHR(arrayOf(__1055803787_Ptr, marshalToNative(paymentRequest), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PaymentCanMakePaymentResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentMediator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1055803787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentMediator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ceef98f1e40741288e73d93d5f822786")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentMediator2(ptr: Pointer?): WithDefault = IPaymentMediator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentMediator2 {
      val address = segment.toRawLongValue()
      return makeIPaymentMediator2(Pointer(address))
    }

    public override fun toNative(obj: IPaymentMediator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1055803787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentMediator2): Array<IPaymentMediator2?> = (elements
        as Array<IPaymentMediator2?>).castToImpl<IPaymentMediator2,IPaymentMediator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentMediator2?> =
        arrayOfNulls<IPaymentMediator2_Impl>(size) as Array<IPaymentMediator2?>
  }
}
