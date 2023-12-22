package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ICommandBarFlyoutCommandBar.ABI::class)
@Signature("{0f7120c5-6d00-5489-9171-bedd2d4ef677}")
@Guid("0f7120c56d0054899171bedd2d4ef677")
@WinRTInterface("0f7120c56d0054899171bedd2d4ef677")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyoutCommandBar.ByReference::class)
public interface ICommandBarFlyoutCommandBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FlyoutTemplateSettings(): CommandBarFlyoutCommandBarTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutCommandBar> {
    public override fun getValue() = ABI.makeICommandBarFlyoutCommandBar(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutCommandBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutCommandBar {
    public val __1065464604_Ptr: Pointer?

    public val _1065464604_VtblPtr: Pointer?
      get() = __1065464604_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FlyoutTemplateSettings(): CommandBarFlyoutCommandBarTemplateSettings? {
      val fnPtr = _1065464604_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarFlyoutCommandBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1065464604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CommandBarFlyoutCommandBarTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFlyoutCommandBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1065464604_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutCommandBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f7120c56d0054899171bedd2d4ef677")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutCommandBar(ptr: Pointer?): WithDefault =
        ICommandBarFlyoutCommandBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyoutCommandBar {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutCommandBar(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutCommandBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1065464604_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutCommandBar):
        Array<ICommandBarFlyoutCommandBar?> = (elements as
        Array<ICommandBarFlyoutCommandBar?>).castToImpl<ICommandBarFlyoutCommandBar,ICommandBarFlyoutCommandBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyoutCommandBar?> =
        arrayOfNulls<ICommandBarFlyoutCommandBar_Impl>(size) as Array<ICommandBarFlyoutCommandBar?>
  }
}
