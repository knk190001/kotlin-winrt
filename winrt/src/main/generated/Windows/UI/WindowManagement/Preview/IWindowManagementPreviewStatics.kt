package Windows.UI.WindowManagement.Preview

import Windows.Foundation.Size
import Windows.UI.WindowManagement.AppWindow
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

@ABIMarker(IWindowManagementPreviewStatics.ABI::class)
@Signature("{0f9725c6-c004-5a23-8fd2-8d092ce2704a}")
@Guid("0f9725c6c0045a238fd28d092ce2704a")
@WinRTInterface("0f9725c6c0045a238fd28d092ce2704a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowManagementPreviewStatics.ByReference::class)
public interface IWindowManagementPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetPreferredMinSize(window: AppWindow?, preferredFrameMinSize: Size?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowManagementPreviewStatics> {
    public override fun getValue() = ABI.makeIWindowManagementPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: IWindowManagementPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowManagementPreviewStatics {
    public val __130273021_Ptr: Pointer?

    public val _130273021_VtblPtr: Pointer?
      get() = __130273021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetPreferredMinSize(window: AppWindow?, preferredFrameMinSize: Size?):
        Unit {
      val fnPtr = _130273021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__130273021_Ptr, marshalToNative(window),
          marshalToNative(preferredFrameMinSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWindowManagementPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __130273021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowManagementPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f9725c6c0045a238fd28d092ce2704a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowManagementPreviewStatics(ptr: Pointer?): WithDefault =
        IWindowManagementPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowManagementPreviewStatics {
      val address = segment.toRawLongValue()
      return makeIWindowManagementPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IWindowManagementPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__130273021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowManagementPreviewStatics):
        Array<IWindowManagementPreviewStatics?> = (elements as
        Array<IWindowManagementPreviewStatics?>).castToImpl<IWindowManagementPreviewStatics,IWindowManagementPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowManagementPreviewStatics?> =
        arrayOfNulls<IWindowManagementPreviewStatics_Impl>(size) as
        Array<IWindowManagementPreviewStatics?>
  }
}
