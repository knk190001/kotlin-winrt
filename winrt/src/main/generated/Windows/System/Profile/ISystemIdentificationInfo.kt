package Windows.System.Profile

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISystemIdentificationInfo.ABI::class)
@Signature("{0c659e7d-c3c2-4d33-a2df-21bc41916eb3}")
@Guid("0c659e7dc3c24d33a2df21bc41916eb3")
@WinRTInterface("0c659e7dc3c24d33a2df21bc41916eb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemIdentificationInfo.ByReference::class)
public interface ISystemIdentificationInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): IBuffer?

  @InterfaceMethod(1)
  public fun get_Source(): SystemIdentificationSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemIdentificationInfo> {
    public override fun getValue() = ABI.makeISystemIdentificationInfo(pointer.getPointer(0))

    public fun setValue(value: ISystemIdentificationInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemIdentificationInfo {
    public val __1484112897_Ptr: Pointer?

    public val _1484112897_VtblPtr: Pointer?
      get() = __1484112897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): IBuffer? {
      val fnPtr = _1484112897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1484112897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Source(): SystemIdentificationSource? {
      val fnPtr = _1484112897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemIdentificationSource>()
      val hr = fn.invokeHR(arrayOf(__1484112897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemIdentificationSource>(result.getValue())
      return resultValue
    }
  }

  public class ISystemIdentificationInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1484112897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemIdentificationInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c659e7dc3c24d33a2df21bc41916eb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemIdentificationInfo(ptr: Pointer?): WithDefault =
        ISystemIdentificationInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemIdentificationInfo {
      val address = segment.toRawLongValue()
      return makeISystemIdentificationInfo(Pointer(address))
    }

    public override fun toNative(obj: ISystemIdentificationInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1484112897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemIdentificationInfo):
        Array<ISystemIdentificationInfo?> = (elements as
        Array<ISystemIdentificationInfo?>).castToImpl<ISystemIdentificationInfo,ISystemIdentificationInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemIdentificationInfo?> =
        arrayOfNulls<ISystemIdentificationInfo_Impl>(size) as Array<ISystemIdentificationInfo?>
  }
}
