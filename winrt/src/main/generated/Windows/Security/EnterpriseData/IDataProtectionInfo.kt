package Windows.Security.EnterpriseData

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

@ABIMarker(IDataProtectionInfo.ABI::class)
@Signature("{8420b0c1-5e31-4405-9540-3f943af0cb26}")
@Guid("8420b0c15e31440595403f943af0cb26")
@WinRTInterface("8420b0c15e31440595403f943af0cb26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataProtectionInfo.ByReference::class)
public interface IDataProtectionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DataProtectionStatus?

  @InterfaceMethod(1)
  public fun get_Identity(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataProtectionInfo> {
    public override fun getValue() = ABI.makeIDataProtectionInfo(pointer.getPointer(0))

    public fun setValue(value: IDataProtectionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataProtectionInfo {
    public val __2061310388_Ptr: Pointer?

    public val _2061310388_VtblPtr: Pointer?
      get() = __2061310388_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DataProtectionStatus? {
      val fnPtr = _2061310388_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataProtectionStatus>()
      val hr = fn.invokeHR(arrayOf(__2061310388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataProtectionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Identity(): String? {
      val fnPtr = _2061310388_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2061310388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDataProtectionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2061310388_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataProtectionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8420b0c15e31440595403f943af0cb26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataProtectionInfo(ptr: Pointer?): WithDefault = IDataProtectionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataProtectionInfo {
      val address = segment.toRawLongValue()
      return makeIDataProtectionInfo(Pointer(address))
    }

    public override fun toNative(obj: IDataProtectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2061310388_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataProtectionInfo): Array<IDataProtectionInfo?> =
        (elements as
        Array<IDataProtectionInfo?>).castToImpl<IDataProtectionInfo,IDataProtectionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataProtectionInfo?> =
        arrayOfNulls<IDataProtectionInfo_Impl>(size) as Array<IDataProtectionInfo?>
  }
}
