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

@ABIMarker(IInkToolbarPenButtonFactory.ABI::class)
@Signature("{b1463d21-59cb-4a83-92e1-692842797b2e}")
@Guid("b1463d2159cb4a8392e1692842797b2e")
@WinRTInterface("b1463d2159cb4a8392e1692842797b2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPenButtonFactory.ByReference::class)
public interface IInkToolbarPenButtonFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPenButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarPenButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPenButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPenButtonFactory {
    public val __279921456_Ptr: Pointer?

    public val _279921456_VtblPtr: Pointer?
      get() = __279921456_Ptr?.getPointer(0)
  }

  public class IInkToolbarPenButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __279921456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPenButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1463d2159cb4a8392e1692842797b2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPenButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarPenButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarPenButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPenButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPenButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__279921456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPenButtonFactory):
        Array<IInkToolbarPenButtonFactory?> = (elements as
        Array<IInkToolbarPenButtonFactory?>).castToImpl<IInkToolbarPenButtonFactory,IInkToolbarPenButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPenButtonFactory?> =
        arrayOfNulls<IInkToolbarPenButtonFactory_Impl>(size) as Array<IInkToolbarPenButtonFactory?>
  }
}
