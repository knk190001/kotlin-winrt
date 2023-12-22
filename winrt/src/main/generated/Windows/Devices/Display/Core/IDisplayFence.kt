package Windows.Devices.Display.Core

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

@ABIMarker(IDisplayFence.ABI::class)
@Signature("{04dcf9ef-3406-5700-8fec-77eba4c5a74b}")
@Guid("04dcf9ef340657008fec77eba4c5a74b")
@WinRTInterface("04dcf9ef340657008fec77eba4c5a74b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayFence.ByReference::class)
public interface IDisplayFence : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayFence>
      {
    public override fun getValue() = ABI.makeIDisplayFence(pointer.getPointer(0))

    public fun setValue(value: IDisplayFence_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayFence {
    public val __2051520239_Ptr: Pointer?

    public val _2051520239_VtblPtr: Pointer?
      get() = __2051520239_Ptr?.getPointer(0)
  }

  public class IDisplayFence_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2051520239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayFence, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04dcf9ef340657008fec77eba4c5a74b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayFence(ptr: Pointer?): WithDefault = IDisplayFence_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayFence {
      val address = segment.toRawLongValue()
      return makeIDisplayFence(Pointer(address))
    }

    public override fun toNative(obj: IDisplayFence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2051520239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayFence): Array<IDisplayFence?> = (elements as
        Array<IDisplayFence?>).castToImpl<IDisplayFence,IDisplayFence_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayFence?> =
        arrayOfNulls<IDisplayFence_Impl>(size) as Array<IDisplayFence?>
  }
}
