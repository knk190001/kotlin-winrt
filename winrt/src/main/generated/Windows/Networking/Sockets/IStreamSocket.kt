package Windows.Networking.Sockets

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Networking.EndpointPair
import Windows.Networking.HostName
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStreamSocket.ABI::class)
@Signature("{69a22cf3-fc7b-4857-af38-f6e7de6a5b49}")
@Guid("69a22cf3fc7b4857af38f6e7de6a5b49")
@WinRTInterface("69a22cf3fc7b4857af38f6e7de6a5b49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocket.ByReference::class)
public interface IStreamSocket : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Control(): StreamSocketControl?

  @InterfaceMethod(1)
  public fun get_Information(): StreamSocketInformation?

  @InterfaceMethod(2)
  public fun get_InputStream(): IInputStream?

  @InterfaceMethod(3)
  public fun get_OutputStream(): IOutputStream?

  @InterfaceMethod(4)
  public fun ConnectAsync(endpointPair: EndpointPair?): IAsyncAction?

  @InterfaceMethod(5)
  public fun ConnectAsync(remoteHostName: HostName?, remoteServiceName: String?): IAsyncAction?

  @InterfaceMethod(6)
  public fun ConnectAsync(endpointPair: EndpointPair?, protectionLevel: SocketProtectionLevel?):
      IAsyncAction?

  @InterfaceMethod(7)
  public fun ConnectAsync(
    remoteHostName: HostName?,
    remoteServiceName: String?,
    protectionLevel: SocketProtectionLevel?
  ): IAsyncAction?

  @InterfaceMethod(8)
  public fun UpgradeToSslAsync(protectionLevel: SocketProtectionLevel?,
      validationHostName: HostName?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStreamSocket>
      {
    public override fun getValue() = ABI.makeIStreamSocket(pointer.getPointer(0))

    public fun setValue(value: IStreamSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocket, IClosable.WithDefault {
    public val __670203445_Ptr: Pointer?

    public val _670203445_VtblPtr: Pointer?
      get() = __670203445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Control(): StreamSocketControl? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocketControl>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocketControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Information(): StreamSocketInformation? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocketInformation>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocketInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InputStream(): IInputStream? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ConnectAsync(endpointPair: EndpointPair?): IAsyncAction? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr, marshalToNative(endpointPair), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ConnectAsync(remoteHostName: HostName?, remoteServiceName: String?):
        IAsyncAction? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ConnectAsync(endpointPair: EndpointPair?,
        protectionLevel: SocketProtectionLevel?): IAsyncAction? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr, marshalToNative(endpointPair),
          marshalToNative(protectionLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ConnectAsync(
      remoteHostName: HostName?,
      remoteServiceName: String?,
      protectionLevel: SocketProtectionLevel?
    ): IAsyncAction? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), marshalToNative(protectionLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun UpgradeToSslAsync(protectionLevel: SocketProtectionLevel?,
        validationHostName: HostName?): IAsyncAction? {
      val fnPtr = _670203445_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__670203445_Ptr, marshalToNative(protectionLevel),
          marshalToNative(validationHostName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_670203445_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __670203445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69a22cf3fc7b4857af38f6e7de6a5b49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocket(ptr: Pointer?): WithDefault = IStreamSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocket {
      val address = segment.toRawLongValue()
      return makeIStreamSocket(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__670203445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocket): Array<IStreamSocket?> = (elements as
        Array<IStreamSocket?>).castToImpl<IStreamSocket,IStreamSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocket?> =
        arrayOfNulls<IStreamSocket_Impl>(size) as Array<IStreamSocket?>
  }
}
