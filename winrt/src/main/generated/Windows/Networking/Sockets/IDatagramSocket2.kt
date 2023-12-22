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

@ABIMarker(IDatagramSocket2.ABI::class)
@Signature("{d83ba354-9a9d-4185-a20a-1424c9c2a7cd}")
@Guid("d83ba3549a9d4185a20a1424c9c2a7cd")
@WinRTInterface("d83ba3549a9d4185a20a1424c9c2a7cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocket2.ByReference::class)
public interface IDatagramSocket2 : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun BindServiceNameAsync(localServiceName: String?, adapter: NetworkAdapter?):
      IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocket2> {
    public override fun getValue() = ABI.makeIDatagramSocket2(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocket2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocket2, IClosable.WithDefault {
    public val __1238990118_Ptr: Pointer?

    public val _1238990118_VtblPtr: Pointer?
      get() = __1238990118_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BindServiceNameAsync(localServiceName: String?, adapter: NetworkAdapter?):
        IAsyncAction? {
      val fnPtr = _1238990118_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1238990118_Ptr, marshalToNative(localServiceName),
          marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IDatagramSocket2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1238990118_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1238990118_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocket2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d83ba3549a9d4185a20a1424c9c2a7cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocket2(ptr: Pointer?): WithDefault = IDatagramSocket2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocket2 {
      val address = segment.toRawLongValue()
      return makeIDatagramSocket2(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocket2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1238990118_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocket2): Array<IDatagramSocket2?> = (elements as
        Array<IDatagramSocket2?>).castToImpl<IDatagramSocket2,IDatagramSocket2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocket2?> =
        arrayOfNulls<IDatagramSocket2_Impl>(size) as Array<IDatagramSocket2?>
  }
}
