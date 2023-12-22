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

@ABIMarker(IBezierSegmentStatics.ABI::class)
@Signature("{98e74d5c-c97a-50b0-ae0e-d436dc9df16d}")
@Guid("98e74d5cc97a50b0ae0ed436dc9df16d")
@WinRTInterface("98e74d5cc97a50b0ae0ed436dc9df16d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBezierSegmentStatics.ByReference::class)
public interface IBezierSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point1Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_Point2Property(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_Point3Property(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBezierSegmentStatics> {
    public override fun getValue() = ABI.makeIBezierSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: IBezierSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBezierSegmentStatics {
    public val __1407248510_Ptr: Pointer?

    public val _1407248510_VtblPtr: Pointer?
      get() = __1407248510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point1Property(): DependencyProperty? {
      val fnPtr = _1407248510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1407248510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Point2Property(): DependencyProperty? {
      val fnPtr = _1407248510_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1407248510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Point3Property(): DependencyProperty? {
      val fnPtr = _1407248510_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1407248510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBezierSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1407248510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBezierSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98e74d5cc97a50b0ae0ed436dc9df16d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBezierSegmentStatics(ptr: Pointer?): WithDefault =
        IBezierSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBezierSegmentStatics {
      val address = segment.toRawLongValue()
      return makeIBezierSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IBezierSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1407248510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBezierSegmentStatics): Array<IBezierSegmentStatics?> =
        (elements as
        Array<IBezierSegmentStatics?>).castToImpl<IBezierSegmentStatics,IBezierSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBezierSegmentStatics?> =
        arrayOfNulls<IBezierSegmentStatics_Impl>(size) as Array<IBezierSegmentStatics?>
  }
}
