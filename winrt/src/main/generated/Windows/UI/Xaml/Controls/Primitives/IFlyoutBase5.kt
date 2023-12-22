package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IFlyoutBase5.ABI::class)
@Signature("{ad3ec0c7-12bb-5a73-b78e-105192ca73d6}")
@Guid("ad3ec0c712bb5a73b78e105192ca73d6")
@WinRTInterface("ad3ec0c712bb5a73b78e105192ca73d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBase5.ByReference::class)
public interface IFlyoutBase5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowMode(): FlyoutShowMode?

  @InterfaceMethod(1)
  public fun put_ShowMode(value: FlyoutShowMode?): Unit

  @InterfaceMethod(2)
  public fun get_InputDevicePrefersPrimaryCommands(): Boolean

  @InterfaceMethod(3)
  public fun get_AreOpenCloseAnimationsEnabled(): Boolean

  @InterfaceMethod(4)
  public fun put_AreOpenCloseAnimationsEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(6)
  public fun ShowAt(placementTarget: DependencyObject?, showOptions: FlyoutShowOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutBase5> {
    public override fun getValue() = ABI.makeIFlyoutBase5(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBase5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBase5 {
    public val __1324150291_Ptr: Pointer?

    public val _1324150291_VtblPtr: Pointer?
      get() = __1324150291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowMode(): FlyoutShowMode? {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutShowMode>()
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutShowMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ShowMode(value: FlyoutShowMode?): Unit {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InputDevicePrefersPrimaryCommands(): Boolean {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_AreOpenCloseAnimationsEnabled(): Boolean {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_AreOpenCloseAnimationsEnabled(value: Boolean): Unit {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun ShowAt(placementTarget: DependencyObject?, showOptions: FlyoutShowOptions?):
        Unit {
      val fnPtr = _1324150291_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150291_Ptr, marshalToNative(placementTarget),
          marshalToNative(showOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBase5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324150291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBase5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad3ec0c712bb5a73b78e105192ca73d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBase5(ptr: Pointer?): WithDefault = IFlyoutBase5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBase5 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBase5(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBase5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324150291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBase5): Array<IFlyoutBase5?> = (elements as
        Array<IFlyoutBase5?>).castToImpl<IFlyoutBase5,IFlyoutBase5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBase5?> =
        arrayOfNulls<IFlyoutBase5_Impl>(size) as Array<IFlyoutBase5?>
  }
}
