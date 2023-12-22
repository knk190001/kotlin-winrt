package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConversationalAgentSignal.ABI::class)
@Signature("{20ed25f7-b120-51f2-8603-265d6a47f232}")
@Guid("20ed25f7b12051f28603265d6a47f232")
@WinRTInterface("20ed25f7b12051f28603265d6a47f232")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSignal.ByReference::class)
public interface IConversationalAgentSignal : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSignalVerificationRequired(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSignalVerificationRequired(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_SignalId(): String?

  @InterfaceMethod(3)
  public fun put_SignalId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_SignalName(): String?

  @InterfaceMethod(5)
  public fun put_SignalName(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_SignalContext(): IUnknown?

  @InterfaceMethod(7)
  public fun put_SignalContext(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun get_SignalStart(): TimeSpan?

  @InterfaceMethod(9)
  public fun put_SignalStart(value: TimeSpan?): Unit

  @InterfaceMethod(10)
  public fun get_SignalEnd(): TimeSpan?

  @InterfaceMethod(11)
  public fun put_SignalEnd(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSignal> {
    public override fun getValue() = ABI.makeIConversationalAgentSignal(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSignal_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSignal {
    public val __1074561693_Ptr: Pointer?

    public val _1074561693_VtblPtr: Pointer?
      get() = __1074561693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSignalVerificationRequired(): Boolean {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSignalVerificationRequired(value: Boolean): Unit {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SignalId(): String? {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SignalId(value: String?): Unit {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SignalName(): String? {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SignalName(value: String?): Unit {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SignalContext(): IUnknown? {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SignalContext(value: IUnknown?): Unit {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SignalStart(): TimeSpan? {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SignalStart(value: TimeSpan?): Unit {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_SignalEnd(): TimeSpan? {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_SignalEnd(value: TimeSpan?): Unit {
      val fnPtr = _1074561693_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074561693_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConversationalAgentSignal_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1074561693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSignal, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20ed25f7b12051f28603265d6a47f232")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSignal(ptr: Pointer?): WithDefault =
        IConversationalAgentSignal_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConversationalAgentSignal {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSignal(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSignal): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1074561693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSignal):
        Array<IConversationalAgentSignal?> = (elements as
        Array<IConversationalAgentSignal?>).castToImpl<IConversationalAgentSignal,IConversationalAgentSignal_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSignal?> =
        arrayOfNulls<IConversationalAgentSignal_Impl>(size) as Array<IConversationalAgentSignal?>
  }
}
