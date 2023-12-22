package Windows.ApplicationModel.VoiceCommands

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IVoiceCommandResponse.ABI::class)
@Signature("{0284b30e-8a3b-4cc4-a6a1-cad5be2716b5}")
@Guid("0284b30e8a3b4cc4a6a1cad5be2716b5")
@WinRTInterface("0284b30e8a3b4cc4a6a1cad5be2716b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandResponse.ByReference::class)
public interface IVoiceCommandResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): VoiceCommandUserMessage?

  @InterfaceMethod(1)
  public fun put_Message(value: VoiceCommandUserMessage?): Unit

  @InterfaceMethod(2)
  public fun get_RepeatMessage(): VoiceCommandUserMessage?

  @InterfaceMethod(3)
  public fun put_RepeatMessage(value: VoiceCommandUserMessage?): Unit

  @InterfaceMethod(4)
  public fun get_AppLaunchArgument(): String?

  @InterfaceMethod(5)
  public fun put_AppLaunchArgument(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_VoiceCommandContentTiles(): IVector<VoiceCommandContentTile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandResponse> {
    public override fun getValue() = ABI.makeIVoiceCommandResponse(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandResponse {
    public val __1942521779_Ptr: Pointer?

    public val _1942521779_VtblPtr: Pointer?
      get() = __1942521779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): VoiceCommandUserMessage? {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceCommandUserMessage>()
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceCommandUserMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Message(value: VoiceCommandUserMessage?): Unit {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RepeatMessage(): VoiceCommandUserMessage? {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceCommandUserMessage>()
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceCommandUserMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RepeatMessage(value: VoiceCommandUserMessage?): Unit {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AppLaunchArgument(): String? {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_AppLaunchArgument(value: String?): Unit {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_VoiceCommandContentTiles(): IVector<VoiceCommandContentTile?>? {
      val fnPtr = _1942521779_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VoiceCommandContentTile?>>()
      val hr = fn.invokeHR(arrayOf(__1942521779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VoiceCommandContentTile?>>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942521779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0284b30e8a3b4cc4a6a1cad5be2716b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandResponse(ptr: Pointer?): WithDefault =
        IVoiceCommandResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandResponse {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandResponse(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942521779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandResponse): Array<IVoiceCommandResponse?> =
        (elements as
        Array<IVoiceCommandResponse?>).castToImpl<IVoiceCommandResponse,IVoiceCommandResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandResponse?> =
        arrayOfNulls<IVoiceCommandResponse_Impl>(size) as Array<IVoiceCommandResponse?>
  }
}
