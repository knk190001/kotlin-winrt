package Microsoft.UI.Content

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

@ABIMarker(IDesktopSiteBridge2.ABI::class)
@Signature("{1190c041-82fb-5f3b-9111-ca8f19a72b75}")
@Guid("1190c04182fb5f3b9111ca8f19a72b75")
@WinRTInterface("1190c04182fb5f3b9111ca8f19a72b75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopSiteBridge2.ByReference::class)
public interface IDesktopSiteBridge2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreatePopupSiteBridge(): PopupWindowSiteBridge?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopSiteBridge2> {
    public override fun getValue() = ABI.makeIDesktopSiteBridge2(pointer.getPointer(0))

    public fun setValue(value: IDesktopSiteBridge2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopSiteBridge2 {
    public val __808295312_Ptr: Pointer?

    public val _808295312_VtblPtr: Pointer?
      get() = __808295312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreatePopupSiteBridge(): PopupWindowSiteBridge? {
      val fnPtr = _808295312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PopupWindowSiteBridge>()
      val hr = fn.invokeHR(arrayOf(__808295312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PopupWindowSiteBridge>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopSiteBridge2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __808295312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopSiteBridge2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1190c04182fb5f3b9111ca8f19a72b75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopSiteBridge2(ptr: Pointer?): WithDefault = IDesktopSiteBridge2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopSiteBridge2 {
      val address = segment.toRawLongValue()
      return makeIDesktopSiteBridge2(Pointer(address))
    }

    public override fun toNative(obj: IDesktopSiteBridge2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__808295312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopSiteBridge2): Array<IDesktopSiteBridge2?> =
        (elements as
        Array<IDesktopSiteBridge2?>).castToImpl<IDesktopSiteBridge2,IDesktopSiteBridge2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopSiteBridge2?> =
        arrayOfNulls<IDesktopSiteBridge2_Impl>(size) as Array<IDesktopSiteBridge2?>
  }
}
