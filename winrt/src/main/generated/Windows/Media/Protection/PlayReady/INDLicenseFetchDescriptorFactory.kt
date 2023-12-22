package Windows.Media.Protection.PlayReady

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDLicenseFetchDescriptorFactory.ABI::class)
@Signature("{d0031202-cfac-4f00-ae6a-97af80b848f2}")
@Guid("d0031202cfac4f00ae6a97af80b848f2")
@WinRTInterface("d0031202cfac4f00ae6a97af80b848f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDLicenseFetchDescriptorFactory.ByReference::class)
public interface INDLicenseFetchDescriptorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    contentIDType: NDContentIDType?,
    contentIDBytes: Array<Byte>,
    licenseFetchChallengeCustomData: INDCustomData?
  ): NDLicenseFetchDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDLicenseFetchDescriptorFactory> {
    public override fun getValue() = ABI.makeINDLicenseFetchDescriptorFactory(pointer.getPointer(0))

    public fun setValue(value: INDLicenseFetchDescriptorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDLicenseFetchDescriptorFactory {
    public val __287634802_Ptr: Pointer?

    public val _287634802_VtblPtr: Pointer?
      get() = __287634802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      contentIDType: NDContentIDType?,
      contentIDBytes: Array<Byte>,
      licenseFetchChallengeCustomData: INDCustomData?
    ): NDLicenseFetchDescriptor? {
      val fnPtr = _287634802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDLicenseFetchDescriptor>()
      val hr = fn.invokeHR(arrayOf(__287634802_Ptr, marshalToNative(contentIDType),
          contentIDBytes.size,marshalToNative(contentIDBytes),
          marshalToNative(licenseFetchChallengeCustomData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDLicenseFetchDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class INDLicenseFetchDescriptorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __287634802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDLicenseFetchDescriptorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0031202cfac4f00ae6a97af80b848f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDLicenseFetchDescriptorFactory(ptr: Pointer?): WithDefault =
        INDLicenseFetchDescriptorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDLicenseFetchDescriptorFactory {
      val address = segment.toRawLongValue()
      return makeINDLicenseFetchDescriptorFactory(Pointer(address))
    }

    public override fun toNative(obj: INDLicenseFetchDescriptorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__287634802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDLicenseFetchDescriptorFactory):
        Array<INDLicenseFetchDescriptorFactory?> = (elements as
        Array<INDLicenseFetchDescriptorFactory?>).castToImpl<INDLicenseFetchDescriptorFactory,INDLicenseFetchDescriptorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDLicenseFetchDescriptorFactory?> =
        arrayOfNulls<INDLicenseFetchDescriptorFactory_Impl>(size) as
        Array<INDLicenseFetchDescriptorFactory?>
  }
}
