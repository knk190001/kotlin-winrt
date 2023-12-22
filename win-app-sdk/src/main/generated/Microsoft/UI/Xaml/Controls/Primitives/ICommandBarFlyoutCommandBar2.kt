package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Media.SystemBackdrop
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

@ABIMarker(ICommandBarFlyoutCommandBar2.ABI::class)
@Signature("{6aca769f-1119-5355-af7f-bcd5aa751229}")
@Guid("6aca769f11195355af7fbcd5aa751229")
@WinRTInterface("6aca769f11195355af7fbcd5aa751229")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyoutCommandBar2.ByReference::class)
public interface ICommandBarFlyoutCommandBar2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemBackdrop(): SystemBackdrop?

  @InterfaceMethod(1)
  public fun put_SystemBackdrop(value: SystemBackdrop?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutCommandBar2> {
    public override fun getValue() = ABI.makeICommandBarFlyoutCommandBar2(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutCommandBar2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutCommandBar2 {
    public val __1330335594_Ptr: Pointer?

    public val _1330335594_VtblPtr: Pointer?
      get() = __1330335594_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemBackdrop(): SystemBackdrop? {
      val fnPtr = _1330335594_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdrop>()
      val hr = fn.invokeHR(arrayOf(__1330335594_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdrop>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SystemBackdrop(value: SystemBackdrop?): Unit {
      val fnPtr = _1330335594_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1330335594_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBarFlyoutCommandBar2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1330335594_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutCommandBar2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6aca769f11195355af7fbcd5aa751229")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutCommandBar2(ptr: Pointer?): WithDefault =
        ICommandBarFlyoutCommandBar2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyoutCommandBar2 {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutCommandBar2(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutCommandBar2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1330335594_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutCommandBar2):
        Array<ICommandBarFlyoutCommandBar2?> = (elements as
        Array<ICommandBarFlyoutCommandBar2?>).castToImpl<ICommandBarFlyoutCommandBar2,ICommandBarFlyoutCommandBar2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyoutCommandBar2?> =
        arrayOfNulls<ICommandBarFlyoutCommandBar2_Impl>(size) as
        Array<ICommandBarFlyoutCommandBar2?>
  }
}
