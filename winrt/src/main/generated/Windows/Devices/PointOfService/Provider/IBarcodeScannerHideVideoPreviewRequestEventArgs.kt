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

@ABIMarker(IBarcodeScannerHideVideoPreviewRequestEventArgs.ABI::class)
@Signature("{16a281fc-d6be-4bc7-9df1-33741f3eadea}")
@Guid("16a281fcd6be4bc79df133741f3eadea")
@WinRTInterface("16a281fcd6be4bc79df133741f3eadea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerHideVideoPreviewRequestEventArgs.ByReference::class)
public interface IBarcodeScannerHideVideoPreviewRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): BarcodeScannerHideVideoPreviewRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerHideVideoPreviewRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerHideVideoPreviewRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerHideVideoPreviewRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerHideVideoPreviewRequestEventArgs {
    public val __1757992791_Ptr: Pointer?

    public val _1757992791_VtblPtr: Pointer?
      get() = __1757992791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): BarcodeScannerHideVideoPreviewRequest? {
      val fnPtr = _1757992791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerHideVideoPreviewRequest>()
      val hr = fn.invokeHR(arrayOf(__1757992791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerHideVideoPreviewRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1757992791_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1757992791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerHideVideoPreviewRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1757992791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerHideVideoPreviewRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16a281fcd6be4bc79df133741f3eadea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerHideVideoPreviewRequestEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerHideVideoPreviewRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerHideVideoPreviewRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerHideVideoPreviewRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerHideVideoPreviewRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1757992791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerHideVideoPreviewRequestEventArgs):
        Array<IBarcodeScannerHideVideoPreviewRequestEventArgs?> = (elements as
        Array<IBarcodeScannerHideVideoPreviewRequestEventArgs?>).castToImpl<IBarcodeScannerHideVideoPreviewRequestEventArgs,IBarcodeScannerHideVideoPreviewRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerHideVideoPreviewRequestEventArgs?>
        = arrayOfNulls<IBarcodeScannerHideVideoPreviewRequestEventArgs_Impl>(size) as
        Array<IBarcodeScannerHideVideoPreviewRequestEventArgs?>
  }
}
