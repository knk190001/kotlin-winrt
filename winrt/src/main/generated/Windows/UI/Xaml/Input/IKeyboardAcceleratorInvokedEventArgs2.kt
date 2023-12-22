package Windows.UI.Xaml.Input

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

@ABIMarker(IKeyboardAcceleratorInvokedEventArgs2.ABI::class)
@Signature("{befca4b8-5907-48ee-8e21-9c969078fa11}")
@Guid("befca4b8590748ee8e219c969078fa11")
@WinRTInterface("befca4b8590748ee8e219c969078fa11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardAcceleratorInvokedEventArgs2.ByReference::class)
public interface IKeyboardAcceleratorInvokedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAccelerator(): KeyboardAccelerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardAcceleratorInvokedEventArgs2> {
    public override fun getValue() =
        ABI.makeIKeyboardAcceleratorInvokedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IKeyboardAcceleratorInvokedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardAcceleratorInvokedEventArgs2 {
    public val __1619539129_Ptr: Pointer?

    public val _1619539129_VtblPtr: Pointer?
      get() = __1619539129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAccelerator(): KeyboardAccelerator? {
      val fnPtr = _1619539129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardAccelerator>()
      val hr = fn.invokeHR(arrayOf(__1619539129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardAccelerator>(result.getValue())
      return resultValue
    }
  }

  public class IKeyboardAcceleratorInvokedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1619539129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardAcceleratorInvokedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("befca4b8590748ee8e219c969078fa11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardAcceleratorInvokedEventArgs2(ptr: Pointer?): WithDefault =
        IKeyboardAcceleratorInvokedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardAcceleratorInvokedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIKeyboardAcceleratorInvokedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardAcceleratorInvokedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1619539129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardAcceleratorInvokedEventArgs2):
        Array<IKeyboardAcceleratorInvokedEventArgs2?> = (elements as
        Array<IKeyboardAcceleratorInvokedEventArgs2?>).castToImpl<IKeyboardAcceleratorInvokedEventArgs2,IKeyboardAcceleratorInvokedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardAcceleratorInvokedEventArgs2?> =
        arrayOfNulls<IKeyboardAcceleratorInvokedEventArgs2_Impl>(size) as
        Array<IKeyboardAcceleratorInvokedEventArgs2?>
  }
}
