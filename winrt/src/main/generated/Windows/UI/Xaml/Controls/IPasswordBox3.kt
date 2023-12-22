package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Input.InputScope
import Windows.UI.Xaml.TextReadingOrder
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

@ABIMarker(IPasswordBox3.ABI::class)
@Signature("{6024d9d1-56b7-41f0-9558-3934c14244d6}")
@Guid("6024d9d156b741f095583934c14244d6")
@WinRTInterface("6024d9d156b741f095583934c14244d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBox3.ByReference::class)
public interface IPasswordBox3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PasswordRevealMode(): PasswordRevealMode?

  @InterfaceMethod(1)
  public fun put_PasswordRevealMode(value: PasswordRevealMode?): Unit

  @InterfaceMethod(2)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(3)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(4)
  public fun get_InputScope(): InputScope?

  @InterfaceMethod(5)
  public fun put_InputScope(value: InputScope?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPasswordBox3>
      {
    public override fun getValue() = ABI.makeIPasswordBox3(pointer.getPointer(0))

    public fun setValue(value: IPasswordBox3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBox3 {
    public val __1928181535_Ptr: Pointer?

    public val _1928181535_VtblPtr: Pointer?
      get() = __1928181535_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PasswordRevealMode(): PasswordRevealMode? {
      val fnPtr = _1928181535_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordRevealMode>()
      val hr = fn.invokeHR(arrayOf(__1928181535_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordRevealMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PasswordRevealMode(value: PasswordRevealMode?): Unit {
      val fnPtr = _1928181535_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1928181535_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _1928181535_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__1928181535_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _1928181535_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1928181535_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InputScope(): InputScope? {
      val fnPtr = _1928181535_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputScope>()
      val hr = fn.invokeHR(arrayOf(__1928181535_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_InputScope(value: InputScope?): Unit {
      val fnPtr = _1928181535_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1928181535_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPasswordBox3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1928181535_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBox3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6024d9d156b741f095583934c14244d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBox3(ptr: Pointer?): WithDefault = IPasswordBox3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBox3 {
      val address = segment.toRawLongValue()
      return makeIPasswordBox3(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBox3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1928181535_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBox3): Array<IPasswordBox3?> = (elements as
        Array<IPasswordBox3?>).castToImpl<IPasswordBox3,IPasswordBox3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBox3?> =
        arrayOfNulls<IPasswordBox3_Impl>(size) as Array<IPasswordBox3?>
  }
}
