package Windows.Media.Capture

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ILowLagMediaRecording.ABI::class)
@Signature("{41c8baf7-ff3f-49f0-a477-f195e3ce5108}")
@Guid("41c8baf7ff3f49f0a477f195e3ce5108")
@WinRTInterface("41c8baf7ff3f49f0a477f195e3ce5108")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLagMediaRecording.ByReference::class)
public interface ILowLagMediaRecording : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun StopAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun FinishAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLagMediaRecording> {
    public override fun getValue() = ABI.makeILowLagMediaRecording(pointer.getPointer(0))

    public fun setValue(value: ILowLagMediaRecording_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLagMediaRecording {
    public val __1084771203_Ptr: Pointer?

    public val _1084771203_VtblPtr: Pointer?
      get() = __1084771203_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAsync(): IAsyncAction? {
      val fnPtr = _1084771203_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1084771203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StopAsync(): IAsyncAction? {
      val fnPtr = _1084771203_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1084771203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FinishAsync(): IAsyncAction? {
      val fnPtr = _1084771203_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1084771203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ILowLagMediaRecording_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1084771203_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLagMediaRecording, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41c8baf7ff3f49f0a477f195e3ce5108")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLagMediaRecording(ptr: Pointer?): WithDefault =
        ILowLagMediaRecording_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLagMediaRecording {
      val address = segment.toRawLongValue()
      return makeILowLagMediaRecording(Pointer(address))
    }

    public override fun toNative(obj: ILowLagMediaRecording): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1084771203_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLagMediaRecording): Array<ILowLagMediaRecording?> =
        (elements as
        Array<ILowLagMediaRecording?>).castToImpl<ILowLagMediaRecording,ILowLagMediaRecording_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLagMediaRecording?> =
        arrayOfNulls<ILowLagMediaRecording_Impl>(size) as Array<ILowLagMediaRecording?>
  }
}
