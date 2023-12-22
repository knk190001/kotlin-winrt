package Microsoft.UI.Xaml.Media

import Windows.Foundation.Point
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

@ABIMarker(IPathFigure.ABI::class)
@Signature("{0ee00712-bf65-5f27-9c06-14abdf6656d7}")
@Guid("0ee00712bf655f279c0614abdf6656d7")
@WinRTInterface("0ee00712bf655f279c0614abdf6656d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathFigure.ByReference::class)
public interface IPathFigure : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Segments(): PathSegmentCollection?

  @InterfaceMethod(1)
  public fun put_Segments(value: PathSegmentCollection?): Unit

  @InterfaceMethod(2)
  public fun get_StartPoint(): Point?

  @InterfaceMethod(3)
  public fun put_StartPoint(value: Point?): Unit

  @InterfaceMethod(4)
  public fun get_IsClosed(): Boolean

  @InterfaceMethod(5)
  public fun put_IsClosed(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsFilled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsFilled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathFigure> {
    public override fun getValue() = ABI.makeIPathFigure(pointer.getPointer(0))

    public fun setValue(value: IPathFigure_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathFigure {
    public val __261986906_Ptr: Pointer?

    public val _261986906_VtblPtr: Pointer?
      get() = __261986906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Segments(): PathSegmentCollection? {
      val fnPtr = _261986906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PathSegmentCollection>()
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PathSegmentCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Segments(value: PathSegmentCollection?): Unit {
      val fnPtr = _261986906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StartPoint(): Point? {
      val fnPtr = _261986906_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StartPoint(value: Point?): Unit {
      val fnPtr = _261986906_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsClosed(): Boolean {
      val fnPtr = _261986906_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsClosed(value: Boolean): Unit {
      val fnPtr = _261986906_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsFilled(): Boolean {
      val fnPtr = _261986906_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsFilled(value: Boolean): Unit {
      val fnPtr = _261986906_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__261986906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPathFigure_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __261986906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathFigure, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ee00712bf655f279c0614abdf6656d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathFigure(ptr: Pointer?): WithDefault = IPathFigure_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathFigure {
      val address = segment.toRawLongValue()
      return makeIPathFigure(Pointer(address))
    }

    public override fun toNative(obj: IPathFigure): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__261986906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathFigure): Array<IPathFigure?> = (elements as
        Array<IPathFigure?>).castToImpl<IPathFigure,IPathFigure_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathFigure?> =
        arrayOfNulls<IPathFigure_Impl>(size) as Array<IPathFigure?>
  }
}
