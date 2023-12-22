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

@ABIMarker(IPaymentToken.ABI::class)
@Signature("{bbcac013-ccd0-41f2-b2a1-0a2e4b5dce25}")
@Guid("bbcac013ccd041f2b2a10a2e4b5dce25")
@WinRTInterface("bbcac013ccd041f2b2a10a2e4b5dce25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentToken.ByReference::class)
public interface IPaymentToken : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaymentMethodId(): String?

  @InterfaceMethod(1)
  public fun get_JsonDetails(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPaymentToken>
      {
    public override fun getValue() = ABI.makeIPaymentToken(pointer.getPointer(0))

    public fun setValue(value: IPaymentToken_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentToken {
    public val __1423470107_Ptr: Pointer?

    public val _1423470107_VtblPtr: Pointer?
      get() = __1423470107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaymentMethodId(): String? {
      val fnPtr = _1423470107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1423470107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_JsonDetails(): String? {
      val fnPtr = _1423470107_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1423470107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentToken_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1423470107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentToken, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbcac013ccd041f2b2a10a2e4b5dce25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentToken(ptr: Pointer?): WithDefault = IPaymentToken_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentToken {
      val address = segment.toRawLongValue()
      return makeIPaymentToken(Pointer(address))
    }

    public override fun toNative(obj: IPaymentToken): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1423470107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentToken): Array<IPaymentToken?> = (elements as
        Array<IPaymentToken?>).castToImpl<IPaymentToken,IPaymentToken_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentToken?> =
        arrayOfNulls<IPaymentToken_Impl>(size) as Array<IPaymentToken?>
  }
}
