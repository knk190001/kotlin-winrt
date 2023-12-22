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

@ABIMarker(IVector3NaturalMotionAnimationFactory.ABI::class)
@Signature("{428241cb-be9c-5c2a-939c-ec78aa60bb8a}")
@Guid("428241cbbe9c5c2a939cec78aa60bb8a")
@WinRTInterface("428241cbbe9c5c2a939cec78aa60bb8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector3NaturalMotionAnimationFactory.ByReference::class)
public interface IVector3NaturalMotionAnimationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector3NaturalMotionAnimationFactory> {
    public override fun getValue() =
        ABI.makeIVector3NaturalMotionAnimationFactory(pointer.getPointer(0))

    public fun setValue(value: IVector3NaturalMotionAnimationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector3NaturalMotionAnimationFactory {
    public val __1742851474_Ptr: Pointer?

    public val _1742851474_VtblPtr: Pointer?
      get() = __1742851474_Ptr?.getPointer(0)
  }

  public class IVector3NaturalMotionAnimationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1742851474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector3NaturalMotionAnimationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("428241cbbe9c5c2a939cec78aa60bb8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector3NaturalMotionAnimationFactory(ptr: Pointer?): WithDefault =
        IVector3NaturalMotionAnimationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector3NaturalMotionAnimationFactory {
      val address = segment.toRawLongValue()
      return makeIVector3NaturalMotionAnimationFactory(Pointer(address))
    }

    public override fun toNative(obj: IVector3NaturalMotionAnimationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1742851474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector3NaturalMotionAnimationFactory):
        Array<IVector3NaturalMotionAnimationFactory?> = (elements as
        Array<IVector3NaturalMotionAnimationFactory?>).castToImpl<IVector3NaturalMotionAnimationFactory,IVector3NaturalMotionAnimationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector3NaturalMotionAnimationFactory?> =
        arrayOfNulls<IVector3NaturalMotionAnimationFactory_Impl>(size) as
        Array<IVector3NaturalMotionAnimationFactory?>
  }
}
