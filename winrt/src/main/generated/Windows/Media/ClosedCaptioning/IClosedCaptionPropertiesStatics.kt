package Windows.Media.ClosedCaptioning

import Windows.UI.Color
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

@ABIMarker(IClosedCaptionPropertiesStatics.ABI::class)
@Signature("{10aa1f84-cc30-4141-b503-5272289e0c20}")
@Guid("10aa1f84cc304141b5035272289e0c20")
@WinRTInterface("10aa1f84cc304141b5035272289e0c20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClosedCaptionPropertiesStatics.ByReference::class)
public interface IClosedCaptionPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FontColor(): ClosedCaptionColor?

  @InterfaceMethod(1)
  public fun get_ComputedFontColor(): Color?

  @InterfaceMethod(2)
  public fun get_FontOpacity(): ClosedCaptionOpacity?

  @InterfaceMethod(3)
  public fun get_FontSize(): ClosedCaptionSize?

  @InterfaceMethod(4)
  public fun get_FontStyle(): ClosedCaptionStyle?

  @InterfaceMethod(5)
  public fun get_FontEffect(): ClosedCaptionEdgeEffect?

  @InterfaceMethod(6)
  public fun get_BackgroundColor(): ClosedCaptionColor?

  @InterfaceMethod(7)
  public fun get_ComputedBackgroundColor(): Color?

  @InterfaceMethod(8)
  public fun get_BackgroundOpacity(): ClosedCaptionOpacity?

  @InterfaceMethod(9)
  public fun get_RegionColor(): ClosedCaptionColor?

  @InterfaceMethod(10)
  public fun get_ComputedRegionColor(): Color?

  @InterfaceMethod(11)
  public fun get_RegionOpacity(): ClosedCaptionOpacity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClosedCaptionPropertiesStatics> {
    public override fun getValue() = ABI.makeIClosedCaptionPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IClosedCaptionPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClosedCaptionPropertiesStatics {
    public val __245666140_Ptr: Pointer?

    public val _245666140_VtblPtr: Pointer?
      get() = __245666140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontColor(): ClosedCaptionColor? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionColor>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionColor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ComputedFontColor(): Color? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FontOpacity(): ClosedCaptionOpacity? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionOpacity>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionOpacity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontSize(): ClosedCaptionSize? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionSize>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FontStyle(): ClosedCaptionStyle? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionStyle>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_FontEffect(): ClosedCaptionEdgeEffect? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionEdgeEffect>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionEdgeEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_BackgroundColor(): ClosedCaptionColor? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionColor>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionColor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ComputedBackgroundColor(): Color? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_BackgroundOpacity(): ClosedCaptionOpacity? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionOpacity>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionOpacity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_RegionColor(): ClosedCaptionColor? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionColor>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionColor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ComputedRegionColor(): Color? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_RegionOpacity(): ClosedCaptionOpacity? {
      val fnPtr = _245666140_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClosedCaptionOpacity>()
      val hr = fn.invokeHR(arrayOf(__245666140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClosedCaptionOpacity>(result.getValue())
      return resultValue
    }
  }

  public class IClosedCaptionPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __245666140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClosedCaptionPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10aa1f84cc304141b5035272289e0c20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClosedCaptionPropertiesStatics(ptr: Pointer?): WithDefault =
        IClosedCaptionPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClosedCaptionPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIClosedCaptionPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IClosedCaptionPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__245666140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClosedCaptionPropertiesStatics):
        Array<IClosedCaptionPropertiesStatics?> = (elements as
        Array<IClosedCaptionPropertiesStatics?>).castToImpl<IClosedCaptionPropertiesStatics,IClosedCaptionPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClosedCaptionPropertiesStatics?> =
        arrayOfNulls<IClosedCaptionPropertiesStatics_Impl>(size) as
        Array<IClosedCaptionPropertiesStatics?>
  }
}
