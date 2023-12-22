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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynServiceInfoStatics.ABI::class)
@Signature("{5678570a-603a-49fc-b750-0ef13609213c}")
@Guid("5678570a603a49fcb7500ef13609213c")
@WinRTInterface("5678570a603a49fcb7500ef13609213c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynServiceInfoStatics.ByReference::class)
public interface IAllJoynServiceInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<AllJoynServiceInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynServiceInfoStatics> {
    public override fun getValue() = ABI.makeIAllJoynServiceInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IAllJoynServiceInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynServiceInfoStatics {
    public val __422536589_Ptr: Pointer?

    public val _422536589_VtblPtr: Pointer?
      get() = __422536589_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<AllJoynServiceInfo?>? {
      val fnPtr = _422536589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynServiceInfo?>>()
      val hr = fn.invokeHR(arrayOf(__422536589_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynServiceInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynServiceInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __422536589_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynServiceInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5678570a603a49fcb7500ef13609213c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynServiceInfoStatics(ptr: Pointer?): WithDefault =
        IAllJoynServiceInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynServiceInfoStatics {
      val address = segment.toRawLongValue()
      return makeIAllJoynServiceInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynServiceInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__422536589_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynServiceInfoStatics):
        Array<IAllJoynServiceInfoStatics?> = (elements as
        Array<IAllJoynServiceInfoStatics?>).castToImpl<IAllJoynServiceInfoStatics,IAllJoynServiceInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynServiceInfoStatics?> =
        arrayOfNulls<IAllJoynServiceInfoStatics_Impl>(size) as Array<IAllJoynServiceInfoStatics?>
  }
}
