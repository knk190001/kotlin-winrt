package Microsoft.UI.Xaml

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

@ABIMarker(ITriggerActionFactory.ABI::class)
@Signature("{1e1faf1a-f614-554a-822a-d98fe46575d1}")
@Guid("1e1faf1af614554a822ad98fe46575d1")
@WinRTInterface("1e1faf1af614554a822ad98fe46575d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITriggerActionFactory.ByReference::class)
public interface ITriggerActionFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITriggerActionFactory> {
    public override fun getValue() = ABI.makeITriggerActionFactory(pointer.getPointer(0))

    public fun setValue(value: ITriggerActionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITriggerActionFactory {
    public val __1895544291_Ptr: Pointer?

    public val _1895544291_VtblPtr: Pointer?
      get() = __1895544291_Ptr?.getPointer(0)
  }

  public class ITriggerActionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1895544291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITriggerActionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e1faf1af614554a822ad98fe46575d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITriggerActionFactory(ptr: Pointer?): WithDefault =
        ITriggerActionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITriggerActionFactory {
      val address = segment.toRawLongValue()
      return makeITriggerActionFactory(Pointer(address))
    }

    public override fun toNative(obj: ITriggerActionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1895544291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITriggerActionFactory): Array<ITriggerActionFactory?> =
        (elements as
        Array<ITriggerActionFactory?>).castToImpl<ITriggerActionFactory,ITriggerActionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITriggerActionFactory?> =
        arrayOfNulls<ITriggerActionFactory_Impl>(size) as Array<ITriggerActionFactory?>
  }
}
