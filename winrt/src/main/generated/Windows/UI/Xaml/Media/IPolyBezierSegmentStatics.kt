package Windows.UI.Xaml.Media

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

@ABIMarker(IPolyBezierSegmentStatics.ABI::class)
@Signature("{1d91a6da-1492-4acc-bd66-a496f3d829d6}")
@Guid("1d91a6da14924accbd66a496f3d829d6")
@WinRTInterface("1d91a6da14924accbd66a496f3d829d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolyBezierSegmentStatics.ByReference::class)
public interface IPolyBezierSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPolyBezierSegmentStatics> {
    public override fun getValue() = ABI.makeIPolyBezierSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: IPolyBezierSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolyBezierSegmentStatics {
    public val __1551625657_Ptr: Pointer?

    public val _1551625657_VtblPtr: Pointer?
      get() = __1551625657_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointsProperty(): DependencyProperty? {
      val fnPtr = _1551625657_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1551625657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPolyBezierSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1551625657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolyBezierSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d91a6da14924accbd66a496f3d829d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolyBezierSegmentStatics(ptr: Pointer?): WithDefault =
        IPolyBezierSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolyBezierSegmentStatics {
      val address = segment.toRawLongValue()
      return makeIPolyBezierSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IPolyBezierSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1551625657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolyBezierSegmentStatics):
        Array<IPolyBezierSegmentStatics?> = (elements as
        Array<IPolyBezierSegmentStatics?>).castToImpl<IPolyBezierSegmentStatics,IPolyBezierSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolyBezierSegmentStatics?> =
        arrayOfNulls<IPolyBezierSegmentStatics_Impl>(size) as Array<IPolyBezierSegmentStatics?>
  }
}
