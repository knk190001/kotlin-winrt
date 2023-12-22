package Windows.ApplicationModel.Payments.Provider

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

@ABIMarker(IPaymentTransactionStatics.ABI::class)
@Signature("{8d639750-ee0a-4df5-9b1e-1c0f9ec59881}")
@Guid("8d639750ee0a4df59b1e1c0f9ec59881")
@WinRTInterface("8d639750ee0a4df59b1e1c0f9ec59881")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentTransactionStatics.ByReference::class)
public interface IPaymentTransactionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(id: String?): IAsyncOperation<PaymentTransaction?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentTransactionStatics> {
    public override fun getValue() = ABI.makeIPaymentTransactionStatics(pointer.getPointer(0))

    public fun setValue(value: IPaymentTransactionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentTransactionStatics {
    public val __13617548_Ptr: Pointer?

    public val _13617548_VtblPtr: Pointer?
      get() = __13617548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(id: String?): IAsyncOperation<PaymentTransaction?>? {
      val fnPtr = _13617548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PaymentTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__13617548_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PaymentTransaction?>>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentTransactionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __13617548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentTransactionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d639750ee0a4df59b1e1c0f9ec59881")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentTransactionStatics(ptr: Pointer?): WithDefault =
        IPaymentTransactionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentTransactionStatics {
      val address = segment.toRawLongValue()
      return makeIPaymentTransactionStatics(Pointer(address))
    }

    public override fun toNative(obj: IPaymentTransactionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__13617548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentTransactionStatics):
        Array<IPaymentTransactionStatics?> = (elements as
        Array<IPaymentTransactionStatics?>).castToImpl<IPaymentTransactionStatics,IPaymentTransactionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentTransactionStatics?> =
        arrayOfNulls<IPaymentTransactionStatics_Impl>(size) as Array<IPaymentTransactionStatics?>
  }
}
