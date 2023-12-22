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

@ABIMarker(IInputCursorFactory.ABI::class)
@Signature("{2f47647b-4be0-53e9-be7e-c38d5459db6b}")
@Guid("2f47647b4be053e9be7ec38d5459db6b")
@WinRTInterface("2f47647b4be053e9be7ec38d5459db6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputCursorFactory.ByReference::class)
public interface IInputCursorFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputCursorFactory> {
    public override fun getValue() = ABI.makeIInputCursorFactory(pointer.getPointer(0))

    public fun setValue(value: IInputCursorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputCursorFactory {
    public val __1699907171_Ptr: Pointer?

    public val _1699907171_VtblPtr: Pointer?
      get() = __1699907171_Ptr?.getPointer(0)
  }

  public class IInputCursorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1699907171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputCursorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f47647b4be053e9be7ec38d5459db6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputCursorFactory(ptr: Pointer?): WithDefault = IInputCursorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputCursorFactory {
      val address = segment.toRawLongValue()
      return makeIInputCursorFactory(Pointer(address))
    }

    public override fun toNative(obj: IInputCursorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1699907171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputCursorFactory): Array<IInputCursorFactory?> =
        (elements as
        Array<IInputCursorFactory?>).castToImpl<IInputCursorFactory,IInputCursorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputCursorFactory?> =
        arrayOfNulls<IInputCursorFactory_Impl>(size) as Array<IInputCursorFactory?>
  }
}
