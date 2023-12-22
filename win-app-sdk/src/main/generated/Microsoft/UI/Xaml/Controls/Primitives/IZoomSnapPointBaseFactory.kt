package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IZoomSnapPointBaseFactory.ABI::class)
@Signature("{2c689eea-b6cf-5024-847b-589355d5a2fa}")
@Guid("2c689eeab6cf5024847b589355d5a2fa")
@WinRTInterface("2c689eeab6cf5024847b589355d5a2fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IZoomSnapPointBaseFactory.ByReference::class)
public interface IZoomSnapPointBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IZoomSnapPointBaseFactory> {
    public override fun getValue() = ABI.makeIZoomSnapPointBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IZoomSnapPointBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IZoomSnapPointBaseFactory {
    public val __496892663_Ptr: Pointer?

    public val _496892663_VtblPtr: Pointer?
      get() = __496892663_Ptr?.getPointer(0)
  }

  public class IZoomSnapPointBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __496892663_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IZoomSnapPointBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c689eeab6cf5024847b589355d5a2fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIZoomSnapPointBaseFactory(ptr: Pointer?): WithDefault =
        IZoomSnapPointBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IZoomSnapPointBaseFactory {
      val address = segment.toRawLongValue()
      return makeIZoomSnapPointBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IZoomSnapPointBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__496892663_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IZoomSnapPointBaseFactory):
        Array<IZoomSnapPointBaseFactory?> = (elements as
        Array<IZoomSnapPointBaseFactory?>).castToImpl<IZoomSnapPointBaseFactory,IZoomSnapPointBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IZoomSnapPointBaseFactory?> =
        arrayOfNulls<IZoomSnapPointBaseFactory_Impl>(size) as Array<IZoomSnapPointBaseFactory?>
  }
}
