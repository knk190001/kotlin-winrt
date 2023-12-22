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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2_13.ABI::class)
@Signature("{314b5846-dbc7-5de4-a792-647ea0f3296a}")
@Guid("314b5846dbc75de4a792647ea0f3296a")
@WinRTInterface("314b5846dbc75de4a792647ea0f3296a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_13.ByReference::class)
public interface ICoreWebView2_13 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Profile(): CoreWebView2Profile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_13> {
    public override fun getValue() = ABI.makeICoreWebView2_13(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_13_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_13 {
    public val __1813492966_Ptr: Pointer?

    public val _1813492966_VtblPtr: Pointer?
      get() = __1813492966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Profile(): CoreWebView2Profile? {
      val fnPtr = _1813492966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Profile>()
      val hr = fn.invokeHR(arrayOf(__1813492966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Profile>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2_13_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_13, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("314b5846dbc75de4a792647ea0f3296a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_13(ptr: Pointer?): WithDefault = ICoreWebView2_13_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_13 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_13(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_13): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_13): Array<ICoreWebView2_13?> = (elements as
        Array<ICoreWebView2_13?>).castToImpl<ICoreWebView2_13,ICoreWebView2_13_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_13?> =
        arrayOfNulls<ICoreWebView2_13_Impl>(size) as Array<ICoreWebView2_13?>
  }
}
