package Windows.Graphics.Printing

import Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintTask.ABI::class)
@Signature("{61d80247-6cf6-4fad-84e2-a5e82e2d4ceb}")
@Guid("61d802476cf64fad84e2a5e82e2d4ceb")
@WinRTInterface("61d802476cf64fad84e2a5e82e2d4ceb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTask.ByReference::class)
public interface IPrintTask : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): DataPackagePropertySet?

  @InterfaceMethod(1)
  public fun get_Source(): IPrintDocumentSource?

  @InterfaceMethod(2)
  public fun get_Options(): PrintTaskOptions?

  @InterfaceMethod(3)
  public fun add_Previewing(eventHandler: TypedEventHandler<PrintTask?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Previewing(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Submitting(eventHandler: TypedEventHandler<PrintTask?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Submitting(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_Progressing(eventHandler: TypedEventHandler<PrintTask?,
      PrintTaskProgressingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Progressing(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_Completed(eventHandler: TypedEventHandler<PrintTask?,
      PrintTaskCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Completed(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrintTask> {
    public override fun getValue() = ABI.makeIPrintTask(pointer.getPointer(0))

    public fun setValue(value: IPrintTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTask {
    public val __1422700182_Ptr: Pointer?

    public val _1422700182_VtblPtr: Pointer?
      get() = __1422700182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): DataPackagePropertySet? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackagePropertySet>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackagePropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Source(): IPrintDocumentSource? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPrintDocumentSource>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPrintDocumentSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Options(): PrintTaskOptions? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskOptions>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Previewing(eventHandler: TypedEventHandler<PrintTask?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Previewing(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Submitting(eventHandler: TypedEventHandler<PrintTask?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Submitting(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Progressing(eventHandler: TypedEventHandler<PrintTask?,
        PrintTaskProgressingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Progressing(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Completed(eventHandler: TypedEventHandler<PrintTask?,
        PrintTaskCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Completed(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1422700182_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422700182_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1422700182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61d802476cf64fad84e2a5e82e2d4ceb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTask(ptr: Pointer?): WithDefault = IPrintTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTask {
      val address = segment.toRawLongValue()
      return makeIPrintTask(Pointer(address))
    }

    public override fun toNative(obj: IPrintTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1422700182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTask): Array<IPrintTask?> = (elements as
        Array<IPrintTask?>).castToImpl<IPrintTask,IPrintTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTask?> = arrayOfNulls<IPrintTask_Impl>(size)
        as Array<IPrintTask?>
  }
}
