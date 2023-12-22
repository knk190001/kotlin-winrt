package Windows.Devices.PointOfService

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IBarcodeScannerReport.ABI::class)
@Signature("{5ce4d8b0-a489-4b96-86c4-f0bf8a37753d}")
@Guid("5ce4d8b0a4894b9686c4f0bf8a37753d")
@WinRTInterface("5ce4d8b0a4894b9686c4f0bf8a37753d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerReport.ByReference::class)
public interface IBarcodeScannerReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScanDataType(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ScanData(): IBuffer?

  @InterfaceMethod(2)
  public fun get_ScanDataLabel(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerReport> {
    public override fun getValue() = ABI.makeIBarcodeScannerReport(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerReport {
    public val __1209122257_Ptr: Pointer?

    public val _1209122257_VtblPtr: Pointer?
      get() = __1209122257_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScanDataType(): WinDef.UINT {
      val fnPtr = _1209122257_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1209122257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ScanData(): IBuffer? {
      val fnPtr = _1209122257_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1209122257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ScanDataLabel(): IBuffer? {
      val fnPtr = _1209122257_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1209122257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209122257_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ce4d8b0a4894b9686c4f0bf8a37753d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerReport(ptr: Pointer?): WithDefault =
        IBarcodeScannerReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerReport {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerReport(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209122257_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerReport): Array<IBarcodeScannerReport?> =
        (elements as
        Array<IBarcodeScannerReport?>).castToImpl<IBarcodeScannerReport,IBarcodeScannerReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerReport?> =
        arrayOfNulls<IBarcodeScannerReport_Impl>(size) as Array<IBarcodeScannerReport?>
  }
}
