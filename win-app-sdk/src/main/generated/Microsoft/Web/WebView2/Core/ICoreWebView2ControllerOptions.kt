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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2ControllerOptions.ABI::class)
@Signature("{3337e821-3606-5a0e-8e2f-0c1e57d743f7}")
@Guid("3337e82136065a0e8e2f0c1e57d743f7")
@WinRTInterface("3337e82136065a0e8e2f0c1e57d743f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ControllerOptions.ByReference::class)
public interface ICoreWebView2ControllerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileName(): String?

  @InterfaceMethod(1)
  public fun put_ProfileName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_IsInPrivateModeEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsInPrivateModeEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ControllerOptions> {
    public override fun getValue() = ABI.makeICoreWebView2ControllerOptions(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ControllerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ControllerOptions {
    public val __687719387_Ptr: Pointer?

    public val _687719387_VtblPtr: Pointer?
      get() = __687719387_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileName(): String? {
      val fnPtr = _687719387_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__687719387_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProfileName(value: String?): Unit {
      val fnPtr = _687719387_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__687719387_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsInPrivateModeEnabled(): Boolean {
      val fnPtr = _687719387_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__687719387_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsInPrivateModeEnabled(value: Boolean): Unit {
      val fnPtr = _687719387_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__687719387_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2ControllerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687719387_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ControllerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3337e82136065a0e8e2f0c1e57d743f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ControllerOptions(ptr: Pointer?): WithDefault =
        ICoreWebView2ControllerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ControllerOptions {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ControllerOptions(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ControllerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687719387_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ControllerOptions):
        Array<ICoreWebView2ControllerOptions?> = (elements as
        Array<ICoreWebView2ControllerOptions?>).castToImpl<ICoreWebView2ControllerOptions,ICoreWebView2ControllerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ControllerOptions?> =
        arrayOfNulls<ICoreWebView2ControllerOptions_Impl>(size) as
        Array<ICoreWebView2ControllerOptions?>
  }
}
