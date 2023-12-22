package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IFlyoutBaseStatics2.ABI::class)
@Signature("{a8e913fe-2d60-4307-aad9-56b450121b58}")
@Guid("a8e913fe2d604307aad956b450121b58")
@WinRTInterface("a8e913fe2d604307aad956b450121b58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseStatics2.ByReference::class)
public interface IFlyoutBaseStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowFocusOnInteractionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AllowFocusWhenDisabledProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ElementSoundModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseStatics2> {
    public override fun getValue() = ABI.makeIFlyoutBaseStatics2(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseStatics2 {
    public val __1942908021_Ptr: Pointer?

    public val _1942908021_VtblPtr: Pointer?
      get() = __1942908021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowFocusOnInteractionProperty(): DependencyProperty? {
      val fnPtr = _1942908021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1942908021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AllowFocusWhenDisabledProperty(): DependencyProperty? {
      val fnPtr = _1942908021_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ElementSoundModeProperty(): DependencyProperty? {
      val fnPtr = _1942908021_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutBaseStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942908021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8e913fe2d604307aad956b450121b58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseStatics2(ptr: Pointer?): WithDefault = IFlyoutBaseStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseStatics2 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942908021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseStatics2): Array<IFlyoutBaseStatics2?> =
        (elements as
        Array<IFlyoutBaseStatics2?>).castToImpl<IFlyoutBaseStatics2,IFlyoutBaseStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseStatics2?> =
        arrayOfNulls<IFlyoutBaseStatics2_Impl>(size) as Array<IFlyoutBaseStatics2?>
  }
}
