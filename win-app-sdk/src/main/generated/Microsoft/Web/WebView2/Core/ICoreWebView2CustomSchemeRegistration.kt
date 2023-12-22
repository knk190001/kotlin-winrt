package Microsoft.Web.WebView2.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2CustomSchemeRegistration.ABI::class)
@Signature("{16dc60d9-ddec-5c3d-bc1f-4408d1875af1}")
@Guid("16dc60d9ddec5c3dbc1f4408d1875af1")
@WinRTInterface("16dc60d9ddec5c3dbc1f4408d1875af1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2CustomSchemeRegistration.ByReference::class)
public interface ICoreWebView2CustomSchemeRegistration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TreatAsSecure(): Int

  @InterfaceMethod(1)
  public fun put_TreatAsSecure(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_HasAuthorityComponent(): Boolean

  @InterfaceMethod(3)
  public fun put_HasAuthorityComponent(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2CustomSchemeRegistration> {
    public override fun getValue() =
        ABI.makeICoreWebView2CustomSchemeRegistration(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2CustomSchemeRegistration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2CustomSchemeRegistration {
    public val __1022364234_Ptr: Pointer?

    public val _1022364234_VtblPtr: Pointer?
      get() = __1022364234_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TreatAsSecure(): Int {
      val fnPtr = _1022364234_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1022364234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TreatAsSecure(value: Int): Unit {
      val fnPtr = _1022364234_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022364234_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HasAuthorityComponent(): Boolean {
      val fnPtr = _1022364234_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022364234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_HasAuthorityComponent(value: Boolean): Unit {
      val fnPtr = _1022364234_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022364234_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2CustomSchemeRegistration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022364234_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2CustomSchemeRegistration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16dc60d9ddec5c3dbc1f4408d1875af1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2CustomSchemeRegistration(ptr: Pointer?): WithDefault =
        ICoreWebView2CustomSchemeRegistration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2CustomSchemeRegistration {
      val address = segment.toRawLongValue()
      return makeICoreWebView2CustomSchemeRegistration(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2CustomSchemeRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022364234_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2CustomSchemeRegistration):
        Array<ICoreWebView2CustomSchemeRegistration?> = (elements as
        Array<ICoreWebView2CustomSchemeRegistration?>).castToImpl<ICoreWebView2CustomSchemeRegistration,ICoreWebView2CustomSchemeRegistration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2CustomSchemeRegistration?> =
        arrayOfNulls<ICoreWebView2CustomSchemeRegistration_Impl>(size) as
        Array<ICoreWebView2CustomSchemeRegistration?>
  }
}
