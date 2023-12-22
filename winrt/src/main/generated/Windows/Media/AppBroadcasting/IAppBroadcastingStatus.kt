package Windows.Media.AppBroadcasting

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastingStatus.ABI::class)
@Signature("{1225e4df-03a1-42f8-8b80-c9228cd9cf2e}")
@Guid("1225e4df03a142f88b80c9228cd9cf2e")
@WinRTInterface("1225e4df03a142f88b80c9228cd9cf2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastingStatus.ByReference::class)
public interface IAppBroadcastingStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanStartBroadcast(): Boolean

  @InterfaceMethod(1)
  public fun get_Details(): AppBroadcastingStatusDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastingStatus> {
    public override fun getValue() = ABI.makeIAppBroadcastingStatus(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastingStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastingStatus {
    public val __375206152_Ptr: Pointer?

    public val _375206152_VtblPtr: Pointer?
      get() = __375206152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanStartBroadcast(): Boolean {
      val fnPtr = _375206152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__375206152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Details(): AppBroadcastingStatusDetails? {
      val fnPtr = _375206152_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastingStatusDetails>()
      val hr = fn.invokeHR(arrayOf(__375206152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastingStatusDetails>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastingStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __375206152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastingStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1225e4df03a142f88b80c9228cd9cf2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastingStatus(ptr: Pointer?): WithDefault =
        IAppBroadcastingStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastingStatus {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastingStatus(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastingStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__375206152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastingStatus): Array<IAppBroadcastingStatus?> =
        (elements as
        Array<IAppBroadcastingStatus?>).castToImpl<IAppBroadcastingStatus,IAppBroadcastingStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastingStatus?> =
        arrayOfNulls<IAppBroadcastingStatus_Impl>(size) as Array<IAppBroadcastingStatus?>
  }
}
