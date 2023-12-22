package Windows.ApplicationModel.Background

import Windows.Foundation.EventRegistrationToken
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTaskRegistration.ABI::class)
@Signature("{10654cc2-a26e-43bf-8c12-1fb40dbfbfa0}")
@Guid("10654cc2a26e43bf8c121fb40dbfbfa0")
@WinRTInterface("10654cc2a26e43bf8c121fb40dbfbfa0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskRegistration.ByReference::class)
public interface IBackgroundTaskRegistration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun add_Progress(handler: BackgroundTaskProgressEventHandler?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Progress(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Completed(handler: BackgroundTaskCompletedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Completed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun Unregister(cancelTask: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskRegistration> {
    public override fun getValue() = ABI.makeIBackgroundTaskRegistration(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskRegistration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskRegistration {
    public val __2000610595_Ptr: Pointer?

    public val _2000610595_VtblPtr: Pointer?
      get() = __2000610595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_Progress(handler: BackgroundTaskProgressEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Progress(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Completed(handler: BackgroundTaskCompletedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Completed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Unregister(cancelTask: Boolean): Unit {
      val fnPtr = _2000610595_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000610595_Ptr, cancelTask,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTaskRegistration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000610595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskRegistration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10654cc2a26e43bf8c121fb40dbfbfa0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskRegistration(ptr: Pointer?): WithDefault =
        IBackgroundTaskRegistration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskRegistration {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskRegistration(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000610595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskRegistration):
        Array<IBackgroundTaskRegistration?> = (elements as
        Array<IBackgroundTaskRegistration?>).castToImpl<IBackgroundTaskRegistration,IBackgroundTaskRegistration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskRegistration?> =
        arrayOfNulls<IBackgroundTaskRegistration_Impl>(size) as Array<IBackgroundTaskRegistration?>
  }
}
