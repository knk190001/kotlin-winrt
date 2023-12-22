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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserActivityRequestManagerStatics.ABI::class)
@Signature("{c0392df1-224a-432c-81e5-0c76b4c4cefa}")
@Guid("c0392df1224a432c81e50c76b4c4cefa")
@WinRTInterface("c0392df1224a432c81e50c76b4c4cefa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityRequestManagerStatics.ByReference::class)
public interface IUserActivityRequestManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): UserActivityRequestManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityRequestManagerStatics> {
    public override fun getValue() =
        ABI.makeIUserActivityRequestManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IUserActivityRequestManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityRequestManagerStatics {
    public val __461944198_Ptr: Pointer?

    public val _461944198_VtblPtr: Pointer?
      get() = __461944198_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): UserActivityRequestManager? {
      val fnPtr = _461944198_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityRequestManager>()
      val hr = fn.invokeHR(arrayOf(__461944198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityRequestManager>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityRequestManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __461944198_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityRequestManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0392df1224a432c81e50c76b4c4cefa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityRequestManagerStatics(ptr: Pointer?): WithDefault =
        IUserActivityRequestManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityRequestManagerStatics {
      val address = segment.toRawLongValue()
      return makeIUserActivityRequestManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityRequestManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__461944198_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityRequestManagerStatics):
        Array<IUserActivityRequestManagerStatics?> = (elements as
        Array<IUserActivityRequestManagerStatics?>).castToImpl<IUserActivityRequestManagerStatics,IUserActivityRequestManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityRequestManagerStatics?> =
        arrayOfNulls<IUserActivityRequestManagerStatics_Impl>(size) as
        Array<IUserActivityRequestManagerStatics?>
  }
}
