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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteParticipantComposingChangedEventArgs.ABI::class)
@Signature("{1ec045a7-cfc9-45c9-9876-449f2bc180f5}")
@Guid("1ec045a7cfc945c99876449f2bc180f5")
@WinRTInterface("1ec045a7cfc945c99876449f2bc180f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteParticipantComposingChangedEventArgs.ByReference::class)
public interface IRemoteParticipantComposingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransportId(): String?

  @InterfaceMethod(1)
  public fun get_ParticipantAddress(): String?

  @InterfaceMethod(2)
  public fun get_IsComposing(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteParticipantComposingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteParticipantComposingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteParticipantComposingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteParticipantComposingChangedEventArgs {
    public val __1898962836_Ptr: Pointer?

    public val _1898962836_VtblPtr: Pointer?
      get() = __1898962836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransportId(): String? {
      val fnPtr = _1898962836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898962836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ParticipantAddress(): String? {
      val fnPtr = _1898962836_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898962836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsComposing(): Boolean {
      val fnPtr = _1898962836_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1898962836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRemoteParticipantComposingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1898962836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteParticipantComposingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ec045a7cfc945c99876449f2bc180f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteParticipantComposingChangedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteParticipantComposingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteParticipantComposingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteParticipantComposingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteParticipantComposingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1898962836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteParticipantComposingChangedEventArgs):
        Array<IRemoteParticipantComposingChangedEventArgs?> = (elements as
        Array<IRemoteParticipantComposingChangedEventArgs?>).castToImpl<IRemoteParticipantComposingChangedEventArgs,IRemoteParticipantComposingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteParticipantComposingChangedEventArgs?> =
        arrayOfNulls<IRemoteParticipantComposingChangedEventArgs_Impl>(size) as
        Array<IRemoteParticipantComposingChangedEventArgs?>
  }
}
