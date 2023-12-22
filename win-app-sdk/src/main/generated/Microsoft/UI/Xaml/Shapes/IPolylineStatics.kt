package Microsoft.UI.Xaml.Shapes

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

@ABIMarker(IPolylineStatics.ABI::class)
@Signature("{48840fe7-d735-5080-9c6d-2862665cdda0}")
@Guid("48840fe7d73550809c6d2862665cdda0")
@WinRTInterface("48840fe7d73550809c6d2862665cdda0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolylineStatics.ByReference::class)
public interface IPolylineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillRuleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PointsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPolylineStatics> {
    public override fun getValue() = ABI.makeIPolylineStatics(pointer.getPointer(0))

    public fun setValue(value: IPolylineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolylineStatics {
    public val __552129926_Ptr: Pointer?

    public val _552129926_VtblPtr: Pointer?
      get() = __552129926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillRuleProperty(): DependencyProperty? {
      val fnPtr = _552129926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__552129926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PointsProperty(): DependencyProperty? {
      val fnPtr = _552129926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__552129926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPolylineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __552129926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolylineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48840fe7d73550809c6d2862665cdda0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolylineStatics(ptr: Pointer?): WithDefault = IPolylineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolylineStatics {
      val address = segment.toRawLongValue()
      return makeIPolylineStatics(Pointer(address))
    }

    public override fun toNative(obj: IPolylineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__552129926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolylineStatics): Array<IPolylineStatics?> = (elements as
        Array<IPolylineStatics?>).castToImpl<IPolylineStatics,IPolylineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolylineStatics?> =
        arrayOfNulls<IPolylineStatics_Impl>(size) as Array<IPolylineStatics?>
  }
}
