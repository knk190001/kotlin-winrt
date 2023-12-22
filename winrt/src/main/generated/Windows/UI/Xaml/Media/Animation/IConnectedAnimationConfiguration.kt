package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IConnectedAnimationConfiguration.ABI::class)
@Signature("{00218aae-cd8c-5651-92a0-c1db95c03998}")
@Guid("00218aaecd8c565192a0c1db95c03998")
@WinRTInterface("00218aaecd8c565192a0c1db95c03998")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimationConfiguration.ByReference::class)
public interface IConnectedAnimationConfiguration : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimationConfiguration> {
    public override fun getValue() = ABI.makeIConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimationConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimationConfiguration {
    public val __1562698891_Ptr: Pointer?

    public val _1562698891_VtblPtr: Pointer?
      get() = __1562698891_Ptr?.getPointer(0)
  }

  public class IConnectedAnimationConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1562698891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimationConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00218aaecd8c565192a0c1db95c03998")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimationConfiguration(ptr: Pointer?): WithDefault =
        IConnectedAnimationConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1562698891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimationConfiguration):
        Array<IConnectedAnimationConfiguration?> = (elements as
        Array<IConnectedAnimationConfiguration?>).castToImpl<IConnectedAnimationConfiguration,IConnectedAnimationConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimationConfiguration?> =
        arrayOfNulls<IConnectedAnimationConfiguration_Impl>(size) as
        Array<IConnectedAnimationConfiguration?>
  }
}
