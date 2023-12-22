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

@ABIMarker(ISpatialNavigationUpdatedEventArgs.ABI::class)
@Signature("{9b713fd7-839d-4a74-8732-45466fc044b5}")
@Guid("9b713fd7839d4a74873245466fc044b5")
@WinRTInterface("9b713fd7839d4a74873245466fc044b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialNavigationUpdatedEventArgs.ByReference::class)
public interface ISpatialNavigationUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun get_NormalizedOffset(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialNavigationUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialNavigationUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialNavigationUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialNavigationUpdatedEventArgs {
    public val __1987543004_Ptr: Pointer?

    public val _1987543004_VtblPtr: Pointer?
      get() = __1987543004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1987543004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1987543004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NormalizedOffset(): Vector3? {
      val fnPtr = _1987543004_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1987543004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialNavigationUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1987543004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialNavigationUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b713fd7839d4a74873245466fc044b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialNavigationUpdatedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialNavigationUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialNavigationUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialNavigationUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialNavigationUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1987543004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialNavigationUpdatedEventArgs):
        Array<ISpatialNavigationUpdatedEventArgs?> = (elements as
        Array<ISpatialNavigationUpdatedEventArgs?>).castToImpl<ISpatialNavigationUpdatedEventArgs,ISpatialNavigationUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialNavigationUpdatedEventArgs?> =
        arrayOfNulls<ISpatialNavigationUpdatedEventArgs_Impl>(size) as
        Array<ISpatialNavigationUpdatedEventArgs?>
  }
}
