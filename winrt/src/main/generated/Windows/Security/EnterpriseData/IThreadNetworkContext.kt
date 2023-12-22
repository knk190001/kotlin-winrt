package Windows.Security.EnterpriseData

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

@ABIMarker(IThreadNetworkContext.ABI::class)
@Signature("{fa4ea8e9-ef13-405a-b12c-d7348c6f41fc}")
@Guid("fa4ea8e9ef13405ab12cd7348c6f41fc")
@WinRTInterface("fa4ea8e9ef13405ab12cd7348c6f41fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThreadNetworkContext.ByReference::class)
public interface IThreadNetworkContext : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThreadNetworkContext> {
    public override fun getValue() = ABI.makeIThreadNetworkContext(pointer.getPointer(0))

    public fun setValue(value: IThreadNetworkContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThreadNetworkContext {
    public val __643500442_Ptr: Pointer?

    public val _643500442_VtblPtr: Pointer?
      get() = __643500442_Ptr?.getPointer(0)
  }

  public class IThreadNetworkContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __643500442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThreadNetworkContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa4ea8e9ef13405ab12cd7348c6f41fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThreadNetworkContext(ptr: Pointer?): WithDefault =
        IThreadNetworkContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThreadNetworkContext {
      val address = segment.toRawLongValue()
      return makeIThreadNetworkContext(Pointer(address))
    }

    public override fun toNative(obj: IThreadNetworkContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__643500442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThreadNetworkContext): Array<IThreadNetworkContext?> =
        (elements as
        Array<IThreadNetworkContext?>).castToImpl<IThreadNetworkContext,IThreadNetworkContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThreadNetworkContext?> =
        arrayOfNulls<IThreadNetworkContext_Impl>(size) as Array<IThreadNetworkContext?>
  }
}
