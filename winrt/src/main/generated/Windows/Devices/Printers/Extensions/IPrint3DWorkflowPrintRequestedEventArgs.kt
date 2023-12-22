package Windows.Devices.Printers.Extensions

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPrint3DWorkflowPrintRequestedEventArgs.ABI::class)
@Signature("{19f8c858-5ac8-4b55-8a5f-e61567dafb4d}")
@Guid("19f8c8585ac84b558a5fe61567dafb4d")
@WinRTInterface("19f8c8585ac84b558a5fe61567dafb4d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DWorkflowPrintRequestedEventArgs.ByReference::class)
public interface IPrint3DWorkflowPrintRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): Print3DWorkflowStatus?

  @InterfaceMethod(1)
  public fun SetExtendedStatus(value: Print3DWorkflowDetail?): Unit

  @InterfaceMethod(2)
  public fun SetSource(source: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun SetSourceChanged(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DWorkflowPrintRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrint3DWorkflowPrintRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrint3DWorkflowPrintRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DWorkflowPrintRequestedEventArgs {
    public val __479617813_Ptr: Pointer?

    public val _479617813_VtblPtr: Pointer?
      get() = __479617813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): Print3DWorkflowStatus? {
      val fnPtr = _479617813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DWorkflowStatus>()
      val hr = fn.invokeHR(arrayOf(__479617813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DWorkflowStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetExtendedStatus(value: Print3DWorkflowDetail?): Unit {
      val fnPtr = _479617813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479617813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetSource(source: IUnknown?): Unit {
      val fnPtr = _479617813_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479617813_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetSourceChanged(value: Boolean): Unit {
      val fnPtr = _479617813_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479617813_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrint3DWorkflowPrintRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479617813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DWorkflowPrintRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19f8c8585ac84b558a5fe61567dafb4d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DWorkflowPrintRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPrint3DWorkflowPrintRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrint3DWorkflowPrintRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrint3DWorkflowPrintRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DWorkflowPrintRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479617813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DWorkflowPrintRequestedEventArgs):
        Array<IPrint3DWorkflowPrintRequestedEventArgs?> = (elements as
        Array<IPrint3DWorkflowPrintRequestedEventArgs?>).castToImpl<IPrint3DWorkflowPrintRequestedEventArgs,IPrint3DWorkflowPrintRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DWorkflowPrintRequestedEventArgs?> =
        arrayOfNulls<IPrint3DWorkflowPrintRequestedEventArgs_Impl>(size) as
        Array<IPrint3DWorkflowPrintRequestedEventArgs?>
  }
}
