package Windows.UI.Xaml.Documents

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

@ABIMarker(IGlyphs2.ABI::class)
@Signature("{aa8bfe5c-3754-4bee-bbe1-4403ee9b86f0}")
@Guid("aa8bfe5c37544beebbe14403ee9b86f0")
@WinRTInterface("aa8bfe5c37544beebbe14403ee9b86f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlyphs2.ByReference::class)
public interface IGlyphs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsColorFontEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsColorFontEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ColorFontPaletteIndex(): Int

  @InterfaceMethod(3)
  public fun put_ColorFontPaletteIndex(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGlyphs2> {
    public override fun getValue() = ABI.makeIGlyphs2(pointer.getPointer(0))

    public fun setValue(value: IGlyphs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlyphs2 {
    public val __1155210973_Ptr: Pointer?

    public val _1155210973_VtblPtr: Pointer?
      get() = __1155210973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsColorFontEnabled(): Boolean {
      val fnPtr = _1155210973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1155210973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsColorFontEnabled(value: Boolean): Unit {
      val fnPtr = _1155210973_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1155210973_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ColorFontPaletteIndex(): Int {
      val fnPtr = _1155210973_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1155210973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ColorFontPaletteIndex(value: Int): Unit {
      val fnPtr = _1155210973_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1155210973_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGlyphs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1155210973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlyphs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa8bfe5c37544beebbe14403ee9b86f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlyphs2(ptr: Pointer?): WithDefault = IGlyphs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGlyphs2 {
      val address = segment.toRawLongValue()
      return makeIGlyphs2(Pointer(address))
    }

    public override fun toNative(obj: IGlyphs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1155210973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlyphs2): Array<IGlyphs2?> = (elements as
        Array<IGlyphs2?>).castToImpl<IGlyphs2,IGlyphs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGlyphs2?> = arrayOfNulls<IGlyphs2_Impl>(size) as
        Array<IGlyphs2?>
  }
}
