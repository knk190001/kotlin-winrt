package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarMenuButtonFactory.ABI::class)
@Signature("{7a463a9d-5dc7-44a7-afd0-2b685cb9a96c}")
@Guid("7a463a9d5dc744a7afd02b685cb9a96c")
@WinRTInterface("7a463a9d5dc744a7afd02b685cb9a96c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarMenuButtonFactory.ByReference::class)
public interface IInkToolbarMenuButtonFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarMenuButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarMenuButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarMenuButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarMenuButtonFactory {
    public val __2016204664_Ptr: Pointer?

    public val _2016204664_VtblPtr: Pointer?
      get() = __2016204664_Ptr?.getPointer(0)
  }

  public class IInkToolbarMenuButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2016204664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarMenuButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a463a9d5dc744a7afd02b685cb9a96c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarMenuButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarMenuButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarMenuButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarMenuButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarMenuButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2016204664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarMenuButtonFactory):
        Array<IInkToolbarMenuButtonFactory?> = (elements as
        Array<IInkToolbarMenuButtonFactory?>).castToImpl<IInkToolbarMenuButtonFactory,IInkToolbarMenuButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarMenuButtonFactory?> =
        arrayOfNulls<IInkToolbarMenuButtonFactory_Impl>(size) as
        Array<IInkToolbarMenuButtonFactory?>
  }
}
