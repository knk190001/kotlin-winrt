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

@ABIMarker(IPaymentRequest2.ABI::class)
@Signature("{b63ccfb5-5998-493e-a04c-67048a50f141}")
@Guid("b63ccfb55998493ea04c67048a50f141")
@WinRTInterface("b63ccfb55998493ea04c67048a50f141")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentRequest2.ByReference::class)
public interface IPaymentRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentRequest2> {
    public override fun getValue() = ABI.makeIPaymentRequest2(pointer.getPointer(0))

    public fun setValue(value: IPaymentRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentRequest2 {
    public val __1675202537_Ptr: Pointer?

    public val _1675202537_VtblPtr: Pointer?
      get() = __1675202537_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1675202537_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1675202537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1675202537_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b63ccfb55998493ea04c67048a50f141")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentRequest2(ptr: Pointer?): WithDefault = IPaymentRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentRequest2 {
      val address = segment.toRawLongValue()
      return makeIPaymentRequest2(Pointer(address))
    }

    public override fun toNative(obj: IPaymentRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1675202537_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentRequest2): Array<IPaymentRequest2?> = (elements as
        Array<IPaymentRequest2?>).castToImpl<IPaymentRequest2,IPaymentRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentRequest2?> =
        arrayOfNulls<IPaymentRequest2_Impl>(size) as Array<IPaymentRequest2?>
  }
}
