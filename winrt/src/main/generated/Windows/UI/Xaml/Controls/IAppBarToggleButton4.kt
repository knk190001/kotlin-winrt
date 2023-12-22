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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBarToggleButton4.ABI::class)
@Signature("{b86b736e-3eaf-4751-a897-00029f1f6aca}")
@Guid("b86b736e3eaf4751a89700029f1f6aca")
@WinRTInterface("b86b736e3eaf4751a89700029f1f6aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButton4.ByReference::class)
public interface IAppBarToggleButton4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextOverride(): String?

  @InterfaceMethod(1)
  public fun put_KeyboardAcceleratorTextOverride(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButton4> {
    public override fun getValue() = ABI.makeIAppBarToggleButton4(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButton4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButton4 {
    public val __1248128352_Ptr: Pointer?

    public val _1248128352_VtblPtr: Pointer?
      get() = __1248128352_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextOverride(): String? {
      val fnPtr = _1248128352_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1248128352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeyboardAcceleratorTextOverride(value: String?): Unit {
      val fnPtr = _1248128352_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1248128352_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBarToggleButton4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248128352_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButton4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b86b736e3eaf4751a89700029f1f6aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButton4(ptr: Pointer?): WithDefault = IAppBarToggleButton4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButton4 {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButton4(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButton4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1248128352_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButton4): Array<IAppBarToggleButton4?> =
        (elements as
        Array<IAppBarToggleButton4?>).castToImpl<IAppBarToggleButton4,IAppBarToggleButton4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButton4?> =
        arrayOfNulls<IAppBarToggleButton4_Impl>(size) as Array<IAppBarToggleButton4?>
  }
}
