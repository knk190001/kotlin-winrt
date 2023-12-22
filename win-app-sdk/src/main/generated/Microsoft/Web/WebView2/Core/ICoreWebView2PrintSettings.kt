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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2PrintSettings.ABI::class)
@Signature("{9c75c8c0-ef3d-58a8-9a8c-18eed9fd0f16}")
@Guid("9c75c8c0ef3d58a89a8c18eed9fd0f16")
@WinRTInterface("9c75c8c0ef3d58a89a8c18eed9fd0f16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PrintSettings.ByReference::class)
public interface ICoreWebView2PrintSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): CoreWebView2PrintOrientation?

  @InterfaceMethod(1)
  public fun put_Orientation(value: CoreWebView2PrintOrientation?): Unit

  @InterfaceMethod(2)
  public fun get_ScaleFactor(): Double

  @InterfaceMethod(3)
  public fun put_ScaleFactor(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_PageWidth(): Double

  @InterfaceMethod(5)
  public fun put_PageWidth(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_PageHeight(): Double

  @InterfaceMethod(7)
  public fun put_PageHeight(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_MarginTop(): Double

  @InterfaceMethod(9)
  public fun put_MarginTop(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_MarginBottom(): Double

  @InterfaceMethod(11)
  public fun put_MarginBottom(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_MarginLeft(): Double

  @InterfaceMethod(13)
  public fun put_MarginLeft(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_MarginRight(): Double

  @InterfaceMethod(15)
  public fun put_MarginRight(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_ShouldPrintBackgrounds(): Boolean

  @InterfaceMethod(17)
  public fun put_ShouldPrintBackgrounds(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_ShouldPrintSelectionOnly(): Boolean

  @InterfaceMethod(19)
  public fun put_ShouldPrintSelectionOnly(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_ShouldPrintHeaderAndFooter(): Boolean

  @InterfaceMethod(21)
  public fun put_ShouldPrintHeaderAndFooter(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_HeaderTitle(): String?

  @InterfaceMethod(23)
  public fun put_HeaderTitle(value: String?): Unit

  @InterfaceMethod(24)
  public fun get_FooterUri(): String?

  @InterfaceMethod(25)
  public fun put_FooterUri(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PrintSettings> {
    public override fun getValue() = ABI.makeICoreWebView2PrintSettings(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PrintSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PrintSettings {
    public val __736490775_Ptr: Pointer?

    public val _736490775_VtblPtr: Pointer?
      get() = __736490775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): CoreWebView2PrintOrientation? {
      val fnPtr = _736490775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PrintOrientation>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PrintOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Orientation(value: CoreWebView2PrintOrientation?): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ScaleFactor(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ScaleFactor(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PageWidth(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_PageWidth(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PageHeight(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_PageHeight(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MarginTop(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MarginTop(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_MarginBottom(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_MarginBottom(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MarginLeft(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_MarginLeft(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MarginRight(): Double {
      val fnPtr = _736490775_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_MarginRight(value: Double): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ShouldPrintBackgrounds(): Boolean {
      val fnPtr = _736490775_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_ShouldPrintBackgrounds(value: Boolean): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ShouldPrintSelectionOnly(): Boolean {
      val fnPtr = _736490775_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_ShouldPrintSelectionOnly(value: Boolean): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ShouldPrintHeaderAndFooter(): Boolean {
      val fnPtr = _736490775_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_ShouldPrintHeaderAndFooter(value: Boolean): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_HeaderTitle(): String? {
      val fnPtr = _736490775_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_HeaderTitle(value: String?): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_FooterUri(): String? {
      val fnPtr = _736490775_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_FooterUri(value: String?): Unit {
      val fnPtr = _736490775_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__736490775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2PrintSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __736490775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PrintSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c75c8c0ef3d58a89a8c18eed9fd0f16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PrintSettings(ptr: Pointer?): WithDefault =
        ICoreWebView2PrintSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2PrintSettings {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PrintSettings(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PrintSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__736490775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PrintSettings):
        Array<ICoreWebView2PrintSettings?> = (elements as
        Array<ICoreWebView2PrintSettings?>).castToImpl<ICoreWebView2PrintSettings,ICoreWebView2PrintSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PrintSettings?> =
        arrayOfNulls<ICoreWebView2PrintSettings_Impl>(size) as Array<ICoreWebView2PrintSettings?>
  }
}
