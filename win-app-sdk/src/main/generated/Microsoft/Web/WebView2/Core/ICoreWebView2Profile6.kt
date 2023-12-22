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

@ABIMarker(ICoreWebView2Profile6.ABI::class)
@Signature("{c16a4665-9d44-5768-94a3-69b3976fc3d6}")
@Guid("c16a46659d44576894a369b3976fc3d6")
@WinRTInterface("c16a46659d44576894a369b3976fc3d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Profile6.ByReference::class)
public interface ICoreWebView2Profile6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPasswordAutosaveEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPasswordAutosaveEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsGeneralAutofillEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsGeneralAutofillEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Profile6> {
    public override fun getValue() = ABI.makeICoreWebView2Profile6(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Profile6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Profile6 {
    public val __1990099180_Ptr: Pointer?

    public val _1990099180_VtblPtr: Pointer?
      get() = __1990099180_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPasswordAutosaveEnabled(): Boolean {
      val fnPtr = _1990099180_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1990099180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPasswordAutosaveEnabled(value: Boolean): Unit {
      val fnPtr = _1990099180_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990099180_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsGeneralAutofillEnabled(): Boolean {
      val fnPtr = _1990099180_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1990099180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsGeneralAutofillEnabled(value: Boolean): Unit {
      val fnPtr = _1990099180_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990099180_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Profile6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990099180_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Profile6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c16a46659d44576894a369b3976fc3d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Profile6(ptr: Pointer?): WithDefault =
        ICoreWebView2Profile6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Profile6 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Profile6(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Profile6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990099180_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Profile6): Array<ICoreWebView2Profile6?> =
        (elements as
        Array<ICoreWebView2Profile6?>).castToImpl<ICoreWebView2Profile6,ICoreWebView2Profile6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Profile6?> =
        arrayOfNulls<ICoreWebView2Profile6_Impl>(size) as Array<ICoreWebView2Profile6?>
  }
}
