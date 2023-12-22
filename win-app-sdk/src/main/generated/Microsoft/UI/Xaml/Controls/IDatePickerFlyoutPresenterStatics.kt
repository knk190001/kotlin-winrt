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

@ABIMarker(IDatePickerFlyoutPresenterStatics.ABI::class)
@Signature("{611359b5-1aa8-528c-8e57-0378a9e71c57}")
@Guid("611359b51aa8528c8e570378a9e71c57")
@WinRTInterface("611359b51aa8528c8e570378a9e71c57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutPresenterStatics.ByReference::class)
public interface IDatePickerFlyoutPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutPresenterStatics> {
    public override fun getValue() =
        ABI.makeIDatePickerFlyoutPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutPresenterStatics {
    public val __178772699_Ptr: Pointer?

    public val _178772699_VtblPtr: Pointer?
      get() = __178772699_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabledProperty(): DependencyProperty? {
      val fnPtr = _178772699_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__178772699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFlyoutPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178772699_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("611359b51aa8528c8e570378a9e71c57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutPresenterStatics(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178772699_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutPresenterStatics):
        Array<IDatePickerFlyoutPresenterStatics?> = (elements as
        Array<IDatePickerFlyoutPresenterStatics?>).castToImpl<IDatePickerFlyoutPresenterStatics,IDatePickerFlyoutPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutPresenterStatics?> =
        arrayOfNulls<IDatePickerFlyoutPresenterStatics_Impl>(size) as
        Array<IDatePickerFlyoutPresenterStatics?>
  }
}
