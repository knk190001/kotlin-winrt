package Windows.System.Profile

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

@ABIMarker(IUnsupportedAppRequirement.ABI::class)
@Signature("{6182445c-894b-5cbc-8976-a98e0a9b998d}")
@Guid("6182445c894b5cbc8976a98e0a9b998d")
@WinRTInterface("6182445c894b5cbc8976a98e0a9b998d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnsupportedAppRequirement.ByReference::class)
public interface IUnsupportedAppRequirement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Requirement(): String?

  @InterfaceMethod(1)
  public fun get_Reasons(): UnsupportedAppRequirementReasons?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnsupportedAppRequirement> {
    public override fun getValue() = ABI.makeIUnsupportedAppRequirement(pointer.getPointer(0))

    public fun setValue(value: IUnsupportedAppRequirement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnsupportedAppRequirement {
    public val __764606397_Ptr: Pointer?

    public val _764606397_VtblPtr: Pointer?
      get() = __764606397_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Requirement(): String? {
      val fnPtr = _764606397_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764606397_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Reasons(): UnsupportedAppRequirementReasons? {
      val fnPtr = _764606397_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnsupportedAppRequirementReasons>()
      val hr = fn.invokeHR(arrayOf(__764606397_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnsupportedAppRequirementReasons>(result.getValue())
      return resultValue
    }
  }

  public class IUnsupportedAppRequirement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __764606397_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnsupportedAppRequirement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6182445c894b5cbc8976a98e0a9b998d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnsupportedAppRequirement(ptr: Pointer?): WithDefault =
        IUnsupportedAppRequirement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnsupportedAppRequirement {
      val address = segment.toRawLongValue()
      return makeIUnsupportedAppRequirement(Pointer(address))
    }

    public override fun toNative(obj: IUnsupportedAppRequirement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__764606397_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnsupportedAppRequirement):
        Array<IUnsupportedAppRequirement?> = (elements as
        Array<IUnsupportedAppRequirement?>).castToImpl<IUnsupportedAppRequirement,IUnsupportedAppRequirement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnsupportedAppRequirement?> =
        arrayOfNulls<IUnsupportedAppRequirement_Impl>(size) as Array<IUnsupportedAppRequirement?>
  }
}
