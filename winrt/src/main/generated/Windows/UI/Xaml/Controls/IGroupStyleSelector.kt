package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGroupStyleSelector.ABI::class)
@Signature("{6dda119e-9a74-478f-a339-5bb52de6c51e}")
@Guid("6dda119e9a74478fa3395bb52de6c51e")
@WinRTInterface("6dda119e9a74478fa3395bb52de6c51e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupStyleSelector.ByReference::class)
public interface IGroupStyleSelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectGroupStyle(group: IUnknown?, level: WinDef.UINT): GroupStyle?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupStyleSelector> {
    public override fun getValue() = ABI.makeIGroupStyleSelector(pointer.getPointer(0))

    public fun setValue(value: IGroupStyleSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupStyleSelector {
    public val __996785779_Ptr: Pointer?

    public val _996785779_VtblPtr: Pointer?
      get() = __996785779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectGroupStyle(group: IUnknown?, level: WinDef.UINT): GroupStyle? {
      val fnPtr = _996785779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupStyle>()
      val hr = fn.invokeHR(arrayOf(__996785779_Ptr, marshalToNative(group), level, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupStyle>(result.getValue())
      return resultValue
    }
  }

  public class IGroupStyleSelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996785779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupStyleSelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6dda119e9a74478fa3395bb52de6c51e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupStyleSelector(ptr: Pointer?): WithDefault = IGroupStyleSelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupStyleSelector {
      val address = segment.toRawLongValue()
      return makeIGroupStyleSelector(Pointer(address))
    }

    public override fun toNative(obj: IGroupStyleSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996785779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupStyleSelector): Array<IGroupStyleSelector?> =
        (elements as
        Array<IGroupStyleSelector?>).castToImpl<IGroupStyleSelector,IGroupStyleSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupStyleSelector?> =
        arrayOfNulls<IGroupStyleSelector_Impl>(size) as Array<IGroupStyleSelector?>
  }
}
