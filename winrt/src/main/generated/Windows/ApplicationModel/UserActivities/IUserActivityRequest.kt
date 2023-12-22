package Windows.ApplicationModel.UserActivities

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

@ABIMarker(IUserActivityRequest.ABI::class)
@Signature("{a0ef6355-cf35-4ff0-8833-50cb4b72e06d}")
@Guid("a0ef6355cf354ff0883350cb4b72e06d")
@WinRTInterface("a0ef6355cf354ff0883350cb4b72e06d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityRequest.ByReference::class)
public interface IUserActivityRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetUserActivity(activity: UserActivity?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityRequest> {
    public override fun getValue() = ABI.makeIUserActivityRequest(pointer.getPointer(0))

    public fun setValue(value: IUserActivityRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityRequest {
    public val __670662286_Ptr: Pointer?

    public val _670662286_VtblPtr: Pointer?
      get() = __670662286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetUserActivity(activity: UserActivity?): Unit {
      val fnPtr = _670662286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__670662286_Ptr, marshalToNative(activity),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserActivityRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __670662286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0ef6355cf354ff0883350cb4b72e06d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityRequest(ptr: Pointer?): WithDefault = IUserActivityRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityRequest {
      val address = segment.toRawLongValue()
      return makeIUserActivityRequest(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__670662286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityRequest): Array<IUserActivityRequest?> =
        (elements as
        Array<IUserActivityRequest?>).castToImpl<IUserActivityRequest,IUserActivityRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityRequest?> =
        arrayOfNulls<IUserActivityRequest_Impl>(size) as Array<IUserActivityRequest?>
  }
}
