package Windows.UI.Input.Spatial

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

@ABIMarker(ISpatialHoldCanceledEventArgs.ABI::class)
@Signature("{5dfcb667-4caa-4093-8c35-b601a839f31b}")
@Guid("5dfcb6674caa40938c35b601a839f31b")
@WinRTInterface("5dfcb6674caa40938c35b601a839f31b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialHoldCanceledEventArgs.ByReference::class)
public interface ISpatialHoldCanceledEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialHoldCanceledEventArgs> {
    public override fun getValue() = ABI.makeISpatialHoldCanceledEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialHoldCanceledEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialHoldCanceledEventArgs {
    public val __31347213_Ptr: Pointer?

    public val _31347213_VtblPtr: Pointer?
      get() = __31347213_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _31347213_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__31347213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialHoldCanceledEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __31347213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialHoldCanceledEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5dfcb6674caa40938c35b601a839f31b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialHoldCanceledEventArgs(ptr: Pointer?): WithDefault =
        ISpatialHoldCanceledEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialHoldCanceledEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialHoldCanceledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialHoldCanceledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__31347213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialHoldCanceledEventArgs):
        Array<ISpatialHoldCanceledEventArgs?> = (elements as
        Array<ISpatialHoldCanceledEventArgs?>).castToImpl<ISpatialHoldCanceledEventArgs,ISpatialHoldCanceledEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialHoldCanceledEventArgs?> =
        arrayOfNulls<ISpatialHoldCanceledEventArgs_Impl>(size) as
        Array<ISpatialHoldCanceledEventArgs?>
  }
}
