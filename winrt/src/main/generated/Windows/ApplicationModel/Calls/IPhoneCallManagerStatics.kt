package Windows.ApplicationModel.Calls

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

@ABIMarker(IPhoneCallManagerStatics.ABI::class)
@Signature("{60edac78-78a6-4872-a3ef-98325ec8b843}")
@Guid("60edac7878a64872a3ef98325ec8b843")
@WinRTInterface("60edac7878a64872a3ef98325ec8b843")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallManagerStatics.ByReference::class)
public interface IPhoneCallManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowPhoneCallUI(phoneNumber: String?, displayName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallManagerStatics> {
    public override fun getValue() = ABI.makeIPhoneCallManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallManagerStatics {
    public val __1063528666_Ptr: Pointer?

    public val _1063528666_VtblPtr: Pointer?
      get() = __1063528666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowPhoneCallUI(phoneNumber: String?, displayName: String?): Unit {
      val fnPtr = _1063528666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1063528666_Ptr, marshalToNative(phoneNumber),
          marshalToNative(displayName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1063528666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60edac7878a64872a3ef98325ec8b843")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallManagerStatics(ptr: Pointer?): WithDefault =
        IPhoneCallManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneCallManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1063528666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallManagerStatics):
        Array<IPhoneCallManagerStatics?> = (elements as
        Array<IPhoneCallManagerStatics?>).castToImpl<IPhoneCallManagerStatics,IPhoneCallManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallManagerStatics?> =
        arrayOfNulls<IPhoneCallManagerStatics_Impl>(size) as Array<IPhoneCallManagerStatics?>
  }
}
