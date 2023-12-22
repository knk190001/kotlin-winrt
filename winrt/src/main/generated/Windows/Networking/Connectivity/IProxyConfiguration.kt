package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProxyConfiguration.ABI::class)
@Signature("{ef3a60b4-9004-4dd6-b7d8-b3e502f4aad0}")
@Guid("ef3a60b490044dd6b7d8b3e502f4aad0")
@WinRTInterface("ef3a60b490044dd6b7d8b3e502f4aad0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProxyConfiguration.ByReference::class)
public interface IProxyConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProxyUris(): IVectorView<Uri?>?

  @InterfaceMethod(1)
  public fun get_CanConnectDirectly(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProxyConfiguration> {
    public override fun getValue() = ABI.makeIProxyConfiguration(pointer.getPointer(0))

    public fun setValue(value: IProxyConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProxyConfiguration {
    public val __402415701_Ptr: Pointer?

    public val _402415701_VtblPtr: Pointer?
      get() = __402415701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProxyUris(): IVectorView<Uri?>? {
      val fnPtr = _402415701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__402415701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanConnectDirectly(): Boolean {
      val fnPtr = _402415701_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__402415701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IProxyConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __402415701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProxyConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef3a60b490044dd6b7d8b3e502f4aad0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProxyConfiguration(ptr: Pointer?): WithDefault = IProxyConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProxyConfiguration {
      val address = segment.toRawLongValue()
      return makeIProxyConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IProxyConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__402415701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProxyConfiguration): Array<IProxyConfiguration?> =
        (elements as
        Array<IProxyConfiguration?>).castToImpl<IProxyConfiguration,IProxyConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProxyConfiguration?> =
        arrayOfNulls<IProxyConfiguration_Impl>(size) as Array<IProxyConfiguration?>
  }
}
