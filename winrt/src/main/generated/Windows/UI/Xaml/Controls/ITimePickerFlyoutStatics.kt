package Windows.UI.Xaml.Controls

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

@ABIMarker(ITimePickerFlyoutStatics.ABI::class)
@Signature("{3f6728ce-2169-4003-b4a8-8de7035a0ad6}")
@Guid("3f6728ce21694003b4a88de7035a0ad6")
@WinRTInterface("3f6728ce21694003b4a88de7035a0ad6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerFlyoutStatics.ByReference::class)
public interface ITimePickerFlyoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClockIdentifierProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TimeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MinuteIncrementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerFlyoutStatics> {
    public override fun getValue() = ABI.makeITimePickerFlyoutStatics(pointer.getPointer(0))

    public fun setValue(value: ITimePickerFlyoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerFlyoutStatics {
    public val __1557016499_Ptr: Pointer?

    public val _1557016499_VtblPtr: Pointer?
      get() = __1557016499_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClockIdentifierProperty(): DependencyProperty? {
      val fnPtr = _1557016499_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1557016499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TimeProperty(): DependencyProperty? {
      val fnPtr = _1557016499_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1557016499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinuteIncrementProperty(): DependencyProperty? {
      val fnPtr = _1557016499_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1557016499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerFlyoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1557016499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerFlyoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f6728ce21694003b4a88de7035a0ad6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerFlyoutStatics(ptr: Pointer?): WithDefault =
        ITimePickerFlyoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerFlyoutStatics {
      val address = segment.toRawLongValue()
      return makeITimePickerFlyoutStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerFlyoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1557016499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerFlyoutStatics):
        Array<ITimePickerFlyoutStatics?> = (elements as
        Array<ITimePickerFlyoutStatics?>).castToImpl<ITimePickerFlyoutStatics,ITimePickerFlyoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerFlyoutStatics?> =
        arrayOfNulls<ITimePickerFlyoutStatics_Impl>(size) as Array<ITimePickerFlyoutStatics?>
  }
}
