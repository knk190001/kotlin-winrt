package Windows.ApplicationModel.Background

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattServiceProviderTriggerStatics.ABI::class)
@Signature("{b413a36a-e294-4591-a5a6-64891a828153}")
@Guid("b413a36ae2944591a5a664891a828153")
@WinRTInterface("b413a36ae2944591a5a664891a828153")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderTriggerStatics.ByReference::class)
public interface IGattServiceProviderTriggerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(triggerId: String?, serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperation<GattServiceProviderTriggerResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderTriggerStatics> {
    public override fun getValue() =
        ABI.makeIGattServiceProviderTriggerStatics(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderTriggerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderTriggerStatics {
    public val __1810075080_Ptr: Pointer?

    public val _1810075080_VtblPtr: Pointer?
      get() = __1810075080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(triggerId: String?,
        serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<GattServiceProviderTriggerResult?>? {
      val fnPtr = _1810075080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattServiceProviderTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__1810075080_Ptr, marshalToNative(triggerId),
          marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattServiceProviderTriggerResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceProviderTriggerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1810075080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderTriggerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b413a36ae2944591a5a664891a828153")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderTriggerStatics(ptr: Pointer?): WithDefault =
        IGattServiceProviderTriggerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProviderTriggerStatics {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderTriggerStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderTriggerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1810075080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderTriggerStatics):
        Array<IGattServiceProviderTriggerStatics?> = (elements as
        Array<IGattServiceProviderTriggerStatics?>).castToImpl<IGattServiceProviderTriggerStatics,IGattServiceProviderTriggerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderTriggerStatics?> =
        arrayOfNulls<IGattServiceProviderTriggerStatics_Impl>(size) as
        Array<IGattServiceProviderTriggerStatics?>
  }
}
