package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IIterable
import Windows.Security.Authentication.Web.Core.IWebAuthenticationCoreManagerStatics.ABI.IID
import Windows.Security.Credentials.WebAccount
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAuthenticationCoreManagerStatics3.ABI::class)
@Signature("{2404eeb2-8924-4d93-ab3a-99688b419d56}")
@Guid("2404eeb289244d93ab3a99688b419d56")
@WinRTInterface("2404eeb289244d93ab3a99688b419d56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationCoreManagerStatics3.ByReference::class)
public interface IWebAuthenticationCoreManagerStatics3 : NativeMapped, IWinRTInterface,
    IWebAuthenticationCoreManagerStatics {
  @InterfaceMethod(0)
  public fun CreateWebAccountMonitor(webAccounts: IIterable<WebAccount?>?): WebAccountMonitor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationCoreManagerStatics3> {
    public override fun getValue() =
        ABI.makeIWebAuthenticationCoreManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationCoreManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationCoreManagerStatics3,
      IWebAuthenticationCoreManagerStatics.WithDefault {
    public val __1154541741_Ptr: Pointer?

    public val _1154541741_VtblPtr: Pointer?
      get() = __1154541741_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWebAccountMonitor(webAccounts: IIterable<WebAccount?>?):
        WebAccountMonitor? {
      val fnPtr = _1154541741_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountMonitor>()
      val hr = fn.invokeHR(arrayOf(__1154541741_Ptr, marshalToNative(webAccounts), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountMonitor>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationCoreManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IWebAuthenticationCoreManagerStatics {
    public override val __1838358598_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1154541741_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1154541741_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationCoreManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2404eeb289244d93ab3a99688b419d56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationCoreManagerStatics3(ptr: Pointer?): WithDefault =
        IWebAuthenticationCoreManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationCoreManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationCoreManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationCoreManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1154541741_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationCoreManagerStatics3):
        Array<IWebAuthenticationCoreManagerStatics3?> = (elements as
        Array<IWebAuthenticationCoreManagerStatics3?>).castToImpl<IWebAuthenticationCoreManagerStatics3,IWebAuthenticationCoreManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationCoreManagerStatics3?> =
        arrayOfNulls<IWebAuthenticationCoreManagerStatics3_Impl>(size) as
        Array<IWebAuthenticationCoreManagerStatics3?>
  }
}
