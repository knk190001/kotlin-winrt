package Windows.System.Profile

import Windows.System.User
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

@ABIMarker(ISystemIdentificationStatics.ABI::class)
@Signature("{5581f42a-d3df-4d93-a37d-c41a616c6d01}")
@Guid("5581f42ad3df4d93a37dc41a616c6d01")
@WinRTInterface("5581f42ad3df4d93a37dc41a616c6d01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemIdentificationStatics.ByReference::class)
public interface ISystemIdentificationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSystemIdForPublisher(): SystemIdentificationInfo?

  @InterfaceMethod(1)
  public fun GetSystemIdForUser(user: User?): SystemIdentificationInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemIdentificationStatics> {
    public override fun getValue() = ABI.makeISystemIdentificationStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemIdentificationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemIdentificationStatics {
    public val __361456940_Ptr: Pointer?

    public val _361456940_VtblPtr: Pointer?
      get() = __361456940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSystemIdForPublisher(): SystemIdentificationInfo? {
      val fnPtr = _361456940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemIdentificationInfo>()
      val hr = fn.invokeHR(arrayOf(__361456940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemIdentificationInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSystemIdForUser(user: User?): SystemIdentificationInfo? {
      val fnPtr = _361456940_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemIdentificationInfo>()
      val hr = fn.invokeHR(arrayOf(__361456940_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemIdentificationInfo>(result.getValue())
      return resultValue
    }
  }

  public class ISystemIdentificationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __361456940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemIdentificationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5581f42ad3df4d93a37dc41a616c6d01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemIdentificationStatics(ptr: Pointer?): WithDefault =
        ISystemIdentificationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemIdentificationStatics {
      val address = segment.toRawLongValue()
      return makeISystemIdentificationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemIdentificationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__361456940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemIdentificationStatics):
        Array<ISystemIdentificationStatics?> = (elements as
        Array<ISystemIdentificationStatics?>).castToImpl<ISystemIdentificationStatics,ISystemIdentificationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemIdentificationStatics?> =
        arrayOfNulls<ISystemIdentificationStatics_Impl>(size) as
        Array<ISystemIdentificationStatics?>
  }
}
