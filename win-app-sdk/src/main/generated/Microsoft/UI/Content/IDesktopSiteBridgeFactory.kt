package Microsoft.UI.Content

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

@ABIMarker(IDesktopSiteBridgeFactory.ABI::class)
@Signature("{d94ee1ff-3af1-54d0-9311-652b29c57c5b}")
@Guid("d94ee1ff3af154d09311652b29c57c5b")
@WinRTInterface("d94ee1ff3af154d09311652b29c57c5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopSiteBridgeFactory.ByReference::class)
public interface IDesktopSiteBridgeFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopSiteBridgeFactory> {
    public override fun getValue() = ABI.makeIDesktopSiteBridgeFactory(pointer.getPointer(0))

    public fun setValue(value: IDesktopSiteBridgeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopSiteBridgeFactory {
    public val __190678696_Ptr: Pointer?

    public val _190678696_VtblPtr: Pointer?
      get() = __190678696_Ptr?.getPointer(0)
  }

  public class IDesktopSiteBridgeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __190678696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopSiteBridgeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d94ee1ff3af154d09311652b29c57c5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopSiteBridgeFactory(ptr: Pointer?): WithDefault =
        IDesktopSiteBridgeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopSiteBridgeFactory {
      val address = segment.toRawLongValue()
      return makeIDesktopSiteBridgeFactory(Pointer(address))
    }

    public override fun toNative(obj: IDesktopSiteBridgeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__190678696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopSiteBridgeFactory):
        Array<IDesktopSiteBridgeFactory?> = (elements as
        Array<IDesktopSiteBridgeFactory?>).castToImpl<IDesktopSiteBridgeFactory,IDesktopSiteBridgeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopSiteBridgeFactory?> =
        arrayOfNulls<IDesktopSiteBridgeFactory_Impl>(size) as Array<IDesktopSiteBridgeFactory?>
  }
}
