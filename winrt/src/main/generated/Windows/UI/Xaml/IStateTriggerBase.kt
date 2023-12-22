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

@ABIMarker(IStateTriggerBase.ABI::class)
@Signature("{48b20698-af06-466c-8052-93666dde0e49}")
@Guid("48b20698af06466c805293666dde0e49")
@WinRTInterface("48b20698af06466c805293666dde0e49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStateTriggerBase.ByReference::class)
public interface IStateTriggerBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStateTriggerBase> {
    public override fun getValue() = ABI.makeIStateTriggerBase(pointer.getPointer(0))

    public fun setValue(value: IStateTriggerBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStateTriggerBase {
    public val __1292182954_Ptr: Pointer?

    public val _1292182954_VtblPtr: Pointer?
      get() = __1292182954_Ptr?.getPointer(0)
  }

  public class IStateTriggerBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1292182954_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStateTriggerBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48b20698af06466c805293666dde0e49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStateTriggerBase(ptr: Pointer?): WithDefault = IStateTriggerBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStateTriggerBase {
      val address = segment.toRawLongValue()
      return makeIStateTriggerBase(Pointer(address))
    }

    public override fun toNative(obj: IStateTriggerBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1292182954_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStateTriggerBase): Array<IStateTriggerBase?> = (elements
        as Array<IStateTriggerBase?>).castToImpl<IStateTriggerBase,IStateTriggerBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStateTriggerBase?> =
        arrayOfNulls<IStateTriggerBase_Impl>(size) as Array<IStateTriggerBase?>
  }
}
