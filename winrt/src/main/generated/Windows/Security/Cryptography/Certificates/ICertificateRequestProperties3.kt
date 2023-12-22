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

@ABIMarker(ICertificateRequestProperties3.ABI::class)
@Signature("{e687f616-734d-46b1-9d4c-6edfdbfc845b}")
@Guid("e687f616734d46b19d4c6edfdbfc845b")
@WinRTInterface("e687f616734d46b19d4c6edfdbfc845b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateRequestProperties3.ByReference::class)
public interface ICertificateRequestProperties3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurveName(): String?

  @InterfaceMethod(1)
  public fun put_CurveName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_CurveParameters(): Array<Byte>?

  @InterfaceMethod(3)
  public fun put_CurveParameters(value: Array<Byte>): Unit

  @InterfaceMethod(4)
  public fun get_ContainerNamePrefix(): String?

  @InterfaceMethod(5)
  public fun put_ContainerNamePrefix(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_ContainerName(): String?

  @InterfaceMethod(7)
  public fun put_ContainerName(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_UseExistingKey(): Boolean

  @InterfaceMethod(9)
  public fun put_UseExistingKey(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateRequestProperties3> {
    public override fun getValue() = ABI.makeICertificateRequestProperties3(pointer.getPointer(0))

    public fun setValue(value: ICertificateRequestProperties3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateRequestProperties3 {
    public val __958100966_Ptr: Pointer?

    public val _958100966_VtblPtr: Pointer?
      get() = __958100966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurveName(): String? {
      val fnPtr = _958100966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CurveName(value: String?): Unit {
      val fnPtr = _958100966_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurveParameters(): Array<Byte>? {
      val fnPtr = _958100966_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CurveParameters(value: Array<Byte>): Unit {
      val fnPtr = _958100966_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContainerNamePrefix(): String? {
      val fnPtr = _958100966_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContainerNamePrefix(value: String?): Unit {
      val fnPtr = _958100966_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContainerName(): String? {
      val fnPtr = _958100966_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContainerName(value: String?): Unit {
      val fnPtr = _958100966_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_UseExistingKey(): Boolean {
      val fnPtr = _958100966_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_UseExistingKey(value: Boolean): Unit {
      val fnPtr = _958100966_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__958100966_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateRequestProperties3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __958100966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateRequestProperties3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e687f616734d46b19d4c6edfdbfc845b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateRequestProperties3(ptr: Pointer?): WithDefault =
        ICertificateRequestProperties3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateRequestProperties3 {
      val address = segment.toRawLongValue()
      return makeICertificateRequestProperties3(Pointer(address))
    }

    public override fun toNative(obj: ICertificateRequestProperties3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__958100966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateRequestProperties3):
        Array<ICertificateRequestProperties3?> = (elements as
        Array<ICertificateRequestProperties3?>).castToImpl<ICertificateRequestProperties3,ICertificateRequestProperties3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateRequestProperties3?> =
        arrayOfNulls<ICertificateRequestProperties3_Impl>(size) as
        Array<ICertificateRequestProperties3?>
  }
}
