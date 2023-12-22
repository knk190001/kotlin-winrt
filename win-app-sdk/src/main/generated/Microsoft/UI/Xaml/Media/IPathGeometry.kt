package Microsoft.UI.Xaml.Media

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

@ABIMarker(IPathGeometry.ABI::class)
@Signature("{11b9d95d-d3d9-5337-a05c-73a27a2b5124}")
@Guid("11b9d95dd3d95337a05c73a27a2b5124")
@WinRTInterface("11b9d95dd3d95337a05c73a27a2b5124")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathGeometry.ByReference::class)
public interface IPathGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillRule(): FillRule?

  @InterfaceMethod(1)
  public fun put_FillRule(value: FillRule?): Unit

  @InterfaceMethod(2)
  public fun get_Figures(): PathFigureCollection?

  @InterfaceMethod(3)
  public fun put_Figures(value: PathFigureCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathGeometry>
      {
    public override fun getValue() = ABI.makeIPathGeometry(pointer.getPointer(0))

    public fun setValue(value: IPathGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathGeometry {
    public val __1075384936_Ptr: Pointer?

    public val _1075384936_VtblPtr: Pointer?
      get() = __1075384936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillRule(): FillRule? {
      val fnPtr = _1075384936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FillRule>()
      val hr = fn.invokeHR(arrayOf(__1075384936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FillRule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FillRule(value: FillRule?): Unit {
      val fnPtr = _1075384936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075384936_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Figures(): PathFigureCollection? {
      val fnPtr = _1075384936_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PathFigureCollection>()
      val hr = fn.invokeHR(arrayOf(__1075384936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PathFigureCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Figures(value: PathFigureCollection?): Unit {
      val fnPtr = _1075384936_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075384936_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPathGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075384936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11b9d95dd3d95337a05c73a27a2b5124")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathGeometry(ptr: Pointer?): WithDefault = IPathGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathGeometry {
      val address = segment.toRawLongValue()
      return makeIPathGeometry(Pointer(address))
    }

    public override fun toNative(obj: IPathGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075384936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathGeometry): Array<IPathGeometry?> = (elements as
        Array<IPathGeometry?>).castToImpl<IPathGeometry,IPathGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathGeometry?> =
        arrayOfNulls<IPathGeometry_Impl>(size) as Array<IPathGeometry?>
  }
}
