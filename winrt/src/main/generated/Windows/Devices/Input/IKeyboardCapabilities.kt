package Windows.Devices.Input

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

@ABIMarker(IKeyboardCapabilities.ABI::class)
@Signature("{3a3f9b56-6798-4bbc-833e-0f34b17c65ff}")
@Guid("3a3f9b5667984bbc833e0f34b17c65ff")
@WinRTInterface("3a3f9b5667984bbc833e0f34b17c65ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardCapabilities.ByReference::class)
public interface IKeyboardCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardPresent(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardCapabilities> {
    public override fun getValue() = ABI.makeIKeyboardCapabilities(pointer.getPointer(0))

    public fun setValue(value: IKeyboardCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardCapabilities {
    public val __1830369032_Ptr: Pointer?

    public val _1830369032_VtblPtr: Pointer?
      get() = __1830369032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardPresent(): Int {
      val fnPtr = _1830369032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1830369032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IKeyboardCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1830369032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a3f9b5667984bbc833e0f34b17c65ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardCapabilities(ptr: Pointer?): WithDefault =
        IKeyboardCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardCapabilities {
      val address = segment.toRawLongValue()
      return makeIKeyboardCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1830369032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardCapabilities): Array<IKeyboardCapabilities?> =
        (elements as
        Array<IKeyboardCapabilities?>).castToImpl<IKeyboardCapabilities,IKeyboardCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardCapabilities?> =
        arrayOfNulls<IKeyboardCapabilities_Impl>(size) as Array<IKeyboardCapabilities?>
  }
}
