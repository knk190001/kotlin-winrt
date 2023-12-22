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

@ABIMarker(IRcsEndUserMessageAction.ABI::class)
@Signature("{92378737-9b42-46d3-9d5e-3c1b2dae7cb8}")
@Guid("923787379b4246d39d5e3c1b2dae7cb8")
@WinRTInterface("923787379b4246d39d5e3c1b2dae7cb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsEndUserMessageAction.ByReference::class)
public interface IRcsEndUserMessageAction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Label(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsEndUserMessageAction> {
    public override fun getValue() = ABI.makeIRcsEndUserMessageAction(pointer.getPointer(0))

    public fun setValue(value: IRcsEndUserMessageAction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsEndUserMessageAction {
    public val __51635822_Ptr: Pointer?

    public val _51635822_VtblPtr: Pointer?
      get() = __51635822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _51635822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__51635822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRcsEndUserMessageAction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __51635822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsEndUserMessageAction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("923787379b4246d39d5e3c1b2dae7cb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsEndUserMessageAction(ptr: Pointer?): WithDefault =
        IRcsEndUserMessageAction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsEndUserMessageAction {
      val address = segment.toRawLongValue()
      return makeIRcsEndUserMessageAction(Pointer(address))
    }

    public override fun toNative(obj: IRcsEndUserMessageAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__51635822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsEndUserMessageAction):
        Array<IRcsEndUserMessageAction?> = (elements as
        Array<IRcsEndUserMessageAction?>).castToImpl<IRcsEndUserMessageAction,IRcsEndUserMessageAction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsEndUserMessageAction?> =
        arrayOfNulls<IRcsEndUserMessageAction_Impl>(size) as Array<IRcsEndUserMessageAction?>
  }
}
