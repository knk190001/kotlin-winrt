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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRcsEndUserMessageAvailableEventArgs.ABI::class)
@Signature("{2d45ae01-3f89-41ea-9702-9e9ed411aa98}")
@Guid("2d45ae013f8941ea97029e9ed411aa98")
@WinRTInterface("2d45ae013f8941ea97029e9ed411aa98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsEndUserMessageAvailableEventArgs.ByReference::class)
public interface IRcsEndUserMessageAvailableEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsMessageAvailable(): Boolean

  @InterfaceMethod(1)
  public fun get_Message(): RcsEndUserMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsEndUserMessageAvailableEventArgs> {
    public override fun getValue() =
        ABI.makeIRcsEndUserMessageAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRcsEndUserMessageAvailableEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsEndUserMessageAvailableEventArgs {
    public val __426839254_Ptr: Pointer?

    public val _426839254_VtblPtr: Pointer?
      get() = __426839254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsMessageAvailable(): Boolean {
      val fnPtr = _426839254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__426839254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Message(): RcsEndUserMessage? {
      val fnPtr = _426839254_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RcsEndUserMessage>()
      val hr = fn.invokeHR(arrayOf(__426839254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RcsEndUserMessage>(result.getValue())
      return resultValue
    }
  }

  public class IRcsEndUserMessageAvailableEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __426839254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsEndUserMessageAvailableEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d45ae013f8941ea97029e9ed411aa98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsEndUserMessageAvailableEventArgs(ptr: Pointer?): WithDefault =
        IRcsEndUserMessageAvailableEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsEndUserMessageAvailableEventArgs {
      val address = segment.toRawLongValue()
      return makeIRcsEndUserMessageAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRcsEndUserMessageAvailableEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__426839254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsEndUserMessageAvailableEventArgs):
        Array<IRcsEndUserMessageAvailableEventArgs?> = (elements as
        Array<IRcsEndUserMessageAvailableEventArgs?>).castToImpl<IRcsEndUserMessageAvailableEventArgs,IRcsEndUserMessageAvailableEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsEndUserMessageAvailableEventArgs?> =
        arrayOfNulls<IRcsEndUserMessageAvailableEventArgs_Impl>(size) as
        Array<IRcsEndUserMessageAvailableEventArgs?>
  }
}
