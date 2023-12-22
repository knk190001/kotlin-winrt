package Microsoft.UI

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

@ABIMarker(IColors.ABI::class)
@Signature("{8cf15863-8411-5afd-946c-328e04da2f2f}")
@Guid("8cf1586384115afd946c328e04da2f2f")
@WinRTInterface("8cf1586384115afd946c328e04da2f2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColors.ByReference::class)
public interface IColors : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColors> {
    public override fun getValue() = ABI.makeIColors(pointer.getPointer(0))

    public fun setValue(value: IColors_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColors {
    public val __836521755_Ptr: Pointer?

    public val _836521755_VtblPtr: Pointer?
      get() = __836521755_Ptr?.getPointer(0)
  }

  public class IColors_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __836521755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColors, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cf1586384115afd946c328e04da2f2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColors(ptr: Pointer?): WithDefault = IColors_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColors {
      val address = segment.toRawLongValue()
      return makeIColors(Pointer(address))
    }

    public override fun toNative(obj: IColors): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__836521755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColors): Array<IColors?> = (elements as
        Array<IColors?>).castToImpl<IColors,IColors_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColors?> = arrayOfNulls<IColors_Impl>(size) as
        Array<IColors?>
  }
}
