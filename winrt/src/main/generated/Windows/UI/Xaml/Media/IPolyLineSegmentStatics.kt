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

@ABIMarker(IPolyLineSegmentStatics.ABI::class)
@Signature("{d64a2c87-33f1-4e70-a47f-b4981ef648a2}")
@Guid("d64a2c8733f14e70a47fb4981ef648a2")
@WinRTInterface("d64a2c8733f14e70a47fb4981ef648a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolyLineSegmentStatics.ByReference::class)
public interface IPolyLineSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPolyLineSegmentStatics> {
    public override fun getValue() = ABI.makeIPolyLineSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: IPolyLineSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolyLineSegmentStatics {
    public val __111357966_Ptr: Pointer?

    public val _111357966_VtblPtr: Pointer?
      get() = __111357966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointsProperty(): DependencyProperty? {
      val fnPtr = _111357966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__111357966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPolyLineSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __111357966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolyLineSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d64a2c8733f14e70a47fb4981ef648a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolyLineSegmentStatics(ptr: Pointer?): WithDefault =
        IPolyLineSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolyLineSegmentStatics {
      val address = segment.toRawLongValue()
      return makeIPolyLineSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IPolyLineSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__111357966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolyLineSegmentStatics): Array<IPolyLineSegmentStatics?>
        = (elements as
        Array<IPolyLineSegmentStatics?>).castToImpl<IPolyLineSegmentStatics,IPolyLineSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolyLineSegmentStatics?> =
        arrayOfNulls<IPolyLineSegmentStatics_Impl>(size) as Array<IPolyLineSegmentStatics?>
  }
}
