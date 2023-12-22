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

@ABIMarker(IComboBoxHelper.ABI::class)
@Signature("{5a3c87ac-c399-5e5f-873f-b9d0e8bcceb7}")
@Guid("5a3c87acc3995e5f873fb9d0e8bcceb7")
@WinRTInterface("5a3c87acc3995e5f873fb9d0e8bcceb7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxHelper.ByReference::class)
public interface IComboBoxHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxHelper> {
    public override fun getValue() = ABI.makeIComboBoxHelper(pointer.getPointer(0))

    public fun setValue(value: IComboBoxHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxHelper {
    public val __122442236_Ptr: Pointer?

    public val _122442236_VtblPtr: Pointer?
      get() = __122442236_Ptr?.getPointer(0)
  }

  public class IComboBoxHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __122442236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a3c87acc3995e5f873fb9d0e8bcceb7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxHelper(ptr: Pointer?): WithDefault = IComboBoxHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxHelper {
      val address = segment.toRawLongValue()
      return makeIComboBoxHelper(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__122442236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxHelper): Array<IComboBoxHelper?> = (elements as
        Array<IComboBoxHelper?>).castToImpl<IComboBoxHelper,IComboBoxHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxHelper?> =
        arrayOfNulls<IComboBoxHelper_Impl>(size) as Array<IComboBoxHelper?>
  }
}
