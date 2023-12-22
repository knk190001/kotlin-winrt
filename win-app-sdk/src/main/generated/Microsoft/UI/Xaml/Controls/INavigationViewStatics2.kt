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

@ABIMarker(INavigationViewStatics2.ABI::class)
@Signature("{79588150-4a1b-5e7c-9f8a-ebc814ce773d}")
@Guid("795881504a1b5e7c9f8aebc814ce773d")
@WinRTInterface("795881504a1b5e7c9f8aebc814ce773d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewStatics2.ByReference::class)
public interface INavigationViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBackButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsBackEnabledProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PaneTitleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PaneDisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PaneHeaderProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_PaneCustomContentProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ContentOverlayProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsPaneVisibleProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_SelectionFollowsFocusProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_ShoulderNavigationEnabledProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_OverflowLabelModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewStatics2> {
    public override fun getValue() = ABI.makeINavigationViewStatics2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewStatics2 {
    public val __645647987_Ptr: Pointer?

    public val _645647987_VtblPtr: Pointer?
      get() = __645647987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBackButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsBackEnabledProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PaneTitleProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PaneDisplayModeProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PaneHeaderProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PaneCustomContentProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ContentOverlayProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsPaneVisibleProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SelectionFollowsFocusProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ShoulderNavigationEnabledProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_OverflowLabelModeProperty(): DependencyProperty? {
      val fnPtr = _645647987_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__645647987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __645647987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("795881504a1b5e7c9f8aebc814ce773d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewStatics2(ptr: Pointer?): WithDefault =
        INavigationViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewStatics2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__645647987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewStatics2): Array<INavigationViewStatics2?>
        = (elements as
        Array<INavigationViewStatics2?>).castToImpl<INavigationViewStatics2,INavigationViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewStatics2?> =
        arrayOfNulls<INavigationViewStatics2_Impl>(size) as Array<INavigationViewStatics2?>
  }
}
