package Windows.UI.Xaml.Media

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

@ABIMarker(IGeometryFactory.ABI::class)
@Signature("{f65daf23-d5fd-42f9-b32a-929c5a4b54e1}")
@Guid("f65daf23d5fd42f9b32a929c5a4b54e1")
@WinRTInterface("f65daf23d5fd42f9b32a929c5a4b54e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeometryFactory.ByReference::class)
public interface IGeometryFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeometryFactory> {
    public override fun getValue() = ABI.makeIGeometryFactory(pointer.getPointer(0))

    public fun setValue(value: IGeometryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeometryFactory {
    public val __1878389436_Ptr: Pointer?

    public val _1878389436_VtblPtr: Pointer?
      get() = __1878389436_Ptr?.getPointer(0)
  }

  public class IGeometryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1878389436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeometryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f65daf23d5fd42f9b32a929c5a4b54e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeometryFactory(ptr: Pointer?): WithDefault = IGeometryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeometryFactory {
      val address = segment.toRawLongValue()
      return makeIGeometryFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeometryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1878389436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeometryFactory): Array<IGeometryFactory?> = (elements as
        Array<IGeometryFactory?>).castToImpl<IGeometryFactory,IGeometryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeometryFactory?> =
        arrayOfNulls<IGeometryFactory_Impl>(size) as Array<IGeometryFactory?>
  }
}
