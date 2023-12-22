package Windows.System.Profile.SystemManufacturers

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

@ABIMarker(ISystemSupportInfoStatics.ABI::class)
@Signature("{ef750974-c422-45d7-a44d-5c1c0043a2b3}")
@Guid("ef750974c42245d7a44d5c1c0043a2b3")
@WinRTInterface("ef750974c42245d7a44d5c1c0043a2b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemSupportInfoStatics.ByReference::class)
public interface ISystemSupportInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalSystemEdition(): String?

  @InterfaceMethod(1)
  public fun get_OemSupportInfo(): OemSupportInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemSupportInfoStatics> {
    public override fun getValue() = ABI.makeISystemSupportInfoStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemSupportInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemSupportInfoStatics {
    public val __1705321978_Ptr: Pointer?

    public val _1705321978_VtblPtr: Pointer?
      get() = __1705321978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalSystemEdition(): String? {
      val fnPtr = _1705321978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1705321978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OemSupportInfo(): OemSupportInfo? {
      val fnPtr = _1705321978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OemSupportInfo>()
      val hr = fn.invokeHR(arrayOf(__1705321978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OemSupportInfo>(result.getValue())
      return resultValue
    }
  }

  public class ISystemSupportInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1705321978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemSupportInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef750974c42245d7a44d5c1c0043a2b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemSupportInfoStatics(ptr: Pointer?): WithDefault =
        ISystemSupportInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemSupportInfoStatics {
      val address = segment.toRawLongValue()
      return makeISystemSupportInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemSupportInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1705321978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemSupportInfoStatics):
        Array<ISystemSupportInfoStatics?> = (elements as
        Array<ISystemSupportInfoStatics?>).castToImpl<ISystemSupportInfoStatics,ISystemSupportInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemSupportInfoStatics?> =
        arrayOfNulls<ISystemSupportInfoStatics_Impl>(size) as Array<ISystemSupportInfoStatics?>
  }
}
