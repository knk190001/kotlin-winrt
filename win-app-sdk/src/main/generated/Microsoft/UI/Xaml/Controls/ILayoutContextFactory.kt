package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ILayoutContextFactory.ABI::class)
@Signature("{f7664771-9242-599e-a7dd-0705565def98}")
@Guid("f76647719242599ea7dd0705565def98")
@WinRTInterface("f76647719242599ea7dd0705565def98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutContextFactory.ByReference::class)
public interface ILayoutContextFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILayoutContextFactory> {
    public override fun getValue() = ABI.makeILayoutContextFactory(pointer.getPointer(0))

    public fun setValue(value: ILayoutContextFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutContextFactory {
    public val __1344750996_Ptr: Pointer?

    public val _1344750996_VtblPtr: Pointer?
      get() = __1344750996_Ptr?.getPointer(0)
  }

  public class ILayoutContextFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344750996_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutContextFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f76647719242599ea7dd0705565def98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutContextFactory(ptr: Pointer?): WithDefault =
        ILayoutContextFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutContextFactory {
      val address = segment.toRawLongValue()
      return makeILayoutContextFactory(Pointer(address))
    }

    public override fun toNative(obj: ILayoutContextFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344750996_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutContextFactory): Array<ILayoutContextFactory?> =
        (elements as
        Array<ILayoutContextFactory?>).castToImpl<ILayoutContextFactory,ILayoutContextFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutContextFactory?> =
        arrayOfNulls<ILayoutContextFactory_Impl>(size) as Array<ILayoutContextFactory?>
  }
}
