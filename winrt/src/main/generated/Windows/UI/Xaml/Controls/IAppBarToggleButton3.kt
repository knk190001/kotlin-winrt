package Windows.UI.Xaml.Controls

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

@ABIMarker(IAppBarToggleButton3.ABI::class)
@Signature("{ef9a85e5-16ff-4d72-b9e8-9b861eaf84a8}")
@Guid("ef9a85e516ff4d72b9e89b861eaf84a8")
@WinRTInterface("ef9a85e516ff4d72b9e89b861eaf84a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButton3.ByReference::class)
public interface IAppBarToggleButton3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelPosition(): CommandBarLabelPosition?

  @InterfaceMethod(1)
  public fun put_LabelPosition(value: CommandBarLabelPosition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButton3> {
    public override fun getValue() = ABI.makeIAppBarToggleButton3(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButton3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButton3 {
    public val __1248128353_Ptr: Pointer?

    public val _1248128353_VtblPtr: Pointer?
      get() = __1248128353_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelPosition(): CommandBarLabelPosition? {
      val fnPtr = _1248128353_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarLabelPosition>()
      val hr = fn.invokeHR(arrayOf(__1248128353_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarLabelPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LabelPosition(value: CommandBarLabelPosition?): Unit {
      val fnPtr = _1248128353_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1248128353_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBarToggleButton3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248128353_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButton3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef9a85e516ff4d72b9e89b861eaf84a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButton3(ptr: Pointer?): WithDefault = IAppBarToggleButton3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButton3 {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButton3(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButton3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1248128353_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButton3): Array<IAppBarToggleButton3?> =
        (elements as
        Array<IAppBarToggleButton3?>).castToImpl<IAppBarToggleButton3,IAppBarToggleButton3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButton3?> =
        arrayOfNulls<IAppBarToggleButton3_Impl>(size) as Array<IAppBarToggleButton3?>
  }
}
