package Windows.Gaming.Input.Custom

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Gaming.Input.Custom.IGameControllerProvider.ABI.IID
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGipGameControllerProvider.ABI::class)
@Signature("{dbcf1e19-1af5-45a8-bf02-a0ee50c823fc}")
@Guid("dbcf1e191af545a8bf02a0ee50c823fc")
@WinRTInterface("dbcf1e191af545a8bf02a0ee50c823fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGipGameControllerProvider.ByReference::class)
public interface IGipGameControllerProvider : NativeMapped, IWinRTInterface, IGameControllerProvider
    {
  @InterfaceMethod(0)
  public fun SendMessage(
    messageClass: GipMessageClass?,
    messageId: Byte,
    messageBuffer: Array<Byte>
  ): Unit

  @InterfaceMethod(1)
  public fun SendReceiveMessage(
    messageClass: GipMessageClass?,
    messageId: Byte,
    requestMessageBuffer: Array<Byte>,
    responseMessageBuffer: Array<Byte>
  ): Unit

  @InterfaceMethod(2)
  public fun UpdateFirmwareAsync(firmwareImage: IInputStream?):
      IAsyncOperationWithProgress<GipFirmwareUpdateResult?, GipFirmwareUpdateProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGipGameControllerProvider> {
    public override fun getValue() = ABI.makeIGipGameControllerProvider(pointer.getPointer(0))

    public fun setValue(value: IGipGameControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGipGameControllerProvider, IGameControllerProvider.WithDefault {
    public val __1940074835_Ptr: Pointer?

    public val _1940074835_VtblPtr: Pointer?
      get() = __1940074835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendMessage(
      messageClass: GipMessageClass?,
      messageId: Byte,
      messageBuffer: Array<Byte>
    ): Unit {
      val fnPtr = _1940074835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1940074835_Ptr, marshalToNative(messageClass), messageId,
          messageBuffer.size,marshalToNative(messageBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SendReceiveMessage(
      messageClass: GipMessageClass?,
      messageId: Byte,
      requestMessageBuffer: Array<Byte>,
      responseMessageBuffer: Array<Byte>
    ): Unit {
      val fnPtr = _1940074835_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1940074835_Ptr, marshalToNative(messageClass), messageId,
          requestMessageBuffer.size,marshalToNative(requestMessageBuffer),
          responseMessageBuffer.size,marshalToNative(responseMessageBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UpdateFirmwareAsync(firmwareImage: IInputStream?):
        IAsyncOperationWithProgress<GipFirmwareUpdateResult?, GipFirmwareUpdateProgress?>? {
      val fnPtr = _1940074835_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<GipFirmwareUpdateResult?,
          GipFirmwareUpdateProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1940074835_Ptr, marshalToNative(firmwareImage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<GipFirmwareUpdateResult?,
          GipFirmwareUpdateProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IGipGameControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameControllerProvider {
    public override val __314032447_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1940074835_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1940074835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGipGameControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbcf1e191af545a8bf02a0ee50c823fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGipGameControllerProvider(ptr: Pointer?): WithDefault =
        IGipGameControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGipGameControllerProvider {
      val address = segment.toRawLongValue()
      return makeIGipGameControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: IGipGameControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1940074835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGipGameControllerProvider):
        Array<IGipGameControllerProvider?> = (elements as
        Array<IGipGameControllerProvider?>).castToImpl<IGipGameControllerProvider,IGipGameControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGipGameControllerProvider?> =
        arrayOfNulls<IGipGameControllerProvider_Impl>(size) as Array<IGipGameControllerProvider?>
  }
}
