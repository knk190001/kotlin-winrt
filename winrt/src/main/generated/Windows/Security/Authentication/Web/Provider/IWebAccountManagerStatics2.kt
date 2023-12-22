package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IWebAccountManagerStatics2.ABI::class)
@Signature("{68a7a829-2d5f-4653-8bb0-bd2fa6bd2d87}")
@Guid("68a7a8292d5f46538bb0bd2fa6bd2d87")
@WinRTInterface("68a7a8292d5f46538bb0bd2fa6bd2d87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountManagerStatics2.ByReference::class)
public interface IWebAccountManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PullCookiesAsync(uriString: String?, callerPFN: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountManagerStatics2> {
    public override fun getValue() = ABI.makeIWebAccountManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IWebAccountManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountManagerStatics2 {
    public val __1099550422_Ptr: Pointer?

    public val _1099550422_VtblPtr: Pointer?
      get() = __1099550422_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PullCookiesAsync(uriString: String?, callerPFN: String?): IAsyncAction? {
      val fnPtr = _1099550422_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1099550422_Ptr, marshalToNative(uriString),
          marshalToNative(callerPFN), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1099550422_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68a7a8292d5f46538bb0bd2fa6bd2d87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountManagerStatics2(ptr: Pointer?): WithDefault =
        IWebAccountManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIWebAccountManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1099550422_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountManagerStatics2):
        Array<IWebAccountManagerStatics2?> = (elements as
        Array<IWebAccountManagerStatics2?>).castToImpl<IWebAccountManagerStatics2,IWebAccountManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountManagerStatics2?> =
        arrayOfNulls<IWebAccountManagerStatics2_Impl>(size) as Array<IWebAccountManagerStatics2?>
  }
}
