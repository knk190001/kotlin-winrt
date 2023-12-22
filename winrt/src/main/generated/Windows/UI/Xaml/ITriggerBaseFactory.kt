package Windows.UI.Xaml

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

@ABIMarker(ITriggerBaseFactory.ABI::class)
@Signature("{6a3b9e57-fc5d-42d0-8cb9-ca50667af746}")
@Guid("6a3b9e57fc5d42d08cb9ca50667af746")
@WinRTInterface("6a3b9e57fc5d42d08cb9ca50667af746")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITriggerBaseFactory.ByReference::class)
public interface ITriggerBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITriggerBaseFactory> {
    public override fun getValue() = ABI.makeITriggerBaseFactory(pointer.getPointer(0))

    public fun setValue(value: ITriggerBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITriggerBaseFactory {
    public val __41961971_Ptr: Pointer?

    public val _41961971_VtblPtr: Pointer?
      get() = __41961971_Ptr?.getPointer(0)
  }

  public class ITriggerBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __41961971_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITriggerBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a3b9e57fc5d42d08cb9ca50667af746")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITriggerBaseFactory(ptr: Pointer?): WithDefault = ITriggerBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITriggerBaseFactory {
      val address = segment.toRawLongValue()
      return makeITriggerBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: ITriggerBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__41961971_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITriggerBaseFactory): Array<ITriggerBaseFactory?> =
        (elements as
        Array<ITriggerBaseFactory?>).castToImpl<ITriggerBaseFactory,ITriggerBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITriggerBaseFactory?> =
        arrayOfNulls<ITriggerBaseFactory_Impl>(size) as Array<ITriggerBaseFactory?>
  }
}
