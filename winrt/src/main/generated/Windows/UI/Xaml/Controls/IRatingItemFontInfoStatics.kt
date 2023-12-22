package Windows.UI.Xaml.Controls

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

@ABIMarker(IRatingItemFontInfoStatics.ABI::class)
@Signature("{fb214f01-6434-4eeb-82ff-7ce5d40bf510}")
@Guid("fb214f0164344eeb82ff7ce5d40bf510")
@WinRTInterface("fb214f0164344eeb82ff7ce5d40bf510")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemFontInfoStatics.ByReference::class)
public interface IRatingItemFontInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisabledGlyphProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_GlyphProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PlaceholderGlyphProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PointerOverGlyphProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PointerOverPlaceholderGlyphProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_UnsetGlyphProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemFontInfoStatics> {
    public override fun getValue() = ABI.makeIRatingItemFontInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IRatingItemFontInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemFontInfoStatics {
    public val __868210268_Ptr: Pointer?

    public val _868210268_VtblPtr: Pointer?
      get() = __868210268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisabledGlyphProperty(): DependencyProperty? {
      val fnPtr = _868210268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__868210268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_GlyphProperty(): DependencyProperty? {
      val fnPtr = _868210268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__868210268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlaceholderGlyphProperty(): DependencyProperty? {
      val fnPtr = _868210268_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__868210268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PointerOverGlyphProperty(): DependencyProperty? {
      val fnPtr = _868210268_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__868210268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PointerOverPlaceholderGlyphProperty(): DependencyProperty? {
      val fnPtr = _868210268_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__868210268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_UnsetGlyphProperty(): DependencyProperty? {
      val fnPtr = _868210268_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__868210268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRatingItemFontInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __868210268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemFontInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb214f0164344eeb82ff7ce5d40bf510")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemFontInfoStatics(ptr: Pointer?): WithDefault =
        IRatingItemFontInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemFontInfoStatics {
      val address = segment.toRawLongValue()
      return makeIRatingItemFontInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemFontInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__868210268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemFontInfoStatics):
        Array<IRatingItemFontInfoStatics?> = (elements as
        Array<IRatingItemFontInfoStatics?>).castToImpl<IRatingItemFontInfoStatics,IRatingItemFontInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemFontInfoStatics?> =
        arrayOfNulls<IRatingItemFontInfoStatics_Impl>(size) as Array<IRatingItemFontInfoStatics?>
  }
}
