package Windows.Devices.Perception.Provider

import Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus
import Windows.Foundation.Deferral
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionPropertyChangeRequest.ABI::class)
@Signature("{3c5aeb51-350b-4df8-9414-59e09815510b}")
@Guid("3c5aeb51350b4df8941459e09815510b")
@WinRTInterface("3c5aeb51350b4df8941459e09815510b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionPropertyChangeRequest.ByReference::class)
public interface IPerceptionPropertyChangeRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(2)
  public fun get_Status(): PerceptionFrameSourcePropertyChangeStatus?

  @InterfaceMethod(3)
  public fun put_Status(value: PerceptionFrameSourcePropertyChangeStatus?): Unit

  @InterfaceMethod(4)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionPropertyChangeRequest> {
    public override fun getValue() = ABI.makeIPerceptionPropertyChangeRequest(pointer.getPointer(0))

    public fun setValue(value: IPerceptionPropertyChangeRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionPropertyChangeRequest {
    public val __744912154_Ptr: Pointer?

    public val _744912154_VtblPtr: Pointer?
      get() = __744912154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _744912154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__744912154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _744912154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__744912154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): PerceptionFrameSourcePropertyChangeStatus? {
      val fnPtr = _744912154_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionFrameSourcePropertyChangeStatus>()
      val hr = fn.invokeHR(arrayOf(__744912154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PerceptionFrameSourcePropertyChangeStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Status(value: PerceptionFrameSourcePropertyChangeStatus?): Unit {
      val fnPtr = _744912154_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744912154_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _744912154_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__744912154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionPropertyChangeRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __744912154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionPropertyChangeRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c5aeb51350b4df8941459e09815510b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionPropertyChangeRequest(ptr: Pointer?): WithDefault =
        IPerceptionPropertyChangeRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionPropertyChangeRequest {
      val address = segment.toRawLongValue()
      return makeIPerceptionPropertyChangeRequest(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionPropertyChangeRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__744912154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionPropertyChangeRequest):
        Array<IPerceptionPropertyChangeRequest?> = (elements as
        Array<IPerceptionPropertyChangeRequest?>).castToImpl<IPerceptionPropertyChangeRequest,IPerceptionPropertyChangeRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionPropertyChangeRequest?> =
        arrayOfNulls<IPerceptionPropertyChangeRequest_Impl>(size) as
        Array<IPerceptionPropertyChangeRequest?>
  }
}
