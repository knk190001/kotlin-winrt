package Windows.UI.Xaml.Documents

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITypography.ABI::class)
@Signature("{866f65d5-ea97-42ab-9288-9c01aebc7a97}")
@Guid("866f65d5ea9742ab92889c01aebc7a97")
@WinRTInterface("866f65d5ea9742ab92889c01aebc7a97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITypography.ByReference::class)
public interface ITypography : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITypography> {
    public override fun getValue() = ABI.makeITypography(pointer.getPointer(0))

    public fun setValue(value: ITypography_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITypography {
    public val __980097367_Ptr: Pointer?

    public val _980097367_VtblPtr: Pointer?
      get() = __980097367_Ptr?.getPointer(0)
  }

  public class ITypography_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __980097367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITypography, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("866f65d5ea9742ab92889c01aebc7a97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITypography(ptr: Pointer?): WithDefault = ITypography_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITypography {
      val address = segment.toRawLongValue()
      return makeITypography(Pointer(address))
    }

    public override fun toNative(obj: ITypography): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__980097367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITypography): Array<ITypography?> = (elements as
        Array<ITypography?>).castToImpl<ITypography,ITypography_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITypography?> =
        arrayOfNulls<ITypography_Impl>(size) as Array<ITypography?>
  }
}
