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

@ABIMarker(IVector2NaturalMotionAnimationFactory.ABI::class)
@Signature("{8c74ff61-0761-48a2-bddb-6afcc52b89d8}")
@Guid("8c74ff61076148a2bddb6afcc52b89d8")
@WinRTInterface("8c74ff61076148a2bddb6afcc52b89d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector2NaturalMotionAnimationFactory.ByReference::class)
public interface IVector2NaturalMotionAnimationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector2NaturalMotionAnimationFactory> {
    public override fun getValue() =
        ABI.makeIVector2NaturalMotionAnimationFactory(pointer.getPointer(0))

    public fun setValue(value: IVector2NaturalMotionAnimationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector2NaturalMotionAnimationFactory {
    public val __1148993508_Ptr: Pointer?

    public val _1148993508_VtblPtr: Pointer?
      get() = __1148993508_Ptr?.getPointer(0)
  }

  public class IVector2NaturalMotionAnimationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1148993508_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector2NaturalMotionAnimationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c74ff61076148a2bddb6afcc52b89d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector2NaturalMotionAnimationFactory(ptr: Pointer?): WithDefault =
        IVector2NaturalMotionAnimationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector2NaturalMotionAnimationFactory {
      val address = segment.toRawLongValue()
      return makeIVector2NaturalMotionAnimationFactory(Pointer(address))
    }

    public override fun toNative(obj: IVector2NaturalMotionAnimationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1148993508_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector2NaturalMotionAnimationFactory):
        Array<IVector2NaturalMotionAnimationFactory?> = (elements as
        Array<IVector2NaturalMotionAnimationFactory?>).castToImpl<IVector2NaturalMotionAnimationFactory,IVector2NaturalMotionAnimationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector2NaturalMotionAnimationFactory?> =
        arrayOfNulls<IVector2NaturalMotionAnimationFactory_Impl>(size) as
        Array<IVector2NaturalMotionAnimationFactory?>
  }
}
