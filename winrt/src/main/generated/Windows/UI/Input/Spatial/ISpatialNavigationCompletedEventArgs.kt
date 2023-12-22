package Windows.UI.Input.Spatial

import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(ISpatialNavigationCompletedEventArgs.ABI::class)
@Signature("{012e80b7-af3b-42c2-9e41-baaa0e721f3a}")
@Guid("012e80b7af3b42c29e41baaa0e721f3a")
@WinRTInterface("012e80b7af3b42c29e41baaa0e721f3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialNavigationCompletedEventArgs.ByReference::class)
public interface ISpatialNavigationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun get_NormalizedOffset(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialNavigationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialNavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialNavigationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialNavigationCompletedEventArgs {
    public val __1961706420_Ptr: Pointer?

    public val _1961706420_VtblPtr: Pointer?
      get() = __1961706420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1961706420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1961706420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NormalizedOffset(): Vector3? {
      val fnPtr = _1961706420_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1961706420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialNavigationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1961706420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialNavigationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("012e80b7af3b42c29e41baaa0e721f3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialNavigationCompletedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialNavigationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialNavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialNavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialNavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1961706420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialNavigationCompletedEventArgs):
        Array<ISpatialNavigationCompletedEventArgs?> = (elements as
        Array<ISpatialNavigationCompletedEventArgs?>).castToImpl<ISpatialNavigationCompletedEventArgs,ISpatialNavigationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialNavigationCompletedEventArgs?> =
        arrayOfNulls<ISpatialNavigationCompletedEventArgs_Impl>(size) as
        Array<ISpatialNavigationCompletedEventArgs?>
  }
}
