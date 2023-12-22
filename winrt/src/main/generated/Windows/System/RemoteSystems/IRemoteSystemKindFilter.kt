package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IRemoteSystemKindFilter.ABI::class)
@Signature("{38e1c9ec-22c3-4ef6-901a-bbb1c7aad4ed}")
@Guid("38e1c9ec22c34ef6901abbb1c7aad4ed")
@WinRTInterface("38e1c9ec22c34ef6901abbb1c7aad4ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemKindFilter.ByReference::class)
public interface IRemoteSystemKindFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystemKinds(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemKindFilter> {
    public override fun getValue() = ABI.makeIRemoteSystemKindFilter(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemKindFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemKindFilter {
    public val __151520672_Ptr: Pointer?

    public val _151520672_VtblPtr: Pointer?
      get() = __151520672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystemKinds(): IVectorView<String?>? {
      val fnPtr = _151520672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__151520672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemKindFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151520672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemKindFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38e1c9ec22c34ef6901abbb1c7aad4ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemKindFilter(ptr: Pointer?): WithDefault =
        IRemoteSystemKindFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemKindFilter {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemKindFilter(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemKindFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151520672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemKindFilter): Array<IRemoteSystemKindFilter?>
        = (elements as
        Array<IRemoteSystemKindFilter?>).castToImpl<IRemoteSystemKindFilter,IRemoteSystemKindFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemKindFilter?> =
        arrayOfNulls<IRemoteSystemKindFilter_Impl>(size) as Array<IRemoteSystemKindFilter?>
  }
}
