package Windows.Security.Authentication.Web.Core

import Windows.Foundation.IAsyncOperation
import Windows.Security.Authentication.Web.Core.IWebAuthenticationCoreManagerStatics.ABI.IID
import Windows.Security.Credentials.WebAccountProvider
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebAuthenticationCoreManagerStatics2.ABI::class)
@Signature("{f584184a-8b57-4820-b6a4-70a5b6fcf44a}")
@Guid("f584184a8b574820b6a470a5b6fcf44a")
@WinRTInterface("f584184a8b574820b6a470a5b6fcf44a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationCoreManagerStatics2.ByReference::class)
public interface IWebAuthenticationCoreManagerStatics2 : NativeMapped, IWinRTInterface,
    IWebAuthenticationCoreManagerStatics {
  @InterfaceMethod(0)
  public fun FindAccountProviderAsync(
    webAccountProviderId: String?,
    authority: String?,
    user: User?
  ): IAsyncOperation<WebAccountProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationCoreManagerStatics2> {
    public override fun getValue() =
        ABI.makeIWebAuthenticationCoreManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationCoreManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationCoreManagerStatics2,
      IWebAuthenticationCoreManagerStatics.WithDefault {
    public val __1154541740_Ptr: Pointer?

    public val _1154541740_VtblPtr: Pointer?
      get() = __1154541740_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAccountProviderAsync(
      webAccountProviderId: String?,
      authority: String?,
      user: User?
    ): IAsyncOperation<WebAccountProvider?>? {
      val fnPtr = _1154541740_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccountProvider?>>()
      val hr = fn.invokeHR(arrayOf(__1154541740_Ptr, marshalToNative(webAccountProviderId),
          marshalToNative(authority), marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccountProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationCoreManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IWebAuthenticationCoreManagerStatics {
    public override val __1838358598_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1154541740_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1154541740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationCoreManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f584184a8b574820b6a470a5b6fcf44a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationCoreManagerStatics2(ptr: Pointer?): WithDefault =
        IWebAuthenticationCoreManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationCoreManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationCoreManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationCoreManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1154541740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationCoreManagerStatics2):
        Array<IWebAuthenticationCoreManagerStatics2?> = (elements as
        Array<IWebAuthenticationCoreManagerStatics2?>).castToImpl<IWebAuthenticationCoreManagerStatics2,IWebAuthenticationCoreManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationCoreManagerStatics2?> =
        arrayOfNulls<IWebAuthenticationCoreManagerStatics2_Impl>(size) as
        Array<IWebAuthenticationCoreManagerStatics2?>
  }
}
