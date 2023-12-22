package Windows.ApplicationModel.UserActivities

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

@ABIMarker(IUserActivityContentInfo.ABI::class)
@Signature("{b399e5ad-137f-409d-822d-e1af27ce08dc}")
@Guid("b399e5ad137f409d822de1af27ce08dc")
@WinRTInterface("b399e5ad137f409d822de1af27ce08dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityContentInfo.ByReference::class)
public interface IUserActivityContentInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ToJson(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityContentInfo> {
    public override fun getValue() = ABI.makeIUserActivityContentInfo(pointer.getPointer(0))

    public fun setValue(value: IUserActivityContentInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityContentInfo {
    public val __524262726_Ptr: Pointer?

    public val _524262726_VtblPtr: Pointer?
      get() = __524262726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ToJson(): String? {
      val fnPtr = _524262726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__524262726_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityContentInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __524262726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityContentInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b399e5ad137f409d822de1af27ce08dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityContentInfo(ptr: Pointer?): WithDefault =
        IUserActivityContentInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityContentInfo {
      val address = segment.toRawLongValue()
      return makeIUserActivityContentInfo(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityContentInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__524262726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityContentInfo):
        Array<IUserActivityContentInfo?> = (elements as
        Array<IUserActivityContentInfo?>).castToImpl<IUserActivityContentInfo,IUserActivityContentInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityContentInfo?> =
        arrayOfNulls<IUserActivityContentInfo_Impl>(size) as Array<IUserActivityContentInfo?>
  }
}
