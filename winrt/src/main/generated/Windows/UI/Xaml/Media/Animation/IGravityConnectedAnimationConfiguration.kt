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

@ABIMarker(IGravityConnectedAnimationConfiguration.ABI::class)
@Signature("{c751a4b7-0459-5142-b891-aeaac1d41822}")
@Guid("c751a4b704595142b891aeaac1d41822")
@WinRTInterface("c751a4b704595142b891aeaac1d41822")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGravityConnectedAnimationConfiguration.ByReference::class)
public interface IGravityConnectedAnimationConfiguration : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGravityConnectedAnimationConfiguration> {
    public override fun getValue() =
        ABI.makeIGravityConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: IGravityConnectedAnimationConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGravityConnectedAnimationConfiguration {
    public val __2107830163_Ptr: Pointer?

    public val _2107830163_VtblPtr: Pointer?
      get() = __2107830163_Ptr?.getPointer(0)
  }

  public class IGravityConnectedAnimationConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2107830163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGravityConnectedAnimationConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c751a4b704595142b891aeaac1d41822")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGravityConnectedAnimationConfiguration(ptr: Pointer?): WithDefault =
        IGravityConnectedAnimationConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGravityConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return makeIGravityConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IGravityConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2107830163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGravityConnectedAnimationConfiguration):
        Array<IGravityConnectedAnimationConfiguration?> = (elements as
        Array<IGravityConnectedAnimationConfiguration?>).castToImpl<IGravityConnectedAnimationConfiguration,IGravityConnectedAnimationConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGravityConnectedAnimationConfiguration?> =
        arrayOfNulls<IGravityConnectedAnimationConfiguration_Impl>(size) as
        Array<IGravityConnectedAnimationConfiguration?>
  }
}
