package Windows.UI.Composition

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

@ABIMarker(ICompositionGeometryFactory.ABI::class)
@Signature("{bffebfe1-8c25-480b-9f56-fed6b288055d}")
@Guid("bffebfe18c25480b9f56fed6b288055d")
@WinRTInterface("bffebfe18c25480b9f56fed6b288055d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGeometryFactory.ByReference::class)
public interface ICompositionGeometryFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGeometryFactory> {
    public override fun getValue() = ABI.makeICompositionGeometryFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionGeometryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGeometryFactory {
    public val __1533400228_Ptr: Pointer?

    public val _1533400228_VtblPtr: Pointer?
      get() = __1533400228_Ptr?.getPointer(0)
  }

  public class ICompositionGeometryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1533400228_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGeometryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bffebfe18c25480b9f56fed6b288055d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGeometryFactory(ptr: Pointer?): WithDefault =
        ICompositionGeometryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGeometryFactory {
      val address = segment.toRawLongValue()
      return makeICompositionGeometryFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGeometryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1533400228_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGeometryFactory):
        Array<ICompositionGeometryFactory?> = (elements as
        Array<ICompositionGeometryFactory?>).castToImpl<ICompositionGeometryFactory,ICompositionGeometryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGeometryFactory?> =
        arrayOfNulls<ICompositionGeometryFactory_Impl>(size) as Array<ICompositionGeometryFactory?>
  }
}
