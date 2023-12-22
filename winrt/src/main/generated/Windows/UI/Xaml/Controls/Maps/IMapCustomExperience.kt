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

@ABIMarker(IMapCustomExperience.ABI::class)
@Signature("{64592866-14a3-4e5f-8883-8e9c500eeede}")
@Guid("6459286614a34e5f88838e9c500eeede")
@WinRTInterface("6459286614a34e5f88838e9c500eeede")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapCustomExperience.ByReference::class)
public interface IMapCustomExperience : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapCustomExperience> {
    public override fun getValue() = ABI.makeIMapCustomExperience(pointer.getPointer(0))

    public fun setValue(value: IMapCustomExperience_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapCustomExperience {
    public val __1533476794_Ptr: Pointer?

    public val _1533476794_VtblPtr: Pointer?
      get() = __1533476794_Ptr?.getPointer(0)
  }

  public class IMapCustomExperience_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1533476794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapCustomExperience, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6459286614a34e5f88838e9c500eeede")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapCustomExperience(ptr: Pointer?): WithDefault = IMapCustomExperience_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapCustomExperience {
      val address = segment.toRawLongValue()
      return makeIMapCustomExperience(Pointer(address))
    }

    public override fun toNative(obj: IMapCustomExperience): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1533476794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapCustomExperience): Array<IMapCustomExperience?> =
        (elements as
        Array<IMapCustomExperience?>).castToImpl<IMapCustomExperience,IMapCustomExperience_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapCustomExperience?> =
        arrayOfNulls<IMapCustomExperience_Impl>(size) as Array<IMapCustomExperience?>
  }
}
