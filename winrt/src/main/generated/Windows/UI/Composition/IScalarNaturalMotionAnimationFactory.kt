package Windows.UI.Composition

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

@ABIMarker(IScalarNaturalMotionAnimationFactory.ABI::class)
@Signature("{835aa4fc-671c-41dd-af48-ae8def8b1529}")
@Guid("835aa4fc671c41ddaf48ae8def8b1529")
@WinRTInterface("835aa4fc671c41ddaf48ae8def8b1529")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScalarNaturalMotionAnimationFactory.ByReference::class)
public interface IScalarNaturalMotionAnimationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScalarNaturalMotionAnimationFactory> {
    public override fun getValue() =
        ABI.makeIScalarNaturalMotionAnimationFactory(pointer.getPointer(0))

    public fun setValue(value: IScalarNaturalMotionAnimationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScalarNaturalMotionAnimationFactory {
    public val __206014795_Ptr: Pointer?

    public val _206014795_VtblPtr: Pointer?
      get() = __206014795_Ptr?.getPointer(0)
  }

  public class IScalarNaturalMotionAnimationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __206014795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScalarNaturalMotionAnimationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("835aa4fc671c41ddaf48ae8def8b1529")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScalarNaturalMotionAnimationFactory(ptr: Pointer?): WithDefault =
        IScalarNaturalMotionAnimationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScalarNaturalMotionAnimationFactory {
      val address = segment.toRawLongValue()
      return makeIScalarNaturalMotionAnimationFactory(Pointer(address))
    }

    public override fun toNative(obj: IScalarNaturalMotionAnimationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__206014795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScalarNaturalMotionAnimationFactory):
        Array<IScalarNaturalMotionAnimationFactory?> = (elements as
        Array<IScalarNaturalMotionAnimationFactory?>).castToImpl<IScalarNaturalMotionAnimationFactory,IScalarNaturalMotionAnimationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScalarNaturalMotionAnimationFactory?> =
        arrayOfNulls<IScalarNaturalMotionAnimationFactory_Impl>(size) as
        Array<IScalarNaturalMotionAnimationFactory?>
  }
}
