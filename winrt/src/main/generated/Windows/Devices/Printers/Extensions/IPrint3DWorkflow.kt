package Windows.Devices.Printers.Extensions

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrint3DWorkflow.ABI::class)
@Signature("{c56f74bd-3669-4a66-ab42-c8151930cd34}")
@Guid("c56f74bd36694a66ab42c8151930cd34")
@WinRTInterface("c56f74bd36694a66ab42c8151930cd34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DWorkflow.ByReference::class)
public interface IPrint3DWorkflow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceID(): String?

  @InterfaceMethod(1)
  public fun GetPrintModelPackage(): IUnknown?

  @InterfaceMethod(2)
  public fun get_IsPrintReady(): Boolean

  @InterfaceMethod(3)
  public fun put_IsPrintReady(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun add_PrintRequested(eventHandler: TypedEventHandler<Print3DWorkflow?,
      Print3DWorkflowPrintRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PrintRequested(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DWorkflow> {
    public override fun getValue() = ABI.makeIPrint3DWorkflow(pointer.getPointer(0))

    public fun setValue(value: IPrint3DWorkflow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DWorkflow {
    public val __1418715137_Ptr: Pointer?

    public val _1418715137_VtblPtr: Pointer?
      get() = __1418715137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceID(): String? {
      val fnPtr = _1418715137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1418715137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPrintModelPackage(): IUnknown? {
      val fnPtr = _1418715137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1418715137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPrintReady(): Boolean {
      val fnPtr = _1418715137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1418715137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsPrintReady(value: Boolean): Unit {
      val fnPtr = _1418715137_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418715137_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_PrintRequested(eventHandler: TypedEventHandler<Print3DWorkflow?,
        Print3DWorkflowPrintRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1418715137_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1418715137_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PrintRequested(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1418715137_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418715137_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrint3DWorkflow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418715137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DWorkflow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c56f74bd36694a66ab42c8151930cd34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DWorkflow(ptr: Pointer?): WithDefault = IPrint3DWorkflow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DWorkflow {
      val address = segment.toRawLongValue()
      return makeIPrint3DWorkflow(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DWorkflow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418715137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DWorkflow): Array<IPrint3DWorkflow?> = (elements as
        Array<IPrint3DWorkflow?>).castToImpl<IPrint3DWorkflow,IPrint3DWorkflow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DWorkflow?> =
        arrayOfNulls<IPrint3DWorkflow_Impl>(size) as Array<IPrint3DWorkflow?>
  }
}
