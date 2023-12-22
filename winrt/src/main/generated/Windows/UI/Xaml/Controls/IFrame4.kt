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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrame4.ABI::class)
@Signature("{9b17c21a-bd2b-4a00-99eb-946be9618084}")
@Guid("9b17c21abd2b4a0099eb946be9618084")
@WinRTInterface("9b17c21abd2b4a0099eb946be9618084")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrame4.ByReference::class)
public interface IFrame4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetNavigationState(navigationState: String?, suppressNavigate: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrame4> {
    public override fun getValue() = ABI.makeIFrame4(pointer.getPointer(0))

    public fun setValue(value: IFrame4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrame4 {
    public val __368728963_Ptr: Pointer?

    public val _368728963_VtblPtr: Pointer?
      get() = __368728963_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetNavigationState(navigationState: String?, suppressNavigate: Boolean):
        Unit {
      val fnPtr = _368728963_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368728963_Ptr, marshalToNative(navigationState),
          suppressNavigate,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrame4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __368728963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrame4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b17c21abd2b4a0099eb946be9618084")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrame4(ptr: Pointer?): WithDefault = IFrame4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrame4 {
      val address = segment.toRawLongValue()
      return makeIFrame4(Pointer(address))
    }

    public override fun toNative(obj: IFrame4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__368728963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrame4): Array<IFrame4?> = (elements as
        Array<IFrame4?>).castToImpl<IFrame4,IFrame4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrame4?> = arrayOfNulls<IFrame4_Impl>(size) as
        Array<IFrame4?>
  }
}
