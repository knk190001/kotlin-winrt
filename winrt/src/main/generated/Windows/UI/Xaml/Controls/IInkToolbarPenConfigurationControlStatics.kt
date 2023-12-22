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

@ABIMarker(IInkToolbarPenConfigurationControlStatics.ABI::class)
@Signature("{48a61bef-19ce-41bb-abe0-7c8726fae75e}")
@Guid("48a61bef19ce41bbabe07c8726fae75e")
@WinRTInterface("48a61bef19ce41bbabe07c8726fae75e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPenConfigurationControlStatics.ByReference::class)
public interface IInkToolbarPenConfigurationControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PenButtonProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPenConfigurationControlStatics> {
    public override fun getValue() =
        ABI.makeIInkToolbarPenConfigurationControlStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPenConfigurationControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPenConfigurationControlStatics {
    public val __1065044074_Ptr: Pointer?

    public val _1065044074_VtblPtr: Pointer?
      get() = __1065044074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PenButtonProperty(): DependencyProperty? {
      val fnPtr = _1065044074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1065044074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarPenConfigurationControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1065044074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPenConfigurationControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48a61bef19ce41bbabe07c8726fae75e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPenConfigurationControlStatics(ptr: Pointer?): WithDefault =
        IInkToolbarPenConfigurationControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInkToolbarPenConfigurationControlStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPenConfigurationControlStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPenConfigurationControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1065044074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPenConfigurationControlStatics):
        Array<IInkToolbarPenConfigurationControlStatics?> = (elements as
        Array<IInkToolbarPenConfigurationControlStatics?>).castToImpl<IInkToolbarPenConfigurationControlStatics,IInkToolbarPenConfigurationControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPenConfigurationControlStatics?> =
        arrayOfNulls<IInkToolbarPenConfigurationControlStatics_Impl>(size) as
        Array<IInkToolbarPenConfigurationControlStatics?>
  }
}
