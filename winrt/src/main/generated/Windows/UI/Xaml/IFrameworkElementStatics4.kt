package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElementStatics4.ABI::class)
@Signature("{9c41b155-c5d8-4663-bff2-d8d54fb5dbb3}")
@Guid("9c41b155c5d84663bff2d8d54fb5dbb3")
@WinRTInterface("9c41b155c5d84663bff2d8d54fb5dbb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementStatics4.ByReference::class)
public interface IFrameworkElementStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowFocusOnInteractionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FocusVisualMarginProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FocusVisualSecondaryThicknessProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FocusVisualPrimaryThicknessProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FocusVisualSecondaryBrushProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_FocusVisualPrimaryBrushProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_AllowFocusWhenDisabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementStatics4> {
    public override fun getValue() = ABI.makeIFrameworkElementStatics4(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementStatics4 {
    public val __1113717407_Ptr: Pointer?

    public val _1113717407_VtblPtr: Pointer?
      get() = __1113717407_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowFocusOnInteractionProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FocusVisualMarginProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FocusVisualSecondaryThicknessProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FocusVisualPrimaryThicknessProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FocusVisualSecondaryBrushProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_FocusVisualPrimaryBrushProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AllowFocusWhenDisabledProperty(): DependencyProperty? {
      val fnPtr = _1113717407_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1113717407_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c41b155c5d84663bff2d8d54fb5dbb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementStatics4(ptr: Pointer?): WithDefault =
        IFrameworkElementStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementStatics4 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementStatics4(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1113717407_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementStatics4):
        Array<IFrameworkElementStatics4?> = (elements as
        Array<IFrameworkElementStatics4?>).castToImpl<IFrameworkElementStatics4,IFrameworkElementStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementStatics4?> =
        arrayOfNulls<IFrameworkElementStatics4_Impl>(size) as Array<IFrameworkElementStatics4?>
  }
}
