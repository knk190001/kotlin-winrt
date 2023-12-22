package Windows.ApplicationModel.Background

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

@ABIMarker(IBackgroundCondition.ABI::class)
@Signature("{ae48a1ee-8951-400a-8302-9c9c9a2a3a3b}")
@Guid("ae48a1ee8951400a83029c9c9a2a3a3b")
@WinRTInterface("ae48a1ee8951400a83029c9c9a2a3a3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundCondition.ByReference::class)
public interface IBackgroundCondition : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundCondition> {
    public override fun getValue() = ABI.makeIBackgroundCondition(pointer.getPointer(0))

    public fun setValue(value: IBackgroundCondition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundCondition {
    public val __772532740_Ptr: Pointer?

    public val _772532740_VtblPtr: Pointer?
      get() = __772532740_Ptr?.getPointer(0)
  }

  public class IBackgroundCondition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __772532740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundCondition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae48a1ee8951400a83029c9c9a2a3a3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundCondition(ptr: Pointer?): WithDefault = IBackgroundCondition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundCondition {
      val address = segment.toRawLongValue()
      return makeIBackgroundCondition(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundCondition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__772532740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundCondition): Array<IBackgroundCondition?> =
        (elements as
        Array<IBackgroundCondition?>).castToImpl<IBackgroundCondition,IBackgroundCondition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundCondition?> =
        arrayOfNulls<IBackgroundCondition_Impl>(size) as Array<IBackgroundCondition?>
  }
}
