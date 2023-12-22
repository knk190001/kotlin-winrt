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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILinearGradientBrush.ABI::class)
@Signature("{c0ab9638-1bd9-5fa4-9649-48cfa12f0d1e}")
@Guid("c0ab96381bd95fa4964948cfa12f0d1e")
@WinRTInterface("c0ab96381bd95fa4964948cfa12f0d1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearGradientBrush.ByReference::class)
public interface ILinearGradientBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartPoint(): Point?

  @InterfaceMethod(1)
  public fun put_StartPoint(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_EndPoint(): Point?

  @InterfaceMethod(3)
  public fun put_EndPoint(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearGradientBrush> {
    public override fun getValue() = ABI.makeILinearGradientBrush(pointer.getPointer(0))

    public fun setValue(value: ILinearGradientBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearGradientBrush {
    public val __1565072652_Ptr: Pointer?

    public val _1565072652_VtblPtr: Pointer?
      get() = __1565072652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartPoint(): Point? {
      val fnPtr = _1565072652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1565072652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_StartPoint(value: Point?): Unit {
      val fnPtr = _1565072652_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565072652_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EndPoint(): Point? {
      val fnPtr = _1565072652_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1565072652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EndPoint(value: Point?): Unit {
      val fnPtr = _1565072652_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565072652_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILinearGradientBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1565072652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearGradientBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0ab96381bd95fa4964948cfa12f0d1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearGradientBrush(ptr: Pointer?): WithDefault = ILinearGradientBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearGradientBrush {
      val address = segment.toRawLongValue()
      return makeILinearGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: ILinearGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1565072652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearGradientBrush): Array<ILinearGradientBrush?> =
        (elements as
        Array<ILinearGradientBrush?>).castToImpl<ILinearGradientBrush,ILinearGradientBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearGradientBrush?> =
        arrayOfNulls<ILinearGradientBrush_Impl>(size) as Array<ILinearGradientBrush?>
  }
}
