package Windows.Graphics.Effects

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

@ABIMarker(IGraphicsEffectSource.ABI::class)
@Signature("{2d8f9ddc-4339-4eb9-9216-f9deb75658a2}")
@Guid("2d8f9ddc43394eb99216f9deb75658a2")
@WinRTInterface("2d8f9ddc43394eb99216f9deb75658a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsEffectSource.ByReference::class)
public interface IGraphicsEffectSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsEffectSource> {
    public override fun getValue() = ABI.makeIGraphicsEffectSource(pointer.getPointer(0))

    public fun setValue(value: IGraphicsEffectSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsEffectSource {
    public val __568797846_Ptr: Pointer?

    public val _568797846_VtblPtr: Pointer?
      get() = __568797846_Ptr?.getPointer(0)
  }

  public class IGraphicsEffectSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __568797846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsEffectSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d8f9ddc43394eb99216f9deb75658a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsEffectSource(ptr: Pointer?): WithDefault =
        IGraphicsEffectSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsEffectSource {
      val address = segment.toRawLongValue()
      return makeIGraphicsEffectSource(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsEffectSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__568797846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsEffectSource): Array<IGraphicsEffectSource?> =
        (elements as
        Array<IGraphicsEffectSource?>).castToImpl<IGraphicsEffectSource,IGraphicsEffectSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsEffectSource?> =
        arrayOfNulls<IGraphicsEffectSource_Impl>(size) as Array<IGraphicsEffectSource?>
  }
}
