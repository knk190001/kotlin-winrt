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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2PrintSettings2.ABI::class)
@Signature("{d2a97895-ca6e-57fc-905d-c6f77a081768}")
@Guid("d2a97895ca6e57fc905dc6f77a081768")
@WinRTInterface("d2a97895ca6e57fc905dc6f77a081768")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PrintSettings2.ByReference::class)
public interface ICoreWebView2PrintSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PageRanges(): String?

  @InterfaceMethod(1)
  public fun put_PageRanges(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_PagesPerSide(): Int

  @InterfaceMethod(3)
  public fun put_PagesPerSide(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_Copies(): Int

  @InterfaceMethod(5)
  public fun put_Copies(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_Collation(): CoreWebView2PrintCollation?

  @InterfaceMethod(7)
  public fun put_Collation(value: CoreWebView2PrintCollation?): Unit

  @InterfaceMethod(8)
  public fun get_ColorMode(): CoreWebView2PrintColorMode?

  @InterfaceMethod(9)
  public fun put_ColorMode(value: CoreWebView2PrintColorMode?): Unit

  @InterfaceMethod(10)
  public fun get_Duplex(): CoreWebView2PrintDuplex?

  @InterfaceMethod(11)
  public fun put_Duplex(value: CoreWebView2PrintDuplex?): Unit

  @InterfaceMethod(12)
  public fun get_MediaSize(): CoreWebView2PrintMediaSize?

  @InterfaceMethod(13)
  public fun put_MediaSize(value: CoreWebView2PrintMediaSize?): Unit

  @InterfaceMethod(14)
  public fun get_PrinterName(): String?

  @InterfaceMethod(15)
  public fun put_PrinterName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PrintSettings2> {
    public override fun getValue() = ABI.makeICoreWebView2PrintSettings2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PrintSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PrintSettings2 {
    public val __1356377495_Ptr: Pointer?

    public val _1356377495_VtblPtr: Pointer?
      get() = __1356377495_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PageRanges(): String? {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PageRanges(value: String?): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PagesPerSide(): Int {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_PagesPerSide(value: Int): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Copies(): Int {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Copies(value: Int): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Collation(): CoreWebView2PrintCollation? {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PrintCollation>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PrintCollation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Collation(value: CoreWebView2PrintCollation?): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ColorMode(): CoreWebView2PrintColorMode? {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PrintColorMode>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PrintColorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ColorMode(value: CoreWebView2PrintColorMode?): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Duplex(): CoreWebView2PrintDuplex? {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PrintDuplex>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PrintDuplex>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Duplex(value: CoreWebView2PrintDuplex?): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MediaSize(): CoreWebView2PrintMediaSize? {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PrintMediaSize>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PrintMediaSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_MediaSize(value: CoreWebView2PrintMediaSize?): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PrinterName(): String? {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PrinterName(value: String?): Unit {
      val fnPtr = _1356377495_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356377495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2PrintSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1356377495_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PrintSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2a97895ca6e57fc905dc6f77a081768")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PrintSettings2(ptr: Pointer?): WithDefault =
        ICoreWebView2PrintSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2PrintSettings2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PrintSettings2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PrintSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1356377495_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PrintSettings2):
        Array<ICoreWebView2PrintSettings2?> = (elements as
        Array<ICoreWebView2PrintSettings2?>).castToImpl<ICoreWebView2PrintSettings2,ICoreWebView2PrintSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PrintSettings2?> =
        arrayOfNulls<ICoreWebView2PrintSettings2_Impl>(size) as Array<ICoreWebView2PrintSettings2?>
  }
}
