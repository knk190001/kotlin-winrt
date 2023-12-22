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

@ABIMarker(IBarcodeScannerReportFactory.ABI::class)
@Signature("{a2547326-2013-457c-8963-49c15dca78ce}")
@Guid("a25473262013457c896349c15dca78ce")
@WinRTInterface("a25473262013457c896349c15dca78ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerReportFactory.ByReference::class)
public interface IBarcodeScannerReportFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    scanDataType: WinDef.UINT,
    scanData: IBuffer?,
    scanDataLabel: IBuffer?
  ): BarcodeScannerReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerReportFactory> {
    public override fun getValue() = ABI.makeIBarcodeScannerReportFactory(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerReportFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerReportFactory {
    public val __504820231_Ptr: Pointer?

    public val _504820231_VtblPtr: Pointer?
      get() = __504820231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      scanDataType: WinDef.UINT,
      scanData: IBuffer?,
      scanDataLabel: IBuffer?
    ): BarcodeScannerReport? {
      val fnPtr = _504820231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerReport>()
      val hr = fn.invokeHR(arrayOf(__504820231_Ptr, scanDataType, marshalToNative(scanData),
          marshalToNative(scanDataLabel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerReport>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerReportFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __504820231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerReportFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a25473262013457c896349c15dca78ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerReportFactory(ptr: Pointer?): WithDefault =
        IBarcodeScannerReportFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerReportFactory {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerReportFactory(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerReportFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__504820231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerReportFactory):
        Array<IBarcodeScannerReportFactory?> = (elements as
        Array<IBarcodeScannerReportFactory?>).castToImpl<IBarcodeScannerReportFactory,IBarcodeScannerReportFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerReportFactory?> =
        arrayOfNulls<IBarcodeScannerReportFactory_Impl>(size) as
        Array<IBarcodeScannerReportFactory?>
  }
}
