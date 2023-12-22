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

@ABIMarker(ICoreWebView2Settings5.ABI::class)
@Signature("{afc42b23-4839-5d73-acf7-e0335631abf5}")
@Guid("afc42b2348395d73acf7e0335631abf5")
@WinRTInterface("afc42b2348395d73acf7e0335631abf5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Settings5.ByReference::class)
public interface ICoreWebView2Settings5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPinchZoomEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPinchZoomEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Settings5> {
    public override fun getValue() = ABI.makeICoreWebView2Settings5(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Settings5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Settings5 {
    public val __965763563_Ptr: Pointer?

    public val _965763563_VtblPtr: Pointer?
      get() = __965763563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPinchZoomEnabled(): Boolean {
      val fnPtr = _965763563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965763563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPinchZoomEnabled(value: Boolean): Unit {
      val fnPtr = _965763563_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965763563_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Settings5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965763563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Settings5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afc42b2348395d73acf7e0335631abf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Settings5(ptr: Pointer?): WithDefault =
        ICoreWebView2Settings5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Settings5 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Settings5(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Settings5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965763563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Settings5): Array<ICoreWebView2Settings5?> =
        (elements as
        Array<ICoreWebView2Settings5?>).castToImpl<ICoreWebView2Settings5,ICoreWebView2Settings5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Settings5?> =
        arrayOfNulls<ICoreWebView2Settings5_Impl>(size) as Array<ICoreWebView2Settings5?>
  }
}
