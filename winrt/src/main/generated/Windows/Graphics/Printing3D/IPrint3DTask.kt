package Windows.Graphics.Printing3D

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

@ABIMarker(IPrint3DTask.ABI::class)
@Signature("{8ce3d080-2118-4c28-80de-f426d70191ae}")
@Guid("8ce3d08021184c2880def426d70191ae")
@WinRTInterface("8ce3d08021184c2880def426d70191ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DTask.ByReference::class)
public interface IPrint3DTask : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): Printing3D3MFPackage?

  @InterfaceMethod(1)
  public fun add_Submitting(eventHandler: TypedEventHandler<Print3DTask?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Submitting(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Completed(eventHandler: TypedEventHandler<Print3DTask?,
      Print3DTaskCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Completed(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_SourceChanged(eventHandler: TypedEventHandler<Print3DTask?,
      Print3DTaskSourceChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_SourceChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrint3DTask> {
    public override fun getValue() = ABI.makeIPrint3DTask(pointer.getPointer(0))

    public fun setValue(value: IPrint3DTask_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DTask {
    public val __889142792_Ptr: Pointer?

    public val _889142792_VtblPtr: Pointer?
      get() = __889142792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): Printing3D3MFPackage? {
      val fnPtr = _889142792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3D3MFPackage>()
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3D3MFPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Submitting(eventHandler: TypedEventHandler<Print3DTask?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _889142792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Submitting(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _889142792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Completed(eventHandler: TypedEventHandler<Print3DTask?,
        Print3DTaskCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _889142792_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Completed(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _889142792_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_SourceChanged(eventHandler: TypedEventHandler<Print3DTask?,
        Print3DTaskSourceChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _889142792_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_SourceChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _889142792_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__889142792_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrint3DTask_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __889142792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DTask, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ce3d08021184c2880def426d70191ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DTask(ptr: Pointer?): WithDefault = IPrint3DTask_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DTask {
      val address = segment.toRawLongValue()
      return makeIPrint3DTask(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__889142792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DTask): Array<IPrint3DTask?> = (elements as
        Array<IPrint3DTask?>).castToImpl<IPrint3DTask,IPrint3DTask_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DTask?> =
        arrayOfNulls<IPrint3DTask_Impl>(size) as Array<IPrint3DTask?>
  }
}
