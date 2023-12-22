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

@ABIMarker(IPaymentDetailsFactory.ABI::class)
@Signature("{cfe8afee-c0ea-4ca1-8bc7-6de67b1f3763}")
@Guid("cfe8afeec0ea4ca18bc76de67b1f3763")
@WinRTInterface("cfe8afeec0ea4ca18bc76de67b1f3763")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentDetailsFactory.ByReference::class)
public interface IPaymentDetailsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(total: PaymentItem?): PaymentDetails?

  @InterfaceMethod(1)
  public fun CreateWithDisplayItems(total: PaymentItem?, displayItems: IIterable<PaymentItem?>?):
      PaymentDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentDetailsFactory> {
    public override fun getValue() = ABI.makeIPaymentDetailsFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentDetailsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentDetailsFactory {
    public val __636058108_Ptr: Pointer?

    public val _636058108_VtblPtr: Pointer?
      get() = __636058108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(total: PaymentItem?): PaymentDetails? {
      val fnPtr = _636058108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentDetails>()
      val hr = fn.invokeHR(arrayOf(__636058108_Ptr, marshalToNative(total), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithDisplayItems(total: PaymentItem?,
        displayItems: IIterable<PaymentItem?>?): PaymentDetails? {
      val fnPtr = _636058108_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentDetails>()
      val hr = fn.invokeHR(arrayOf(__636058108_Ptr, marshalToNative(total),
          marshalToNative(displayItems), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentDetails>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentDetailsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __636058108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentDetailsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfe8afeec0ea4ca18bc76de67b1f3763")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentDetailsFactory(ptr: Pointer?): WithDefault =
        IPaymentDetailsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentDetailsFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentDetailsFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentDetailsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__636058108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentDetailsFactory): Array<IPaymentDetailsFactory?> =
        (elements as
        Array<IPaymentDetailsFactory?>).castToImpl<IPaymentDetailsFactory,IPaymentDetailsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentDetailsFactory?> =
        arrayOfNulls<IPaymentDetailsFactory_Impl>(size) as Array<IPaymentDetailsFactory?>
  }
}
