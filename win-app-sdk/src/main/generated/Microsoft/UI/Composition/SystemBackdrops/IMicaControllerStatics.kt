package Microsoft.UI.Composition.SystemBackdrops

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

@ABIMarker(IMicaControllerStatics.ABI::class)
@Signature("{7d85d834-d514-5250-b7c4-0b7850d1efdc}")
@Guid("7d85d834d5145250b7c40b7850d1efdc")
@WinRTInterface("7d85d834d5145250b7c40b7850d1efdc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicaControllerStatics.ByReference::class)
public interface IMicaControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicaControllerStatics> {
    public override fun getValue() = ABI.makeIMicaControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IMicaControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicaControllerStatics {
    public val __1176153706_Ptr: Pointer?

    public val _1176153706_VtblPtr: Pointer?
      get() = __1176153706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1176153706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1176153706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMicaControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1176153706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicaControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d85d834d5145250b7c40b7850d1efdc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicaControllerStatics(ptr: Pointer?): WithDefault =
        IMicaControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMicaControllerStatics {
      val address = segment.toRawLongValue()
      return makeIMicaControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IMicaControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1176153706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicaControllerStatics): Array<IMicaControllerStatics?> =
        (elements as
        Array<IMicaControllerStatics?>).castToImpl<IMicaControllerStatics,IMicaControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicaControllerStatics?> =
        arrayOfNulls<IMicaControllerStatics_Impl>(size) as Array<IMicaControllerStatics?>
  }
}
