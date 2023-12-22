package Microsoft.UI.Xaml.Input

import Windows.System.VirtualKey
import Windows.System.VirtualKeyModifiers
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProcessKeyboardAcceleratorEventArgs.ABI::class)
@Signature("{9be0d058-3d26-5811-b50a-3bb80ca766c9}")
@Guid("9be0d0583d265811b50a3bb80ca766c9")
@WinRTInterface("9be0d0583d265811b50a3bb80ca766c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessKeyboardAcceleratorEventArgs.ByReference::class)
public interface IProcessKeyboardAcceleratorEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Key(): VirtualKey?

  @InterfaceMethod(1)
  public fun get_Modifiers(): VirtualKeyModifiers?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessKeyboardAcceleratorEventArgs> {
    public override fun getValue() =
        ABI.makeIProcessKeyboardAcceleratorEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProcessKeyboardAcceleratorEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessKeyboardAcceleratorEventArgs {
    public val __2074029033_Ptr: Pointer?

    public val _2074029033_VtblPtr: Pointer?
      get() = __2074029033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Key(): VirtualKey? {
      val fnPtr = _2074029033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__2074029033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Modifiers(): VirtualKeyModifiers? {
      val fnPtr = _2074029033_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__2074029033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _2074029033_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2074029033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _2074029033_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2074029033_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProcessKeyboardAcceleratorEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2074029033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessKeyboardAcceleratorEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9be0d0583d265811b50a3bb80ca766c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessKeyboardAcceleratorEventArgs(ptr: Pointer?): WithDefault =
        IProcessKeyboardAcceleratorEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessKeyboardAcceleratorEventArgs {
      val address = segment.toRawLongValue()
      return makeIProcessKeyboardAcceleratorEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProcessKeyboardAcceleratorEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2074029033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessKeyboardAcceleratorEventArgs):
        Array<IProcessKeyboardAcceleratorEventArgs?> = (elements as
        Array<IProcessKeyboardAcceleratorEventArgs?>).castToImpl<IProcessKeyboardAcceleratorEventArgs,IProcessKeyboardAcceleratorEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessKeyboardAcceleratorEventArgs?> =
        arrayOfNulls<IProcessKeyboardAcceleratorEventArgs_Impl>(size) as
        Array<IProcessKeyboardAcceleratorEventArgs?>
  }
}
