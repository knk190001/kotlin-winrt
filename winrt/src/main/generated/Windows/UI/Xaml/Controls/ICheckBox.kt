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

@ABIMarker(ICheckBox.ABI::class)
@Signature("{2294c894-7e2a-4b70-b088-8f5d814875ba}")
@Guid("2294c8947e2a4b70b0888f5d814875ba")
@WinRTInterface("2294c8947e2a4b70b0888f5d814875ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICheckBox.ByReference::class)
public interface ICheckBox : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICheckBox> {
    public override fun getValue() = ABI.makeICheckBox(pointer.getPointer(0))

    public fun setValue(value: ICheckBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICheckBox {
    public val __1048126399_Ptr: Pointer?

    public val _1048126399_VtblPtr: Pointer?
      get() = __1048126399_Ptr?.getPointer(0)
  }

  public class ICheckBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1048126399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICheckBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2294c8947e2a4b70b0888f5d814875ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICheckBox(ptr: Pointer?): WithDefault = ICheckBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICheckBox {
      val address = segment.toRawLongValue()
      return makeICheckBox(Pointer(address))
    }

    public override fun toNative(obj: ICheckBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1048126399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICheckBox): Array<ICheckBox?> = (elements as
        Array<ICheckBox?>).castToImpl<ICheckBox,ICheckBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICheckBox?> = arrayOfNulls<ICheckBox_Impl>(size)
        as Array<ICheckBox?>
  }
}
