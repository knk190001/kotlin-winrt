package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.IAsyncAction
import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IWebAccountManagerStatics4.ABI::class)
@Signature("{59ebc2d2-f7db-412f-bc3f-f2fea04430b4}")
@Guid("59ebc2d2f7db412fbc3ff2fea04430b4")
@WinRTInterface("59ebc2d2f7db412fbc3ff2fea04430b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountManagerStatics4.ByReference::class)
public interface IWebAccountManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InvalidateAppCacheForAllAccountsAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun InvalidateAppCacheForAccountAsync(webAccount: WebAccount?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountManagerStatics4> {
    public override fun getValue() = ABI.makeIWebAccountManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IWebAccountManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountManagerStatics4 {
    public val __1099550424_Ptr: Pointer?

    public val _1099550424_VtblPtr: Pointer?
      get() = __1099550424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InvalidateAppCacheForAllAccountsAsync(): IAsyncAction? {
      val fnPtr = _1099550424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1099550424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun InvalidateAppCacheForAccountAsync(webAccount: WebAccount?): IAsyncAction? {
      val fnPtr = _1099550424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1099550424_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1099550424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59ebc2d2f7db412fbc3ff2fea04430b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountManagerStatics4(ptr: Pointer?): WithDefault =
        IWebAccountManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIWebAccountManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1099550424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountManagerStatics4):
        Array<IWebAccountManagerStatics4?> = (elements as
        Array<IWebAccountManagerStatics4?>).castToImpl<IWebAccountManagerStatics4,IWebAccountManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountManagerStatics4?> =
        arrayOfNulls<IWebAccountManagerStatics4_Impl>(size) as Array<IWebAccountManagerStatics4?>
  }
}
