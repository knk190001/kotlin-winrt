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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificateExtension.ABI::class)
@Signature("{84cf0656-a9e6-454d-8e45-2ea7c4bcd53b}")
@Guid("84cf0656a9e6454d8e452ea7c4bcd53b")
@WinRTInterface("84cf0656a9e6454d8e452ea7c4bcd53b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateExtension.ByReference::class)
public interface ICertificateExtension : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ObjectId(): String?

  @InterfaceMethod(1)
  public fun put_ObjectId(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_IsCritical(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCritical(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun EncodeValue(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Value(): Array<Byte>?

  @InterfaceMethod(6)
  public fun put_Value(value: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateExtension> {
    public override fun getValue() = ABI.makeICertificateExtension(pointer.getPointer(0))

    public fun setValue(value: ICertificateExtension_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateExtension {
    public val __1307735210_Ptr: Pointer?

    public val _1307735210_VtblPtr: Pointer?
      get() = __1307735210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ObjectId(): String? {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ObjectId(value: String?): Unit {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCritical(): Boolean {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCritical(value: Boolean): Unit {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun EncodeValue(value: String?): Unit {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Value(): Array<Byte>? {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Value(value: Array<Byte>): Unit {
      val fnPtr = _1307735210_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307735210_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateExtension_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1307735210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateExtension, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84cf0656a9e6454d8e452ea7c4bcd53b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateExtension(ptr: Pointer?): WithDefault =
        ICertificateExtension_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateExtension {
      val address = segment.toRawLongValue()
      return makeICertificateExtension(Pointer(address))
    }

    public override fun toNative(obj: ICertificateExtension): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1307735210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateExtension): Array<ICertificateExtension?> =
        (elements as
        Array<ICertificateExtension?>).castToImpl<ICertificateExtension,ICertificateExtension_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateExtension?> =
        arrayOfNulls<ICertificateExtension_Impl>(size) as Array<ICertificateExtension?>
  }
}
