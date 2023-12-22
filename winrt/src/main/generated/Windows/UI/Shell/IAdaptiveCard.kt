package Windows.UI.Shell

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

@ABIMarker(IAdaptiveCard.ABI::class)
@Signature("{72d0568c-a274-41cd-82a8-989d40b9b05e}")
@Guid("72d0568ca27441cd82a8989d40b9b05e")
@WinRTInterface("72d0568ca27441cd82a8989d40b9b05e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveCard.ByReference::class)
public interface IAdaptiveCard : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ToJson(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAdaptiveCard>
      {
    public override fun getValue() = ABI.makeIAdaptiveCard(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveCard_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveCard {
    public val __590639566_Ptr: Pointer?

    public val _590639566_VtblPtr: Pointer?
      get() = __590639566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ToJson(): String? {
      val fnPtr = _590639566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__590639566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveCard_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __590639566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveCard, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72d0568ca27441cd82a8989d40b9b05e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveCard(ptr: Pointer?): WithDefault = IAdaptiveCard_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveCard {
      val address = segment.toRawLongValue()
      return makeIAdaptiveCard(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveCard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__590639566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveCard): Array<IAdaptiveCard?> = (elements as
        Array<IAdaptiveCard?>).castToImpl<IAdaptiveCard,IAdaptiveCard_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveCard?> =
        arrayOfNulls<IAdaptiveCard_Impl>(size) as Array<IAdaptiveCard?>
  }
}
