package Windows.Graphics.Printing.PrintSupport

import Windows.Data.Xml.Dom.XmlDocument
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

@ABIMarker(IPrintSupportPrintDeviceCapabilitiesChangedEventArgs.ABI::class)
@Signature("{15969bf0-9028-5722-8a37-7d7c34b41dd6}")
@Guid("15969bf0902857228a377d7c34b41dd6")
@WinRTInterface("15969bf0902857228a377d7c34b41dd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportPrintDeviceCapabilitiesChangedEventArgs.ByReference::class)
public interface IPrintSupportPrintDeviceCapabilitiesChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentPrintDeviceCapabilities(): XmlDocument?

  @InterfaceMethod(1)
  public fun UpdatePrintDeviceCapabilities(updatedPdc: XmlDocument?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintSupportPrintDeviceCapabilitiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportPrintDeviceCapabilitiesChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportPrintDeviceCapabilitiesChangedEventArgs {
    public val __1995003052_Ptr: Pointer?

    public val _1995003052_VtblPtr: Pointer?
      get() = __1995003052_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentPrintDeviceCapabilities(): XmlDocument? {
      val fnPtr = _1995003052_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1995003052_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdatePrintDeviceCapabilities(updatedPdc: XmlDocument?): Unit {
      val fnPtr = _1995003052_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1995003052_Ptr, marshalToNative(updatedPdc),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1995003052_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1995003052_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSupportPrintDeviceCapabilitiesChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1995003052_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15969bf0902857228a377d7c34b41dd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportPrintDeviceCapabilitiesChangedEventArgs(ptr: Pointer?): WithDefault
        = IPrintSupportPrintDeviceCapabilitiesChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintSupportPrintDeviceCapabilitiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintSupportPrintDeviceCapabilitiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportPrintDeviceCapabilitiesChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1995003052_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportPrintDeviceCapabilitiesChangedEventArgs):
        Array<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs?> = (elements as
        Array<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs?>).castToImpl<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs,IPrintSupportPrintDeviceCapabilitiesChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs?> =
        arrayOfNulls<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs_Impl>(size) as
        Array<IPrintSupportPrintDeviceCapabilitiesChangedEventArgs?>
  }
}
