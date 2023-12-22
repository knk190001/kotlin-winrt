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

@ABIMarker(ITriggerBase.ABI::class)
@Signature("{e7ea222f-dee6-4393-a8b2-8923d641f395}")
@Guid("e7ea222fdee64393a8b28923d641f395")
@WinRTInterface("e7ea222fdee64393a8b28923d641f395")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITriggerBase.ByReference::class)
public interface ITriggerBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITriggerBase> {
    public override fun getValue() = ABI.makeITriggerBase(pointer.getPointer(0))

    public fun setValue(value: ITriggerBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITriggerBase {
    public val __413443863_Ptr: Pointer?

    public val _413443863_VtblPtr: Pointer?
      get() = __413443863_Ptr?.getPointer(0)
  }

  public class ITriggerBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __413443863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITriggerBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7ea222fdee64393a8b28923d641f395")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITriggerBase(ptr: Pointer?): WithDefault = ITriggerBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITriggerBase {
      val address = segment.toRawLongValue()
      return makeITriggerBase(Pointer(address))
    }

    public override fun toNative(obj: ITriggerBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__413443863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITriggerBase): Array<ITriggerBase?> = (elements as
        Array<ITriggerBase?>).castToImpl<ITriggerBase,ITriggerBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITriggerBase?> =
        arrayOfNulls<ITriggerBase_Impl>(size) as Array<ITriggerBase?>
  }
}
