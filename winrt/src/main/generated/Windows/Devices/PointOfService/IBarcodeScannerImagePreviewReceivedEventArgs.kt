package Windows.Devices.PointOfService

import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

@ABIMarker(IBarcodeScannerImagePreviewReceivedEventArgs.ABI::class)
@Signature("{f3b7de85-6e8b-434e-9f58-06ef26bc4baf}")
@Guid("f3b7de856e8b434e9f5806ef26bc4baf")
@WinRTInterface("f3b7de856e8b434e9f5806ef26bc4baf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerImagePreviewReceivedEventArgs.ByReference::class)
public interface IBarcodeScannerImagePreviewReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Preview(): IRandomAccessStreamWithContentType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerImagePreviewReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerImagePreviewReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerImagePreviewReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerImagePreviewReceivedEventArgs {
    public val __1074174452_Ptr: Pointer?

    public val _1074174452_VtblPtr: Pointer?
      get() = __1074174452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Preview(): IRandomAccessStreamWithContentType? {
      val fnPtr = _1074174452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamWithContentType>()
      val hr = fn.invokeHR(arrayOf(__1074174452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamWithContentType>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerImagePreviewReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1074174452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerImagePreviewReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3b7de856e8b434e9f5806ef26bc4baf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerImagePreviewReceivedEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerImagePreviewReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerImagePreviewReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerImagePreviewReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerImagePreviewReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1074174452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerImagePreviewReceivedEventArgs):
        Array<IBarcodeScannerImagePreviewReceivedEventArgs?> = (elements as
        Array<IBarcodeScannerImagePreviewReceivedEventArgs?>).castToImpl<IBarcodeScannerImagePreviewReceivedEventArgs,IBarcodeScannerImagePreviewReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerImagePreviewReceivedEventArgs?> =
        arrayOfNulls<IBarcodeScannerImagePreviewReceivedEventArgs_Impl>(size) as
        Array<IBarcodeScannerImagePreviewReceivedEventArgs?>
  }
}
