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

@ABIMarker(IFlyoutBaseStatics5.ABI::class)
@Signature("{69edb25c-992a-542b-bcff-2f7f855523bd}")
@Guid("69edb25c992a542bbcff2f7f855523bd")
@WinRTInterface("69edb25c992a542bbcff2f7f855523bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseStatics5.ByReference::class)
public interface IFlyoutBaseStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ShowModeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_InputDevicePrefersPrimaryCommandsProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AreOpenCloseAnimationsEnabledProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsOpenProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseStatics5> {
    public override fun getValue() = ABI.makeIFlyoutBaseStatics5(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseStatics5 {
    public val __1942908024_Ptr: Pointer?

    public val _1942908024_VtblPtr: Pointer?
      get() = __1942908024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetProperty(): DependencyProperty? {
      val fnPtr = _1942908024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShowModeProperty(): DependencyProperty? {
      val fnPtr = _1942908024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InputDevicePrefersPrimaryCommandsProperty(): DependencyProperty? {
      val fnPtr = _1942908024_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AreOpenCloseAnimationsEnabledProperty(): DependencyProperty? {
      val fnPtr = _1942908024_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _1942908024_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1942908024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutBaseStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942908024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69edb25c992a542bbcff2f7f855523bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseStatics5(ptr: Pointer?): WithDefault = IFlyoutBaseStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseStatics5 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseStatics5(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942908024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseStatics5): Array<IFlyoutBaseStatics5?> =
        (elements as
        Array<IFlyoutBaseStatics5?>).castToImpl<IFlyoutBaseStatics5,IFlyoutBaseStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseStatics5?> =
        arrayOfNulls<IFlyoutBaseStatics5_Impl>(size) as Array<IFlyoutBaseStatics5?>
  }
}
