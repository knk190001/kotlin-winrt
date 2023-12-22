package Windows.Storage

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageFilePropertiesWithAvailability.ABI::class)
@Signature("{afcbbe9b-582b-4133-9648-e44ca46ee491}")
@Guid("afcbbe9b582b41339648e44ca46ee491")
@WinRTInterface("afcbbe9b582b41339648e44ca46ee491")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFilePropertiesWithAvailability.ByReference::class)
public interface IStorageFilePropertiesWithAvailability : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAvailable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFilePropertiesWithAvailability> {
    public override fun getValue() =
        ABI.makeIStorageFilePropertiesWithAvailability(pointer.getPointer(0))

    public fun setValue(value: IStorageFilePropertiesWithAvailability_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFilePropertiesWithAvailability {
    public val __1432186990_Ptr: Pointer?

    public val _1432186990_VtblPtr: Pointer?
      get() = __1432186990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAvailable(): Boolean {
      val fnPtr = _1432186990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1432186990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageFilePropertiesWithAvailability_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432186990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFilePropertiesWithAvailability, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afcbbe9b582b41339648e44ca46ee491")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFilePropertiesWithAvailability(ptr: Pointer?): WithDefault =
        IStorageFilePropertiesWithAvailability_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFilePropertiesWithAvailability {
      val address = segment.toRawLongValue()
      return makeIStorageFilePropertiesWithAvailability(Pointer(address))
    }

    public override fun toNative(obj: IStorageFilePropertiesWithAvailability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432186990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFilePropertiesWithAvailability):
        Array<IStorageFilePropertiesWithAvailability?> = (elements as
        Array<IStorageFilePropertiesWithAvailability?>).castToImpl<IStorageFilePropertiesWithAvailability,IStorageFilePropertiesWithAvailability_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFilePropertiesWithAvailability?> =
        arrayOfNulls<IStorageFilePropertiesWithAvailability_Impl>(size) as
        Array<IStorageFilePropertiesWithAvailability?>
  }
}
