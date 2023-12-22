package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewStatics4.ABI::class)
@Signature("{08fd8d33-2611-5336-a315-d98e6366c9db}")
@Guid("08fd8d3326115336a315d98e6366c9db")
@WinRTInterface("08fd8d3326115336a315d98e6366c9db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewStatics4.ByReference::class)
public interface IApplicationViewStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ClearAllPersistedState(): Unit

  @InterfaceMethod(1)
  public fun ClearPersistedState(key: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewStatics4> {
    public override fun getValue() = ABI.makeIApplicationViewStatics4(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewStatics4 {
    public val __326373006_Ptr: Pointer?

    public val _326373006_VtblPtr: Pointer?
      get() = __326373006_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ClearAllPersistedState(): Unit {
      val fnPtr = _326373006_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__326373006_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ClearPersistedState(key: String?): Unit {
      val fnPtr = _326373006_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__326373006_Ptr, marshalToNative(key),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationViewStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __326373006_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08fd8d3326115336a315d98e6366c9db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewStatics4(ptr: Pointer?): WithDefault =
        IApplicationViewStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewStatics4 {
      val address = segment.toRawLongValue()
      return makeIApplicationViewStatics4(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__326373006_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewStatics4):
        Array<IApplicationViewStatics4?> = (elements as
        Array<IApplicationViewStatics4?>).castToImpl<IApplicationViewStatics4,IApplicationViewStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewStatics4?> =
        arrayOfNulls<IApplicationViewStatics4_Impl>(size) as Array<IApplicationViewStatics4?>
  }
}
