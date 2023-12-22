package Microsoft.UI.Composition

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

@ABIMarker(INaturalMotionAnimationFactory.ABI::class)
@Signature("{0411a259-2622-59e2-a59e-1e23d8f83a9f}")
@Guid("0411a259262259e2a59e1e23d8f83a9f")
@WinRTInterface("0411a259262259e2a59e1e23d8f83a9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INaturalMotionAnimationFactory.ByReference::class)
public interface INaturalMotionAnimationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INaturalMotionAnimationFactory> {
    public override fun getValue() = ABI.makeINaturalMotionAnimationFactory(pointer.getPointer(0))

    public fun setValue(value: INaturalMotionAnimationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INaturalMotionAnimationFactory {
    public val __1605987636_Ptr: Pointer?

    public val _1605987636_VtblPtr: Pointer?
      get() = __1605987636_Ptr?.getPointer(0)
  }

  public class INaturalMotionAnimationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1605987636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INaturalMotionAnimationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0411a259262259e2a59e1e23d8f83a9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINaturalMotionAnimationFactory(ptr: Pointer?): WithDefault =
        INaturalMotionAnimationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INaturalMotionAnimationFactory {
      val address = segment.toRawLongValue()
      return makeINaturalMotionAnimationFactory(Pointer(address))
    }

    public override fun toNative(obj: INaturalMotionAnimationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1605987636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INaturalMotionAnimationFactory):
        Array<INaturalMotionAnimationFactory?> = (elements as
        Array<INaturalMotionAnimationFactory?>).castToImpl<INaturalMotionAnimationFactory,INaturalMotionAnimationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INaturalMotionAnimationFactory?> =
        arrayOfNulls<INaturalMotionAnimationFactory_Impl>(size) as
        Array<INaturalMotionAnimationFactory?>
  }
}
