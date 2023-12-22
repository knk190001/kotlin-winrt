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

@ABIMarker(IPopupStatics2.ABI::class)
@Signature("{2b9ae9ec-55ef-43b6-b459-12e40ffa4302}")
@Guid("2b9ae9ec55ef43b6b45912e40ffa4302")
@WinRTInterface("2b9ae9ec55ef43b6b45912e40ffa4302")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupStatics2.ByReference::class)
public interface IPopupStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopupStatics2>
      {
    public override fun getValue() = ABI.makeIPopupStatics2(pointer.getPointer(0))

    public fun setValue(value: IPopupStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupStatics2 {
    public val __1440539523_Ptr: Pointer?

    public val _1440539523_VtblPtr: Pointer?
      get() = __1440539523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1440539523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1440539523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopupStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1440539523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b9ae9ec55ef43b6b45912e40ffa4302")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupStatics2(ptr: Pointer?): WithDefault = IPopupStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupStatics2 {
      val address = segment.toRawLongValue()
      return makeIPopupStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPopupStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1440539523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupStatics2): Array<IPopupStatics2?> = (elements as
        Array<IPopupStatics2?>).castToImpl<IPopupStatics2,IPopupStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupStatics2?> =
        arrayOfNulls<IPopupStatics2_Impl>(size) as Array<IPopupStatics2?>
  }
}
