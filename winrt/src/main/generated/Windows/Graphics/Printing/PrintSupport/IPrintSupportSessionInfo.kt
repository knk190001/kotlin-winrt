package Windows.Graphics.Printing.PrintSupport

import Windows.ApplicationModel.AppInfo
import Windows.Devices.Printers.IppPrintDevice
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

@ABIMarker(IPrintSupportSessionInfo.ABI::class)
@Signature("{852149af-777d-53e9-9ee9-45d3f4b5be9c}")
@Guid("852149af777d53e99ee945d3f4b5be9c")
@WinRTInterface("852149af777d53e99ee945d3f4b5be9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportSessionInfo.ByReference::class)
public interface IPrintSupportSessionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceAppInfo(): AppInfo?

  @InterfaceMethod(1)
  public fun get_Printer(): IppPrintDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportSessionInfo> {
    public override fun getValue() = ABI.makeIPrintSupportSessionInfo(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportSessionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportSessionInfo {
    public val __1573915804_Ptr: Pointer?

    public val _1573915804_VtblPtr: Pointer?
      get() = __1573915804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceAppInfo(): AppInfo? {
      val fnPtr = _1573915804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__1573915804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Printer(): IppPrintDevice? {
      val fnPtr = _1573915804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppPrintDevice>()
      val hr = fn.invokeHR(arrayOf(__1573915804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppPrintDevice>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSupportSessionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1573915804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportSessionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("852149af777d53e99ee945d3f4b5be9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportSessionInfo(ptr: Pointer?): WithDefault =
        IPrintSupportSessionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintSupportSessionInfo {
      val address = segment.toRawLongValue()
      return makeIPrintSupportSessionInfo(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportSessionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1573915804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportSessionInfo):
        Array<IPrintSupportSessionInfo?> = (elements as
        Array<IPrintSupportSessionInfo?>).castToImpl<IPrintSupportSessionInfo,IPrintSupportSessionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintSupportSessionInfo?> =
        arrayOfNulls<IPrintSupportSessionInfo_Impl>(size) as Array<IPrintSupportSessionInfo?>
  }
}
