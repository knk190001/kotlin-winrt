package Windows.System.Profile

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

@ABIMarker(IAnalyticsInfoStatics.ABI::class)
@Signature("{1d5ee066-188d-5ba9-4387-acaeb0e7e305}")
@Guid("1d5ee066188d5ba94387acaeb0e7e305")
@WinRTInterface("1d5ee066188d5ba94387acaeb0e7e305")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnalyticsInfoStatics.ByReference::class)
public interface IAnalyticsInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VersionInfo(): AnalyticsVersionInfo?

  @InterfaceMethod(1)
  public fun get_DeviceForm(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnalyticsInfoStatics> {
    public override fun getValue() = ABI.makeIAnalyticsInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IAnalyticsInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnalyticsInfoStatics {
    public val __1615925509_Ptr: Pointer?

    public val _1615925509_VtblPtr: Pointer?
      get() = __1615925509_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VersionInfo(): AnalyticsVersionInfo? {
      val fnPtr = _1615925509_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnalyticsVersionInfo>()
      val hr = fn.invokeHR(arrayOf(__1615925509_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnalyticsVersionInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceForm(): String? {
      val fnPtr = _1615925509_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1615925509_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAnalyticsInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1615925509_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnalyticsInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d5ee066188d5ba94387acaeb0e7e305")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnalyticsInfoStatics(ptr: Pointer?): WithDefault =
        IAnalyticsInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnalyticsInfoStatics {
      val address = segment.toRawLongValue()
      return makeIAnalyticsInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnalyticsInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1615925509_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnalyticsInfoStatics): Array<IAnalyticsInfoStatics?> =
        (elements as
        Array<IAnalyticsInfoStatics?>).castToImpl<IAnalyticsInfoStatics,IAnalyticsInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnalyticsInfoStatics?> =
        arrayOfNulls<IAnalyticsInfoStatics_Impl>(size) as Array<IAnalyticsInfoStatics?>
  }
}
