package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IGlyphsStatics2.ABI::class)
@Signature("{10489aa7-1615-4a33-aa02-d7ef2aefc739}")
@Guid("10489aa716154a33aa02d7ef2aefc739")
@WinRTInterface("10489aa716154a33aa02d7ef2aefc739")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlyphsStatics2.ByReference::class)
public interface IGlyphsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsColorFontEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ColorFontPaletteIndexProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlyphsStatics2> {
    public override fun getValue() = ABI.makeIGlyphsStatics2(pointer.getPointer(0))

    public fun setValue(value: IGlyphsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlyphsStatics2 {
    public val __1493744412_Ptr: Pointer?

    public val _1493744412_VtblPtr: Pointer?
      get() = __1493744412_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsColorFontEnabledProperty(): DependencyProperty? {
      val fnPtr = _1493744412_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493744412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ColorFontPaletteIndexProperty(): DependencyProperty? {
      val fnPtr = _1493744412_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493744412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGlyphsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1493744412_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlyphsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10489aa716154a33aa02d7ef2aefc739")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlyphsStatics2(ptr: Pointer?): WithDefault = IGlyphsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGlyphsStatics2 {
      val address = segment.toRawLongValue()
      return makeIGlyphsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGlyphsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1493744412_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlyphsStatics2): Array<IGlyphsStatics2?> = (elements as
        Array<IGlyphsStatics2?>).castToImpl<IGlyphsStatics2,IGlyphsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGlyphsStatics2?> =
        arrayOfNulls<IGlyphsStatics2_Impl>(size) as Array<IGlyphsStatics2?>
  }
}
