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

@ABIMarker(IBackgroundTaskInstance.ABI::class)
@Signature("{865bda7a-21d8-4573-8f32-928a1b0641f6}")
@Guid("865bda7a21d845738f32928a1b0641f6")
@WinRTInterface("865bda7a21d845738f32928a1b0641f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskInstance.ByReference::class)
public interface IBackgroundTaskInstance : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Task(): BackgroundTaskRegistration?

  @InterfaceMethod(2)
  public fun get_Progress(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_Progress(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_TriggerDetails(): IUnknown?

  @InterfaceMethod(5)
  public fun add_Canceled(cancelHandler: BackgroundTaskCanceledEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Canceled(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun get_SuspendedCount(): WinDef.UINT

  @InterfaceMethod(8)
  public fun GetDeferral(): BackgroundTaskDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskInstance> {
    public override fun getValue() = ABI.makeIBackgroundTaskInstance(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskInstance_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskInstance {
    public val __1930790727_Ptr: Pointer?

    public val _1930790727_VtblPtr: Pointer?
      get() = __1930790727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Task(): BackgroundTaskRegistration? {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskRegistration>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskRegistration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Progress(): WinDef.UINT {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Progress(value: WinDef.UINT): Unit {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TriggerDetails(): IUnknown? {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_Canceled(cancelHandler: BackgroundTaskCanceledEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr, marshalToNative(cancelHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Canceled(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SuspendedCount(): WinDef.UINT {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun GetDeferral(): BackgroundTaskDeferral? {
      val fnPtr = _1930790727_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskDeferral>()
      val hr = fn.invokeHR(arrayOf(__1930790727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTaskInstance_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1930790727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskInstance, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("865bda7a21d845738f32928a1b0641f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskInstance(ptr: Pointer?): WithDefault =
        IBackgroundTaskInstance_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskInstance {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskInstance(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1930790727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskInstance): Array<IBackgroundTaskInstance?>
        = (elements as
        Array<IBackgroundTaskInstance?>).castToImpl<IBackgroundTaskInstance,IBackgroundTaskInstance_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskInstance?> =
        arrayOfNulls<IBackgroundTaskInstance_Impl>(size) as Array<IBackgroundTaskInstance?>
  }
}
