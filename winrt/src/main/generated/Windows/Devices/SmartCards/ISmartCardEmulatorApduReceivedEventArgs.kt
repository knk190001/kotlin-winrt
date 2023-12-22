package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardEmulatorApduReceivedEventArgs.ABI::class)
@Signature("{d55d1576-69d2-5333-5b5f-f8c0d6e9f09f}")
@Guid("d55d157669d253335b5ff8c0d6e9f09f")
@WinRTInterface("d55d157669d253335b5ff8c0d6e9f09f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulatorApduReceivedEventArgs.ByReference::class)
public interface ISmartCardEmulatorApduReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommandApdu(): IBuffer?

  @InterfaceMethod(1)
  public fun get_ConnectionProperties(): SmartCardEmulatorConnectionProperties?

  @InterfaceMethod(2)
  public fun TryRespondAsync(responseApdu: IBuffer?): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun get_AutomaticResponseStatus(): SmartCardAutomaticResponseStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorApduReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeISmartCardEmulatorApduReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorApduReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorApduReceivedEventArgs {
    public val __697559291_Ptr: Pointer?

    public val _697559291_VtblPtr: Pointer?
      get() = __697559291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommandApdu(): IBuffer? {
      val fnPtr = _697559291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__697559291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionProperties(): SmartCardEmulatorConnectionProperties? {
      val fnPtr = _697559291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulatorConnectionProperties>()
      val hr = fn.invokeHR(arrayOf(__697559291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulatorConnectionProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryRespondAsync(responseApdu: IBuffer?): IAsyncOperation<Boolean>? {
      val fnPtr = _697559291_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__697559291_Ptr, marshalToNative(responseApdu), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AutomaticResponseStatus(): SmartCardAutomaticResponseStatus? {
      val fnPtr = _697559291_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardAutomaticResponseStatus>()
      val hr = fn.invokeHR(arrayOf(__697559291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardAutomaticResponseStatus>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardEmulatorApduReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697559291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorApduReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d55d157669d253335b5ff8c0d6e9f09f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorApduReceivedEventArgs(ptr: Pointer?): WithDefault =
        ISmartCardEmulatorApduReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardEmulatorApduReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorApduReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorApduReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697559291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorApduReceivedEventArgs):
        Array<ISmartCardEmulatorApduReceivedEventArgs?> = (elements as
        Array<ISmartCardEmulatorApduReceivedEventArgs?>).castToImpl<ISmartCardEmulatorApduReceivedEventArgs,ISmartCardEmulatorApduReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulatorApduReceivedEventArgs?> =
        arrayOfNulls<ISmartCardEmulatorApduReceivedEventArgs_Impl>(size) as
        Array<ISmartCardEmulatorApduReceivedEventArgs?>
  }
}
