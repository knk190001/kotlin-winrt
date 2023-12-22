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

@ABIMarker(IUserActivityContentInfoStatics.ABI::class)
@Signature("{9988c34b-0386-4bc9-968a-8200b004144f}")
@Guid("9988c34b03864bc9968a8200b004144f")
@WinRTInterface("9988c34b03864bc9968a8200b004144f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityContentInfoStatics.ByReference::class)
public interface IUserActivityContentInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromJson(value: String?): UserActivityContentInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityContentInfoStatics> {
    public override fun getValue() = ABI.makeIUserActivityContentInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IUserActivityContentInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityContentInfoStatics {
    public val __2115805087_Ptr: Pointer?

    public val _2115805087_VtblPtr: Pointer?
      get() = __2115805087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromJson(value: String?): UserActivityContentInfo? {
      val fnPtr = _2115805087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityContentInfo>()
      val hr = fn.invokeHR(arrayOf(__2115805087_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityContentInfo>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityContentInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2115805087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityContentInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9988c34b03864bc9968a8200b004144f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityContentInfoStatics(ptr: Pointer?): WithDefault =
        IUserActivityContentInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityContentInfoStatics {
      val address = segment.toRawLongValue()
      return makeIUserActivityContentInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityContentInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2115805087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityContentInfoStatics):
        Array<IUserActivityContentInfoStatics?> = (elements as
        Array<IUserActivityContentInfoStatics?>).castToImpl<IUserActivityContentInfoStatics,IUserActivityContentInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityContentInfoStatics?> =
        arrayOfNulls<IUserActivityContentInfoStatics_Impl>(size) as
        Array<IUserActivityContentInfoStatics?>
  }
}
