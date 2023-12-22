package Windows.UI.Input.Spatial

import Windows.Foundation.IReference
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

@ABIMarker(ISpatialInteractionSourceLocation.ABI::class)
@Signature("{ea4696c4-7e8b-30ca-bcc5-c77189cea30a}")
@Guid("ea4696c47e8b30cabcc5c77189cea30a")
@WinRTInterface("ea4696c47e8b30cabcc5c77189cea30a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceLocation.ByReference::class)
public interface ISpatialInteractionSourceLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): IReference<Vector3?>?

  @InterfaceMethod(1)
  public fun get_Velocity(): IReference<Vector3?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceLocation> {
    public override fun getValue() =
        ABI.makeISpatialInteractionSourceLocation(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceLocation {
    public val __611273578_Ptr: Pointer?

    public val _611273578_VtblPtr: Pointer?
      get() = __611273578_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): IReference<Vector3?>? {
      val fnPtr = _611273578_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__611273578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Velocity(): IReference<Vector3?>? {
      val fnPtr = _611273578_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__611273578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __611273578_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea4696c47e8b30cabcc5c77189cea30a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceLocation(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceLocation {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceLocation(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__611273578_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceLocation):
        Array<ISpatialInteractionSourceLocation?> = (elements as
        Array<ISpatialInteractionSourceLocation?>).castToImpl<ISpatialInteractionSourceLocation,ISpatialInteractionSourceLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceLocation?> =
        arrayOfNulls<ISpatialInteractionSourceLocation_Impl>(size) as
        Array<ISpatialInteractionSourceLocation?>
  }
}
