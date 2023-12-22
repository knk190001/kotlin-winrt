package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceServicingTrigger.ABI::class)
@Signature("{1ab217ad-6e34-49d3-9e6f-17f1b6dfa881}")
@Guid("1ab217ad6e3449d39e6f17f1b6dfa881")
@WinRTInterface("1ab217ad6e3449d39e6f17f1b6dfa881")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceServicingTrigger.ByReference::class)
public interface IDeviceServicingTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun RequestAsync(deviceId: String?, expectedDuration: TimeSpan?):
      IAsyncOperation<DeviceTriggerResult?>?

  @InterfaceMethod(1)
  public fun RequestAsync(
    deviceId: String?,
    expectedDuration: TimeSpan?,
    arguments: String?
  ): IAsyncOperation<DeviceTriggerResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceServicingTrigger> {
    public override fun getValue() = ABI.makeIDeviceServicingTrigger(pointer.getPointer(0))

    public fun setValue(value: IDeviceServicingTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceServicingTrigger, IBackgroundTrigger.WithDefault {
    public val __35760333_Ptr: Pointer?

    public val _35760333_VtblPtr: Pointer?
      get() = __35760333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAsync(deviceId: String?, expectedDuration: TimeSpan?):
        IAsyncOperation<DeviceTriggerResult?>? {
      val fnPtr = _35760333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__35760333_Ptr, marshalToNative(deviceId),
          marshalToNative(expectedDuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceTriggerResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAsync(
      deviceId: String?,
      expectedDuration: TimeSpan?,
      arguments: String?
    ): IAsyncOperation<DeviceTriggerResult?>? {
      val fnPtr = _35760333_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__35760333_Ptr, marshalToNative(deviceId),
          marshalToNative(expectedDuration), marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceTriggerResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceServicingTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_35760333_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __35760333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceServicingTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ab217ad6e3449d39e6f17f1b6dfa881")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceServicingTrigger(ptr: Pointer?): WithDefault =
        IDeviceServicingTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceServicingTrigger {
      val address = segment.toRawLongValue()
      return makeIDeviceServicingTrigger(Pointer(address))
    }

    public override fun toNative(obj: IDeviceServicingTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__35760333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceServicingTrigger): Array<IDeviceServicingTrigger?>
        = (elements as
        Array<IDeviceServicingTrigger?>).castToImpl<IDeviceServicingTrigger,IDeviceServicingTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceServicingTrigger?> =
        arrayOfNulls<IDeviceServicingTrigger_Impl>(size) as Array<IDeviceServicingTrigger?>
  }
}
