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

@ABIMarker(IPosPrinterStatus.ABI::class)
@Signature("{d1f0c730-da40-4328-bf76-5156fa33b747}")
@Guid("d1f0c730da404328bf765156fa33b747")
@WinRTInterface("d1f0c730da404328bf765156fa33b747")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterStatus.ByReference::class)
public interface IPosPrinterStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StatusKind(): PosPrinterStatusKind?

  @InterfaceMethod(1)
  public fun get_ExtendedStatus(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterStatus> {
    public override fun getValue() = ABI.makeIPosPrinterStatus(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterStatus {
    public val __516062167_Ptr: Pointer?

    public val _516062167_VtblPtr: Pointer?
      get() = __516062167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StatusKind(): PosPrinterStatusKind? {
      val fnPtr = _516062167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterStatusKind>()
      val hr = fn.invokeHR(arrayOf(__516062167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterStatusKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedStatus(): WinDef.UINT {
      val fnPtr = _516062167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__516062167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPosPrinterStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __516062167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1f0c730da404328bf765156fa33b747")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterStatus(ptr: Pointer?): WithDefault = IPosPrinterStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterStatus {
      val address = segment.toRawLongValue()
      return makeIPosPrinterStatus(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516062167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterStatus): Array<IPosPrinterStatus?> = (elements
        as Array<IPosPrinterStatus?>).castToImpl<IPosPrinterStatus,IPosPrinterStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterStatus?> =
        arrayOfNulls<IPosPrinterStatus_Impl>(size) as Array<IPosPrinterStatus?>
  }
}
