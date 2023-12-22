package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ITransitionFactory.ABI::class)
@Signature("{b7023e3b-bcd3-50ec-aacf-8cfcece25f17}")
@Guid("b7023e3bbcd350ecaacf8cfcece25f17")
@WinRTInterface("b7023e3bbcd350ecaacf8cfcece25f17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransitionFactory.ByReference::class)
public interface ITransitionFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransitionFactory> {
    public override fun getValue() = ABI.makeITransitionFactory(pointer.getPointer(0))

    public fun setValue(value: ITransitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransitionFactory {
    public val __2005677734_Ptr: Pointer?

    public val _2005677734_VtblPtr: Pointer?
      get() = __2005677734_Ptr?.getPointer(0)
  }

  public class ITransitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2005677734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7023e3bbcd350ecaacf8cfcece25f17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransitionFactory(ptr: Pointer?): WithDefault = ITransitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransitionFactory {
      val address = segment.toRawLongValue()
      return makeITransitionFactory(Pointer(address))
    }

    public override fun toNative(obj: ITransitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2005677734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransitionFactory): Array<ITransitionFactory?> =
        (elements as
        Array<ITransitionFactory?>).castToImpl<ITransitionFactory,ITransitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransitionFactory?> =
        arrayOfNulls<ITransitionFactory_Impl>(size) as Array<ITransitionFactory?>
  }
}
