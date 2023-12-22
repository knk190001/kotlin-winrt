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

@ABIMarker(ISnapPointBaseFactory.ABI::class)
@Signature("{50266508-15f8-530a-a213-e976e04e670b}")
@Guid("5026650815f8530aa213e976e04e670b")
@WinRTInterface("5026650815f8530aa213e976e04e670b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISnapPointBaseFactory.ByReference::class)
public interface ISnapPointBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISnapPointBaseFactory> {
    public override fun getValue() = ABI.makeISnapPointBaseFactory(pointer.getPointer(0))

    public fun setValue(value: ISnapPointBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISnapPointBaseFactory {
    public val __810411260_Ptr: Pointer?

    public val _810411260_VtblPtr: Pointer?
      get() = __810411260_Ptr?.getPointer(0)
  }

  public class ISnapPointBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810411260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISnapPointBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5026650815f8530aa213e976e04e670b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISnapPointBaseFactory(ptr: Pointer?): WithDefault =
        ISnapPointBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISnapPointBaseFactory {
      val address = segment.toRawLongValue()
      return makeISnapPointBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: ISnapPointBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810411260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISnapPointBaseFactory): Array<ISnapPointBaseFactory?> =
        (elements as
        Array<ISnapPointBaseFactory?>).castToImpl<ISnapPointBaseFactory,ISnapPointBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISnapPointBaseFactory?> =
        arrayOfNulls<ISnapPointBaseFactory_Impl>(size) as Array<ISnapPointBaseFactory?>
  }
}
