package Windows.Networking.Sockets

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Networking.Connectivity.NetworkAdapter
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

@ABIMarker(IStreamSocketListener2.ABI::class)
@Signature("{658dc13e-bb3e-4458-b232-ed1088694b98}")
@Guid("658dc13ebb3e4458b232ed1088694b98")
@WinRTInterface("658dc13ebb3e4458b232ed1088694b98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketListener2.ByReference::class)
public interface IStreamSocketListener2 : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun BindServiceNameAsync(localServiceName: String?,
      protectionLevel: SocketProtectionLevel?): IAsyncAction?

  @InterfaceMethod(1)
  public fun BindServiceNameAsync(
    localServiceName: String?,
    protectionLevel: SocketProtectionLevel?,
    adapter: NetworkAdapter?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketListener2> {
    public override fun getValue() = ABI.makeIStreamSocketListener2(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketListener2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketListener2, IClosable.WithDefault {
    public val __845265805_Ptr: Pointer?

    public val _845265805_VtblPtr: Pointer?
      get() = __845265805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BindServiceNameAsync(localServiceName: String?,
        protectionLevel: SocketProtectionLevel?): IAsyncAction? {
      val fnPtr = _845265805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__845265805_Ptr, marshalToNative(localServiceName),
          marshalToNative(protectionLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun BindServiceNameAsync(
      localServiceName: String?,
      protectionLevel: SocketProtectionLevel?,
      adapter: NetworkAdapter?
    ): IAsyncAction? {
      val fnPtr = _845265805_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__845265805_Ptr, marshalToNative(localServiceName),
          marshalToNative(protectionLevel), marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketListener2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_845265805_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __845265805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketListener2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("658dc13ebb3e4458b232ed1088694b98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketListener2(ptr: Pointer?): WithDefault =
        IStreamSocketListener2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketListener2 {
      val address = segment.toRawLongValue()
      return makeIStreamSocketListener2(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketListener2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__845265805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketListener2): Array<IStreamSocketListener2?> =
        (elements as
        Array<IStreamSocketListener2?>).castToImpl<IStreamSocketListener2,IStreamSocketListener2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketListener2?> =
        arrayOfNulls<IStreamSocketListener2_Impl>(size) as Array<IStreamSocketListener2?>
  }
}
