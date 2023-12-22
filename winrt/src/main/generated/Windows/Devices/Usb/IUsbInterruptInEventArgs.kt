package Windows.Devices.Usb

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IUsbInterruptInEventArgs.ABI::class)
@Signature("{b7b04092-1418-4936-8209-299cf5605583}")
@Guid("b7b04092141849368209299cf5605583")
@WinRTInterface("b7b04092141849368209299cf5605583")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterruptInEventArgs.ByReference::class)
public interface IUsbInterruptInEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InterruptData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterruptInEventArgs> {
    public override fun getValue() = ABI.makeIUsbInterruptInEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUsbInterruptInEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterruptInEventArgs {
    public val __222688430_Ptr: Pointer?

    public val _222688430_VtblPtr: Pointer?
      get() = __222688430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InterruptData(): IBuffer? {
      val fnPtr = _222688430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__222688430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterruptInEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __222688430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterruptInEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7b04092141849368209299cf5605583")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterruptInEventArgs(ptr: Pointer?): WithDefault =
        IUsbInterruptInEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterruptInEventArgs {
      val address = segment.toRawLongValue()
      return makeIUsbInterruptInEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterruptInEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__222688430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterruptInEventArgs):
        Array<IUsbInterruptInEventArgs?> = (elements as
        Array<IUsbInterruptInEventArgs?>).castToImpl<IUsbInterruptInEventArgs,IUsbInterruptInEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterruptInEventArgs?> =
        arrayOfNulls<IUsbInterruptInEventArgs_Impl>(size) as Array<IUsbInterruptInEventArgs?>
  }
}
