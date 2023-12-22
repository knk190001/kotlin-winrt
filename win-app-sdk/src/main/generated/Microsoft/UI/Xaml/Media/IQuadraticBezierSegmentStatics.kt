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

@ABIMarker(IQuadraticBezierSegmentStatics.ABI::class)
@Signature("{4d56ea65-0a1a-528a-a5b6-41da03ac71f4}")
@Guid("4d56ea650a1a528aa5b641da03ac71f4")
@WinRTInterface("4d56ea650a1a528aa5b641da03ac71f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQuadraticBezierSegmentStatics.ByReference::class)
public interface IQuadraticBezierSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point1Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_Point2Property(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IQuadraticBezierSegmentStatics> {
    public override fun getValue() = ABI.makeIQuadraticBezierSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: IQuadraticBezierSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQuadraticBezierSegmentStatics {
    public val __1097899640_Ptr: Pointer?

    public val _1097899640_VtblPtr: Pointer?
      get() = __1097899640_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point1Property(): DependencyProperty? {
      val fnPtr = _1097899640_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1097899640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Point2Property(): DependencyProperty? {
      val fnPtr = _1097899640_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1097899640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IQuadraticBezierSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1097899640_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQuadraticBezierSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d56ea650a1a528aa5b641da03ac71f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQuadraticBezierSegmentStatics(ptr: Pointer?): WithDefault =
        IQuadraticBezierSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQuadraticBezierSegmentStatics {
      val address = segment.toRawLongValue()
      return makeIQuadraticBezierSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IQuadraticBezierSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1097899640_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQuadraticBezierSegmentStatics):
        Array<IQuadraticBezierSegmentStatics?> = (elements as
        Array<IQuadraticBezierSegmentStatics?>).castToImpl<IQuadraticBezierSegmentStatics,IQuadraticBezierSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQuadraticBezierSegmentStatics?> =
        arrayOfNulls<IQuadraticBezierSegmentStatics_Impl>(size) as
        Array<IQuadraticBezierSegmentStatics?>
  }
}
