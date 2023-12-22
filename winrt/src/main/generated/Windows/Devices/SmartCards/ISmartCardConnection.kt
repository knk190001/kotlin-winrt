package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IBuffer
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardConnection.ABI::class)
@Signature("{7edb991a-a81a-47bc-a649-156be6b7f231}")
@Guid("7edb991aa81a47bca649156be6b7f231")
@WinRTInterface("7edb991aa81a47bca649156be6b7f231")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardConnection.ByReference::class)
public interface ISmartCardConnection : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun TransmitAsync(command: IBuffer?): IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardConnection> {
    public override fun getValue() = ABI.makeISmartCardConnection(pointer.getPointer(0))

    public fun setValue(value: ISmartCardConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardConnection, IClosable.WithDefault {
    public val __1908950180_Ptr: Pointer?

    public val _1908950180_VtblPtr: Pointer?
      get() = __1908950180_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TransmitAsync(command: IBuffer?): IAsyncOperation<IBuffer?>? {
      val fnPtr = _1908950180_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1908950180_Ptr, marshalToNative(command), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1908950180_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1908950180_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7edb991aa81a47bca649156be6b7f231")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardConnection(ptr: Pointer?): WithDefault = ISmartCardConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardConnection {
      val address = segment.toRawLongValue()
      return makeISmartCardConnection(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1908950180_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardConnection): Array<ISmartCardConnection?> =
        (elements as
        Array<ISmartCardConnection?>).castToImpl<ISmartCardConnection,ISmartCardConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardConnection?> =
        arrayOfNulls<ISmartCardConnection_Impl>(size) as Array<ISmartCardConnection?>
  }
}
