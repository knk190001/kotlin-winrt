package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ICmsTimestampInfo.ABI::class)
@Signature("{2f5f00f2-2c18-4f88-8435-c534086076f5}")
@Guid("2f5f00f22c184f888435c534086076f5")
@WinRTInterface("2f5f00f22c184f888435c534086076f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsTimestampInfo.ByReference::class)
public interface ICmsTimestampInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SigningCertificate(): Certificate?

  @InterfaceMethod(1)
  public fun get_Certificates(): IVectorView<Certificate?>?

  @InterfaceMethod(2)
  public fun get_Timestamp(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsTimestampInfo> {
    public override fun getValue() = ABI.makeICmsTimestampInfo(pointer.getPointer(0))

    public fun setValue(value: ICmsTimestampInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsTimestampInfo {
    public val __1567273481_Ptr: Pointer?

    public val _1567273481_VtblPtr: Pointer?
      get() = __1567273481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SigningCertificate(): Certificate? {
      val fnPtr = _1567273481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1567273481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Certificates(): IVectorView<Certificate?>? {
      val fnPtr = _1567273481_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__1567273481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1567273481_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1567273481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class ICmsTimestampInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1567273481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsTimestampInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f5f00f22c184f888435c534086076f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsTimestampInfo(ptr: Pointer?): WithDefault = ICmsTimestampInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsTimestampInfo {
      val address = segment.toRawLongValue()
      return makeICmsTimestampInfo(Pointer(address))
    }

    public override fun toNative(obj: ICmsTimestampInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1567273481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsTimestampInfo): Array<ICmsTimestampInfo?> = (elements
        as Array<ICmsTimestampInfo?>).castToImpl<ICmsTimestampInfo,ICmsTimestampInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsTimestampInfo?> =
        arrayOfNulls<ICmsTimestampInfo_Impl>(size) as Array<ICmsTimestampInfo?>
  }
}
