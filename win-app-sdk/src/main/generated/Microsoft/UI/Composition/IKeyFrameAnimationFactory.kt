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

@ABIMarker(IKeyFrameAnimationFactory.ABI::class)
@Signature("{7cccfc87-3baf-5100-b5f8-2f779f954f19}")
@Guid("7cccfc873baf5100b5f82f779f954f19")
@WinRTInterface("7cccfc873baf5100b5f82f779f954f19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyFrameAnimationFactory.ByReference::class)
public interface IKeyFrameAnimationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyFrameAnimationFactory> {
    public override fun getValue() = ABI.makeIKeyFrameAnimationFactory(pointer.getPointer(0))

    public fun setValue(value: IKeyFrameAnimationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyFrameAnimationFactory {
    public val __152233069_Ptr: Pointer?

    public val _152233069_VtblPtr: Pointer?
      get() = __152233069_Ptr?.getPointer(0)
  }

  public class IKeyFrameAnimationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152233069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyFrameAnimationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7cccfc873baf5100b5f82f779f954f19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyFrameAnimationFactory(ptr: Pointer?): WithDefault =
        IKeyFrameAnimationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyFrameAnimationFactory {
      val address = segment.toRawLongValue()
      return makeIKeyFrameAnimationFactory(Pointer(address))
    }

    public override fun toNative(obj: IKeyFrameAnimationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152233069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyFrameAnimationFactory):
        Array<IKeyFrameAnimationFactory?> = (elements as
        Array<IKeyFrameAnimationFactory?>).castToImpl<IKeyFrameAnimationFactory,IKeyFrameAnimationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyFrameAnimationFactory?> =
        arrayOfNulls<IKeyFrameAnimationFactory_Impl>(size) as Array<IKeyFrameAnimationFactory?>
  }
}
