package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IColorPickerSliderAutomationPeer.ABI::class)
@Signature("{793d35d4-4152-50fa-b5f4-f6c045c1339d}")
@Guid("793d35d4415250fab5f4f6c045c1339d")
@WinRTInterface("793d35d4415250fab5f4f6c045c1339d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPickerSliderAutomationPeer.ByReference::class)
public interface IColorPickerSliderAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPickerSliderAutomationPeer> {
    public override fun getValue() = ABI.makeIColorPickerSliderAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IColorPickerSliderAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPickerSliderAutomationPeer {
    public val __649329656_Ptr: Pointer?

    public val _649329656_VtblPtr: Pointer?
      get() = __649329656_Ptr?.getPointer(0)
  }

  public class IColorPickerSliderAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649329656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPickerSliderAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("793d35d4415250fab5f4f6c045c1339d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPickerSliderAutomationPeer(ptr: Pointer?): WithDefault =
        IColorPickerSliderAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPickerSliderAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIColorPickerSliderAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IColorPickerSliderAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649329656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPickerSliderAutomationPeer):
        Array<IColorPickerSliderAutomationPeer?> = (elements as
        Array<IColorPickerSliderAutomationPeer?>).castToImpl<IColorPickerSliderAutomationPeer,IColorPickerSliderAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPickerSliderAutomationPeer?> =
        arrayOfNulls<IColorPickerSliderAutomationPeer_Impl>(size) as
        Array<IColorPickerSliderAutomationPeer?>
  }
}
