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

@ABIMarker(IDisplaySurface.ABI::class)
@Signature("{594f6cc6-139a-56d6-a4b1-15fe2cb76adb}")
@Guid("594f6cc6139a56d6a4b115fe2cb76adb")
@WinRTInterface("594f6cc6139a56d6a4b115fe2cb76adb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplaySurface.ByReference::class)
public interface IDisplaySurface : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplaySurface> {
    public override fun getValue() = ABI.makeIDisplaySurface(pointer.getPointer(0))

    public fun setValue(value: IDisplaySurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplaySurface {
    public val __1006465651_Ptr: Pointer?

    public val _1006465651_VtblPtr: Pointer?
      get() = __1006465651_Ptr?.getPointer(0)
  }

  public class IDisplaySurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1006465651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplaySurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("594f6cc6139a56d6a4b115fe2cb76adb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplaySurface(ptr: Pointer?): WithDefault = IDisplaySurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplaySurface {
      val address = segment.toRawLongValue()
      return makeIDisplaySurface(Pointer(address))
    }

    public override fun toNative(obj: IDisplaySurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1006465651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplaySurface): Array<IDisplaySurface?> = (elements as
        Array<IDisplaySurface?>).castToImpl<IDisplaySurface,IDisplaySurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplaySurface?> =
        arrayOfNulls<IDisplaySurface_Impl>(size) as Array<IDisplaySurface?>
  }
}
