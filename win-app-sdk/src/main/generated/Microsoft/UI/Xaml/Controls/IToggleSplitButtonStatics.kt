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

@ABIMarker(IToggleSplitButtonStatics.ABI::class)
@Signature("{801c9ca9-5b24-5b9e-a8d1-cff4b6e6857f}")
@Guid("801c9ca95b245b9ea8d1cff4b6e6857f")
@WinRTInterface("801c9ca95b245b9ea8d1cff4b6e6857f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSplitButtonStatics.ByReference::class)
public interface IToggleSplitButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCheckedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSplitButtonStatics> {
    public override fun getValue() = ABI.makeIToggleSplitButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IToggleSplitButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSplitButtonStatics {
    public val __1214105996_Ptr: Pointer?

    public val _1214105996_VtblPtr: Pointer?
      get() = __1214105996_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCheckedProperty(): DependencyProperty? {
      val fnPtr = _1214105996_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1214105996_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IToggleSplitButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1214105996_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSplitButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("801c9ca95b245b9ea8d1cff4b6e6857f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSplitButtonStatics(ptr: Pointer?): WithDefault =
        IToggleSplitButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSplitButtonStatics {
      val address = segment.toRawLongValue()
      return makeIToggleSplitButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IToggleSplitButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1214105996_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSplitButtonStatics):
        Array<IToggleSplitButtonStatics?> = (elements as
        Array<IToggleSplitButtonStatics?>).castToImpl<IToggleSplitButtonStatics,IToggleSplitButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSplitButtonStatics?> =
        arrayOfNulls<IToggleSplitButtonStatics_Impl>(size) as Array<IToggleSplitButtonStatics?>
  }
}
