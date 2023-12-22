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

@ABIMarker(ITriggerAction.ABI::class)
@Signature("{a2c0df02-63d5-4b46-9b83-0868d3079621}")
@Guid("a2c0df0263d54b469b830868d3079621")
@WinRTInterface("a2c0df0263d54b469b830868d3079621")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITriggerAction.ByReference::class)
public interface ITriggerAction : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITriggerAction>
      {
    public override fun getValue() = ABI.makeITriggerAction(pointer.getPointer(0))

    public fun setValue(value: ITriggerAction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITriggerAction {
    public val __2139151108_Ptr: Pointer?

    public val _2139151108_VtblPtr: Pointer?
      get() = __2139151108_Ptr?.getPointer(0)
  }

  public class ITriggerAction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2139151108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITriggerAction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2c0df0263d54b469b830868d3079621")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITriggerAction(ptr: Pointer?): WithDefault = ITriggerAction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITriggerAction {
      val address = segment.toRawLongValue()
      return makeITriggerAction(Pointer(address))
    }

    public override fun toNative(obj: ITriggerAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2139151108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITriggerAction): Array<ITriggerAction?> = (elements as
        Array<ITriggerAction?>).castToImpl<ITriggerAction,ITriggerAction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITriggerAction?> =
        arrayOfNulls<ITriggerAction_Impl>(size) as Array<ITriggerAction?>
  }
}
