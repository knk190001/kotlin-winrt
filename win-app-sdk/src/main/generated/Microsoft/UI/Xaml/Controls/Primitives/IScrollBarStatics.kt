package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IScrollBarStatics.ABI::class)
@Signature("{88b52e18-9528-579f-bd84-eba585a01c7a}")
@Guid("88b52e189528579fbd84eba585a01c7a")
@WinRTInterface("88b52e189528579fbd84eba585a01c7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollBarStatics.ByReference::class)
public interface IScrollBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ViewportSizeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IndicatorModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollBarStatics> {
    public override fun getValue() = ABI.makeIScrollBarStatics(pointer.getPointer(0))

    public fun setValue(value: IScrollBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollBarStatics {
    public val __1095615792_Ptr: Pointer?

    public val _1095615792_VtblPtr: Pointer?
      get() = __1095615792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1095615792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1095615792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ViewportSizeProperty(): DependencyProperty? {
      val fnPtr = _1095615792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1095615792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IndicatorModeProperty(): DependencyProperty? {
      val fnPtr = _1095615792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1095615792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScrollBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1095615792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88b52e189528579fbd84eba585a01c7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollBarStatics(ptr: Pointer?): WithDefault = IScrollBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollBarStatics {
      val address = segment.toRawLongValue()
      return makeIScrollBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IScrollBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1095615792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollBarStatics): Array<IScrollBarStatics?> = (elements
        as Array<IScrollBarStatics?>).castToImpl<IScrollBarStatics,IScrollBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollBarStatics?> =
        arrayOfNulls<IScrollBarStatics_Impl>(size) as Array<IScrollBarStatics?>
  }
}
