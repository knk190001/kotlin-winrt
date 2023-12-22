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

@ABIMarker(IDatePickerFlyoutItemStatics.ABI::class)
@Signature("{da7140fc-5613-5ab2-9aab-36cf396ef56c}")
@Guid("da7140fc56135ab29aab36cf396ef56c")
@WinRTInterface("da7140fc56135ab29aab36cf396ef56c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutItemStatics.ByReference::class)
public interface IDatePickerFlyoutItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryTextProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SecondaryTextProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutItemStatics> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutItemStatics(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutItemStatics {
    public val __1028909972_Ptr: Pointer?

    public val _1028909972_VtblPtr: Pointer?
      get() = __1028909972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryTextProperty(): DependencyProperty? {
      val fnPtr = _1028909972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1028909972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SecondaryTextProperty(): DependencyProperty? {
      val fnPtr = _1028909972_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1028909972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFlyoutItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1028909972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da7140fc56135ab29aab36cf396ef56c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutItemStatics(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutItemStatics {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1028909972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutItemStatics):
        Array<IDatePickerFlyoutItemStatics?> = (elements as
        Array<IDatePickerFlyoutItemStatics?>).castToImpl<IDatePickerFlyoutItemStatics,IDatePickerFlyoutItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutItemStatics?> =
        arrayOfNulls<IDatePickerFlyoutItemStatics_Impl>(size) as
        Array<IDatePickerFlyoutItemStatics?>
  }
}
