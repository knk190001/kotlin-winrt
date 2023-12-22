package Windows.ApplicationModel.Chat

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

@ABIMarker(IRcsEndUserMessageAvailableTriggerDetails.ABI::class)
@Signature("{5b97742d-351f-4692-b41e-1b035dc18986}")
@Guid("5b97742d351f4692b41e1b035dc18986")
@WinRTInterface("5b97742d351f4692b41e1b035dc18986")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsEndUserMessageAvailableTriggerDetails.ByReference::class)
public interface IRcsEndUserMessageAvailableTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsEndUserMessageAvailableTriggerDetails> {
    public override fun getValue() =
        ABI.makeIRcsEndUserMessageAvailableTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IRcsEndUserMessageAvailableTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsEndUserMessageAvailableTriggerDetails {
    public val __1492377417_Ptr: Pointer?

    public val _1492377417_VtblPtr: Pointer?
      get() = __1492377417_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1492377417_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1492377417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _1492377417_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1492377417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRcsEndUserMessageAvailableTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492377417_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsEndUserMessageAvailableTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b97742d351f4692b41e1b035dc18986")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsEndUserMessageAvailableTriggerDetails(ptr: Pointer?): WithDefault =
        IRcsEndUserMessageAvailableTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRcsEndUserMessageAvailableTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIRcsEndUserMessageAvailableTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IRcsEndUserMessageAvailableTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492377417_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsEndUserMessageAvailableTriggerDetails):
        Array<IRcsEndUserMessageAvailableTriggerDetails?> = (elements as
        Array<IRcsEndUserMessageAvailableTriggerDetails?>).castToImpl<IRcsEndUserMessageAvailableTriggerDetails,IRcsEndUserMessageAvailableTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsEndUserMessageAvailableTriggerDetails?> =
        arrayOfNulls<IRcsEndUserMessageAvailableTriggerDetails_Impl>(size) as
        Array<IRcsEndUserMessageAvailableTriggerDetails?>
  }
}
