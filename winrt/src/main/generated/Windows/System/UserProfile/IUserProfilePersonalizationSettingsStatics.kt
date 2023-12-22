package Windows.System.UserProfile

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

@ABIMarker(IUserProfilePersonalizationSettingsStatics.ABI::class)
@Signature("{91acb841-5037-454b-9883-bb772d08dd16}")
@Guid("91acb8415037454b9883bb772d08dd16")
@WinRTInterface("91acb8415037454b9883bb772d08dd16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserProfilePersonalizationSettingsStatics.ByReference::class)
public interface IUserProfilePersonalizationSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): UserProfilePersonalizationSettings?

  @InterfaceMethod(1)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserProfilePersonalizationSettingsStatics> {
    public override fun getValue() =
        ABI.makeIUserProfilePersonalizationSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IUserProfilePersonalizationSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserProfilePersonalizationSettingsStatics {
    public val __178959133_Ptr: Pointer?

    public val _178959133_VtblPtr: Pointer?
      get() = __178959133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): UserProfilePersonalizationSettings? {
      val fnPtr = _178959133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserProfilePersonalizationSettings>()
      val hr = fn.invokeHR(arrayOf(__178959133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserProfilePersonalizationSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsSupported(): Boolean {
      val fnPtr = _178959133_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__178959133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUserProfilePersonalizationSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178959133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserProfilePersonalizationSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91acb8415037454b9883bb772d08dd16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserProfilePersonalizationSettingsStatics(ptr: Pointer?): WithDefault =
        IUserProfilePersonalizationSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserProfilePersonalizationSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIUserProfilePersonalizationSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserProfilePersonalizationSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178959133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserProfilePersonalizationSettingsStatics):
        Array<IUserProfilePersonalizationSettingsStatics?> = (elements as
        Array<IUserProfilePersonalizationSettingsStatics?>).castToImpl<IUserProfilePersonalizationSettingsStatics,IUserProfilePersonalizationSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserProfilePersonalizationSettingsStatics?> =
        arrayOfNulls<IUserProfilePersonalizationSettingsStatics_Impl>(size) as
        Array<IUserProfilePersonalizationSettingsStatics?>
  }
}
