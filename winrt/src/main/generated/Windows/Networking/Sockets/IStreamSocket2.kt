package Windows.Networking.Sockets

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Networking.Connectivity.NetworkAdapter
import Windows.Networking.HostName
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

@ABIMarker(IStreamSocket2.ABI::class)
@Signature("{29d0e575-f314-4d09-adf0-0fbd967fbd9f}")
@Guid("29d0e575f3144d09adf00fbd967fbd9f")
@WinRTInterface("29d0e575f3144d09adf00fbd967fbd9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocket2.ByReference::class)
public interface IStreamSocket2 : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun ConnectAsync(
    remoteHostName: HostName?,
    remoteServiceName: String?,
    protectionLevel: SocketProtectionLevel?,
    adapter: NetworkAdapter?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStreamSocket2>
      {
    public override fun getValue() = ABI.makeIStreamSocket2(pointer.getPointer(0))

    public fun setValue(value: IStreamSocket2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocket2, IClosable.WithDefault {
    public val __698529735_Ptr: Pointer?

    public val _698529735_VtblPtr: Pointer?
      get() = __698529735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConnectAsync(
      remoteHostName: HostName?,
      remoteServiceName: String?,
      protectionLevel: SocketProtectionLevel?,
      adapter: NetworkAdapter?
    ): IAsyncAction? {
      val fnPtr = _698529735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__698529735_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), marshalToNative(protectionLevel),
          marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocket2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_698529735_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __698529735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocket2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29d0e575f3144d09adf00fbd967fbd9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocket2(ptr: Pointer?): WithDefault = IStreamSocket2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocket2 {
      val address = segment.toRawLongValue()
      return makeIStreamSocket2(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocket2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__698529735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocket2): Array<IStreamSocket2?> = (elements as
        Array<IStreamSocket2?>).castToImpl<IStreamSocket2,IStreamSocket2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocket2?> =
        arrayOfNulls<IStreamSocket2_Impl>(size) as Array<IStreamSocket2?>
  }
}
