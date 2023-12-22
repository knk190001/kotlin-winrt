package Windows.Media.Protection.PlayReady

import Windows.Foundation.DateTime
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDTransmitterProperties.ABI::class)
@Signature("{e536af23-ac4f-4adc-8c66-4ff7c2702dd6}")
@Guid("e536af23ac4f4adc8c664ff7c2702dd6")
@WinRTInterface("e536af23ac4f4adc8c664ff7c2702dd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDTransmitterProperties.ByReference::class)
public interface INDTransmitterProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CertificateType(): NDCertificateType?

  @InterfaceMethod(1)
  public fun get_PlatformIdentifier(): NDCertificatePlatformID?

  @InterfaceMethod(2)
  public fun get_SupportedFeatures(): Array<NDCertificateFeature?>?

  @InterfaceMethod(3)
  public fun get_SecurityLevel(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_SecurityVersion(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_ExpirationDate(): DateTime?

  @InterfaceMethod(6)
  public fun get_ClientID(): Array<Byte>?

  @InterfaceMethod(7)
  public fun get_ModelDigest(): Array<Byte>?

  @InterfaceMethod(8)
  public fun get_ModelManufacturerName(): String?

  @InterfaceMethod(9)
  public fun get_ModelName(): String?

  @InterfaceMethod(10)
  public fun get_ModelNumber(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDTransmitterProperties> {
    public override fun getValue() = ABI.makeINDTransmitterProperties(pointer.getPointer(0))

    public fun setValue(value: INDTransmitterProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDTransmitterProperties {
    public val __125592492_Ptr: Pointer?

    public val _125592492_VtblPtr: Pointer?
      get() = __125592492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CertificateType(): NDCertificateType? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDCertificateType>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDCertificateType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PlatformIdentifier(): NDCertificatePlatformID? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDCertificatePlatformID>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDCertificatePlatformID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedFeatures(): Array<NDCertificateFeature?>? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<NDCertificateFeature>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SecurityLevel(): WinDef.UINT {
      val fnPtr = _125592492_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_SecurityVersion(): WinDef.UINT {
      val fnPtr = _125592492_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ExpirationDate(): DateTime? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ClientID(): Array<Byte>? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ModelDigest(): Array<Byte>? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ModelManufacturerName(): String? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ModelName(): String? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ModelNumber(): String? {
      val fnPtr = _125592492_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__125592492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INDTransmitterProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __125592492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDTransmitterProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e536af23ac4f4adc8c664ff7c2702dd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDTransmitterProperties(ptr: Pointer?): WithDefault =
        INDTransmitterProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDTransmitterProperties {
      val address = segment.toRawLongValue()
      return makeINDTransmitterProperties(Pointer(address))
    }

    public override fun toNative(obj: INDTransmitterProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__125592492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDTransmitterProperties):
        Array<INDTransmitterProperties?> = (elements as
        Array<INDTransmitterProperties?>).castToImpl<INDTransmitterProperties,INDTransmitterProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDTransmitterProperties?> =
        arrayOfNulls<INDTransmitterProperties_Impl>(size) as Array<INDTransmitterProperties?>
  }
}
