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

@ABIMarker(IPickerConfirmedEventArgs.ABI::class)
@Signature("{002ac84d-4cb1-5a84-9460-7b9fb716500b}")
@Guid("002ac84d4cb15a8494607b9fb716500b")
@WinRTInterface("002ac84d4cb15a8494607b9fb716500b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerConfirmedEventArgs.ByReference::class)
public interface IPickerConfirmedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerConfirmedEventArgs> {
    public override fun getValue() = ABI.makeIPickerConfirmedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPickerConfirmedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerConfirmedEventArgs {
    public val __1107773459_Ptr: Pointer?

    public val _1107773459_VtblPtr: Pointer?
      get() = __1107773459_Ptr?.getPointer(0)
  }

  public class IPickerConfirmedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1107773459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerConfirmedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("002ac84d4cb15a8494607b9fb716500b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerConfirmedEventArgs(ptr: Pointer?): WithDefault =
        IPickerConfirmedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerConfirmedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPickerConfirmedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPickerConfirmedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1107773459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerConfirmedEventArgs):
        Array<IPickerConfirmedEventArgs?> = (elements as
        Array<IPickerConfirmedEventArgs?>).castToImpl<IPickerConfirmedEventArgs,IPickerConfirmedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerConfirmedEventArgs?> =
        arrayOfNulls<IPickerConfirmedEventArgs_Impl>(size) as Array<IPickerConfirmedEventArgs?>
  }
}
