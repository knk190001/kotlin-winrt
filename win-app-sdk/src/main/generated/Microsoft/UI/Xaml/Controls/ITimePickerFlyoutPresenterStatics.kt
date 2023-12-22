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

@ABIMarker(ITimePickerFlyoutPresenterStatics.ABI::class)
@Signature("{0cd9d57d-970f-5df3-b2af-49cff489675e}")
@Guid("0cd9d57d970f5df3b2af49cff489675e")
@WinRTInterface("0cd9d57d970f5df3b2af49cff489675e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerFlyoutPresenterStatics.ByReference::class)
public interface ITimePickerFlyoutPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerFlyoutPresenterStatics> {
    public override fun getValue() =
        ABI.makeITimePickerFlyoutPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: ITimePickerFlyoutPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerFlyoutPresenterStatics {
    public val __809068922_Ptr: Pointer?

    public val _809068922_VtblPtr: Pointer?
      get() = __809068922_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabledProperty(): DependencyProperty? {
      val fnPtr = _809068922_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__809068922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerFlyoutPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __809068922_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerFlyoutPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cd9d57d970f5df3b2af49cff489675e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerFlyoutPresenterStatics(ptr: Pointer?): WithDefault =
        ITimePickerFlyoutPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerFlyoutPresenterStatics {
      val address = segment.toRawLongValue()
      return makeITimePickerFlyoutPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerFlyoutPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__809068922_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerFlyoutPresenterStatics):
        Array<ITimePickerFlyoutPresenterStatics?> = (elements as
        Array<ITimePickerFlyoutPresenterStatics?>).castToImpl<ITimePickerFlyoutPresenterStatics,ITimePickerFlyoutPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerFlyoutPresenterStatics?> =
        arrayOfNulls<ITimePickerFlyoutPresenterStatics_Impl>(size) as
        Array<ITimePickerFlyoutPresenterStatics?>
  }
}
