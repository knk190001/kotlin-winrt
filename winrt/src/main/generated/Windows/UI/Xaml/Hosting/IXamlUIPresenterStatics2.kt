package Windows.UI.Xaml.Hosting

import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode
import Windows.UI.Xaml.FrameworkElement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlUIPresenterStatics2.ABI::class)
@Signature("{5c6b68d2-cf1c-4f53-bf09-6a745f7a9703}")
@Guid("5c6b68d2cf1c4f53bf096a745f7a9703")
@WinRTInterface("5c6b68d2cf1c4f53bf096a745f7a9703")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUIPresenterStatics2.ByReference::class)
public interface IXamlUIPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFlyoutPlacementTargetInfo(
    placementTarget: FrameworkElement?,
    preferredPlacement: FlyoutPlacementMode?,
    targetPreferredPlacement: Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode.ByReference?,
    allowFallbacks: Boolean
  ): Rect?

  @InterfaceMethod(1)
  public fun GetFlyoutPlacement(
    placementTargetBounds: Rect?,
    controlSize: Size?,
    minControlSize: Size?,
    containerRect: Rect?,
    targetPreferredPlacement: FlyoutPlacementMode?,
    allowFallbacks: Boolean,
    chosenPlacement: Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode.ByReference?
  ): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUIPresenterStatics2> {
    public override fun getValue() = ABI.makeIXamlUIPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IXamlUIPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUIPresenterStatics2 {
    public val __240601075_Ptr: Pointer?

    public val _240601075_VtblPtr: Pointer?
      get() = __240601075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFlyoutPlacementTargetInfo(
      placementTarget: FrameworkElement?,
      preferredPlacement: FlyoutPlacementMode?,
      targetPreferredPlacement: Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode.ByReference?,
      allowFallbacks: Boolean
    ): Rect? {
      val fnPtr = _240601075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__240601075_Ptr, marshalToNative(placementTarget),
          marshalToNative(preferredPlacement), marshalToNative(targetPreferredPlacement),
          allowFallbacks, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFlyoutPlacement(
      placementTargetBounds: Rect?,
      controlSize: Size?,
      minControlSize: Size?,
      containerRect: Rect?,
      targetPreferredPlacement: FlyoutPlacementMode?,
      allowFallbacks: Boolean,
      chosenPlacement: Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode.ByReference?
    ): Rect? {
      val fnPtr = _240601075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__240601075_Ptr, marshalToNative(placementTargetBounds),
          marshalToNative(controlSize), marshalToNative(minControlSize),
          marshalToNative(containerRect), marshalToNative(targetPreferredPlacement), allowFallbacks,
          marshalToNative(chosenPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IXamlUIPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __240601075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUIPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c6b68d2cf1c4f53bf096a745f7a9703")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUIPresenterStatics2(ptr: Pointer?): WithDefault =
        IXamlUIPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUIPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIXamlUIPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IXamlUIPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__240601075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUIPresenterStatics2):
        Array<IXamlUIPresenterStatics2?> = (elements as
        Array<IXamlUIPresenterStatics2?>).castToImpl<IXamlUIPresenterStatics2,IXamlUIPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUIPresenterStatics2?> =
        arrayOfNulls<IXamlUIPresenterStatics2_Impl>(size) as Array<IXamlUIPresenterStatics2?>
  }
}
