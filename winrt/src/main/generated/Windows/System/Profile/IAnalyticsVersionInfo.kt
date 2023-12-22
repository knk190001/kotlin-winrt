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

@ABIMarker(IAnalyticsVersionInfo.ABI::class)
@Signature("{926130b8-9955-4c74-bdc1-7cd0decf9b03}")
@Guid("926130b899554c74bdc17cd0decf9b03")
@WinRTInterface("926130b899554c74bdc17cd0decf9b03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnalyticsVersionInfo.ByReference::class)
public interface IAnalyticsVersionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceFamily(): String?

  @InterfaceMethod(1)
  public fun get_DeviceFamilyVersion(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnalyticsVersionInfo> {
    public override fun getValue() = ABI.makeIAnalyticsVersionInfo(pointer.getPointer(0))

    public fun setValue(value: IAnalyticsVersionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnalyticsVersionInfo {
    public val __1878501236_Ptr: Pointer?

    public val _1878501236_VtblPtr: Pointer?
      get() = __1878501236_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceFamily(): String? {
      val fnPtr = _1878501236_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878501236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceFamilyVersion(): String? {
      val fnPtr = _1878501236_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878501236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAnalyticsVersionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1878501236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnalyticsVersionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("926130b899554c74bdc17cd0decf9b03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnalyticsVersionInfo(ptr: Pointer?): WithDefault =
        IAnalyticsVersionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnalyticsVersionInfo {
      val address = segment.toRawLongValue()
      return makeIAnalyticsVersionInfo(Pointer(address))
    }

    public override fun toNative(obj: IAnalyticsVersionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1878501236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnalyticsVersionInfo): Array<IAnalyticsVersionInfo?> =
        (elements as
        Array<IAnalyticsVersionInfo?>).castToImpl<IAnalyticsVersionInfo,IAnalyticsVersionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnalyticsVersionInfo?> =
        arrayOfNulls<IAnalyticsVersionInfo_Impl>(size) as Array<IAnalyticsVersionInfo?>
  }
}
