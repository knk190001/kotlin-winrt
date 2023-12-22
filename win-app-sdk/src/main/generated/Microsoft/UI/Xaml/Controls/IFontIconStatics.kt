package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IFontIconStatics.ABI::class)
@Signature("{55564030-2f80-5be5-8c2a-ebb6ecba07e8}")
@Guid("555640302f805be58c2aebb6ecba07e8")
@WinRTInterface("555640302f805be58c2aebb6ecba07e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIconStatics.ByReference::class)
public interface IFontIconStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GlyphProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FontSizeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FontWeightProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FontStyleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_MirroredWhenRightToLeftProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontIconStatics> {
    public override fun getValue() = ABI.makeIFontIconStatics(pointer.getPointer(0))

    public fun setValue(value: IFontIconStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIconStatics {
    public val __981090454_Ptr: Pointer?

    public val _981090454_VtblPtr: Pointer?
      get() = __981090454_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GlyphProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FontSizeProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FontFamilyProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontWeightProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FontStyleProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MirroredWhenRightToLeftProperty(): DependencyProperty? {
      val fnPtr = _981090454_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__981090454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFontIconStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __981090454_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIconStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("555640302f805be58c2aebb6ecba07e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIconStatics(ptr: Pointer?): WithDefault = IFontIconStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIconStatics {
      val address = segment.toRawLongValue()
      return makeIFontIconStatics(Pointer(address))
    }

    public override fun toNative(obj: IFontIconStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__981090454_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIconStatics): Array<IFontIconStatics?> = (elements as
        Array<IFontIconStatics?>).castToImpl<IFontIconStatics,IFontIconStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIconStatics?> =
        arrayOfNulls<IFontIconStatics_Impl>(size) as Array<IFontIconStatics?>
  }
}
