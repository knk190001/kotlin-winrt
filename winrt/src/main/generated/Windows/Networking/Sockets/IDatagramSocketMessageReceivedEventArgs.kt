package Windows.Networking.Sockets

import Windows.Networking.HostName
import Windows.Storage.Streams.DataReader
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IDatagramSocketMessageReceivedEventArgs.ABI::class)
@Signature("{9e2ddca2-1712-4ce4-b179-8c652c6d107e}")
@Guid("9e2ddca217124ce4b1798c652c6d107e")
@WinRTInterface("9e2ddca217124ce4b1798c652c6d107e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocketMessageReceivedEventArgs.ByReference::class)
public interface IDatagramSocketMessageReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteAddress(): HostName?

  @InterfaceMethod(1)
  public fun get_RemotePort(): String?

  @InterfaceMethod(2)
  public fun get_LocalAddress(): HostName?

  @InterfaceMethod(3)
  public fun GetDataReader(): DataReader?

  @InterfaceMethod(4)
  public fun GetDataStream(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocketMessageReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIDatagramSocketMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocketMessageReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocketMessageReceivedEventArgs {
    public val __1810144997_Ptr: Pointer?

    public val _1810144997_VtblPtr: Pointer?
      get() = __1810144997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteAddress(): HostName? {
      val fnPtr = _1810144997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1810144997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemotePort(): String? {
      val fnPtr = _1810144997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1810144997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LocalAddress(): HostName? {
      val fnPtr = _1810144997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1810144997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDataReader(): DataReader? {
      val fnPtr = _1810144997_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataReader>()
      val hr = fn.invokeHR(arrayOf(__1810144997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDataStream(): IInputStream? {
      val fnPtr = _1810144997_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__1810144997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IDatagramSocketMessageReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1810144997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocketMessageReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e2ddca217124ce4b1798c652c6d107e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocketMessageReceivedEventArgs(ptr: Pointer?): WithDefault =
        IDatagramSocketMessageReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDatagramSocketMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDatagramSocketMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocketMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1810144997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocketMessageReceivedEventArgs):
        Array<IDatagramSocketMessageReceivedEventArgs?> = (elements as
        Array<IDatagramSocketMessageReceivedEventArgs?>).castToImpl<IDatagramSocketMessageReceivedEventArgs,IDatagramSocketMessageReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocketMessageReceivedEventArgs?> =
        arrayOfNulls<IDatagramSocketMessageReceivedEventArgs_Impl>(size) as
        Array<IDatagramSocketMessageReceivedEventArgs?>
  }
}
