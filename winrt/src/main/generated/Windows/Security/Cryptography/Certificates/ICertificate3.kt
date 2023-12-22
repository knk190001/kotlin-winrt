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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificate3.ABI::class)
@Signature("{be51a966-ae5f-4652-ace7-c6d7e7724cf3}")
@Guid("be51a966ae5f4652ace7c6d7e7724cf3")
@WinRTInterface("be51a966ae5f4652ace7c6d7e7724cf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificate3.ByReference::class)
public interface ICertificate3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPerUser(): Boolean

  @InterfaceMethod(1)
  public fun get_StoreName(): String?

  @InterfaceMethod(2)
  public fun get_KeyStorageProviderName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICertificate3>
      {
    public override fun getValue() = ABI.makeICertificate3(pointer.getPointer(0))

    public fun setValue(value: ICertificate3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificate3 {
    public val __960525930_Ptr: Pointer?

    public val _960525930_VtblPtr: Pointer?
      get() = __960525930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPerUser(): Boolean {
      val fnPtr = _960525930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__960525930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_StoreName(): String? {
      val fnPtr = _960525930_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960525930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyStorageProviderName(): String? {
      val fnPtr = _960525930_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960525930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICertificate3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __960525930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificate3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be51a966ae5f4652ace7c6d7e7724cf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificate3(ptr: Pointer?): WithDefault = ICertificate3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificate3 {
      val address = segment.toRawLongValue()
      return makeICertificate3(Pointer(address))
    }

    public override fun toNative(obj: ICertificate3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__960525930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificate3): Array<ICertificate3?> = (elements as
        Array<ICertificate3?>).castToImpl<ICertificate3,ICertificate3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificate3?> =
        arrayOfNulls<ICertificate3_Impl>(size) as Array<ICertificate3?>
  }
}
