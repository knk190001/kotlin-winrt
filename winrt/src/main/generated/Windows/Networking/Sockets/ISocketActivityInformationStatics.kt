package Windows.Networking.Sockets

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(ISocketActivityInformationStatics.ABI::class)
@Signature("{8570b47a-7e7d-4736-8041-1327a6543c56}")
@Guid("8570b47a7e7d473680411327a6543c56")
@WinRTInterface("8570b47a7e7d473680411327a6543c56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocketActivityInformationStatics.ByReference::class)
public interface ISocketActivityInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllSockets(): IMapView<String?, SocketActivityInformation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocketActivityInformationStatics> {
    public override fun getValue() =
        ABI.makeISocketActivityInformationStatics(pointer.getPointer(0))

    public fun setValue(value: ISocketActivityInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocketActivityInformationStatics {
    public val __1080123661_Ptr: Pointer?

    public val _1080123661_VtblPtr: Pointer?
      get() = __1080123661_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllSockets(): IMapView<String?, SocketActivityInformation?>? {
      val fnPtr = _1080123661_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, SocketActivityInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1080123661_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          SocketActivityInformation?>>(result.getValue())
      return resultValue
    }
  }

  public class ISocketActivityInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1080123661_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocketActivityInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8570b47a7e7d473680411327a6543c56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocketActivityInformationStatics(ptr: Pointer?): WithDefault =
        ISocketActivityInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocketActivityInformationStatics {
      val address = segment.toRawLongValue()
      return makeISocketActivityInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISocketActivityInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1080123661_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocketActivityInformationStatics):
        Array<ISocketActivityInformationStatics?> = (elements as
        Array<ISocketActivityInformationStatics?>).castToImpl<ISocketActivityInformationStatics,ISocketActivityInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocketActivityInformationStatics?> =
        arrayOfNulls<ISocketActivityInformationStatics_Impl>(size) as
        Array<ISocketActivityInformationStatics?>
  }
}
