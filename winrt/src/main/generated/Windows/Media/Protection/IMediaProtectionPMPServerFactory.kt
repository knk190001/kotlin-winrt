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

@ABIMarker(IMediaProtectionPMPServerFactory.ABI::class)
@Signature("{602c8e5e-f7d2-487e-af91-dbc4252b2182}")
@Guid("602c8e5ef7d2487eaf91dbc4252b2182")
@WinRTInterface("602c8e5ef7d2487eaf91dbc4252b2182")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaProtectionPMPServerFactory.ByReference::class)
public interface IMediaProtectionPMPServerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePMPServer(pProperties: IPropertySet?): MediaProtectionPMPServer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaProtectionPMPServerFactory> {
    public override fun getValue() = ABI.makeIMediaProtectionPMPServerFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaProtectionPMPServerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaProtectionPMPServerFactory {
    public val __559946486_Ptr: Pointer?

    public val _559946486_VtblPtr: Pointer?
      get() = __559946486_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePMPServer(pProperties: IPropertySet?): MediaProtectionPMPServer? {
      val fnPtr = _559946486_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaProtectionPMPServer>()
      val hr = fn.invokeHR(arrayOf(__559946486_Ptr, marshalToNative(pProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaProtectionPMPServer>(result.getValue())
      return resultValue
    }
  }

  public class IMediaProtectionPMPServerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __559946486_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaProtectionPMPServerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("602c8e5ef7d2487eaf91dbc4252b2182")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaProtectionPMPServerFactory(ptr: Pointer?): WithDefault =
        IMediaProtectionPMPServerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaProtectionPMPServerFactory {
      val address = segment.toRawLongValue()
      return makeIMediaProtectionPMPServerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaProtectionPMPServerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__559946486_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaProtectionPMPServerFactory):
        Array<IMediaProtectionPMPServerFactory?> = (elements as
        Array<IMediaProtectionPMPServerFactory?>).castToImpl<IMediaProtectionPMPServerFactory,IMediaProtectionPMPServerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaProtectionPMPServerFactory?> =
        arrayOfNulls<IMediaProtectionPMPServerFactory_Impl>(size) as
        Array<IMediaProtectionPMPServerFactory?>
  }
}
