package Microsoft.UI.Input

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

@ABIMarker(IInputCustomCursorFactory.ABI::class)
@Signature("{6f402882-66e0-57d3-89d0-aa5e2ff917bc}")
@Guid("6f40288266e057d389d0aa5e2ff917bc")
@WinRTInterface("6f40288266e057d389d0aa5e2ff917bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputCustomCursorFactory.ByReference::class)
public interface IInputCustomCursorFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputCustomCursorFactory> {
    public override fun getValue() = ABI.makeIInputCustomCursorFactory(pointer.getPointer(0))

    public fun setValue(value: IInputCustomCursorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputCustomCursorFactory {
    public val __361521970_Ptr: Pointer?

    public val _361521970_VtblPtr: Pointer?
      get() = __361521970_Ptr?.getPointer(0)
  }

  public class IInputCustomCursorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __361521970_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputCustomCursorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f40288266e057d389d0aa5e2ff917bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputCustomCursorFactory(ptr: Pointer?): WithDefault =
        IInputCustomCursorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputCustomCursorFactory {
      val address = segment.toRawLongValue()
      return makeIInputCustomCursorFactory(Pointer(address))
    }

    public override fun toNative(obj: IInputCustomCursorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__361521970_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputCustomCursorFactory):
        Array<IInputCustomCursorFactory?> = (elements as
        Array<IInputCustomCursorFactory?>).castToImpl<IInputCustomCursorFactory,IInputCustomCursorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputCustomCursorFactory?> =
        arrayOfNulls<IInputCustomCursorFactory_Impl>(size) as Array<IInputCustomCursorFactory?>
  }
}
