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

@ABIMarker(ICmsSignerInfo.ABI::class)
@Signature("{50d020db-1d2f-4c1a-b5c5-d0188ff91f47}")
@Guid("50d020db1d2f4c1ab5c5d0188ff91f47")
@WinRTInterface("50d020db1d2f4c1ab5c5d0188ff91f47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsSignerInfo.ByReference::class)
public interface ICmsSignerInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Certificate(): Certificate?

  @InterfaceMethod(1)
  public fun put_Certificate(value: Certificate?): Unit

  @InterfaceMethod(2)
  public fun get_HashAlgorithmName(): String?

  @InterfaceMethod(3)
  public fun put_HashAlgorithmName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_TimestampInfo(): CmsTimestampInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICmsSignerInfo>
      {
    public override fun getValue() = ABI.makeICmsSignerInfo(pointer.getPointer(0))

    public fun setValue(value: ICmsSignerInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsSignerInfo {
    public val __1200696845_Ptr: Pointer?

    public val _1200696845_VtblPtr: Pointer?
      get() = __1200696845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Certificate(): Certificate? {
      val fnPtr = _1200696845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1200696845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Certificate(value: Certificate?): Unit {
      val fnPtr = _1200696845_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200696845_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HashAlgorithmName(): String? {
      val fnPtr = _1200696845_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1200696845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HashAlgorithmName(value: String?): Unit {
      val fnPtr = _1200696845_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200696845_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TimestampInfo(): CmsTimestampInfo? {
      val fnPtr = _1200696845_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CmsTimestampInfo>()
      val hr = fn.invokeHR(arrayOf(__1200696845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CmsTimestampInfo>(result.getValue())
      return resultValue
    }
  }

  public class ICmsSignerInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1200696845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsSignerInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50d020db1d2f4c1ab5c5d0188ff91f47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsSignerInfo(ptr: Pointer?): WithDefault = ICmsSignerInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsSignerInfo {
      val address = segment.toRawLongValue()
      return makeICmsSignerInfo(Pointer(address))
    }

    public override fun toNative(obj: ICmsSignerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1200696845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsSignerInfo): Array<ICmsSignerInfo?> = (elements as
        Array<ICmsSignerInfo?>).castToImpl<ICmsSignerInfo,ICmsSignerInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsSignerInfo?> =
        arrayOfNulls<ICmsSignerInfo_Impl>(size) as Array<ICmsSignerInfo?>
  }
}
