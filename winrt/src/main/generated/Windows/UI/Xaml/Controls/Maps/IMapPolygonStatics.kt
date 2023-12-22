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

@ABIMarker(IMapPolygonStatics.ABI::class)
@Signature("{37f573be-097b-424c-87cc-2ee042fda6d2}")
@Guid("37f573be097b424c87cc2ee042fda6d2")
@WinRTInterface("37f573be097b424c87cc2ee042fda6d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapPolygonStatics.ByReference::class)
public interface IMapPolygonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PathProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StrokeThicknessProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_StrokeDashedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapPolygonStatics> {
    public override fun getValue() = ABI.makeIMapPolygonStatics(pointer.getPointer(0))

    public fun setValue(value: IMapPolygonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapPolygonStatics {
    public val __474182538_Ptr: Pointer?

    public val _474182538_VtblPtr: Pointer?
      get() = __474182538_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PathProperty(): DependencyProperty? {
      val fnPtr = _474182538_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__474182538_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StrokeThicknessProperty(): DependencyProperty? {
      val fnPtr = _474182538_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__474182538_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_StrokeDashedProperty(): DependencyProperty? {
      val fnPtr = _474182538_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__474182538_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapPolygonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __474182538_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapPolygonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37f573be097b424c87cc2ee042fda6d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapPolygonStatics(ptr: Pointer?): WithDefault = IMapPolygonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapPolygonStatics {
      val address = segment.toRawLongValue()
      return makeIMapPolygonStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapPolygonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__474182538_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapPolygonStatics): Array<IMapPolygonStatics?> =
        (elements as
        Array<IMapPolygonStatics?>).castToImpl<IMapPolygonStatics,IMapPolygonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapPolygonStatics?> =
        arrayOfNulls<IMapPolygonStatics_Impl>(size) as Array<IMapPolygonStatics?>
  }
}
