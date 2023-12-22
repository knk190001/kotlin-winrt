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

@ABIMarker(IScrollPresenterStatics.ABI::class)
@Signature("{e27ba947-f8a5-5869-9a71-cd514d41c623}")
@Guid("e27ba947f8a558699a71cd514d41c623")
@WinRTInterface("e27ba947f8a558699a71cd514d41c623")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollPresenterStatics.ByReference::class)
public interface IScrollPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ContentProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ContentOrientationProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_HorizontalScrollChainModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_VerticalScrollChainModeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_HorizontalScrollRailModeProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_VerticalScrollRailModeProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_HorizontalScrollModeProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_VerticalScrollModeProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ComputedHorizontalScrollModeProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_ComputedVerticalScrollModeProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_ZoomChainModeProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_ZoomModeProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_IgnoredInputKindsProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_MinZoomFactorProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_MaxZoomFactorProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_HorizontalAnchorRatioProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_VerticalAnchorRatioProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollPresenterStatics> {
    public override fun getValue() = ABI.makeIScrollPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IScrollPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollPresenterStatics {
    public val __537339515_Ptr: Pointer?

    public val _537339515_VtblPtr: Pointer?
      get() = __537339515_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContentOrientationProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HorizontalScrollChainModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VerticalScrollChainModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HorizontalScrollRailModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_VerticalScrollRailModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_HorizontalScrollModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_VerticalScrollModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ComputedHorizontalScrollModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ComputedVerticalScrollModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ZoomChainModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_ZoomModeProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_IgnoredInputKindsProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_MinZoomFactorProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_MaxZoomFactorProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_HorizontalAnchorRatioProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_VerticalAnchorRatioProperty(): DependencyProperty? {
      val fnPtr = _537339515_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__537339515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScrollPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __537339515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e27ba947f8a558699a71cd514d41c623")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollPresenterStatics(ptr: Pointer?): WithDefault =
        IScrollPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIScrollPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IScrollPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__537339515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollPresenterStatics): Array<IScrollPresenterStatics?>
        = (elements as
        Array<IScrollPresenterStatics?>).castToImpl<IScrollPresenterStatics,IScrollPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollPresenterStatics?> =
        arrayOfNulls<IScrollPresenterStatics_Impl>(size) as Array<IScrollPresenterStatics?>
  }
}
