package Windows.UI.Input.Spatial

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Quaternion
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

@ABIMarker(ISpatialInteractionSourceLocation2.ABI::class)
@Signature("{4c671045-3917-40fc-a9ac-31c9cf5ff91b}")
@Guid("4c671045391740fca9ac31c9cf5ff91b")
@WinRTInterface("4c671045391740fca9ac31c9cf5ff91b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceLocation2.ByReference::class)
public interface ISpatialInteractionSourceLocation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): IReference<Quaternion?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceLocation2> {
    public override fun getValue() =
        ABI.makeISpatialInteractionSourceLocation2(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceLocation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceLocation2 {
    public val __1769611684_Ptr: Pointer?

    public val _1769611684_VtblPtr: Pointer?
      get() = __1769611684_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): IReference<Quaternion?>? {
      val fnPtr = _1769611684_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Quaternion?>>()
      val hr = fn.invokeHR(arrayOf(__1769611684_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Quaternion?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceLocation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1769611684_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceLocation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c671045391740fca9ac31c9cf5ff91b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceLocation2(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceLocation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceLocation2 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceLocation2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceLocation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1769611684_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceLocation2):
        Array<ISpatialInteractionSourceLocation2?> = (elements as
        Array<ISpatialInteractionSourceLocation2?>).castToImpl<ISpatialInteractionSourceLocation2,ISpatialInteractionSourceLocation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceLocation2?> =
        arrayOfNulls<ISpatialInteractionSourceLocation2_Impl>(size) as
        Array<ISpatialInteractionSourceLocation2?>
  }
}
