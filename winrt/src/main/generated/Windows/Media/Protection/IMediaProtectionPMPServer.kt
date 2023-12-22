package Windows.Media.Protection

import Windows.Foundation.Collections.IPropertySet
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaProtectionPMPServer.ABI::class)
@Signature("{0c111226-7b26-4d31-95bb-9c1b08ef7fc0}")
@Guid("0c1112267b264d3195bb9c1b08ef7fc0")
@WinRTInterface("0c1112267b264d3195bb9c1b08ef7fc0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaProtectionPMPServer.ByReference::class)
public interface IMediaProtectionPMPServer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaProtectionPMPServer> {
    public override fun getValue() = ABI.makeIMediaProtectionPMPServer(pointer.getPointer(0))

    public fun setValue(value: IMediaProtectionPMPServer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaProtectionPMPServer {
    public val __1533107340_Ptr: Pointer?

    public val _1533107340_VtblPtr: Pointer?
      get() = __1533107340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1533107340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1533107340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IMediaProtectionPMPServer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1533107340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaProtectionPMPServer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c1112267b264d3195bb9c1b08ef7fc0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaProtectionPMPServer(ptr: Pointer?): WithDefault =
        IMediaProtectionPMPServer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaProtectionPMPServer {
      val address = segment.toRawLongValue()
      return makeIMediaProtectionPMPServer(Pointer(address))
    }

    public override fun toNative(obj: IMediaProtectionPMPServer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1533107340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaProtectionPMPServer):
        Array<IMediaProtectionPMPServer?> = (elements as
        Array<IMediaProtectionPMPServer?>).castToImpl<IMediaProtectionPMPServer,IMediaProtectionPMPServer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaProtectionPMPServer?> =
        arrayOfNulls<IMediaProtectionPMPServer_Impl>(size) as Array<IMediaProtectionPMPServer?>
  }
}
