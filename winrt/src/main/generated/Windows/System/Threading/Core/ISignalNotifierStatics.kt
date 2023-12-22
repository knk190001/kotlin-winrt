package Windows.System.Threading.Core

import Windows.Foundation.TimeSpan
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

@ABIMarker(ISignalNotifierStatics.ABI::class)
@Signature("{1c4e4566-8400-46d3-a115-7d0c0dfc9f62}")
@Guid("1c4e4566840046d3a1157d0c0dfc9f62")
@WinRTInterface("1c4e4566840046d3a1157d0c0dfc9f62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISignalNotifierStatics.ByReference::class)
public interface ISignalNotifierStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AttachToEvent(name: String?, handler: SignalHandler?): SignalNotifier?

  @InterfaceMethod(1)
  public fun AttachToEvent(
    name: String?,
    handler: SignalHandler?,
    timeout: TimeSpan?
  ): SignalNotifier?

  @InterfaceMethod(2)
  public fun AttachToSemaphore(name: String?, handler: SignalHandler?): SignalNotifier?

  @InterfaceMethod(3)
  public fun AttachToSemaphore(
    name: String?,
    handler: SignalHandler?,
    timeout: TimeSpan?
  ): SignalNotifier?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISignalNotifierStatics> {
    public override fun getValue() = ABI.makeISignalNotifierStatics(pointer.getPointer(0))

    public fun setValue(value: ISignalNotifierStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISignalNotifierStatics {
    public val __251312279_Ptr: Pointer?

    public val _251312279_VtblPtr: Pointer?
      get() = __251312279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AttachToEvent(name: String?, handler: SignalHandler?): SignalNotifier? {
      val fnPtr = _251312279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SignalNotifier>()
      val hr = fn.invokeHR(arrayOf(__251312279_Ptr, marshalToNative(name), marshalToNative(handler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SignalNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AttachToEvent(
      name: String?,
      handler: SignalHandler?,
      timeout: TimeSpan?
    ): SignalNotifier? {
      val fnPtr = _251312279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SignalNotifier>()
      val hr = fn.invokeHR(arrayOf(__251312279_Ptr, marshalToNative(name), marshalToNative(handler),
          marshalToNative(timeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SignalNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun AttachToSemaphore(name: String?, handler: SignalHandler?): SignalNotifier? {
      val fnPtr = _251312279_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SignalNotifier>()
      val hr = fn.invokeHR(arrayOf(__251312279_Ptr, marshalToNative(name), marshalToNative(handler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SignalNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun AttachToSemaphore(
      name: String?,
      handler: SignalHandler?,
      timeout: TimeSpan?
    ): SignalNotifier? {
      val fnPtr = _251312279_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SignalNotifier>()
      val hr = fn.invokeHR(arrayOf(__251312279_Ptr, marshalToNative(name), marshalToNative(handler),
          marshalToNative(timeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SignalNotifier>(result.getValue())
      return resultValue
    }
  }

  public class ISignalNotifierStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __251312279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISignalNotifierStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c4e4566840046d3a1157d0c0dfc9f62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISignalNotifierStatics(ptr: Pointer?): WithDefault =
        ISignalNotifierStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISignalNotifierStatics {
      val address = segment.toRawLongValue()
      return makeISignalNotifierStatics(Pointer(address))
    }

    public override fun toNative(obj: ISignalNotifierStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__251312279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISignalNotifierStatics): Array<ISignalNotifierStatics?> =
        (elements as
        Array<ISignalNotifierStatics?>).castToImpl<ISignalNotifierStatics,ISignalNotifierStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISignalNotifierStatics?> =
        arrayOfNulls<ISignalNotifierStatics_Impl>(size) as Array<ISignalNotifierStatics?>
  }
}
