package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IDeviceUseTrigger.ABI::class)
@Signature("{0da68011-334f-4d57-b6ec-6dca64b412e4}")
@Guid("0da68011334f4d57b6ec6dca64b412e4")
@WinRTInterface("0da68011334f4d57b6ec6dca64b412e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceUseTrigger.ByReference::class)
public interface IDeviceUseTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun RequestAsync(deviceId: String?): IAsyncOperation<DeviceTriggerResult?>?

  @InterfaceMethod(1)
  public fun RequestAsync(deviceId: String?, arguments: String?):
      IAsyncOperation<DeviceTriggerResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceUseTrigger> {
    public override fun getValue() = ABI.makeIDeviceUseTrigger(pointer.getPointer(0))

    public fun setValue(value: IDeviceUseTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceUseTrigger, IBackgroundTrigger.WithDefault {
    public val __369591016_Ptr: Pointer?

    public val _369591016_VtblPtr: Pointer?
      get() = __369591016_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAsync(deviceId: String?): IAsyncOperation<DeviceTriggerResult?>? {
      val fnPtr = _369591016_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__369591016_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceTriggerResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAsync(deviceId: String?, arguments: String?):
        IAsyncOperation<DeviceTriggerResult?>? {
      val fnPtr = _369591016_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__369591016_Ptr, marshalToNative(deviceId),
          marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceTriggerResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceUseTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_369591016_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __369591016_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceUseTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0da68011334f4d57b6ec6dca64b412e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceUseTrigger(ptr: Pointer?): WithDefault = IDeviceUseTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceUseTrigger {
      val address = segment.toRawLongValue()
      return makeIDeviceUseTrigger(Pointer(address))
    }

    public override fun toNative(obj: IDeviceUseTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369591016_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceUseTrigger): Array<IDeviceUseTrigger?> = (elements
        as Array<IDeviceUseTrigger?>).castToImpl<IDeviceUseTrigger,IDeviceUseTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceUseTrigger?> =
        arrayOfNulls<IDeviceUseTrigger_Impl>(size) as Array<IDeviceUseTrigger?>
  }
}
