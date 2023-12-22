package Windows.UI.Xaml

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IFrameworkElement4.ABI::class)
@Signature("{6b765bb3-fba3-4404-bdee-1a45d1ca5f21}")
@Guid("6b765bb3fba34404bdee1a45d1ca5f21")
@WinRTInterface("6b765bb3fba34404bdee1a45d1ca5f21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement4.ByReference::class)
public interface IFrameworkElement4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowFocusOnInteraction(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowFocusOnInteraction(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_FocusVisualMargin(): Thickness?

  @InterfaceMethod(3)
  public fun put_FocusVisualMargin(value: Thickness?): Unit

  @InterfaceMethod(4)
  public fun get_FocusVisualSecondaryThickness(): Thickness?

  @InterfaceMethod(5)
  public fun put_FocusVisualSecondaryThickness(value: Thickness?): Unit

  @InterfaceMethod(6)
  public fun get_FocusVisualPrimaryThickness(): Thickness?

  @InterfaceMethod(7)
  public fun put_FocusVisualPrimaryThickness(value: Thickness?): Unit

  @InterfaceMethod(8)
  public fun get_FocusVisualSecondaryBrush(): Brush?

  @InterfaceMethod(9)
  public fun put_FocusVisualSecondaryBrush(value: Brush?): Unit

  @InterfaceMethod(10)
  public fun get_FocusVisualPrimaryBrush(): Brush?

  @InterfaceMethod(11)
  public fun put_FocusVisualPrimaryBrush(value: Brush?): Unit

  @InterfaceMethod(12)
  public fun get_AllowFocusWhenDisabled(): Boolean

  @InterfaceMethod(13)
  public fun put_AllowFocusWhenDisabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement4> {
    public override fun getValue() = ABI.makeIFrameworkElement4(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement4 {
    public val __329359556_Ptr: Pointer?

    public val _329359556_VtblPtr: Pointer?
      get() = __329359556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowFocusOnInteraction(): Boolean {
      val fnPtr = _329359556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowFocusOnInteraction(value: Boolean): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FocusVisualMargin(): Thickness? {
      val fnPtr = _329359556_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FocusVisualMargin(value: Thickness?): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FocusVisualSecondaryThickness(): Thickness? {
      val fnPtr = _329359556_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FocusVisualSecondaryThickness(value: Thickness?): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FocusVisualPrimaryThickness(): Thickness? {
      val fnPtr = _329359556_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FocusVisualPrimaryThickness(value: Thickness?): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FocusVisualSecondaryBrush(): Brush? {
      val fnPtr = _329359556_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FocusVisualSecondaryBrush(value: Brush?): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_FocusVisualPrimaryBrush(): Brush? {
      val fnPtr = _329359556_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_FocusVisualPrimaryBrush(value: Brush?): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AllowFocusWhenDisabled(): Boolean {
      val fnPtr = _329359556_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_AllowFocusWhenDisabled(value: Boolean): Unit {
      val fnPtr = _329359556_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359556_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElement4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329359556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b765bb3fba34404bdee1a45d1ca5f21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement4(ptr: Pointer?): WithDefault = IFrameworkElement4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement4 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement4(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329359556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement4): Array<IFrameworkElement4?> =
        (elements as
        Array<IFrameworkElement4?>).castToImpl<IFrameworkElement4,IFrameworkElement4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement4?> =
        arrayOfNulls<IFrameworkElement4_Impl>(size) as Array<IFrameworkElement4?>
  }
}
