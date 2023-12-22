package Microsoft.UI.Xaml.Shapes

import Microsoft.UI.Xaml.Media.FillRule
import Microsoft.UI.Xaml.Media.PointCollection
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

@ABIMarker(IPolyline.ABI::class)
@Signature("{c7f0bec6-184c-5d96-8102-04dd211e100c}")
@Guid("c7f0bec6184c5d96810204dd211e100c")
@WinRTInterface("c7f0bec6184c5d96810204dd211e100c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolyline.ByReference::class)
public interface IPolyline : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillRule(): FillRule?

  @InterfaceMethod(1)
  public fun put_FillRule(value: FillRule?): Unit

  @InterfaceMethod(2)
  public fun get_Points(): PointCollection?

  @InterfaceMethod(3)
  public fun put_Points(value: PointCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPolyline> {
    public override fun getValue() = ABI.makeIPolyline(pointer.getPointer(0))

    public fun setValue(value: IPolyline_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolyline {
    public val __1879194933_Ptr: Pointer?

    public val _1879194933_VtblPtr: Pointer?
      get() = __1879194933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillRule(): FillRule? {
      val fnPtr = _1879194933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FillRule>()
      val hr = fn.invokeHR(arrayOf(__1879194933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FillRule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FillRule(value: FillRule?): Unit {
      val fnPtr = _1879194933_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1879194933_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Points(): PointCollection? {
      val fnPtr = _1879194933_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointCollection>()
      val hr = fn.invokeHR(arrayOf(__1879194933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Points(value: PointCollection?): Unit {
      val fnPtr = _1879194933_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1879194933_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPolyline_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1879194933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolyline, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7f0bec6184c5d96810204dd211e100c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolyline(ptr: Pointer?): WithDefault = IPolyline_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolyline {
      val address = segment.toRawLongValue()
      return makeIPolyline(Pointer(address))
    }

    public override fun toNative(obj: IPolyline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1879194933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolyline): Array<IPolyline?> = (elements as
        Array<IPolyline?>).castToImpl<IPolyline,IPolyline_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolyline?> = arrayOfNulls<IPolyline_Impl>(size)
        as Array<IPolyline?>
  }
}
