package Microsoft.UI.Xaml.Media

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

@ABIMarker(IPolyQuadraticBezierSegmentStatics.ABI::class)
@Signature("{7eb6374d-cd30-5507-b2ab-c4e3a7dc60bf}")
@Guid("7eb6374dcd305507b2abc4e3a7dc60bf")
@WinRTInterface("7eb6374dcd305507b2abc4e3a7dc60bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolyQuadraticBezierSegmentStatics.ByReference::class)
public interface IPolyQuadraticBezierSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPolyQuadraticBezierSegmentStatics> {
    public override fun getValue() =
        ABI.makeIPolyQuadraticBezierSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: IPolyQuadraticBezierSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolyQuadraticBezierSegmentStatics {
    public val __254326132_Ptr: Pointer?

    public val _254326132_VtblPtr: Pointer?
      get() = __254326132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointsProperty(): DependencyProperty? {
      val fnPtr = _254326132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__254326132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPolyQuadraticBezierSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __254326132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolyQuadraticBezierSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7eb6374dcd305507b2abc4e3a7dc60bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolyQuadraticBezierSegmentStatics(ptr: Pointer?): WithDefault =
        IPolyQuadraticBezierSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolyQuadraticBezierSegmentStatics {
      val address = segment.toRawLongValue()
      return makeIPolyQuadraticBezierSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IPolyQuadraticBezierSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__254326132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolyQuadraticBezierSegmentStatics):
        Array<IPolyQuadraticBezierSegmentStatics?> = (elements as
        Array<IPolyQuadraticBezierSegmentStatics?>).castToImpl<IPolyQuadraticBezierSegmentStatics,IPolyQuadraticBezierSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolyQuadraticBezierSegmentStatics?> =
        arrayOfNulls<IPolyQuadraticBezierSegmentStatics_Impl>(size) as
        Array<IPolyQuadraticBezierSegmentStatics?>
  }
}
