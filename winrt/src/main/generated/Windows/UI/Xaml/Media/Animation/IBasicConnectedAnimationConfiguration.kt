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

@ABIMarker(IBasicConnectedAnimationConfiguration.ABI::class)
@Signature("{e675f9b5-a4d6-5353-83e6-c89e7cf8d456}")
@Guid("e675f9b5a4d6535383e6c89e7cf8d456")
@WinRTInterface("e675f9b5a4d6535383e6c89e7cf8d456")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBasicConnectedAnimationConfiguration.ByReference::class)
public interface IBasicConnectedAnimationConfiguration : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBasicConnectedAnimationConfiguration> {
    public override fun getValue() =
        ABI.makeIBasicConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: IBasicConnectedAnimationConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBasicConnectedAnimationConfiguration {
    public val __360119091_Ptr: Pointer?

    public val _360119091_VtblPtr: Pointer?
      get() = __360119091_Ptr?.getPointer(0)
  }

  public class IBasicConnectedAnimationConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __360119091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBasicConnectedAnimationConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e675f9b5a4d6535383e6c89e7cf8d456")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBasicConnectedAnimationConfiguration(ptr: Pointer?): WithDefault =
        IBasicConnectedAnimationConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBasicConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return makeIBasicConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IBasicConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__360119091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBasicConnectedAnimationConfiguration):
        Array<IBasicConnectedAnimationConfiguration?> = (elements as
        Array<IBasicConnectedAnimationConfiguration?>).castToImpl<IBasicConnectedAnimationConfiguration,IBasicConnectedAnimationConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBasicConnectedAnimationConfiguration?> =
        arrayOfNulls<IBasicConnectedAnimationConfiguration_Impl>(size) as
        Array<IBasicConnectedAnimationConfiguration?>
  }
}
