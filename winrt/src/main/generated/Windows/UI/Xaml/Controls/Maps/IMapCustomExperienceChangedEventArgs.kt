package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapCustomExperienceChangedEventArgs.ABI::class)
@Signature("{b9e6fb9b-8fc1-4042-ac34-a61b38bb7514}")
@Guid("b9e6fb9b8fc14042ac34a61b38bb7514")
@WinRTInterface("b9e6fb9b8fc14042ac34a61b38bb7514")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapCustomExperienceChangedEventArgs.ByReference::class)
public interface IMapCustomExperienceChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapCustomExperienceChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMapCustomExperienceChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapCustomExperienceChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapCustomExperienceChangedEventArgs {
    public val __1184933207_Ptr: Pointer?

    public val _1184933207_VtblPtr: Pointer?
      get() = __1184933207_Ptr?.getPointer(0)
  }

  public class IMapCustomExperienceChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1184933207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapCustomExperienceChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9e6fb9b8fc14042ac34a61b38bb7514")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapCustomExperienceChangedEventArgs(ptr: Pointer?): WithDefault =
        IMapCustomExperienceChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapCustomExperienceChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapCustomExperienceChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapCustomExperienceChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1184933207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapCustomExperienceChangedEventArgs):
        Array<IMapCustomExperienceChangedEventArgs?> = (elements as
        Array<IMapCustomExperienceChangedEventArgs?>).castToImpl<IMapCustomExperienceChangedEventArgs,IMapCustomExperienceChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapCustomExperienceChangedEventArgs?> =
        arrayOfNulls<IMapCustomExperienceChangedEventArgs_Impl>(size) as
        Array<IMapCustomExperienceChangedEventArgs?>
  }
}
