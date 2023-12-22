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

@ABIMarker(ISpatialHoldCompletedEventArgs.ABI::class)
@Signature("{3f64470b-4cfd-43da-8dc4-e64552173971}")
@Guid("3f64470b4cfd43da8dc4e64552173971")
@WinRTInterface("3f64470b4cfd43da8dc4e64552173971")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialHoldCompletedEventArgs.ByReference::class)
public interface ISpatialHoldCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialHoldCompletedEventArgs> {
    public override fun getValue() = ABI.makeISpatialHoldCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialHoldCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialHoldCompletedEventArgs {
    public val __1008973001_Ptr: Pointer?

    public val _1008973001_VtblPtr: Pointer?
      get() = __1008973001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1008973001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1008973001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialHoldCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1008973001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialHoldCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f64470b4cfd43da8dc4e64552173971")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialHoldCompletedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialHoldCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialHoldCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialHoldCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialHoldCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1008973001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialHoldCompletedEventArgs):
        Array<ISpatialHoldCompletedEventArgs?> = (elements as
        Array<ISpatialHoldCompletedEventArgs?>).castToImpl<ISpatialHoldCompletedEventArgs,ISpatialHoldCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialHoldCompletedEventArgs?> =
        arrayOfNulls<ISpatialHoldCompletedEventArgs_Impl>(size) as
        Array<ISpatialHoldCompletedEventArgs?>
  }
}
