package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapPolylineStatics.ABI::class)
@Signature("{61fde44b-1ddf-4303-b809-ec87f58ad065}")
@Guid("61fde44b1ddf4303b809ec87f58ad065")
@WinRTInterface("61fde44b1ddf4303b809ec87f58ad065")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapPolylineStatics.ByReference::class)
public interface IMapPolylineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PathProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StrokeDashedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapPolylineStatics> {
    public override fun getValue() = ABI.makeIMapPolylineStatics(pointer.getPointer(0))

    public fun setValue(value: IMapPolylineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapPolylineStatics {
    public val __1579206650_Ptr: Pointer?

    public val _1579206650_VtblPtr: Pointer?
      get() = __1579206650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PathProperty(): DependencyProperty? {
      val fnPtr = _1579206650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1579206650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StrokeDashedProperty(): DependencyProperty? {
      val fnPtr = _1579206650_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1579206650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapPolylineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1579206650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapPolylineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61fde44b1ddf4303b809ec87f58ad065")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapPolylineStatics(ptr: Pointer?): WithDefault = IMapPolylineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapPolylineStatics {
      val address = segment.toRawLongValue()
      return makeIMapPolylineStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapPolylineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1579206650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapPolylineStatics): Array<IMapPolylineStatics?> =
        (elements as
        Array<IMapPolylineStatics?>).castToImpl<IMapPolylineStatics,IMapPolylineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapPolylineStatics?> =
        arrayOfNulls<IMapPolylineStatics_Impl>(size) as Array<IMapPolylineStatics?>
  }
}
