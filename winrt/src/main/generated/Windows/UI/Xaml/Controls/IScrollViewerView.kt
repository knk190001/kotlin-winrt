package Windows.UI.Xaml.Controls

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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewerView.ABI::class)
@Signature("{64e9be01-4dc2-493e-abe8-cbd3c577490e}")
@Guid("64e9be014dc2493eabe8cbd3c577490e")
@WinRTInterface("64e9be014dc2493eabe8cbd3c577490e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerView.ByReference::class)
public interface IScrollViewerView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(2)
  public fun get_ZoomFactor(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerView> {
    public override fun getValue() = ABI.makeIScrollViewerView(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerView {
    public val __576810336_Ptr: Pointer?

    public val _576810336_VtblPtr: Pointer?
      get() = __576810336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _576810336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__576810336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _576810336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__576810336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ZoomFactor(): Float {
      val fnPtr = _576810336_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__576810336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollViewerView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __576810336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64e9be014dc2493eabe8cbd3c577490e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerView(ptr: Pointer?): WithDefault = IScrollViewerView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerView {
      val address = segment.toRawLongValue()
      return makeIScrollViewerView(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__576810336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerView): Array<IScrollViewerView?> = (elements
        as Array<IScrollViewerView?>).castToImpl<IScrollViewerView,IScrollViewerView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerView?> =
        arrayOfNulls<IScrollViewerView_Impl>(size) as Array<IScrollViewerView?>
  }
}
