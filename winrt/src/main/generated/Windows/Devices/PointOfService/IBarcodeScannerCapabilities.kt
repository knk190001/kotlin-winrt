package Windows.Devices.PointOfService

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

@ABIMarker(IBarcodeScannerCapabilities.ABI::class)
@Signature("{c60691e4-f2c8-4420-a307-b12ef6622857}")
@Guid("c60691e4f2c84420a307b12ef6622857")
@WinRTInterface("c60691e4f2c84420a307b12ef6622857")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerCapabilities.ByReference::class)
public interface IBarcodeScannerCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PowerReportingType(): UnifiedPosPowerReportingType?

  @InterfaceMethod(1)
  public fun get_IsStatisticsReportingSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsStatisticsUpdatingSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsImagePreviewSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerCapabilities> {
    public override fun getValue() = ABI.makeIBarcodeScannerCapabilities(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerCapabilities {
    public val __2023673491_Ptr: Pointer?

    public val _2023673491_VtblPtr: Pointer?
      get() = __2023673491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PowerReportingType(): UnifiedPosPowerReportingType? {
      val fnPtr = _2023673491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosPowerReportingType>()
      val hr = fn.invokeHR(arrayOf(__2023673491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosPowerReportingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStatisticsReportingSupported(): Boolean {
      val fnPtr = _2023673491_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2023673491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsStatisticsUpdatingSupported(): Boolean {
      val fnPtr = _2023673491_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2023673491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsImagePreviewSupported(): Boolean {
      val fnPtr = _2023673491_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2023673491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarcodeScannerCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2023673491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c60691e4f2c84420a307b12ef6622857")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerCapabilities(ptr: Pointer?): WithDefault =
        IBarcodeScannerCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerCapabilities {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023673491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerCapabilities):
        Array<IBarcodeScannerCapabilities?> = (elements as
        Array<IBarcodeScannerCapabilities?>).castToImpl<IBarcodeScannerCapabilities,IBarcodeScannerCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerCapabilities?> =
        arrayOfNulls<IBarcodeScannerCapabilities_Impl>(size) as Array<IBarcodeScannerCapabilities?>
  }
}
