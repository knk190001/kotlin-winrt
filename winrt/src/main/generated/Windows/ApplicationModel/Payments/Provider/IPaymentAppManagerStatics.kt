package Windows.ApplicationModel.Payments.Provider

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

@ABIMarker(IPaymentAppManagerStatics.ABI::class)
@Signature("{a341ac28-fc89-4406-b4d9-34e7fe79dfb6}")
@Guid("a341ac28fc894406b4d934e7fe79dfb6")
@WinRTInterface("a341ac28fc894406b4d934e7fe79dfb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentAppManagerStatics.ByReference::class)
public interface IPaymentAppManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): PaymentAppManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentAppManagerStatics> {
    public override fun getValue() = ABI.makeIPaymentAppManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPaymentAppManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentAppManagerStatics {
    public val __1151585100_Ptr: Pointer?

    public val _1151585100_VtblPtr: Pointer?
      get() = __1151585100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): PaymentAppManager? {
      val fnPtr = _1151585100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentAppManager>()
      val hr = fn.invokeHR(arrayOf(__1151585100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentAppManager>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentAppManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1151585100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentAppManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a341ac28fc894406b4d934e7fe79dfb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentAppManagerStatics(ptr: Pointer?): WithDefault =
        IPaymentAppManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentAppManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPaymentAppManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPaymentAppManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1151585100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentAppManagerStatics):
        Array<IPaymentAppManagerStatics?> = (elements as
        Array<IPaymentAppManagerStatics?>).castToImpl<IPaymentAppManagerStatics,IPaymentAppManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentAppManagerStatics?> =
        arrayOfNulls<IPaymentAppManagerStatics_Impl>(size) as Array<IPaymentAppManagerStatics?>
  }
}
