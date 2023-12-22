package Windows.Perception.Spatial

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

@ABIMarker(ISpatialBoundingVolume.ABI::class)
@Signature("{fb2065da-68c3-33df-b7af-4c787207999c}")
@Guid("fb2065da68c333dfb7af4c787207999c")
@WinRTInterface("fb2065da68c333dfb7af4c787207999c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialBoundingVolume.ByReference::class)
public interface ISpatialBoundingVolume : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialBoundingVolume> {
    public override fun getValue() = ABI.makeISpatialBoundingVolume(pointer.getPointer(0))

    public fun setValue(value: ISpatialBoundingVolume_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialBoundingVolume {
    public val __678301473_Ptr: Pointer?

    public val _678301473_VtblPtr: Pointer?
      get() = __678301473_Ptr?.getPointer(0)
  }

  public class ISpatialBoundingVolume_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __678301473_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialBoundingVolume, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb2065da68c333dfb7af4c787207999c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialBoundingVolume(ptr: Pointer?): WithDefault =
        ISpatialBoundingVolume_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialBoundingVolume {
      val address = segment.toRawLongValue()
      return makeISpatialBoundingVolume(Pointer(address))
    }

    public override fun toNative(obj: ISpatialBoundingVolume): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__678301473_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialBoundingVolume): Array<ISpatialBoundingVolume?> =
        (elements as
        Array<ISpatialBoundingVolume?>).castToImpl<ISpatialBoundingVolume,ISpatialBoundingVolume_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialBoundingVolume?> =
        arrayOfNulls<ISpatialBoundingVolume_Impl>(size) as Array<ISpatialBoundingVolume?>
  }
}
