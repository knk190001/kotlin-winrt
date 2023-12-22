package Microsoft.UI.Content

import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Graphics.PointInt32
import Windows.Graphics.RectInt32
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

@ABIMarker(IContentCoordinateConverter.ABI::class)
@Signature("{10a11230-5eb4-5840-a346-570f4a49040f}")
@Guid("10a112305eb45840a346570f4a49040f")
@WinRTInterface("10a112305eb45840a346570f4a49040f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentCoordinateConverter.ByReference::class)
public interface IContentCoordinateConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ConvertLocalToScreen(localPoint: Point?): PointInt32?

  @InterfaceMethod(1)
  public fun ConvertLocalToScreen(localPoints: Array<Point?>): Array<PointInt32?>?

  @InterfaceMethod(2)
  public fun ConvertLocalToScreen(localPoints: Array<Point?>,
      roundingMode: ContentCoordinateRoundingMode?): Array<PointInt32?>?

  @InterfaceMethod(3)
  public fun ConvertLocalToScreen(localRect: Rect?): RectInt32?

  @InterfaceMethod(4)
  public fun ConvertScreenToLocal(screenPoint: PointInt32?): Point?

  @InterfaceMethod(5)
  public fun ConvertScreenToLocal(screenPoints: Array<PointInt32?>): Array<Point?>?

  @InterfaceMethod(6)
  public fun ConvertScreenToLocal(screenRect: RectInt32?): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentCoordinateConverter> {
    public override fun getValue() = ABI.makeIContentCoordinateConverter(pointer.getPointer(0))

    public fun setValue(value: IContentCoordinateConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentCoordinateConverter {
    public val __763303289_Ptr: Pointer?

    public val _763303289_VtblPtr: Pointer?
      get() = __763303289_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertLocalToScreen(localPoint: Point?): PointInt32? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointInt32>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, marshalToNative(localPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConvertLocalToScreen(localPoints: Array<Point?>): Array<PointInt32?>? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<PointInt32>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, localPoints.size,marshalToNative(localPoints),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<PointInt32?>
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ConvertLocalToScreen(localPoints: Array<Point?>,
        roundingMode: ContentCoordinateRoundingMode?): Array<PointInt32?>? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<PointInt32>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, localPoints.size,marshalToNative(localPoints),
          marshalToNative(roundingMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<PointInt32?>
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ConvertLocalToScreen(localRect: Rect?): RectInt32? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RectInt32>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, marshalToNative(localRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RectInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ConvertScreenToLocal(screenPoint: PointInt32?): Point? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, marshalToNative(screenPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ConvertScreenToLocal(screenPoints: Array<PointInt32?>): Array<Point?>? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<Point>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, screenPoints.size,marshalToNative(screenPoints),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<Point?>
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ConvertScreenToLocal(screenRect: RectInt32?): Rect? {
      val fnPtr = _763303289_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__763303289_Ptr, marshalToNative(screenRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IContentCoordinateConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __763303289_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentCoordinateConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10a112305eb45840a346570f4a49040f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentCoordinateConverter(ptr: Pointer?): WithDefault =
        IContentCoordinateConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentCoordinateConverter {
      val address = segment.toRawLongValue()
      return makeIContentCoordinateConverter(Pointer(address))
    }

    public override fun toNative(obj: IContentCoordinateConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__763303289_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentCoordinateConverter):
        Array<IContentCoordinateConverter?> = (elements as
        Array<IContentCoordinateConverter?>).castToImpl<IContentCoordinateConverter,IContentCoordinateConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentCoordinateConverter?> =
        arrayOfNulls<IContentCoordinateConverter_Impl>(size) as Array<IContentCoordinateConverter?>
  }
}
