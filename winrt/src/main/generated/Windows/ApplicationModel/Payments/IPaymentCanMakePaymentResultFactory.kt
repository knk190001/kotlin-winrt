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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentCanMakePaymentResultFactory.ABI::class)
@Signature("{bbdcaa3e-7d49-4f69-aa53-2a0f8164b7c9}")
@Guid("bbdcaa3e7d494f69aa532a0f8164b7c9")
@WinRTInterface("bbdcaa3e7d494f69aa532a0f8164b7c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentCanMakePaymentResultFactory.ByReference::class)
public interface IPaymentCanMakePaymentResultFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(value: PaymentCanMakePaymentResultStatus?): PaymentCanMakePaymentResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentCanMakePaymentResultFactory> {
    public override fun getValue() =
        ABI.makeIPaymentCanMakePaymentResultFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentCanMakePaymentResultFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentCanMakePaymentResultFactory {
    public val __384428111_Ptr: Pointer?

    public val _384428111_VtblPtr: Pointer?
      get() = __384428111_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(value: PaymentCanMakePaymentResultStatus?):
        PaymentCanMakePaymentResult? {
      val fnPtr = _384428111_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentCanMakePaymentResult>()
      val hr = fn.invokeHR(arrayOf(__384428111_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentCanMakePaymentResult>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentCanMakePaymentResultFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __384428111_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentCanMakePaymentResultFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbdcaa3e7d494f69aa532a0f8164b7c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentCanMakePaymentResultFactory(ptr: Pointer?): WithDefault =
        IPaymentCanMakePaymentResultFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentCanMakePaymentResultFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentCanMakePaymentResultFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentCanMakePaymentResultFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__384428111_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentCanMakePaymentResultFactory):
        Array<IPaymentCanMakePaymentResultFactory?> = (elements as
        Array<IPaymentCanMakePaymentResultFactory?>).castToImpl<IPaymentCanMakePaymentResultFactory,IPaymentCanMakePaymentResultFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentCanMakePaymentResultFactory?> =
        arrayOfNulls<IPaymentCanMakePaymentResultFactory_Impl>(size) as
        Array<IPaymentCanMakePaymentResultFactory?>
  }
}
