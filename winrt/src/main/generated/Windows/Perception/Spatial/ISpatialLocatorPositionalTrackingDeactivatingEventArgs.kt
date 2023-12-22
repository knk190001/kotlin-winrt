package Windows.Perception.Spatial

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

@ABIMarker(ISpatialLocatorPositionalTrackingDeactivatingEventArgs.ABI::class)
@Signature("{b8a84063-e3f4-368b-9061-9ea9d1d6cc16}")
@Guid("b8a84063e3f4368b90619ea9d1d6cc16")
@WinRTInterface("b8a84063e3f4368b90619ea9d1d6cc16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISpatialLocatorPositionalTrackingDeactivatingEventArgs.ByReference::class)
public interface ISpatialLocatorPositionalTrackingDeactivatingEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Canceled(): Boolean

  @InterfaceMethod(1)
  public fun put_Canceled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialLocatorPositionalTrackingDeactivatingEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialLocatorPositionalTrackingDeactivatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialLocatorPositionalTrackingDeactivatingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialLocatorPositionalTrackingDeactivatingEventArgs {
    public val __1937904070_Ptr: Pointer?

    public val _1937904070_VtblPtr: Pointer?
      get() = __1937904070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Canceled(): Boolean {
      val fnPtr = _1937904070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1937904070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Canceled(value: Boolean): Unit {
      val fnPtr = _1937904070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1937904070_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialLocatorPositionalTrackingDeactivatingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1937904070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialLocatorPositionalTrackingDeactivatingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8a84063e3f4368b90619ea9d1d6cc16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialLocatorPositionalTrackingDeactivatingEventArgs(ptr: Pointer?):
        WithDefault = ISpatialLocatorPositionalTrackingDeactivatingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialLocatorPositionalTrackingDeactivatingEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialLocatorPositionalTrackingDeactivatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialLocatorPositionalTrackingDeactivatingEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1937904070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialLocatorPositionalTrackingDeactivatingEventArgs):
        Array<ISpatialLocatorPositionalTrackingDeactivatingEventArgs?> = (elements as
        Array<ISpatialLocatorPositionalTrackingDeactivatingEventArgs?>).castToImpl<ISpatialLocatorPositionalTrackingDeactivatingEventArgs,ISpatialLocatorPositionalTrackingDeactivatingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISpatialLocatorPositionalTrackingDeactivatingEventArgs?> =
        arrayOfNulls<ISpatialLocatorPositionalTrackingDeactivatingEventArgs_Impl>(size) as
        Array<ISpatialLocatorPositionalTrackingDeactivatingEventArgs?>
  }
}
