package Windows.System.RemoteSystems

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystem2.ABI::class)
@Signature("{09dfe4ec-fb8b-4a08-a758-6876435d769e}")
@Guid("09dfe4ecfb8b4a08a7586876435d769e")
@WinRTInterface("09dfe4ecfb8b4a08a7586876435d769e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystem2.ByReference::class)
public interface IRemoteSystem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAvailableBySpatialProximity(): Boolean

  @InterfaceMethod(1)
  public fun GetCapabilitySupportedAsync(capabilityName: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRemoteSystem2>
      {
    public override fun getValue() = ABI.makeIRemoteSystem2(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystem2 {
    public val __675573662_Ptr: Pointer?

    public val _675573662_VtblPtr: Pointer?
      get() = __675573662_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAvailableBySpatialProximity(): Boolean {
      val fnPtr = _675573662_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__675573662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetCapabilitySupportedAsync(capabilityName: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _675573662_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__675573662_Ptr, marshalToNative(capabilityName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __675573662_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09dfe4ecfb8b4a08a7586876435d769e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystem2(ptr: Pointer?): WithDefault = IRemoteSystem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystem2 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystem2(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__675573662_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystem2): Array<IRemoteSystem2?> = (elements as
        Array<IRemoteSystem2?>).castToImpl<IRemoteSystem2,IRemoteSystem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystem2?> =
        arrayOfNulls<IRemoteSystem2_Impl>(size) as Array<IRemoteSystem2?>
  }
}
