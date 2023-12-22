package Windows.UI.Xaml.Documents

import Windows.Foundation.Uri
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.StyleSimulations
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGlyphs.ABI::class)
@Signature("{d079498b-f2b1-4281-99a2-e4d05932b2b5}")
@Guid("d079498bf2b1428199a2e4d05932b2b5")
@WinRTInterface("d079498bf2b1428199a2e4d05932b2b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlyphs.ByReference::class)
public interface IGlyphs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnicodeString(): String?

  @InterfaceMethod(1)
  public fun put_UnicodeString(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Indices(): String?

  @InterfaceMethod(3)
  public fun put_Indices(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_FontUri(): Uri?

  @InterfaceMethod(5)
  public fun put_FontUri(value: Uri?): Unit

  @InterfaceMethod(6)
  public fun get_StyleSimulations(): StyleSimulations?

  @InterfaceMethod(7)
  public fun put_StyleSimulations(value: StyleSimulations?): Unit

  @InterfaceMethod(8)
  public fun get_FontRenderingEmSize(): Double

  @InterfaceMethod(9)
  public fun put_FontRenderingEmSize(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_OriginX(): Double

  @InterfaceMethod(11)
  public fun put_OriginX(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_OriginY(): Double

  @InterfaceMethod(13)
  public fun put_OriginY(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_Fill(): Brush?

  @InterfaceMethod(15)
  public fun put_Fill(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGlyphs> {
    public override fun getValue() = ABI.makeIGlyphs(pointer.getPointer(0))

    public fun setValue(value: IGlyphs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlyphs {
    public val __1422738193_Ptr: Pointer?

    public val _1422738193_VtblPtr: Pointer?
      get() = __1422738193_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnicodeString(): String? {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UnicodeString(value: String?): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Indices(): String? {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Indices(value: String?): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontUri(): Uri? {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontUri(value: Uri?): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_StyleSimulations(): StyleSimulations? {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StyleSimulations>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StyleSimulations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_StyleSimulations(value: StyleSimulations?): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontRenderingEmSize(): Double {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_FontRenderingEmSize(value: Double): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_OriginX(): Double {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_OriginX(value: Double): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_OriginY(): Double {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_OriginY(value: Double): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Fill(): Brush? {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Fill(value: Brush?): Unit {
      val fnPtr = _1422738193_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422738193_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGlyphs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1422738193_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlyphs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d079498bf2b1428199a2e4d05932b2b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlyphs(ptr: Pointer?): WithDefault = IGlyphs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGlyphs {
      val address = segment.toRawLongValue()
      return makeIGlyphs(Pointer(address))
    }

    public override fun toNative(obj: IGlyphs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1422738193_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlyphs): Array<IGlyphs?> = (elements as
        Array<IGlyphs?>).castToImpl<IGlyphs,IGlyphs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGlyphs?> = arrayOfNulls<IGlyphs_Impl>(size) as
        Array<IGlyphs?>
  }
}
