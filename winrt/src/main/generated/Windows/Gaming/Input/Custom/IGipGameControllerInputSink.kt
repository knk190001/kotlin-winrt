package Windows.Gaming.Input.Custom

import Windows.Gaming.Input.Custom.IGameControllerInputSink.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGipGameControllerInputSink.ABI::class)
@Signature("{a2108abf-09f1-43bc-a140-80f899ec36fb}")
@Guid("a2108abf09f143bca14080f899ec36fb")
@WinRTInterface("a2108abf09f143bca14080f899ec36fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGipGameControllerInputSink.ByReference::class)
public interface IGipGameControllerInputSink : NativeMapped, IWinRTInterface,
    IGameControllerInputSink {
  @InterfaceMethod(0)
  public fun OnKeyReceived(
    timestamp: WinDef.ULONG,
    keyCode: Byte,
    isPressed: Boolean
  ): Unit

  @InterfaceMethod(1)
  public fun OnMessageReceived(
    timestamp: WinDef.ULONG,
    messageClass: GipMessageClass?,
    messageId: Byte,
    sequenceId: Byte,
    messageBuffer: Array<Byte>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGipGameControllerInputSink> {
    public override fun getValue() = ABI.makeIGipGameControllerInputSink(pointer.getPointer(0))

    public fun setValue(value: IGipGameControllerInputSink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGipGameControllerInputSink, IGameControllerInputSink.WithDefault {
    public val __2053241791_Ptr: Pointer?

    public val _2053241791_VtblPtr: Pointer?
      get() = __2053241791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnKeyReceived(
      timestamp: WinDef.ULONG,
      keyCode: Byte,
      isPressed: Boolean
    ): Unit {
      val fnPtr = _2053241791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2053241791_Ptr, timestamp, keyCode, isPressed,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnMessageReceived(
      timestamp: WinDef.ULONG,
      messageClass: GipMessageClass?,
      messageId: Byte,
      sequenceId: Byte,
      messageBuffer: Array<Byte>
    ): Unit {
      val fnPtr = _2053241791_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2053241791_Ptr, timestamp, marshalToNative(messageClass),
          messageId, sequenceId, messageBuffer.size,marshalToNative(messageBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGipGameControllerInputSink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameControllerInputSink {
    public override val __895392785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2053241791_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2053241791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGipGameControllerInputSink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2108abf09f143bca14080f899ec36fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGipGameControllerInputSink(ptr: Pointer?): WithDefault =
        IGipGameControllerInputSink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGipGameControllerInputSink {
      val address = segment.toRawLongValue()
      return makeIGipGameControllerInputSink(Pointer(address))
    }

    public override fun toNative(obj: IGipGameControllerInputSink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2053241791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGipGameControllerInputSink):
        Array<IGipGameControllerInputSink?> = (elements as
        Array<IGipGameControllerInputSink?>).castToImpl<IGipGameControllerInputSink,IGipGameControllerInputSink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGipGameControllerInputSink?> =
        arrayOfNulls<IGipGameControllerInputSink_Impl>(size) as Array<IGipGameControllerInputSink?>
  }
}
