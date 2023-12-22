package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IStackPanelStatics.ABI::class)
@Signature("{10bb04e3-eb01-5ea8-9f96-69508479def9}")
@Guid("10bb04e3eb015ea89f9669508479def9")
@WinRTInterface("10bb04e3eb015ea89f9669508479def9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackPanelStatics.ByReference::class)
public interface IStackPanelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreScrollSnapPointsRegularProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_PaddingProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SpacingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStackPanelStatics> {
    public override fun getValue() = ABI.makeIStackPanelStatics(pointer.getPointer(0))

    public fun setValue(value: IStackPanelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackPanelStatics {
    public val __1258085150_Ptr: Pointer?

    public val _1258085150_VtblPtr: Pointer?
      get() = __1258085150_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreScrollSnapPointsRegularProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SpacingProperty(): DependencyProperty? {
      val fnPtr = _1258085150_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1258085150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStackPanelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1258085150_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackPanelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10bb04e3eb015ea89f9669508479def9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackPanelStatics(ptr: Pointer?): WithDefault = IStackPanelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackPanelStatics {
      val address = segment.toRawLongValue()
      return makeIStackPanelStatics(Pointer(address))
    }

    public override fun toNative(obj: IStackPanelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1258085150_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackPanelStatics): Array<IStackPanelStatics?> =
        (elements as
        Array<IStackPanelStatics?>).castToImpl<IStackPanelStatics,IStackPanelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackPanelStatics?> =
        arrayOfNulls<IStackPanelStatics_Impl>(size) as Array<IStackPanelStatics?>
  }
}
