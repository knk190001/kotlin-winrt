package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVirtualizingPanel.ABI::class)
@Signature("{2b216a2d-5079-51ba-838a-9086903636b4}")
@Guid("2b216a2d507951ba838a9086903636b4")
@WinRTInterface("2b216a2d507951ba838a9086903636b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingPanel.ByReference::class)
public interface IVirtualizingPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemContainerGenerator(): ItemContainerGenerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingPanel> {
    public override fun getValue() = ABI.makeIVirtualizingPanel(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingPanel {
    public val __797830697_Ptr: Pointer?

    public val _797830697_VtblPtr: Pointer?
      get() = __797830697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemContainerGenerator(): ItemContainerGenerator? {
      val fnPtr = _797830697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemContainerGenerator>()
      val hr = fn.invokeHR(arrayOf(__797830697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemContainerGenerator>(result.getValue())
      return resultValue
    }
  }

  public class IVirtualizingPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __797830697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b216a2d507951ba838a9086903636b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingPanel(ptr: Pointer?): WithDefault = IVirtualizingPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingPanel {
      val address = segment.toRawLongValue()
      return makeIVirtualizingPanel(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__797830697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingPanel): Array<IVirtualizingPanel?> =
        (elements as
        Array<IVirtualizingPanel?>).castToImpl<IVirtualizingPanel,IVirtualizingPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingPanel?> =
        arrayOfNulls<IVirtualizingPanel_Impl>(size) as Array<IVirtualizingPanel?>
  }
}
