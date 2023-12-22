package Windows.Security.Cryptography.Certificates

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

@ABIMarker(IPfxImportParameters.ABI::class)
@Signature("{680d3511-9a08-47c8-864a-2edd4d8eb46c}")
@Guid("680d35119a0847c8864a2edd4d8eb46c")
@WinRTInterface("680d35119a0847c8864a2edd4d8eb46c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPfxImportParameters.ByReference::class)
public interface IPfxImportParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exportable(): ExportOption?

  @InterfaceMethod(1)
  public fun put_Exportable(value: ExportOption?): Unit

  @InterfaceMethod(2)
  public fun get_KeyProtectionLevel(): KeyProtectionLevel?

  @InterfaceMethod(3)
  public fun put_KeyProtectionLevel(value: KeyProtectionLevel?): Unit

  @InterfaceMethod(4)
  public fun get_InstallOptions(): InstallOptions?

  @InterfaceMethod(5)
  public fun put_InstallOptions(value: InstallOptions?): Unit

  @InterfaceMethod(6)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(7)
  public fun put_FriendlyName(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_KeyStorageProviderName(): String?

  @InterfaceMethod(9)
  public fun put_KeyStorageProviderName(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_ContainerNamePrefix(): String?

  @InterfaceMethod(11)
  public fun put_ContainerNamePrefix(value: String?): Unit

  @InterfaceMethod(12)
  public fun get_ReaderName(): String?

  @InterfaceMethod(13)
  public fun put_ReaderName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPfxImportParameters> {
    public override fun getValue() = ABI.makeIPfxImportParameters(pointer.getPointer(0))

    public fun setValue(value: IPfxImportParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPfxImportParameters {
    public val __453940189_Ptr: Pointer?

    public val _453940189_VtblPtr: Pointer?
      get() = __453940189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exportable(): ExportOption? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExportOption>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExportOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Exportable(value: ExportOption?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyProtectionLevel(): KeyProtectionLevel? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyProtectionLevel(value: KeyProtectionLevel?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InstallOptions(): InstallOptions? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InstallOptions>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InstallOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_InstallOptions(value: InstallOptions?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FriendlyName(value: String?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_KeyStorageProviderName(): String? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_KeyStorageProviderName(value: String?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ContainerNamePrefix(): String? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ContainerNamePrefix(value: String?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ReaderName(): String? {
      val fnPtr = _453940189_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ReaderName(value: String?): Unit {
      val fnPtr = _453940189_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453940189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPfxImportParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __453940189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPfxImportParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("680d35119a0847c8864a2edd4d8eb46c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPfxImportParameters(ptr: Pointer?): WithDefault = IPfxImportParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPfxImportParameters {
      val address = segment.toRawLongValue()
      return makeIPfxImportParameters(Pointer(address))
    }

    public override fun toNative(obj: IPfxImportParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__453940189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPfxImportParameters): Array<IPfxImportParameters?> =
        (elements as
        Array<IPfxImportParameters?>).castToImpl<IPfxImportParameters,IPfxImportParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPfxImportParameters?> =
        arrayOfNulls<IPfxImportParameters_Impl>(size) as Array<IPfxImportParameters?>
  }
}
