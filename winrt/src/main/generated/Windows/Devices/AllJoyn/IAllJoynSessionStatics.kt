package Windows.Devices.AllJoyn

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynSessionStatics.ABI::class)
@Signature("{9e05d604-a06c-46d4-b46c-0b0b54105b44}")
@Guid("9e05d604a06c46d4b46c0b0b54105b44")
@WinRTInterface("9e05d604a06c46d4b46c0b0b54105b44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynSessionStatics.ByReference::class)
public interface IAllJoynSessionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFromServiceInfoAsync(serviceInfo: AllJoynServiceInfo?):
      IAsyncOperation<AllJoynSession?>?

  @InterfaceMethod(1)
  public fun GetFromServiceInfoAsync(serviceInfo: AllJoynServiceInfo?,
      busAttachment: AllJoynBusAttachment?): IAsyncOperation<AllJoynSession?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynSessionStatics> {
    public override fun getValue() = ABI.makeIAllJoynSessionStatics(pointer.getPointer(0))

    public fun setValue(value: IAllJoynSessionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynSessionStatics {
    public val __2014987776_Ptr: Pointer?

    public val _2014987776_VtblPtr: Pointer?
      get() = __2014987776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFromServiceInfoAsync(serviceInfo: AllJoynServiceInfo?):
        IAsyncOperation<AllJoynSession?>? {
      val fnPtr = _2014987776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynSession?>>()
      val hr = fn.invokeHR(arrayOf(__2014987776_Ptr, marshalToNative(serviceInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFromServiceInfoAsync(serviceInfo: AllJoynServiceInfo?,
        busAttachment: AllJoynBusAttachment?): IAsyncOperation<AllJoynSession?>? {
      val fnPtr = _2014987776_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynSession?>>()
      val hr = fn.invokeHR(arrayOf(__2014987776_Ptr, marshalToNative(serviceInfo),
          marshalToNative(busAttachment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynSession?>>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynSessionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2014987776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynSessionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e05d604a06c46d4b46c0b0b54105b44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynSessionStatics(ptr: Pointer?): WithDefault =
        IAllJoynSessionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynSessionStatics {
      val address = segment.toRawLongValue()
      return makeIAllJoynSessionStatics(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynSessionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2014987776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynSessionStatics): Array<IAllJoynSessionStatics?> =
        (elements as
        Array<IAllJoynSessionStatics?>).castToImpl<IAllJoynSessionStatics,IAllJoynSessionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynSessionStatics?> =
        arrayOfNulls<IAllJoynSessionStatics_Impl>(size) as Array<IAllJoynSessionStatics?>
  }
}
