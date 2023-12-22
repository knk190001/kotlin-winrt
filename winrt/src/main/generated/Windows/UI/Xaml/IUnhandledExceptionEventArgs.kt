package Windows.UI.Xaml

import Windows.Foundation.HResult
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

@ABIMarker(IUnhandledExceptionEventArgs.ABI::class)
@Signature("{7230269c-054e-4cf3-86c5-be90eb6863d5}")
@Guid("7230269c054e4cf386c5be90eb6863d5")
@WinRTInterface("7230269c054e4cf386c5be90eb6863d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnhandledExceptionEventArgs.ByReference::class)
public interface IUnhandledExceptionEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exception(): HResult?

  @InterfaceMethod(1)
  public fun get_Message(): String?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnhandledExceptionEventArgs> {
    public override fun getValue() = ABI.makeIUnhandledExceptionEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUnhandledExceptionEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnhandledExceptionEventArgs {
    public val __730954407_Ptr: Pointer?

    public val _730954407_VtblPtr: Pointer?
      get() = __730954407_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exception(): HResult? {
      val fnPtr = _730954407_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__730954407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Message(): String? {
      val fnPtr = _730954407_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__730954407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _730954407_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__730954407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _730954407_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__730954407_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUnhandledExceptionEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __730954407_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnhandledExceptionEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7230269c054e4cf386c5be90eb6863d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnhandledExceptionEventArgs(ptr: Pointer?): WithDefault =
        IUnhandledExceptionEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnhandledExceptionEventArgs {
      val address = segment.toRawLongValue()
      return makeIUnhandledExceptionEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUnhandledExceptionEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__730954407_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnhandledExceptionEventArgs):
        Array<IUnhandledExceptionEventArgs?> = (elements as
        Array<IUnhandledExceptionEventArgs?>).castToImpl<IUnhandledExceptionEventArgs,IUnhandledExceptionEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnhandledExceptionEventArgs?> =
        arrayOfNulls<IUnhandledExceptionEventArgs_Impl>(size) as
        Array<IUnhandledExceptionEventArgs?>
  }
}
