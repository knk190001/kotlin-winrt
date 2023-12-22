package Microsoft.UI.Input

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICharacterReceivedEventArgs.ABI::class)
@Signature("{36122718-9263-592b-8d87-8f86543ffc95}")
@Guid("361227189263592b8d878f86543ffc95")
@WinRTInterface("361227189263592b8d878f86543ffc95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICharacterReceivedEventArgs.ByReference::class)
public interface ICharacterReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_KeyCode(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_KeyStatus(): PhysicalKeyStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICharacterReceivedEventArgs> {
    public override fun getValue() = ABI.makeICharacterReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICharacterReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICharacterReceivedEventArgs {
    public val __898417210_Ptr: Pointer?

    public val _898417210_VtblPtr: Pointer?
      get() = __898417210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _898417210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__898417210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _898417210_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__898417210_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyCode(): WinDef.UINT {
      val fnPtr = _898417210_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__898417210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_KeyStatus(): PhysicalKeyStatus? {
      val fnPtr = _898417210_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__898417210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhysicalKeyStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICharacterReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __898417210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICharacterReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("361227189263592b8d878f86543ffc95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICharacterReceivedEventArgs(ptr: Pointer?): WithDefault =
        ICharacterReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICharacterReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeICharacterReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICharacterReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__898417210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICharacterReceivedEventArgs):
        Array<ICharacterReceivedEventArgs?> = (elements as
        Array<ICharacterReceivedEventArgs?>).castToImpl<ICharacterReceivedEventArgs,ICharacterReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICharacterReceivedEventArgs?> =
        arrayOfNulls<ICharacterReceivedEventArgs_Impl>(size) as Array<ICharacterReceivedEventArgs?>
  }
}
