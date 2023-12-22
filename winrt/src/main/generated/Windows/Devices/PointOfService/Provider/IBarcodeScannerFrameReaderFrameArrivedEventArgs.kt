package Windows.Devices.PointOfService.Provider

import Windows.Foundation.Deferral
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

@ABIMarker(IBarcodeScannerFrameReaderFrameArrivedEventArgs.ABI::class)
@Signature("{b0bbd604-54fd-436d-8629-712e787223dd}")
@Guid("b0bbd60454fd436d8629712e787223dd")
@WinRTInterface("b0bbd60454fd436d8629712e787223dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerFrameReaderFrameArrivedEventArgs.ByReference::class)
public interface IBarcodeScannerFrameReaderFrameArrivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerFrameReaderFrameArrivedEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerFrameReaderFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerFrameReaderFrameArrivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerFrameReaderFrameArrivedEventArgs {
    public val __38999527_Ptr: Pointer?

    public val _38999527_VtblPtr: Pointer?
      get() = __38999527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _38999527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__38999527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerFrameReaderFrameArrivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __38999527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerFrameReaderFrameArrivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0bbd60454fd436d8629712e787223dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerFrameReaderFrameArrivedEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerFrameReaderFrameArrivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerFrameReaderFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerFrameReaderFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerFrameReaderFrameArrivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__38999527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerFrameReaderFrameArrivedEventArgs):
        Array<IBarcodeScannerFrameReaderFrameArrivedEventArgs?> = (elements as
        Array<IBarcodeScannerFrameReaderFrameArrivedEventArgs?>).castToImpl<IBarcodeScannerFrameReaderFrameArrivedEventArgs,IBarcodeScannerFrameReaderFrameArrivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerFrameReaderFrameArrivedEventArgs?>
        = arrayOfNulls<IBarcodeScannerFrameReaderFrameArrivedEventArgs_Impl>(size) as
        Array<IBarcodeScannerFrameReaderFrameArrivedEventArgs?>
  }
}
