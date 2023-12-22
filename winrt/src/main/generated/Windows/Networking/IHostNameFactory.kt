package Windows.Networking

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

@ABIMarker(IHostNameFactory.ABI::class)
@Signature("{458c23ed-712f-4576-adf1-c20b2c643558}")
@Guid("458c23ed712f4576adf1c20b2c643558")
@WinRTInterface("458c23ed712f4576adf1c20b2c643558")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHostNameFactory.ByReference::class)
public interface IHostNameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateHostName(hostName: String?): HostName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHostNameFactory> {
    public override fun getValue() = ABI.makeIHostNameFactory(pointer.getPointer(0))

    public fun setValue(value: IHostNameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHostNameFactory {
    public val __846332115_Ptr: Pointer?

    public val _846332115_VtblPtr: Pointer?
      get() = __846332115_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateHostName(hostName: String?): HostName? {
      val fnPtr = _846332115_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__846332115_Ptr, marshalToNative(hostName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }
  }

  public class IHostNameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __846332115_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHostNameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("458c23ed712f4576adf1c20b2c643558")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHostNameFactory(ptr: Pointer?): WithDefault = IHostNameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHostNameFactory {
      val address = segment.toRawLongValue()
      return makeIHostNameFactory(Pointer(address))
    }

    public override fun toNative(obj: IHostNameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__846332115_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHostNameFactory): Array<IHostNameFactory?> = (elements as
        Array<IHostNameFactory?>).castToImpl<IHostNameFactory,IHostNameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHostNameFactory?> =
        arrayOfNulls<IHostNameFactory_Impl>(size) as Array<IHostNameFactory?>
  }
}
