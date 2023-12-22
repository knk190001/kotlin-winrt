package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionSurfaceBrush.ABI::class)
@Signature("{616bb5a5-0a33-512d-b4b1-3d3734f04aca}")
@Guid("616bb5a50a33512db4b13d3734f04aca")
@WinRTInterface("616bb5a50a33512db4b13d3734f04aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionSurfaceBrush.ByReference::class)
public interface ICompositionSurfaceBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BitmapInterpolationMode(): CompositionBitmapInterpolationMode?

  @InterfaceMethod(1)
  public fun put_BitmapInterpolationMode(value: CompositionBitmapInterpolationMode?): Unit

  @InterfaceMethod(2)
  public fun get_HorizontalAlignmentRatio(): Float

  @InterfaceMethod(3)
  public fun put_HorizontalAlignmentRatio(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_Stretch(): CompositionStretch?

  @InterfaceMethod(5)
  public fun put_Stretch(value: CompositionStretch?): Unit

  @InterfaceMethod(6)
  public fun get_Surface(): ICompositionSurface?

  @InterfaceMethod(7)
  public fun put_Surface(value: ICompositionSurface?): Unit

  @InterfaceMethod(8)
  public fun get_VerticalAlignmentRatio(): Float

  @InterfaceMethod(9)
  public fun put_VerticalAlignmentRatio(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionSurfaceBrush> {
    public override fun getValue() = ABI.makeICompositionSurfaceBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionSurfaceBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionSurfaceBrush {
    public val __1356334818_Ptr: Pointer?

    public val _1356334818_VtblPtr: Pointer?
      get() = __1356334818_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapInterpolationMode(): CompositionBitmapInterpolationMode? {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBitmapInterpolationMode>()
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBitmapInterpolationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BitmapInterpolationMode(value: CompositionBitmapInterpolationMode?):
        Unit {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalAlignmentRatio(): Float {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_HorizontalAlignmentRatio(value: Float): Unit {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Stretch(): CompositionStretch? {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStretch>()
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Stretch(value: CompositionStretch?): Unit {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Surface(): ICompositionSurface? {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICompositionSurface>()
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICompositionSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Surface(value: ICompositionSurface?): Unit {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_VerticalAlignmentRatio(): Float {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_VerticalAlignmentRatio(value: Float): Unit {
      val fnPtr = _1356334818_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356334818_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionSurfaceBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1356334818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionSurfaceBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("616bb5a50a33512db4b13d3734f04aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionSurfaceBrush(ptr: Pointer?): WithDefault =
        ICompositionSurfaceBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionSurfaceBrush {
      val address = segment.toRawLongValue()
      return makeICompositionSurfaceBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionSurfaceBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1356334818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionSurfaceBrush):
        Array<ICompositionSurfaceBrush?> = (elements as
        Array<ICompositionSurfaceBrush?>).castToImpl<ICompositionSurfaceBrush,ICompositionSurfaceBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionSurfaceBrush?> =
        arrayOfNulls<ICompositionSurfaceBrush_Impl>(size) as Array<ICompositionSurfaceBrush?>
  }
}
