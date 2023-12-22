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

@ABIMarker(ICompositionObjectFactory.ABI::class)
@Signature("{6133c5f9-cd3b-56b2-876f-eb849db14911}")
@Guid("6133c5f9cd3b56b2876feb849db14911")
@WinRTInterface("6133c5f9cd3b56b2876feb849db14911")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionObjectFactory.ByReference::class)
public interface ICompositionObjectFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionObjectFactory> {
    public override fun getValue() = ABI.makeICompositionObjectFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionObjectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionObjectFactory {
    public val __685426778_Ptr: Pointer?

    public val _685426778_VtblPtr: Pointer?
      get() = __685426778_Ptr?.getPointer(0)
  }

  public class ICompositionObjectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __685426778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionObjectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6133c5f9cd3b56b2876feb849db14911")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionObjectFactory(ptr: Pointer?): WithDefault =
        ICompositionObjectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionObjectFactory {
      val address = segment.toRawLongValue()
      return makeICompositionObjectFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionObjectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__685426778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionObjectFactory):
        Array<ICompositionObjectFactory?> = (elements as
        Array<ICompositionObjectFactory?>).castToImpl<ICompositionObjectFactory,ICompositionObjectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionObjectFactory?> =
        arrayOfNulls<ICompositionObjectFactory_Impl>(size) as Array<ICompositionObjectFactory?>
  }
}
