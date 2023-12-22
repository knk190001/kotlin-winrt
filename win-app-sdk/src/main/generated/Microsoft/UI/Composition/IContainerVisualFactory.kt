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

@ABIMarker(IContainerVisualFactory.ABI::class)
@Signature("{3fa45eeb-c6dd-5afd-971d-eaaf6245e716}")
@Guid("3fa45eebc6dd5afd971deaaf6245e716")
@WinRTInterface("3fa45eebc6dd5afd971deaaf6245e716")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContainerVisualFactory.ByReference::class)
public interface IContainerVisualFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContainerVisualFactory> {
    public override fun getValue() = ABI.makeIContainerVisualFactory(pointer.getPointer(0))

    public fun setValue(value: IContainerVisualFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContainerVisualFactory {
    public val __821406206_Ptr: Pointer?

    public val _821406206_VtblPtr: Pointer?
      get() = __821406206_Ptr?.getPointer(0)
  }

  public class IContainerVisualFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __821406206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContainerVisualFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fa45eebc6dd5afd971deaaf6245e716")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContainerVisualFactory(ptr: Pointer?): WithDefault =
        IContainerVisualFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContainerVisualFactory {
      val address = segment.toRawLongValue()
      return makeIContainerVisualFactory(Pointer(address))
    }

    public override fun toNative(obj: IContainerVisualFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__821406206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContainerVisualFactory): Array<IContainerVisualFactory?>
        = (elements as
        Array<IContainerVisualFactory?>).castToImpl<IContainerVisualFactory,IContainerVisualFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContainerVisualFactory?> =
        arrayOfNulls<IContainerVisualFactory_Impl>(size) as Array<IContainerVisualFactory?>
  }
}
