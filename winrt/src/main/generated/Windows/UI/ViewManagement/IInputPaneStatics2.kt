package Windows.UI.ViewManagement

import Windows.UI.UIContext
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

@ABIMarker(IInputPaneStatics2.ABI::class)
@Signature("{1b63529b-d9ec-4531-8445-71bab9fb828e}")
@Guid("1b63529bd9ec4531844571bab9fb828e")
@WinRTInterface("1b63529bd9ec4531844571bab9fb828e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPaneStatics2.ByReference::class)
public interface IInputPaneStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUIContext(context: UIContext?): InputPane?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPaneStatics2> {
    public override fun getValue() = ABI.makeIInputPaneStatics2(pointer.getPointer(0))

    public fun setValue(value: IInputPaneStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPaneStatics2 {
    public val __1571556653_Ptr: Pointer?

    public val _1571556653_VtblPtr: Pointer?
      get() = __1571556653_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUIContext(context: UIContext?): InputPane? {
      val fnPtr = _1571556653_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPane>()
      val hr = fn.invokeHR(arrayOf(__1571556653_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPane>(result.getValue())
      return resultValue
    }
  }

  public class IInputPaneStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1571556653_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPaneStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b63529bd9ec4531844571bab9fb828e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPaneStatics2(ptr: Pointer?): WithDefault = IInputPaneStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPaneStatics2 {
      val address = segment.toRawLongValue()
      return makeIInputPaneStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInputPaneStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1571556653_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPaneStatics2): Array<IInputPaneStatics2?> =
        (elements as
        Array<IInputPaneStatics2?>).castToImpl<IInputPaneStatics2,IInputPaneStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPaneStatics2?> =
        arrayOfNulls<IInputPaneStatics2_Impl>(size) as Array<IInputPaneStatics2?>
  }
}
