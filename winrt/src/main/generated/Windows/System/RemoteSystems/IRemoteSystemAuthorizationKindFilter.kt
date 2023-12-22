package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemAuthorizationKindFilter.ABI::class)
@Signature("{6b0dde8e-04d0-40f4-a27f-c2acbbd6b734}")
@Guid("6b0dde8e04d040f4a27fc2acbbd6b734")
@WinRTInterface("6b0dde8e04d040f4a27fc2acbbd6b734")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemAuthorizationKindFilter.ByReference::class)
public interface IRemoteSystemAuthorizationKindFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystemAuthorizationKind(): RemoteSystemAuthorizationKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemAuthorizationKindFilter> {
    public override fun getValue() =
        ABI.makeIRemoteSystemAuthorizationKindFilter(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemAuthorizationKindFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemAuthorizationKindFilter {
    public val __875635759_Ptr: Pointer?

    public val _875635759_VtblPtr: Pointer?
      get() = __875635759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystemAuthorizationKind(): RemoteSystemAuthorizationKind? {
      val fnPtr = _875635759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemAuthorizationKind>()
      val hr = fn.invokeHR(arrayOf(__875635759_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemAuthorizationKind>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemAuthorizationKindFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __875635759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemAuthorizationKindFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b0dde8e04d040f4a27fc2acbbd6b734")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemAuthorizationKindFilter(ptr: Pointer?): WithDefault =
        IRemoteSystemAuthorizationKindFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemAuthorizationKindFilter {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemAuthorizationKindFilter(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemAuthorizationKindFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__875635759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemAuthorizationKindFilter):
        Array<IRemoteSystemAuthorizationKindFilter?> = (elements as
        Array<IRemoteSystemAuthorizationKindFilter?>).castToImpl<IRemoteSystemAuthorizationKindFilter,IRemoteSystemAuthorizationKindFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemAuthorizationKindFilter?> =
        arrayOfNulls<IRemoteSystemAuthorizationKindFilter_Impl>(size) as
        Array<IRemoteSystemAuthorizationKindFilter?>
  }
}
